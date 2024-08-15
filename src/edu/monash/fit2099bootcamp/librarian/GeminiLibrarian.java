package edu.monash.fit2099bootcamp.librarian;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * A class that represents a GeminiLibrarian object.
 * The GeminiLibrarian object can generate content based on the user's prompt.
 */
public class GeminiLibrarian extends Librarian {
    private static final String API_KEY = "NeverGonnaGiveYouUp";
    private static final String REQUEST_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=" + API_KEY;
    private String name;

    /**
     * Constructor.
     * Name defaults to "Gemini Librarian".
     */
    public GeminiLibrarian() {
        this.name = "Gemini Librarian";
    }

    /**
     * Returns the name of the GeminiLibrarian object.
     *
     * @return a String representing the name of the GeminiLibrarian object
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Generates content based on the user's prompt.
     *
     * @return a String representing the generated content
     */
    @Override
    public String speak() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your prompt: ");
        String prompt = scanner.nextLine();
        return geminiCall(prompt);
    }

    /**
     * Calls the Gemini API to generate content based on the user's prompt.
     *
     * @param prompt the user's prompt
     * @return a String representing the generated content
     */
    private String geminiCall(String prompt) {
        String result;
        try {
            // Create the URL object
            URL url = new URL(REQUEST_URL);
            // Below is an example of downcasting where it casts URLConnection to HttpURLConnection
            // Again, this is not a good practice in OOP, but we are doing it here for API call only
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set request method to POST
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            // Create JSON payload
            String jsonInputString = "{\"contents\": [{\"parts\": [{\"text\": \"" + prompt + "\"}]}]}";

            // Send JSON input
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Get the response code
            // If the response code is 200, it means the request was successful
            // If the response code is not 200, it means the request was unsuccessful and has some issues
            // For example, if the API key is invalid, the response code will be 400
            int code = connection.getResponseCode();
            System.out.println("Response Code: " + code);

            // Read the response
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
                String responseLine;
                result = "";
                while ((responseLine = br.readLine()) != null) {
                    if (responseLine.trim().startsWith("\"text\": ")) {
                        result = responseLine.trim().substring(9, responseLine.trim().length() - 1);
                    }
                }
               //System.out.println(result);
            }
        } catch (Exception e) {
            return "I am sorry, I cannot help you with that. Gemini offline at the moment.";
        }
        if (result == null || result.isEmpty()) {
            result = "I am sorry, I cannot help you with that.";
        }
        return result;
    }

    /**
     * Main method to test the GeminiLibrarian class.
     *
     * @param args the command-line arguments
     */
//    public static void main(String[] args) {
//        GeminiLibrarian geminiLibrarian = new GeminiLibrarian();
//        System.out.println(geminiLibrarian.speak());
//    }
}