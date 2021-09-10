package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Sorting Task");
        System.out.println("--------------------");
        sortTask();
        System.out.println("Done..............................................\n\n");

        System.out.println("Person List Task");
        System.out.println("--------------------");
        personListTask();
        System.out.println("Done..............................................\n\n");
    }

    private static void sortTask() {
        int[] intArray = new int[20];
        Random randomIntegers = new Random();

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = randomIntegers.nextInt(10001);
        }
        int[] intArrayCloned = intArray.clone();
        System.out.println("Your Array of integers:");
        System.out.println(Arrays.toString(intArray));
        System.out.println();

        System.out.println("Sort the array By using:");

        System.out.println("1- The method Array.sort");
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println();

        System.out.println("2- Hand-written sort function");
        bubbleSort(intArrayCloned);
        System.out.println(Arrays.toString(intArrayCloned));
    }

    private static void bubbleSort(int[] intArray) {
        int tempValue;

        for (int i = 0; i < (intArray.length) - 1; i++)
            for (int j = 0; j < (intArray.length) - i - 1; j++)
                if (intArray[j] > intArray[j + 1]) {
                    tempValue = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = tempValue;
                }
    }

    private static void personListTask() {

        ArrayList<Person> persons = new ArrayList();
        String[] data;

        System.out.println("Enter the data(name, age) of the persons you want to add to your list:");
        System.out.println();

        while (true) {
            System.out.print((persons.size() + 1) + "- ");
            if (scanner.hasNextInt())
                if (scanner.nextInt() == 0)
                    break;
            data = scanner.nextLine().split(",");
            persons.add(new Person(data[0], Byte.parseByte(data[1])));
        }

        if (!persons.isEmpty()) {
            System.out.println("Persons\t\tName\t\tAge");
            for (int i = 0; i < persons.size(); i++) {
                System.out.print("       \t\t" + persons.get(i).getName());
                System.out.println("\t\t" + persons.get(i).getAge());
            }
        } else {
            System.out.println("List of persons is empty");
        }
    }
}
