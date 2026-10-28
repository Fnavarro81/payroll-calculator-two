package com.pluralsight;
import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("Enter the name of file: ");
            String employeesFile = inputScanner.nextLine();
        try {
            FileReader fileReader = new FileReader(employeesFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Print table header
            System.out.println("\n===============================================");
            System.out.printf("%-5s | %-18s | %s%n", "ID", "Name", "Gross Pay");
            System.out.println("===============================================");

            String line = bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null){

            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
