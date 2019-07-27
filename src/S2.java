import java.awt.*;                                           
import javax.swing.*;
import java.awt.event.*;
import java.io.*;  
import java.net.*; 
import java.util.*;
import myshareabout.*;                                                        //Myshare build v1.0 (beta) DEVELOPED BY ARFAN SHAIKH (shaikharfan7@gmail.com)
                                                                

class S2 extends myshare{                                             		  //CLIENT class S2 inherits from class Myshare
	public static void b()
	{                                                               		  //client function b 
     try{
            String loc=addr;                                      			  //gets ip address from address field and stores in variable loc
			String dest=dpth;         										  //gets destination path selected and stores in variable dest
        	int filesize=9999999;                                 			  //file size in bytes
	    	int bytesRead;                                        			  //contains the current statistics of the bytes read from the input stream
	    	int currentTot = 0;                                   			  //has total number of read bytes 
			Socket s=new Socket(loc,6666);                        			  //socket object s with server address and port number (6666 here)
			System.out.println("Connected to Myshare server  - Project By Arfan Shaikh (shaikharfan7@gmail.com)");
			byte [] bytearray  = new byte [filesize];             			  //bytearray which will hold temporary data like buffer
			FileOutputStream fos = new FileOutputStream(dest);    			  //OutputStream object which points to the file which will be filled with data copied from source file along with directory for new file
			System.out.println("File destination :"+dest);
			BufferedOutputStream bos = new BufferedOutputStream(fos);  		  //helps to write a new file
			InputStream is = s.getInputStream();                       		  //reading data from the inputstream using the read method of the object.
			//byte read procedure-developed by Arfan Shaikh shaikharfan7@gmail.com
 			bytesRead = is.read(bytearray,0,bytearray.length);      		  // data read from the input channel stores in  bytearray
	    	currentTot = bytesRead;                                 	      //current statistics = number of bytes read
	    	do {                                                                        
	       	    bytesRead = is.read(bytearray, currentTot, (bytearray.length-currentTot));  //reads from input stream until there is no data left(-1)
	            if(bytesRead >= 0) currentTot += bytesRead;
	    	   }while(bytesRead > -1);
			bos.write(bytearray, 0 , currentTot);                   		  //writing bytes to file.
			bos.flush();                                            		  //clears output stream
			s.close();                                              		  //closes socket S
            System.out.println("Transfer complete  - Project By Arfan Shaikh (shaikharfan7@gmail.com)");
            System.out.println("Close application before opening the file");
		    }
		    catch(Exception e){																																																									
			       System.out.println("Cannot connect to server.\n"+e);}      //exception arises if cannot connect to server	        
    }  
}









   
 