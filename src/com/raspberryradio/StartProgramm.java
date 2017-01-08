package com.raspberryradio;

import com.raspberryradio.mpd.Mpd;
import com.raspberryradio.touch.Touch;
import java.util.Properties;

public class StartProgramm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Starting...");

        //Betriebssystem wird erkannt bzw. ausgelesen
        String os = "os.name";
        Properties prop = System.getProperties();   //http://lopica.sourceforge.net/os.html

        
        String needed_os = "Linux";
        //Prüft ob Linux das Betriebssystem ist
        if (prop.getProperty(os).equals(needed_os)) {

        } else {
            System.out.println("Does not run on " + prop.getProperty(os));
            //System.exit(0);  //Beendet das Programm
        }
        //Läuft das Programm mit Adminrechten?
        ExecuteCommand.rootPermissions();
        
        //Prüft ob mpd installiert ist, wenn nicht, wird es installiert. 
        Mpd.does_run();
        
        Touch touch = new Touch(); //Erstellt Objekt touch für die Oberfäche
        touch.setVisible(true); //Macht die GUI sichtbar für den Nutzer
        
    }
}
