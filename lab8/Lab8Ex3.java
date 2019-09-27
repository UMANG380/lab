package com.cg.lab.lab8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab8Ex3 {
	
	public static void main(String[] args) throws IOException 
    { 
        File file = new File("C:abc.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line; 
          
        // Initializing counters 
        int countWord = 0; 
        int lineCount = 0; 
        int characterCount = 0; 
        
          
        
        while((line = reader.readLine()) != null) 
        { 
           
            if(!(line.equals(""))) 
            { 
                  
                characterCount += line.length(); 
                  
                
                String[] wordList = line.split("\\s+"); 
                  
                countWord += wordList.length; 
                 
                  
              
                String[] lineList = line.split("[!?.:]+"); 
                  
                lineCount += lineList.length; 
            } 
        } 
          
        System.out.println("Total word count = " + countWord); 
        System.out.println("Total number of lines = " + lineCount); 
        System.out.println("Total number of characters = " + characterCount); 
        
    } 

}
