/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raspberryradio.mpd;

import com.raspberryradio.ExecuteCommand;

/**
 *
 * @author Felix
 */
public class Mpd {
    public static boolean does_run(){
        boolean b = false;
        String str = "pgrep mpd";
        int i = 0;
        try{
             i = Integer.parseInt(ExecuteCommand.executeCMD(str));
            
        }catch(Exception e){
           
        }
        if(i<0 || i< 9999){
            System.out.println("MPD is installed");
        }else{
            System.out.println("MPD is NOT installed");
        }
        
        return b;
    }
}
