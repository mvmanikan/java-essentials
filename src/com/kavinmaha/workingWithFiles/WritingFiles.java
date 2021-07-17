package com.kavinmaha.workingWithFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingFiles {
    public static void main(String[] args) {
        // 17.06.2021 File writing
        String fileName = "src/data.csv";
        File file = new File(fileName);

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

        try {
//            FileWriter fileWriter = new FileWriter(fileName,true);
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("id,name,email");
            printWriter.println("1,Mani,mvmanikan@gmail.com");
            printWriter.println("2,Sheeba,sheeba.manimv@gmail.com");
            printWriter.println("3,Kavin,kavin.mani@gmail.com");
            printWriter.println("4,Maha,maha.mani@gmail.com");
            printWriter.flush(); // flush and then close
            printWriter.close();
            System.out.println("File Writing completed");
        } catch (IOException e) {
            System.out.println("FileWriter Error");
            System.out.println(e);
        }
    }
}
