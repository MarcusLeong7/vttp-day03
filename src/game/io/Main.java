package game.io;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        // Reference to a file ; Getting a path
        Path p =Paths.get("catinthehat.txt");
        System.out.printf("toString:%s\n",p.toString());

        //Converting a path to file and Get the file
        File f = p.toFile();


        // Information of the file
        System.out.printf("get absolute path %s\n",f.getAbsolutePath());
        System.out.printf("getname: %%s\n",f.getName());
        System.out.printf("file size: %d\n",f.length());

        // Use File
        File cat = new File("src/game/io/Main.java");
        System.out.printf("get absolute path %s\n",cat.getAbsolutePath());
        System.out.printf("getname: %%s\n",cat.getName());
        System.out.printf("file size: %d\n",cat.length());
    }
    
}
