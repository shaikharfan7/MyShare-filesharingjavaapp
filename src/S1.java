/*
MyShare - File transfer application to share files easily.
    Copyright (C) 2019  Arfan Shaikh
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.

    Author   : Arfan Shaikh
    Contact  : shaikharfan7@gmail.com
    Twitter  : https://twitter.com/shaikharfan7/
    LinkedIn : https://www.linkedin.com/in/shaikharfan7/
*/


import java.awt.*;                                           
import javax.swing.*;
import java.awt.event.*;
import java.io.*;  
import java.net.*; 
import java.util.*;
import myshareabout.*;                                                        //Myshare build v1.0 (beta) DEVELOPED BY ARFAN SHAIKH (shaikharfan7@gmail.com)
                                                                
class S1 extends myshare{                                                     //SERVER class S1 inherits from class Myshare

    public static void a()                                                                                                                        
    {                                                                         //server function a.
     try{                                                                     //using try catch method.                                  
            String src=spth;                                                  //gets path from br action listener and stores in variable src
            ServerSocket ss=new ServerSocket(6666);                           //initializes server socket with port number 6666
            System.out.println("Myshare server is online - Project By Arfan Shaikh (shaikharfan7@gmail.com)");          
            Socket s=ss.accept();								              //establishes connection(waits for client connection and once any clients tries on to connect on server it accepts the connection and then store it in socket object of the socket class)
            System.out.println("Accepted connection : " + s);
            File tf = new File (src);                                         //defining file object and giving source path
            System.out.println("Selected file :"+src);
            byte [] bytearray  = new byte [(int)tf.length()];                 //declaring byte array which stores data temporarily of file length 
            FileInputStream fin = new FileInputStream(tf);                    //declating file input stream object with file object tf.
            BufferedInputStream bin = new BufferedInputStream(fin);           //reads from the source file and the data read would be filled in the bytearray object
		    bin.read(bytearray,0,bytearray.length);                           //reads the file and stores in bytearray.
		    OutputStream os = s.getOutputStream();                            //output stream for connecting/sending files to client
		    System.out.println("Sending file.....");                   
            os.write(bytearray,0,bytearray.length);                           //writing data to output stream from bytearray.
		    os.flush();                                                       //clears output stream
		    s.close();                                                        //closes socket		  
            System.out.println("File transfer complete - Project By Arfan Shaikh (shaikharfan7@gmail.com)"); 
        }
	 catch(Exception e){
			System.out.println("Cannot connect to client\n"+e);}	          //exception arises if error occurs in the try section	
    }  
}