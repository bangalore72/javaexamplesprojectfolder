package dxc.streamexamples.invokejavascript;

 
import javax.script.*;  
import java.io.*;  
public class Example1 {  
    public static void main(String[] args) throws Exception{  
        // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading Nashorn file  
        //ee.eval(new FileReader("js/hello.js"));  
        
        ee.eval(new FileReader("/aworkarea/rworkarea/javaexamplesprojectfolderroot/javaexamplesprojectfolder/samplejs/test.js"));  
        
        
    }  
}  