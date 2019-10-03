package TestPack;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class CreateAndLoad {

    public static void create() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("data", "groceries.txt"));
        List<String> newList = new ArrayList<>();

        for (String line : lines) {
            if (line.equals("milk")) {
                newList.add("cream");
                continue;
            }
            newList.add(line);
        }
        Files.write(Paths.get("data", "groceries.txt"), newList);
    }


    public static void main(String[] args) throws IOException {
        create();
    }


}
