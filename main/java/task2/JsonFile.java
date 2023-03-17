package task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
public class JsonFile implements Serializable {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    public static void userToJson() throws IOException {
        String json;
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/Tanya/Downloads/modul10/src/main/java/task2/file1.txt"))) {
            String line = reader.readLine();
            List<User> users = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                User user = new User();
                String[] array = line.trim().split(" ");
                if (array.length == 2 && array[0] != null && Integer.parseInt(array[1]) > 0) {
                    user.setName(array[0]);
                    user.setAge(Integer.parseInt(array[1]));
                    users.add(user);
                }
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("user.json"))) {
                json = GSON.toJson(users);
                writer.write(json);
                System.out.println(json);
            }
        }
    }
            public static void main (String[]args) throws IOException {

                JsonFile jsonFile = new JsonFile(); jsonFile.userToJson();


            }
        }
