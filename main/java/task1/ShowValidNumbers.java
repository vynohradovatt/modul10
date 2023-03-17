package task1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShowValidNumbers {

    private File file = new File("src/main/java/task1/file.txt");

    public void printPhoneNumber() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            Pattern pattern = Pattern.compile("\\(?\\d{3}\\)?[-.\\s]?\\d{3}[-\\S]\\d{4}"); //(xxx) xxx-xxxx та xxx-xxx-xxxx
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    System.out.println(matcher.group());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}



