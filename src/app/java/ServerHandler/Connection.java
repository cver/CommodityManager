/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.java.ServerHandler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author cver
 */
public class Connection {
    private static final String CLOSE = "close";
    private ServerSocket server = null;
    private Socket client = null;
    
    public void connect() {
        int clientNumber = 0;
        try {
            server = new ServerSocket(4444);
        } catch (IOException e) {
            log(e.getMessage());
            System.exit(1);
        }
        try {
            while (true) {
                try {
                    client = server.accept();
                } catch (IOException ex) {
                    log(ex.getMessage());
                }
                new ServiceThread(client, clientNumber++).start();
            }
        } finally {
            try {
                server.close();
            } catch (IOException ex) {
                log(ex.getMessage());
            }
        }
    }
    
    public static void log(String msg) {
        System.out.println(msg);
    }
    
    private String execute(String command, String data) {
        return "hello";//fix
    }
    
    private static class ServiceThread extends Thread {
        private int clientNumber;
        private Socket client;

        public ServiceThread(Socket client, int clientNumber) {
            this.clientNumber = clientNumber;
            this.client = client;
        }
 
        @Override
        public void run() {
            try {
                BufferedReader is = new BufferedReader(new InputStreamReader(client.getInputStream()));
                BufferedWriter os = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
                while (true) {
                    String line = is.readLine();
                    os.write(">> " + line);
                    os.newLine();
                    os.flush();
                    if (line.equals(CLOSE)) {
                        os.write(">> OK");
                        os.newLine();
                        os.flush();
                        break;
                    }
                }
            } catch (IOException e) {
                log(e.getMessage());
            }
        }
    }
}
