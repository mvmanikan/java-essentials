package com.kavinmaha.workingWithFiles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ParsingFiles {
    public static void main(String[] args) {
        // 18.06.2021 Parsing Files
        String fileName = "src/data.csv";
        File file = new File(fileName);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            System.out.println("Header : " + bufferedReader.readLine());
            List<User> users = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                int id = Integer.parseInt(split[0]);
                String name = split[1];
                String email = split[2];
                User user = new User(id, name, email);
                users.add(user);
                System.out.println(user);
            }
            bufferedReader.close();
            System.out.println();
            System.out.println("Looping through Users");
            users.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            System.out.println("Error while reading the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
