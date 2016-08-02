package com.raspberryradio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Felix
 */
public class ExecuteCommand {
    public static String executeCMD(String str){
        Process p;
        String s1;
        String s2 = "";
        try{
           p = Runtime.getRuntime().exec(str);
           BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
           while((s1 = br.readLine())!= null) {
               System.out.println("line: " + s1);
               s2 = s1;
           }
           p.waitFor();
           System.out.println("exit: " + p.exitValue());
           p.destroy();
        }catch(IOException | InterruptedException e){
            System.out.println(e);
        }
        return s2;
    }
}
