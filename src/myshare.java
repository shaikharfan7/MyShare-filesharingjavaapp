import java.awt.*;                                           
import javax.swing.*;
import java.awt.event.*;
import java.io.*;  
import java.net.*; 
import java.util.*;
import myshareabout.*;                                            //Myshare build v1.0 (beta) DEVELOPED BY ARFAN SHAIKH (shaikharfan7@gmail.com)
public class myshare 
{
	 public static String spth;                                   //global variable for source path(server)
     public static String dpth;                                   //global variable for destination path(client)
     public static String addr;                                   //global variable for ip address
     public static void main(String args[])
	 {     
         S1 obj1= new S1();                                       //object declaration for class S1(server)
         S2 obj2= new S2();                                       //object declaration for class S2(client)
         abt ab = new abt();				                              //object declaration for class abt in package myshareabout
         //Frame creation
         JFrame frame = new JFrame("Myshare v1.0 beta(File transfer) - Project By Arfan Shaikh (shaikharfan7@gmail.com)");        
	     frame.setSize(1359,410);                                               //Frame Size declaration
	     //panel
	     JPanel a1 = new JPanel();                                              //panel declaration
	     JLabel j1 = new JLabel("                                     Select file to send:");                //label 1
         JLabel j2 = new JLabel("                                                    Select to receive  :"); //label 2
	     JTextField t = new JTextField();                                      //textfield t
         JTextField tr= new JTextField();								                       //textfield tr
	     JButton bs = new JButton("--Source--");                               //button bs (source)
         JButton br = new JButton("Destination");                              //button br (destination)
	     JButton adrss = new JButton("Set");                                   //button adrs(to set ip)
         JFileChooser fc = new JFileChooser();                                 //file chooser declaration
         JTextField adrs = new JTextField();                                   //adrs textfield
         JLabel tp = new JLabel("Status :");                                   //label 3
         JLabel tq = new JLabel("Awaiting input");                             //label 4
         JMenuBar mb = new JMenuBar();                                         //menu bar declaration
         JMenu m0 = new JMenu("File");                                         //menu pane 1
         JMenu m1 = new JMenu("Help");                                         //menu pane 2      
         ImageIcon img = new ImageIcon("myshareabout/a.png");
         frame.setIconImage(img.getImage());
         mb.add(m0);                                                           //adding menu options to menubar mb
         mb.add(m1);
         JMenuItem m10 = new JMenuItem("Exit");                                //menu item exit
         JMenuItem m11 = new JMenuItem("About");                               //menu item about
         JMenuItem m12 = new JMenuItem("User guide");                          //menu item user guide
         JMenuItem m13 = new JMenuItem("Date & time");
         m0.add(m13);
         m0.add(m10);                                                          //adding menu items to options
         m1.add(m12);
         m1.add(m11);
		 frame.getContentPane().add(BorderLayout.NORTH,mb);                    //setting panel(menubar) mb to north of frame
         a1.add(j1);                                                           //adding contents in flow to panel a1
	     a1.add(t);
	     a1.add(bs); 
         a1.add(tp);																																																																																																																																			//myshare v1.0 beta developed dby arfan shaikh 15ce13
         a1.add(tq);
         a1.add(j2);  
         a1.add(tr);
         a1.add(br);
         a1.add(adrs);                                                        //adding text field
         a1.add(adrss);                                                       //adding button 
         t.setText("Click to select file");                                   //default text in field t
         tr.setText("Click to select file");								                  //default text in field tr
         adrs.setText("Enter ip address"); 
         JPanel panel = new JPanel();                                         //new panel
	     JLabel label = new JLabel("Select :");                               //label 5
         JButton snd = new JButton("send");                                   //send button
         JButton rcv = new JButton("receive");                                //receive button
         System.out.println("Myshare v1.0 beta - Project By Arfan Shaikh (shaikharfan7@gmail.com)");
         //adding contents to panel
         panel.add(label);
         panel.add(snd);
         panel.add(rcv);
         a1.setBackground(Color.white);                                       //setting background and foreground colors to components
         mb.setBackground(Color.black);
         panel.setBackground(Color.black);
         label.setForeground(Color.white);
         m0.setForeground(Color.white);
         m1.setForeground(Color.white);
         m10.setForeground(Color.white);
         m11.setForeground(Color.white);
         m10.setBackground(Color.black);
         m11.setBackground(Color.black);
         bs.setBackground(Color.white);
         br.setBackground(Color.white);
         adrss.setBackground(Color.white);
         snd.setBackground(Color.white);
         rcv.setBackground(Color.white);
         m12.setBackground(Color.black);
         m12.setForeground(Color.white);
         m13.setBackground(Color.black);
         m13.setForeground(Color.white);
         frame.getContentPane().add(BorderLayout.CENTER,a1);                  //setting panel(a1) postion to center    
         frame.getContentPane().add(BorderLayout.SOUTH,panel);		            //setting panel to south
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                //frame close operation
         frame.setVisible(true);                                              //frame visiblity
         ab.introa();                                                         //accessing package myshareabout
         
         //adding functions to menubars and buttons using actionlisteners from java.awt.event

          m13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent h) 
            {  
             JFrame dt = new JFrame("Date & time");
             dt.setSize(280,75);
             dt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             JPanel dtt = new JPanel();
             dt.getContentPane().add(BorderLayout.CENTER,dtt);
             JLabel dttt = new JLabel(""+new Date());
             JButton time = new JButton("Refresh"); 
             time.setBackground(Color.white);
             time.setBackground(Color.white);
			       dtt.add(dttt);
             dtt.add(time);                                       
             dt.setVisible(true);
             time.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent tt) {
             dttt.setText(""+new Date());
             }});
 			      }
          });


          m12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) 
            {
               
             ab.htus();                                                       //invokes userguide frame on clicking userguide option             
            }
          });


          m10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent b) 
            {    
             System.exit(0);                                                  //exits from application on clicking exit           
            }
            });

          m11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent c) 
            {
             ab.abts();                                                       //invokes about frame on clicking about
            }
          });


          adrss.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent d) 
            {
             addr=adrs.getText();                                             //takes address from text field adrs and stores in addr string
             adrs.setText(""+addr);                                                    
            }
            
          });


          snd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
             obj1.a();                                                        //on clicking send button initialises server from server class s1.
             tq.setText("You clicked send");                                  //after completion sets status.
            }
          });


          rcv.addActionListener(new ActionListener(){
        	  public void actionPerformed(ActionEvent f)
            {	
        	   obj2.b();									                                      //on clicking receive button client connects to server of set ip
             tq.setText("You clicked receive");                               //after completion sets status.
        	  }
          });
   
       
          bs.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent g) 
            {
             fc.showOpenDialog(a1);                                           //opens window (file chooser) for selecting directory  
          	 spth=""+fc.getSelectedFile();                                    //gets selected path from file chooser and stores in global variable spth
             t.setText(""+spth);                                
            }
          });
        


          br.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent g) 
            {
             fc.showOpenDialog(a1);                                           //opens window (file chooser) for selecting directory  
             dpth=""+fc.getSelectedFile();                                    //gets selected path from file chooser and stores in global variable dpth
             tr.setText(""+dpth);                             
            }
          });
        
}}  