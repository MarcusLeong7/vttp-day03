package game.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain {

    public static void main(String[] args) 
        throws FileNotFoundException, IOException{

        // Check if a file path is provided as an argument
        if (args.length < 1) {
            System.err.println("Error: Please provide a file name as a command-line argument.");
                return; // Exit the program if no argument is provided
        }
        
        File file = new File(args[0]);
        //Throws an exception
        InputStream fis = new FileInputStream(file);

        BufferedReader ois = new BufferedReader(new InputStreamReader(fis));

        int totalWords = 0;

        while (true) {
            String line = ois.readLine();
            if (null == line)
                break;
            System.out.printf(">>>: %s\n",line.toUpperCase());
            String[] words = line.split(" ");
            totalWords += words.length;

        }

        System.out.printf(">>> total words:%s\n", totalWords);

        // Create a buffer
        //byte[] buffer = new byte[1024];

        //Read the file
        //int bytesRead = 0;
        //int total = 0;
        //while (bytesRead >= 0) {
           // bytesRead = is.read(buffer);
            //if (bytesRead >= 0)
             //   total += bytesRead;
            //System.out.printf(">>> bytes read: %d\n", bytesRead);
        // }
        // while ((bytesRead = is.read(buffer))>=0));

        //After eading close the stream
        fis.close();

    }
    
}
