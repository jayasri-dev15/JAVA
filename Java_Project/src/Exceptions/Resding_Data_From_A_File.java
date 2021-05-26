package Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Resding_Data_From_A_File 

{

	public static void main(String[] args) 
	
	{
		//Define the file path to read
		String filename="C:\\ex1\\read_from_file.txt";
		
		String text = null;
		
		//create the file in java
		File file=new File(filename);
		
        //open the file
		
		try
		{
			
			//read the file
			
			BufferedReader br=new BufferedReader(new FileReader(file));
			
		}catch(FileNotFoundException e)
		{
			System.out.println("ERROR: File not found: "+filename);
			e.printStackTrace();
		}catch(IOException e)
		{
			System.out.println("ERROR: Unable to read the file text: "+filename);
			e.printStackTrace();
		}finally
		{
			System.out.println("Finished reading");
		}
		System.out.println(text);
	}
	
	

}
