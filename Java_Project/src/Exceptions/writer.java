package Exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writer 

{

	public static void main(String[] args) 
	{
		
        String filename="C:\\ex1\\read_from_file.txt";
		
		String text ="Writing a piece of line";
		
		File file=new File(filename);
		
		try
		{
			FileWriter fr=new FileWriter(file);
			fr.write(text);
			fr.close();
		}catch(IOException e)
		{
			System.out.println("ERROR: Unable to read the file text: "+filename);
			e.printStackTrace();
		}finally
		{
			System.out.println("Finished writing");
		}

	}

}
