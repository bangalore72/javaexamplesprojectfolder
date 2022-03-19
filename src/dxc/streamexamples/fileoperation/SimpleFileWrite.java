package dxc.streamexamples.fileoperation;

import java.io.*;

public class SimpleFileWrite {
	
	public static void main(String[] args)
	{
		
		try
		{
			FileOutputStream fout = new FileOutputStream("/tmp/simple.txt");
			
			fout.write(65);
			
			fout.close();
			
			System.out.println(" created file..");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		read();
		
		
	}

	
	public static void read()
	{

		try
		{
			FileInputStream fin = new FileInputStream("/tmp/simple1.txt");
			
			int i = 0;
			
			while( (i = fin.read() )!= -1 )
			{
				System.out.print( (char)i );
					
			}
			 
			
			System.out.println(" read file completed..");
			
			fin.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
