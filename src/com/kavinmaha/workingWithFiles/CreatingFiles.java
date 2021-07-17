package com.kavinmaha.workingWithFiles;

import java.io.File;
import java.io.IOException;

public class CreatingFiles {
    public static void main(String[] args) {
        // 17.06.2021 File creation
        File file = new File("src/data.csv");

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created");
                System.out.println(file.getName() + " created");
            } catch (IOException e) {
                System.out.println("Error while creating file");
                System.out.println("Exception " + e);
            }
        }
    }
}
