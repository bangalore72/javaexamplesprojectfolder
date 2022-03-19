package dxc.streamexamples.fileoperation;

 
import java.io.File;
import java.io.*;

public class FilenameFilterExample {
    private static final String PATH = "/tmp/tmp1";

    public static void main(String[] args) {
        File directory = new File(PATH);
        File[] fileList = directory.listFiles();

        for (File file : fileList) System.out.println(file.getName());
    }

}

class MyFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".txt");
    }
}
