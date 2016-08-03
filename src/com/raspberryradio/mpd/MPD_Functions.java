package com.raspberryradio.mpd;

import com.raspberryradio.ExecuteCommand;

public class MPD_Functions {

    public void setVolume(int percent) {
        String percent_str = Integer.toString(percent);
        String str = "mpc volume " + percent_str;
        ExecuteCommand.executeCMD(str);
    }
    public void update(){
        String str = "mpc update";
        ExecuteCommand.executeCMD(str);
    }
    public void loadPlaylist(){
        String str = "mpc load playlist";
        ExecuteCommand.executeCMD(str);
    }
    public void play(int i){
        String i_str = Integer.toString(i);
        String str = "mpc play " + i_str;
        ExecuteCommand.executeCMD(str);
    }
}
