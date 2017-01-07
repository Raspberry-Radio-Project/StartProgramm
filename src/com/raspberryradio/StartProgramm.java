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

        //Get OS-Name
        String os = "os.name";
        Properties prop = System.getProperties();   //http://lopica.sourceforge.net/os.html

        //Check OS
        String needed_os = "Linux";
        if (prop.getProperty(os).equals(needed_os)) {

        } else {
            System.out.println("Does not run on " + prop.getProperty(os));
            //System.exit(0);   Kann später wieder eingefügt werden
        }
        //Do we have root rights?
        ExecuteCommand.rootPermissions();
        
        //Check if mpd is running
        Mpd.does_run();
        
        Touch touch = new Touch(); //Erstellt Objekt touch für die Oberfäche
        touch.setVisible(true); //Macht die GUI sichtbar für den Nutzer
        
    }
}
