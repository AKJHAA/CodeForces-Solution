// C. Turtle and Good Pairs
import java.io.*;
import java.util.*;
public class CF_968_C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(reader.readLine().trim());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(reader.readLine().trim());
            String s = reader.readLine().trim();

            // Count frequency of each character
            Map<Character, Integer> frequencyMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }

            // Create a list to store characters based on their frequency
            List<Character> result = new ArrayList<>();
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                char c = entry.getKey();
                int count = entry.getValue();
                // Add all occurrences of the character to the result list
                for (int j = 0; j < count; j++) {
                    result.add(c);
                }
            }

            // Convert the list to a string and print the result
            StringBuilder sb = new StringBuilder();
            for (char c : result) {
                sb.append(c);
            }
            writer.write(sb.toString() + "\n");
        }

        reader.close();
        writer.close();
    }
}Wrong