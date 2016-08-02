package com.raspberryradio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
*Executes command in terminal and returns line as string. 
*
 */
public class ExecuteCommand {

    public static String executeCMD(String str) {
        Process p;
        String s1;
        String[] s2 = new String[20];
        int n = 0;
        try {
            p = Runtime.getRuntime().exec(str);
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((s1 = br.readLine()) != null) {
                System.out.println("line: " + s1);
                s2[n] = s1;
                n++;
            }
            p.waitFor();
            System.out.println("exit: " + p.exitValue());
            p.destroy();
        } catch (IOException | InterruptedException e) {
            System.out.println(e);
        }
        return s2[0];
    }
}
