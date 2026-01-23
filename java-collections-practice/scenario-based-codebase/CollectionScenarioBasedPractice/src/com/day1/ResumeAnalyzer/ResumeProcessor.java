package com.day1.ResumeAnalyzer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ResumeProcessor {
	
	public static List<Resume>processResume(String folderpath){
		HashMap<String,Resume>resumeMap=new HashMap<>();
		
		
		File folder=new File(folderpath);
		File[]files=folder.listFiles();
		
		if(files==null) return new ArrayList<>();
		
		for(File file:files) {
			
			try {
				String content=ResumeReader.readResume(file);
				String email=RegexExtractor.extractEmail(content);
				String phone=RegexExtractor.extractPhone(content);
				int score= RegexExtractor.countSkill(content);
				
				Resume data=new Resume(email,phone,score);
				resumeMap.put(email,data);
			}catch(Exception e) {
				System.out.println("Skipping Invalid Resume: "+file.getName( ));
			}
		}
		List<Resume> sortedList=new ArrayList<>(resumeMap.values());
		
		sortedList.sort((a,b)-> b.getKeywordCount()-a.getKeywordCount());
		return sortedList;
	}

}
