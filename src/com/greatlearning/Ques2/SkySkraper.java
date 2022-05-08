package com.greatlearning.Ques2;

import java.util.Stack;

public class SkySkraper {
	 
	public void buildSkyScraper(int[] sizes, int n) {
	        Stack<Integer> sizeStack = new Stack<>();
	        int dayWithHighestSize = n;
	        System.out.println("=========The order of construction is as follows===============");
	        for (int i = 0; i < n; i++) {
	            int sizeOfTheDay = sizes[i];
	            if (sizeOfTheDay < dayWithHighestSize) {
	                sizeStack.push(sizeOfTheDay);
	                System.out.println("Day: " + (i + 1) + " ");
	            } else {
	                System.out.println("Day: " + (i + 1));
	                System.out.print(sizeOfTheDay + " ");
	                dayWithHighestSize--;
	                while (!sizeStack.isEmpty() && sizeStack.peek() >= dayWithHighestSize) {
	                    System.out.print(sizeStack.pop() + " ");
	                    dayWithHighestSize--;
	                }
	            }
	            System.out.println();
	        }
	    }

}
