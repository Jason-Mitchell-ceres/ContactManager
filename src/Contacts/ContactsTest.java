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
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Contacts Manager Application.\n");
        System.out.println("\n1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
    switch(input.nextInt()) {
        case 1:
            getContactList();
            break;
        case 2:
            addContact();
            break;
        case 3:
            searchPerson();
            break;
        case 4:
            deletePerson();
            break;
        case 5:
//            updateOnExit();
            break;
    }


//        searchPerson();
//        deletePerson();
//        System.out.println(getContactList());

//
    }



    //// ===== View contact list ==== ////
    public static List<String> getContactList() {
        Path p = Paths.get("src/Contacts","contact.txt");

        List<String> contactList = new ArrayList<>();

        try {
            contactList = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contactList;
    }




    ///// ======= Add contact  ========= ///////
    public static void addContact(){
        Scanner input = new Scanner(System.in);
        Contact person = new Contact();


        System.out.println("Give me a First Name: ");
        person.setFName(input.nextLine());

        System.out.println("Give me a Last Name: ");
        person.setLName(input.nextLine());

        System.out.println("Give me a Phone Number: ");
        person.setPhoneNum(input.nextLong());
}


        ///// ==== Search contacts === ////
    public static void searchPerson() {
        //// ======== Search by name ========== ///////
//        System.out.println(newPerson.indexOf(searchName));
        Scanner input = new Scanner(System.in);
        System.out.println("Hey, who you lookin' for?");
        String searchName = input.nextLine();
    }


    //// ==== Delete Contacts ===== //////
    public static void deletePerson() {
        Contact person = new Contact();
        Scanner input = new Scanner(System.in);
        System.out.println("Who do you want to remove?");

    }

    //// ======== Update text file ( upon exit )  ========== ///////

    public static void updateOnExit(Contact person) throws IOException {
//        System.out.println(person.getName());
        String newPerson = person.getName();
        List<String> contactList = Arrays.asList(person.getName());
        Path filePath = Paths.get("src/Contacts", "contact.txt");
        Files.write(filePath, contactList, StandardOpenOption.APPEND);
    }




}





///// NOTES //////

    /// Search notes ///
//List<String> contactList = null;
//        try {
//            contactList = Files.readAllLines(Paths.get("src/Contacts", "contact.txt"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        List<String> newContactList = new ArrayList<>();
//        for (String contact : contactList) {
//            if (contact.equalsIgnoreCase(person.getName())) {
//                newContactList.add("starch");
//                continue;
//            }
//            newContactList.remove(input.nextLine());
//        }
////
//        System.out.println(newContactList);
////
//        try {
//            Files.write(Paths.get("src/Contacts", "contact.txt"), newContactList);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
