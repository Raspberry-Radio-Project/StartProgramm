package com.raspberryradio.mpd;

import com.raspberryradio.ExecuteCommand;

public class Mpd {

    public static boolean does_run() {
        boolean b = false;
        String str = "pgrep mpd";
        int i = 0;
        try {
            i = Integer.parseInt(ExecuteCommand.executeCMD(str));

        } catch (Exception e) {

        }
        if (i < 0 || i < 9999) {
            System.out.println("MPD is installed");
        } else {
            System.out.println("MPD is NOT installed");
        }

        return b;
    }
}
