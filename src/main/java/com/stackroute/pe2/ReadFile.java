package com.stackroute.pe2;

import java.io.*;

public class ReadFile {
    public String fileReader(String fileName, String extension){
        StringBuilder finalOutput = new StringBuilder();
        String fileNameAndExtension = fileName.concat(extension);
        try {
            File file = new File("/home/test/Documents/stack route/Java Assignment/pe2-testcases/text/".concat(fileNameAndExtension));
            FileReader fileReaderObj = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReaderObj);
            String string;
            try {
                while ((string = bufferedReader.readLine()) != null) {
                    finalOutput.append(string);
                }
            }catch (IOException exception){
                try {
                    throw new IOException();
                }catch (Exception ex){}
            }
        }catch (FileNotFoundException exception){
            try {
                throw new FileNotFoundException();
            }catch (Exception ex){}
        }
        finally {

        }
        return finalOutput.toString().toUpperCase();
    }

    public int lengthOf(String fileName, String extension){
        return fileReader(fileName, extension).length();
    }
}
