package com.demoqa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigrationReader {
    //create an Object of property
    private static Properties properties= new Properties();

 static{

     try{
         //need to open the file in java memory: FileInputStream
         FileInputStream file = new FileInputStream("configuration.properties");

         //load the properties object using FileInputStream object
         properties.load(file);

         //close file
         file.close();
     }catch(IOException e){
         System.out.println("File is not found in cofiguration.properties");
         e.printStackTrace();
     }

 }
 public static String getProperty(String keyword){
     return properties.getProperty(keyword);
 }

}
