package com.raspberryradio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Felix
 */
public class ExecuteCommand {
    public static void executeCMD(String str){
        Process p;
        String s;
        try{
           p = Runtime.getRuntime().exec(str);
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
