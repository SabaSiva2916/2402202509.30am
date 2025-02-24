package org.smpl;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;

public class A {

	public static void main(String[] args) {
		char baseChar = 'a'; // Starting character
		int maxRows = 7; // Total rows in the pattern

		for (int i = 0; i < maxRows; i++) {
			// Print the first part: 'a' repeated (maxRows - i) times
			for (int j = 1; j < maxRows - i; j++) {
				System.out.print(baseChar); //aaaaaaa
			}                              // aaaaabb     
                                         
			// Print the second part: next character repeated (i) times
			char nextChar = (char) (baseChar + i);
			for (int j = 0; j < i+1; j++) {
				System.out.print(nextChar);
			}

			// Move to the next line
			System.out.println();
		}

	}
}
