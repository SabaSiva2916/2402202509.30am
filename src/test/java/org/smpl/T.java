package org.smpl;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Vector;

import io.cucumber.java.lu.a;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class T {

	public static void main(String[] args) {

		// Creating object for Vector class
		Vector<String> v = new Vector<String>();
		// Adding values into Vector
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("e");
		v.add("d");

		System.out.println(v); // [a,b,c,e,d]
		// TO get the output as one by one format --> We need to go for iteration
		// We perfrom iteration without using for and for each

		Enumeration<String> elements = v.elements();

		while (elements.hasMoreElements()) {
			String string = elements.nextElement();
			System.out.println(string);
		}

		System.out.println();

		Iterator<String> iterator = v.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			if (string.equals("e")) {
				iterator.remove();
			}
		}

		System.out.println(v);

		System.out.println();

		ListIterator<String> listIterator = v.listIterator();
		while (listIterator.hasNext()) {
			String string = listIterator.next();
			System.out.println(string);
		}
		System.out.println();

		while (listIterator.hasPrevious()) {
			String string = listIterator.previous();
			System.out.println(string);
		}

		System.out.println();
		
		while (listIterator.hasNext()) {
			String string = listIterator.next();
			if (string.equals("c")) {
				listIterator.add("d");
			} else if (string.equals("d")) {
				listIterator.set("course");
			} else if (string.equals("a")) {
				listIterator.remove();
			}
		}
		System.out.println(v);
	}

}
