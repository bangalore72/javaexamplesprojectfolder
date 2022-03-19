package dxc.streamexamples.fileoperation;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DirectoryFileReader {
	public static void main(String[] args) throws IOException{  
        File dir = new File("/tmp/tmp1");
        File[] files = dir.listFiles();
        // Fetching all the files
        for (File file : files) {
            if(file.isFile()) {
                BufferedReader inputStream = null;
                String line;
                try {
                    inputStream = new BufferedReader(new FileReader(file));
                    while ((line = inputStream.readLine()) != null) {
                        System.out.println(line);
                    }
                }catch(IOException e) {
                	System.out.println(e);
                }
                finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            }
        }
        
	}
}
 