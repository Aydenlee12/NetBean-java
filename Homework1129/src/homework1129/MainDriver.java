/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework1129;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ayden
 */
public class MainDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        File fileIn = new File("Exam.txt");
        Scanner fileRead = new Scanner(fileIn);
        
        //PrintWriter fileWriter = new PrintWriter("Output.txt");
        
        
            while(fileRead.hasNextLine()){
                String line = fileRead.nextLine();
                System.out.println(line);
            }
        }catch(FileNotFoundException e){ 
            System.out.println("File not found");
        }            
        }
    }