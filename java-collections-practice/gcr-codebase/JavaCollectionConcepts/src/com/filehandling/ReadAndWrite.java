package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("D:\\Desktop\\FileHandling\\ClassFile2.txt");
		    FileOutputStream fos=new FileOutputStream("D:\\Desktop\\FileHandling\\ClassFile.txt");
		    
		    int txt;
		    while((txt=fis.read())!=-1){
		    	fos.write(txt);
		    }
		   System.out.println("File copied successful!");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
