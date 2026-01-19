package com.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReadUserInputFromConsole {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name: ");
		String name=reader.readLine();
		System.out.println("Enter age: ");
		int age=Integer.parseInt(reader.readLine());
		System.out.println("Enter favorite language: ");
		String favorite=reader.readLine();
		
		BufferedWriter writer=new BufferedWriter(new FileWriter("D:\\Desktop\\FileHandling\\ClassFile.txt"));
		 

        writer.write("Name: " + name);
        writer.newLine();
        writer.write("Age: " + age);
        writer.newLine();
        writer.write("Favorite Language: " + favorite);

        writer.close();
        reader.close();

        System.out.println("Data written to file successfully!");
	}

}
