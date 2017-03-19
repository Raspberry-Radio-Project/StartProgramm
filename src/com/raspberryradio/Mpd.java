package com.raspberryradio;

import com.raspberryradio.ExecuteCommand;

public class Mpd {

    public static boolean does_run() {
        boolean b = false;
        String str = "pgrep mpd"; //Gibt Prozess ID aus
        int i = 0;
        try {
            i = Integer.parseInt(ExecuteCommand.executeCMD(str));

        } catch (Exception e) {

        }
        if (i < 0 || i < 9999) {
            System.out.println("MPD is installed");
        } else {
            if(ExecuteCommand.rootPermissions()){
                ExecuteCommand.executeCMD("sudo apt-get install mpd mpc alsa-utils usbmount"); //Installiert mpd, mpc, alsa-utils (Für Soundkarte), usbmount (erkennt automatisch USB-Sticks)
            }else{
                System.out.println("MPD is NOT installed");
            }
        }

        return b;
    }
}
