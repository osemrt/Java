
import java.io.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<Contact> contacts = new ArrayList<>();

        contacts.add(new Contact("Shannon A. Cook", "956-348-0681", "ShannonACook@armyspy.com", "eejie2Aed"));
        contacts.add(new Contact("Sara C. Appel", "603-793-2844", "SaraCAppel@jourrapide.com", "Dend1946"));
        contacts.add(new Contact("Kevin S. Tetreault", "305-572-2854", "KevinSTetreault@rhyta.com", "phoh0Ooh0v"));
        contacts.add(new Contact("Andrew T. Sack", "303-406-1525", "ndrewTSack@teleworm.us", "Uugh3lio3v"));

        File file = new File("contacts.dat");


        //Writing the objects to the file
        try {

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, false));

            objectOutputStream.write(contacts.size());  //Caution!

            for (Contact aContact : contacts)
                objectOutputStream.writeObject(aContact);


            objectOutputStream.close();
            System.out.println("The information you have entered has been successfully saved in file " + file.getName());


        } catch (IOException e) {
            System.out.println("An exception has occurred during writing to the file.");
            e.printStackTrace();
        }


        //Reading the objects from the file
        try {

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            int contactCount = objectInputStream.read();

            for (int i = 0; i < contactCount; i++) {
                System.out.println((Contact) objectInputStream.readObject());
            }

            objectInputStream.close();


        } catch (IOException e) {
            System.out.println("A file reading exception has occurred");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("A class cast exception has occurred");
            e.printStackTrace();
        }


    }

}

