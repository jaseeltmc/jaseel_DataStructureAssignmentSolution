package com.greatlearning.Ques2;

import java.util.Scanner;

public class Main {
	

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	SkySkraper noOfFloors = new SkySkraper();
        System.out.println("Enter the number of floors in the building :=");
        int n = scanner.nextInt();
        int[] sizeArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the size of the array for : Day" + (i + 1));
            sizeArray[i] = scanner.nextInt();
        }
        
        noOfFloors.buildSkyScraper(sizeArray, n);
        

}}
