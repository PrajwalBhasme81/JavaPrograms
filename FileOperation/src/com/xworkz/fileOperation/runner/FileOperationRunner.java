package com.xworkz.fileOperation.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import com.xworkz.fileOperation.dto.MetroDto;

public class FileOperationRunner {
	public static void main(String[] args) throws IOException {
		MetroDto metro = new MetroDto("Ragigudda", "RV Road", 5);
		File file = new File("MetroTicket.txt");
		System.out.println("File: "+file);
		try {
			if(!file.exists()) {
				if(file.createNewFile()) {
					System.out.println("New File Created");
					addObject(metro,file);
				}else {
					addObject(metro,file);
				}
					
				}
			}catch(IOException e) {
				System.out.println("File is not Created");
			}	
		
	   Object obj = readObject(file);
		System.out.println(obj);
		
		}

	private static void addObject(MetroDto metro, File file){
		try(FileOutputStream out = new FileOutputStream(file); ObjectOutputStream in = new ObjectOutputStream(out)){
			System.out.println("Saving Object");
			in.writeObject(metro);
			System.out.println("File Length: "+file.length());
		}catch(IOException e)
		{
			System.out.println("File is not present");
		}
	}
	
	private static Object readObject(File file) {
		try(FileInputStream filein = new FileInputStream(file); ObjectInputStream in = new ObjectInputStream(filein)){
			System.out.println("Reading Object");
			return in.readObject();
		}catch(IOException | ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
			return new Object();
		}
	}
}


