package Contacts;

import java.util.Scanner;
import javax.imageio.IIOException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Collections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactsTest {
    public static void main(String[] args) throws IOException {



        ///// ======= MAIN BUILD ========= ///////
        Scanner input = new Scanner(System.in);
        Contact person = new Contact();

        System.out.println("Give me a First Name: ");
        person.setFName(input.nextLine());

        System.out.println("Give me a Last Name: ");
        person.setLName(input.nextLine());

        System.out.println("Give me a Phone Number: ");
        person.setPhoneNum(input.nextLong());







        //// ======== Add to text file ========== ///////
//        System.out.println(person.getName());
        String newPerson = person.getName();
        List<String> contactList = Arrays.asList(person.getName());
        Path filePath = Paths.get("src/Contacts", "contact.txt");
        Files.write(filePath, contactList);







        //// ======== Search by name ========== ///////
        System.out.println("Hey, who you lookin' for?");
        String searchName = input.nextLine();
//        System.out.println(newPerson.indexOf(searchName));






        System.out.println("\n1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");


//        String directory = "contacts";
//        String filename = "contact.txt";
//
//        Path dataDirectory = Paths.get(directory);
//        Path dataFile = Paths.get(directory, filename);
//
//        if (Files.notExists(dataDirectory)) {
//            Files.createDirectories(dataDirectory);
//        }
//
//        if (!Files.exists(dataFile)) {
//            Files.createFile(dataFile);
//        }





    }


    public void contactList() {

    }


}
