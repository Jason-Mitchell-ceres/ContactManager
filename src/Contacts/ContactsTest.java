package Contacts;

import java.util.Scanner;

public class ContactsTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Contact person = new Contact();

        System.out.println("Give me a First Name: ");
        person.setFName(input.nextLine());

        System.out.println("Give me a Last Name: ");
        person.setLName(input.nextLine());

        System.out.println("Give me a Phone Number: ");
        person.setPhoneNum(input.nextLong());

        System.out.println(person.getName());


        System.out.println("\n1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
    }

    public void contactList () {

    }

}
