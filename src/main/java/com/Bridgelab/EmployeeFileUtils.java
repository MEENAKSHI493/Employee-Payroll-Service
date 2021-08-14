package com.Bridgelab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class EmployeeFileUtils {


    // find file exits or not
    public  boolean fileExits(){
        File file=new File("D:\\Test.txt");
        if(file.exists()){
            System.out.println("File Exists");
            return true;
        }
        else
            System.out.println("File not exists");

        return  false;
    }

    //Delete file if exists
     public static boolean deleteFile(File file) throws IOException{
        if(file!=null){
            if(file.isDirectory()){
                File[] files=file.listFiles();
                for (File f:files){
                    deleteFile(file);
                }
            }
            return Files.deleteIfExists(file.toPath());
        }
        return false;
    }

    // Create Directory
    public  boolean createDrirectory() {
        File file = new File("e:\\sample");
        if (file.mkdir()) {
            System.out.println("Directory s present");
            return true;
        } else
            System.out.println("Directory exists");
        return false;

    }
}

