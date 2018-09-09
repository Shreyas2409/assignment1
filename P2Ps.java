/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHREYAS
 */
import java.net.*;
import java.io.*;
import java.io.IOException;
public class P2Ps {
    private static String transferFile;
    public static void main(String [] args) throws IOException{
        ServerSocket serverSocket =new ServerSocket(15123);
        Socket sock = serverSocket.accept();
        System.out.println("connection is established"+sock);
        File tranferFile = new File("C:\\Users\\SHREYAS\\Downloads");
        byte [] bytearray = new byte [(int)transferFile.length()];
        FileInputStream fis = new FileInputStream(transferFile);
        BufferedInputStream bis = new BufferedInputStream(fis);
        bis.read(bytearray,0,bytearray.length);
        OutputStream os = sock.getOutputStream();
        System.out.println("sending..");
        os.write(bytearray,0,bytearray.length);
        os.flush();
        sock.close();
        System.out.println("transfered");
        
    }

   
    
}