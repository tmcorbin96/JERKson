package io.zipcoder;

import io.zipcoder.utils.FileReader;
import org.apache.commons.io.FileUtils;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class GroceryReporter {
    private final String originalFileText;

    public GroceryReporter(String jerksonFileName) {
        this.originalFileText = FileReader.readFile(jerksonFileName);
    }

    @Override
    public String toString() {
//        String content;
//        try {
//            content = new String(Files.readAllBytes(Paths.get(GroceryReporter)));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//
        String fileName = "RawInput.JerkSON";
        File file = new File(fileName);

        String content;
        try {
            content = new String(Files.readAllBytes(Paths.get("RawInput.JerkSON")), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return content;
    }

}
