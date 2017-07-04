package com.raspberryradio;

import java.util.Properties;

public class StartProgramm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Starting...");
        
        ExecuteCommand.activeusb();

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
        //ExecuteCommand.rootPermissions();
        //Prüft ob mpd installiert ist, wenn nicht, wird es installiert. 
        Mpd.does_run();
       
        /* Wird ausgelagert in Autostartscript
        System.out.println("Ordnerstruktur anpassen...");
        ExecuteCommand.executeCMD("sudo chmod g+w /var/lib/mpd/music/ /var/lib/mpd/playlists/");    //Schreib- und Leserechte werden gesetzt.
        ExecuteCommand.executeCMD("sudo chgrp audio /var/lib/mpd/music/ /var/lib/mpd/playlists/");  //Setzt die Gruppenzugehörigkeit von Ordner und Dateien
        */
        
        System.out.println("Starting: GUI");
        
        Touch touch = new Touch(); //Erstellt Objekt touch für die Oberfäche
        touch.setVisible(true); //Macht die GUI sichtbar für den Nutzer
        
        //Serielle Schnittstelle wird verwendet, um dem Verstärker mitzuteilen, dass das Radio eingeschalten wurde.
        System.out.println("Verstärker ");
        SerialConnection.connect();
        
        System.out.println("...Ending");
    }
}
