package com.raspberryradio.mpd;

import com.raspberryradio.ExecuteCommand;

public class MPD_Functions {

    public void setVolume(int percent) {
        String percent_str = Integer.toString(percent);
        String str = "mpc volume " + percent_str;
        ExecuteCommand.executeCMD(str);
    }
}
