package com.raspberryradio;

public class MPD_Functions {

    static public void setVolume(int percent) {
        String percent_str = Integer.toString(percent); //Zahl wird zu String umgewandelt
        String str = "mpc volume " + percent_str;
        ExecuteCommand.executeCMD(str); //String wird weiter an executeCMD() Methode gegeben
    }
    
    //Updatet die Datenbank
    public static void update(){
        String str = "mpc update";
        ExecuteCommand.executeCMD(str);
    }
    public static void status(){
        
    }
    
    //Lädt Playlist für die Wiedergabe
    public static void loadPlaylist(String mstr){
        String str = "mpc load ";
        ExecuteCommand.executeCMD(str + mstr);
    }
    /*public void playlist(){
        String str = "mpc playlist";
        
    }*/
    
    //Beginnt Abspielen einer Playlist
    public static void play(int i){
        String i_str = Integer.toString(i);
        String str = "mpc play " + i_str;
        ExecuteCommand.executeCMD(str);
    }
    
    //Spielt nächsten Song in der Playlist
    public static void next(){ 
        String str = "mpc next";
        ExecuteCommand.executeCMD(str);
    }
    
    //Stoppt bzw. beginnt wieder mit abspielen
    public static void pause(){
        String str = "mpc pause";
        ExecuteCommand.executeCMD(str);
    }
    
    //Löscht die alte Playlist mit den Streams. 
    public static void clear(){
        String str = "mpc clear";
        ExecuteCommand.executeCMD(str);
    }
}
