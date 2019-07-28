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






package myshareabout;
import java.awt.*;                                                                        //PACKAGE FOR MyShare v1.0 beta
import javax.swing.*; 											      //built by Arfan (15CE13/shaikharfan7@gmail.com)
import java.awt.event.*;
import java.io.*;  


public class abt{
	
 public static void htus()
     {
            JFrame howto = new JFrame("User guide");
            howto.setSize(900,500);
            JPanel ht1= new JPanel();
            JPanel ht2 = new JPanel();
            JLabel hto = new JLabel("HOW TO USE MyShare ?");
            hto.setFont(new Font("Serif", Font.BOLD, 40));                               //setting font
            JLabel hts = new JLabel();
            JLabel htr = new JLabel();
            JLabel cmd = new JLabel("Check command prompt/terminal for updating status of application.");

            howto.getContentPane().add(BorderLayout.NORTH,ht1);
            howto.getContentPane().add(BorderLayout.CENTER,ht2);
            ht1.add(hto);
            ht2.add(hts);
            ht2.add(htr);
            ht2.add(cmd);
            ht2.setBackground(Color.white);                                              //setting colors
            ht1.setBackground(Color.white);
            hto.setForeground(Color.blue);
            htr.setText("To receive, click on destination button and select location and give the file name (with extension) and make sure to set ip address of the sender(Server).");
            hts.setText("To send,click on source button and select destination path of the source file and click send.");
            howto.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                     //only one frame closes
            howto.setVisible(true);


      }



 public static void introa()
	{
		System.out.println("This program Myshare v1.0 is using package myshareabout.  - Project By Arfan Shaikh (15CE13/shaikharfan7@gmail.com)");
	}

 public static void abts()
	{
     
            JFrame about = new JFrame("About");
            about.setSize(200,200);
            JPanel n1 = new JPanel();
            JLabel n11=new JLabel("Myshare v1.0 beta");
            JPanel n2 = new JPanel();
            JLabel n12 = new JLabel("Built by : Arfan Shaikh");
            JPanel n3 = new JPanel();
            n3.add(new JLabel(new ImageIcon("a.png")));
            n11.setForeground(Color.red);
            n11.setFont(new Font("Serif", Font.BOLD, 22));
            n1.add(n11);
            n2.add(n12);
            n3.setBackground(Color.black);
            n2.setBackground(Color.black);
            n12.setForeground(Color.blue);
            n1.setBackground(Color.black);
            n12.setFont(new Font("Serif", Font.BOLD, 14));
            about.getContentPane().add(BorderLayout.NORTH,n1);
            about.getContentPane().add(BorderLayout.CENTER,n3);
            about.getContentPane().add(BorderLayout.SOUTH,n2);
            about.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            about.setVisible(true);	
      }
}