package ex45;

/*
 *  UCF COP3330 Fall 2021 Assignment 45 Solution
 *  Copyright 2021 Jenna Busch
 */

//pseudocode
//first I need to prompt for the output file
//create a new output file based off that name
//next I need to trace through the input file text and find the word "utilize"
//Throughout this I need to replace these words with "use" and write them to the output file
//then I need to close the files

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exercise45 {
    public static void main(String[] args) throws IOException {
        //create a scanner
        Scanner input = new Scanner(System.in);
        File file = new File("src/main/java/ex45/exercise45_input.txt");
        Scanner inputFile = new Scanner(file);

        System.out.println("What is the name of your output file?");
        String fileName = input.next();

        //create output file
        FileWriter outputFile = new FileWriter("src/main/java/ex45/"+fileName);

        //go through input file
        while(inputFile.hasNext())
        {
            String words = inputFile.nextLine();
            words = words.replaceAll("utilize", "use");
            outputFile.write(words);
            outputFile.write("\n");
        }

        //if you dont close it wont write to the output
        inputFile.close();
        outputFile.close();

    }
}
