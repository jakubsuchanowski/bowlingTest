package com.example.primenumbers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PrimeNumbersApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimeNumbersApplication.class, args);
        Scanner in = new Scanner(System.in);
        System.out.println("Give the maximum of the range (eg.100)");
        String s = in.nextLine();
        int size = Integer.parseInt(s) - 1;
        PrimeNumbers pm = new PrimeNumbers();
        int[][] numbersTable = pm.createTable(size);
        int root = new CommonOperations().floorRootValue(size);
        numbersTable = pm.markNonPrimeFromTable(numbersTable, root);
        System.out.println("");
        pm.showPrimeNumbers(numbersTable);
    }

}
