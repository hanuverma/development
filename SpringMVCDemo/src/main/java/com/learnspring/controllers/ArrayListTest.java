package com.learnspring.controllers;

import java.util.ArrayList;

public class ArrayListTest {
		public static void main(String[] args) {
			
			ArrayList al = new ArrayList();
			
			al.add("1");
			al.add("3");
			al.add("4");
			al.add(1, "2");
			
			for (Object  object : al) {
				System.out.println(object);
			}
		}
}
