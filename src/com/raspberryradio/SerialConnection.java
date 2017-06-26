/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raspberryradio;

import jssc.SerialPort;
import jssc.SerialPortException;

public class SerialConnection {
    static SerialPort serialPort = new SerialPort("/dev/ttyUSB0");
    //static SerialPort serialPort = new SerialPort("COM6");
    
    static void connect() {
        try {
            System.out.println("Port opened: " + serialPort.openPort());
            System.out.println("Params setted: "
                    + serialPort.setParams(9600, 8, 1, 0));
            System.out.println("\"V_VS:R\" successfully writen to port: "
                    + serialPort.writeBytes("V_VS:R\n".getBytes()));
            System.out.println("\"V_VD:R\" successfully writen to port: "
                    + serialPort.writeBytes("V_VD:R\n".getBytes()));
            System.out.println("Port closed: " + serialPort.closePort());
        } catch (SerialPortException ex) {
            System.out.println(ex);
        }
    }

    static void change() {
        try {
            System.out.println("Port opened: " + serialPort.openPort());
            System.out.println("Params setted: "
                    + serialPort.setParams(9600, 8, 1, 0));
            System.out.println("\"V_VI:R\" successfully writen to port: "
                    + serialPort.writeBytes("V_VI:R\n".getBytes()));
            System.out.println("Port closed: " + serialPort.closePort());
        } catch (SerialPortException ex) {
            System.out.println(ex);
        }
    }
    static void disconnect(){
        System.out.println("Verstäker beenden");
        try {
            System.out.println("Port opened: " + serialPort.openPort());
            System.out.println("Params setted: "
                    + serialPort.setParams(9600, 8, 1, 0));
            System.out.println("\"V_VA:R\" successfully writen to port: "
                    + serialPort.writeBytes("V_VA:R\n".getBytes()));
            System.out.println("Port closed: " + serialPort.closePort());
        } catch (SerialPortException ex) {
            System.out.println(ex);
        }
    };
}
