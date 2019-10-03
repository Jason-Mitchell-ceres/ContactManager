package Contacts;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContactsTest {

    public static List<Contact> contacts = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        System.out.println("Phone Contact List:\n");
        createContactsList(loadContacts());
        System.out.println("Welcome to the Contacts Manager Application.\n");
        Scanner input = new Scanner(System.in);
        boolean willContinue = true;
        do {
            displayMenu();
            switch (input.nextInt()) {
                case 1:
                    displayContacts();
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
                    updateOnExit();
                    willContinue = false;
                    System.out.println("Thank you, your contact list has been updated!");
                    break;
            }
        }while (willContinue);
    }/// main()


    /// ===== Create contact ==== ///
    public static void createContactsList(List<String> lines) {
        for(String line : lines){
            /// parse through the string line to pull out the fName, lName, and number to pass to contact constructor
//            "someFirstName someLastName phonenumber";
            Contact c = null;
            try {
                String firstName = line.substring(0, line.indexOf(" "));
                System.out.println(firstName);
                String lastName = line.substring(line.indexOf(" "), line.lastIndexOf(" "));
                System.out.println(lastName);
                String phoneNumber = line.substring(line.lastIndexOf(" "));
                System.out.println(phoneNumber);
                c = new Contact(firstName, lastName, phoneNumber);
            } catch(Exception e) {
                
            }
            contacts.add(c);
        }
    }


    // ===== Load contact ==== ///
    public static List<String> loadContacts(){
        Path p = Paths.get("src","Contacts", "contact.txt");
        try {
            return Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }



    //// ==== Display Menu ==== /////
    public static void displayMenu() {
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5): \n");
    }



    //// ===== View contact list ==== ////
    public static void displayContacts() {

        List<String> contactList = new ArrayList<>();
        for(Contact contact : contacts) {
            System.out.println(contact.getName());
        }
    }







    public static void test(){
        contacts.get(0);

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
        person.setPhoneNum(input.nextLine());
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

    public static void updateOnExit() throws IOException {
        Contact person = new Contact();
//        System.out.println(person.getName());
//        String newPerson = person.getName();
//        List<String> contactList = Arrays.asList(person.getName());
        Path filePath = Paths.get("src/Contacts", "contact.txt");
//        Files.write(filePath, contactList, StandardOpenOption.APPEND);
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