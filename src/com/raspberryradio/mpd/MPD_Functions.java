package com.raspberryradio.mpd;

import com.raspberryradio.ExecuteCommand;

public class MPD_Functions {

    public void setVolume(int percent) {
        String percent_str = Integer.toString(percent); //Zahl wird zu String umgewandelt
        String str = "mpc volume " + percent_str;
        ExecuteCommand.executeCMD(str); //String wird weiter an executeCMD() Methode gegeben
    }
    
    //Updatet die Datenbank
    public void update(){
        String str = "mpc update";
        ExecuteCommand.executeCMD(str);
    }
    public void status(){
        
    }
    
    //Lädt Playlist für die Wiedergabe
    public void loadPlaylist(){
        String str = "mpc load playlist";
        ExecuteCommand.executeCMD(str);
    }
    /*public void playlist(){
        String str = "mpc playlist";
        
    }*/
    
    //Beginnt Abspielen einer Playlist
    public void play(int i){
        String i_str = Integer.toString(i);
        String str = "mpc play " + i_str;
        ExecuteCommand.executeCMD(str);
    }
    
    //Spielt nächsten Song in der Playlist
    public void next(){ 
        String str = "mpc next";
        ExecuteCommand.executeCMD(str);
    }
    
    //Stoppt bzw. beginnt wieder mit abspielen
    public void pause(){
        String str = "mpc pause";
        ExecuteCommand.executeCMD(str);
    }
    
}
