/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raspberryradio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Properties;

/**
 *
 * @author Felix
 */
public class StartProgramm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Starting...");
        
        
        //Get OS-Name
        String os = "os.name";
        Properties prop = System.getProperties();   //http://lopica.sourceforge.net/os.html
        
        //Check OS
        String needed_os = "Linux";
        if(prop.getProperty(os).equals(needed_os)){
            
        } else {
            System.out.println("Does not run on "+prop.getProperty(os));
            //System.exit(0);
        }
        
        //Check if mpd is installed
        String s;
        Process p;
        try{
           p = Runtime.getRuntime().exec("sudo apt-get install mpd");
           BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
           while((s = br.readLine())!= null) {
               System.out.println("line: " + s);
           }
           p.waitFor();
           System.out.println("exit: " + p.exitValue());
           p.destroy();
        }catch(IOException | InterruptedException e){
            System.out.println(e);
        }
    }
}
