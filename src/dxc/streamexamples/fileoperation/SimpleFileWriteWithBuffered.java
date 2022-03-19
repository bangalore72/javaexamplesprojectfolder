package dxc.streamexamples.fileoperation;

import java.io.*;

public class SimpleFileWriteWithBuffered {
	
	public static void main(String[] args)
	{
		
		try
		{
			FileOutputStream fout = new FileOutputStream("/tmp/testout1.txt");
			 
			BufferedOutputStream  bfout = new BufferedOutputStream(fout);
			
			String s = " This is a test data for writing ....";
			
			byte[] arr = s.getBytes();
			
			bfout.write(arr);
			
			bfout.flush();
			
			bfout.close();
			
			fout.close();
			
			
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println(" write file completed..");
		
		readByBufferedStream();
		
	}

	
	public static void readByBufferedStream()
	{

		try
		{
			FileInputStream fin = new FileInputStream("/tmp/testout1.txt");
			
			BufferedInputStream  bfin = new BufferedInputStream(fin);
			
			
			
			
			int i = 0;
			
			while( (i = bfin.read() )!= -1 )
			{
				System.out.print( (char)i );
					
			}
			 
			
			System.out.println(" read file completed..");
			
			bfin.close();
			
			fin.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
