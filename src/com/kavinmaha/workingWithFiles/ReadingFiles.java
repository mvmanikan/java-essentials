package com.kavinmaha.workingWithFiles;

import java.io.*;

public class ReadingFiles {
    public static void main(String[] args) {
        // 17.06.2021 File Reading
        String fileName = "src/data.csv";
        File file = new File(fileName);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String contents = "";
            while ((contents = bufferedReader.readLine()) != null) {
                System.out.println(contents);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error while reading the file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
