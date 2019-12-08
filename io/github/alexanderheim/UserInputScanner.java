package io.github.alexanderheim;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class UserInputScanner {
    private String filepath;

    public UserInputScanner(String filepath){
        this.filepath = filepath;
    }

    public void setFilePath(String filepath){
        this.filepath = filepath;
    }

    public String getText() throws IOException, TooManyCharsException {
        List<String> lines = Files.readAllLines(Paths.get(filepath), StandardCharsets.UTF_8);
        String output = "";
        for(String s : lines){
            output += s;
            output += "\n";
        }
        output = output.trim();
        if(output.length() > 300) throw new TooManyCharsException("More than 300 Chars!");
        return output;
    }
}
