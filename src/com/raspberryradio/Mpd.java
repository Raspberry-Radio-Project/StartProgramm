package com.raspberryradio;

public class Mpd {

    public static boolean does_run() {
        boolean b = false;
        String str = "pgrep sasa"; //Gibt Prozess ID aus
        String answ; //Speichert die Antwort von der Methode "executeCMD(str)"
        
        answ = ExecuteCommand.executeCMD(str);
        
        if (("null").equals(answ) == false) {
            System.out.println("MPD is installed");
        } else {
            if(ExecuteCommand.rootPermissions()){
                ExecuteCommand.executeCMD("sudo apt-get install mpd mpc alsa-utils"); //Installiert mpd, mpc, alsa-utils (Für Soundkarte)
            }else{
                System.err.println("MPD is NOT installed");
            }
        }

        return b;
    }
}
