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
public class P2Pr {
     public static void main(String [] args) throws IOException{
         int filesize = 1022326;
         int bytesRead;
         int total = 0;
        Socket sock =  new Socket("10.20.12.124",15125);
        byte [] bytearray = new byte [filesize];
        InputStream is = sock.getInputStream();
         FileOutputStream fos = new FileOutputStream("C:\\Users\\SHREYAS\\Downloads");
          BufferedOutputStream bos = new BufferedOutputStream(fos);
          bytesRead = is.read(bytearray,0,bytearray.length);
          total= bytesRead;
          do{
              bytesRead = is.read(bytearray,total,(bytearray.length-total));
              if(bytesRead >= 0) total = bytesRead;
          }
          while(bytesRead > -1);
          bos.write(bytearray,0,total);
          bos.flush();
          bos.close();
          sock.close();
          System.out.println("file tansfered");
        
        
       
     
         
     }
    
}
