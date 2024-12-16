package com.telran.homework.homework9;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class Dictionary {

    public static void main(String[] args) {
        Map<String, Integer> dictionary = new HashMap<>();

        String text = getSomeText();
        Scanner scanner = new Scanner(text);

        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase();
            int count = dictionary.getOrDefault(word, 0);
            dictionary.put(word, ++count);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(dictionary.entrySet());
        entries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println(entries);
    }

    public static String getSomeText() {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://www.omegle.com/"))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("HTTP Status: " + response.statusCode());
            return response.body();
        } catch (Exception e) {
            return "";
        }
    }
}
