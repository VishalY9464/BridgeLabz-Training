package com.day1.ResumeAnalyzer;

import java.util.List;

public class ResumeAppSystem {
	public static void main(String[] args) {
		
		String folderPath="D:\\Desktop\\FileHandling";
		List<Resume>resume=ResumeProcessor.processResume(folderPath);
		
		for(Resume r:resume) {
			System.out.println(r);
			
		}
		
		
	}

}
