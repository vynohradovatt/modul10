package task3;

import task2.User;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class CountWordsInFile {

    public static void main(String[] args) throws IOException {

        String file = "./src/main/java/task3/file2.txt";

        Map<String ,Integer> count = countWords(file);

        for (Map.Entry<String, Integer> text: count.entrySet()) {
            System.out.println(text.getKey() + " " + text.getValue());
        }

    }
   public static Map<String, Integer> countWords(String filePath) throws IOException {
        Map<String, Integer> wordCountMap = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                Integer count = wordCountMap.getOrDefault(word, 0);
                wordCountMap.put(word, count + 1);
            }
        }
        reader.close();
        return wordCountMap;
    }
}

