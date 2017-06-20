/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raspberryradio;

import jssc.SerialPort;
import jssc.SerialPortException;

public class SerialConnection {
    static void connect(){
        SerialPort serialPort = new SerialPort("/dev/ttyUSB0"); //Dateipfad des SerialChips.
        try {
            System.out.println("Port opened: " + serialPort.openPort());
            System.out.println("Params setted: " + serialPort.setParams(9600, 8, 1, 0));
            System.out.println("\"VS\" successfully writen to port: " + serialPort.writeBytes("VS".getBytes())); //Zeichenkette zum Anschalten des Verstärkers
            System.out.println("\"VD\" successfully writen to port: " + serialPort.writeBytes("VD".getBytes())); //Zeichenkette zum Durchschalten auf die Lautsprecher
            System.out.println("Port closed: " + serialPort.closePort());
        }
        catch (SerialPortException ex){
            System.out.println(ex); //Fehlermeldung wird in der Konsole angezeigt.
        }
    }
    
    static void change(){
        SerialPort serialPort = new SerialPort("/dev/ttyUSB0"); //Dateipfad des SerialChips.
        try {
            System.out.println("Port opened: " + serialPort.openPort());
            System.out.println("Params setted: " + serialPort.setParams(9600, 8, 1, 0));
            System.out.println("\"VI\" successfully writen to port: " + serialPort.writeBytes("VI".getBytes())); //Verstärker wechselt den Audioeingang
            System.out.println("Port closed: " + serialPort.closePort());
        }
        catch (SerialPortException ex){
            System.out.println(ex); //Fehlermeldung wird in der Konsole angezeigt.
        }
    }
}
