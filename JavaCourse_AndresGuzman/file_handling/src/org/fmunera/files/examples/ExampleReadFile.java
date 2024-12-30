package org.fmunera.files.examples;

import org.fmunera.files.examples.service.FileService;

public class ExampleReadFile {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\VivoBook\\Documents\\test_file_handling_java\\java.txt";

        FileService service = new FileService();
        System.out.println(service.readFile2(fileName));

    }
}
