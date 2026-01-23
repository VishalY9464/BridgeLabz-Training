package com.day1.ResumeAnalyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ResumeReader {
	
	public static String readResume(File file) throws Exception {
		
		if(!file.getName().endsWith(".txt") && !file.getName().endsWith(".pdf")) {
			throw new Exception("Unsupported file format");
		}
		
		BufferedReader reader=new BufferedReader(new FileReader(file));
		StringBuilder content=new StringBuilder();
		
		String line;
		while((line=reader.readLine())!=null) {
			content.append(line).append(" ");
		}
		reader.close();
		return content.toString();
	}

}
