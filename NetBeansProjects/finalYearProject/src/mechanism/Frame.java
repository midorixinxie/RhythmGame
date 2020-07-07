/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanism;
import javax.swing.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author pro
 */
public class Frame extends JFrame {
    
    private Image backgroundImage;
    private Image screenPaint;
    private int songPlayedNo=0; 
    private Graphics graphicObj;
    private JButton startButton=new JButton("CLICK TO START");
    private JButton exitButton=new JButton("CLICK TO EXIT");
    private JButton Button1=new JButton("Play 'EASY' ");
    private JButton Button2=new JButton("Play 'Hard' ");
    private JButton Button3=new JButton("Player Guide");
    private JButton gobackButton=new JButton("Back To Home Page");
    private JLabel text=new JLabel("Choose Easy or Hard to start your rhythm journey!");
    ArrayList<songList> songLi=new ArrayList<songList>();    
    private boolean isMenuPage=false;
    private boolean isGamePage=false;
    
    private ImageIcon startButtonImage=new ImageIcon(getClass().getResource("/image/start2.png"));
    private ImageIcon exitButtonImage=new ImageIcon(getClass().getResource("/image/exit.png"));
    private ImageIcon ButtonsImage=new ImageIcon(getClass().getResource("/image/square.png"));
    private ImageIcon guideBack=new ImageIcon(getClass().getResource("/image/back.jpg"));

    public static Board gameboard;
    
    public Frame(){
        
    setUndecorated(true);
    setTitle("rhythm game");
    setSize(800,700);
    setResizable(false);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setBackground(new Color(0,0,0));
    setLayout(null);
    
    //Display the window.
    
    
    addKeyListener(new keyInput());//add keys
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
    System.out.println(getClass().getResource("/image/start2.png"));
    
    // click 'play' button to go to songMenu page							
    startButton.setBounds(200,150,343,143);
    startButton.setBorderPainted(false);
    startButton.setContentAreaFilled(false);
    startButton.setFocusPainted(false);
    startButton.addMouseListener(new MouseAdapter(){
    @Override
    public void mouseEntered(MouseEvent me)
    {
        
      startButton.setIcon(startButtonImage);
      startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    @Override
    public void mouseExited(MouseEvent me)
    {
        startButton.setIcon(startButtonImage);
        startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));	
    }
    @Override
    public void mousePressed(MouseEvent me)
    {
        songMenuPage();
    }
    });   
    
    add(startButton);
    
    //exit							
    exitButton.setBounds(200, 450, 343, 143);
    exitButton.setBorderPainted(false);
    exitButton.setContentAreaFilled(false);
    exitButton.setFocusPainted(false);
    exitButton.addMouseListener(new MouseAdapter(){
    @Override
    public void mouseEntered(MouseEvent me)
    {
        
      exitButton.setIcon(exitButtonImage);
      exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    @Override
    public void mouseExited(MouseEvent me)
    {
       exitButton.setIcon(exitButtonImage);
       exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));	
    }
    @Override
    public void mousePressed(MouseEvent me)
    {
         if(me.getSource() == exitButton){
           try{
             Thread.sleep(1000);
           }catch(Exception ex){
             ex.printStackTrace();
           }
           System.exit(0);
    }

    }
    });   
    
    add(exitButton);
    
    
    
    
    
    
     
    //button for music1
    Button1.setBounds(150,150,240,100);//location x y, size
    Button1.setVisible(false);
    Button1.setBorderPainted(false);
    Button1.setContentAreaFilled(false);
    Button1.setFocusPainted(false);
    Button1.addMouseListener(new MouseAdapter(){
     @Override
     public void mouseEntered(MouseEvent me){
       Button1.setVisible(true);
       Button1.setIcon(ButtonsImage);
       Button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
       
     }
     @Override
     public void mouseExited(MouseEvent me){
       Button1.setIcon(ButtonsImage);
       Button1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
     }
     @Override
     public void mousePressed(MouseEvent me){
      
       Button1.setVisible(false);
       
       isGamePage=true;
       backgroundImage=new ImageIcon(getClass().getResource("/image/elecPiano.jpg")).getImage();
       playGame(0); //music 1 easy
       

     }
        
    });
    
   add(Button1);
   
   //button for music2
    Button2.setBounds(150,250,240,100);//location x y, size
    Button2.setVisible(false);
    Button2.setBorderPainted(false);
    Button2.setContentAreaFilled(false);
    Button2.setFocusPainted(false);
    Button2.addMouseListener(new MouseAdapter(){
     @Override
     public void mouseEntered(MouseEvent me){
       Button2.setVisible(true);
       Button2.setIcon(ButtonsImage);
       Button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
       
     }
     @Override
     public void mouseExited(MouseEvent me){
       Button2.setIcon(ButtonsImage);
       Button2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
     }
     @Override
     public void mousePressed(MouseEvent me){
      
       Button2.setVisible(false);
       
       isGamePage=true;
       backgroundImage=new ImageIcon(getClass().getResource("/image/elecPiano.jpg")).getImage();
       playGame(1); //music 2 hard
       
       
     }
        
    });
    
   add(Button2);
   
   //button for player guide
    Button3.setBounds(150,50,240,100);//location x y, size
    Button3.setVisible(false);
    Button3.setBorderPainted(false);
    Button3.setContentAreaFilled(false);
    Button3.setFocusPainted(false);
    Button3.addMouseListener(new MouseAdapter(){
     @Override
     public void mouseEntered(MouseEvent me){
       Button3.setVisible(true);
       Button3.setIcon(ButtonsImage);
       Button3.setCursor(new Cursor(Cursor.HAND_CURSOR));
       
     }
     @Override
     public void mouseExited(MouseEvent me){
       Button3.setIcon(ButtonsImage);
       Button3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
     }
     @Override
     public void mousePressed(MouseEvent me){
      
       Button3.setVisible(false);
              JOptionPane.showMessageDialog(null,
                        "Welcome to Rhythm! Let me tell you how to play!"+"\n"
                                
                         +"In this game , you can only use the FIVE KEYS below on keyboard :"+"\n"+"\n"
                          +"D   F   SPACE  J   K"+"\n"+"\n"
                          +"if the game has started but you want to go back you can just press Enter/Return key."
                          +"\nif you are playing the game and you want stop the whole apllication,just pressing 'esc' key. "
                                +"\n\n\nchoose one of our musics to give a try! Good Luck!");
       
      
       
       
     }
        
    });
    
   add(Button3);
   
   
   //button for going back
    gobackButton.setBounds(165,400,240,100);//location x y, size
    gobackButton.setVisible(false);
    gobackButton.setBorderPainted(false);
    gobackButton.setContentAreaFilled(false);
    gobackButton.setFocusPainted(false);
    gobackButton.addMouseListener(new MouseAdapter(){
     @Override
     public void mouseEntered(MouseEvent me){
       gobackButton.setVisible(true);
       gobackButton.setIcon(ButtonsImage);
       gobackButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
       
     }
     @Override
     public void mouseExited(MouseEvent me){
       gobackButton.setIcon(ButtonsImage);
       gobackButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
     }
     @Override
     public void mousePressed(MouseEvent me){
      
       gobackButton.setVisible(false);
       startButton.setVisible(true);
       exitButton.setVisible(true);
       isMenuPage=false;
       gobackButton.setVisible(false);
       Button1.setVisible(false);
       Button2.setVisible(false);
       Button3.setVisible(false);
       
       
       try{
          Thread.sleep(1000);//1s
        }catch(InterruptedException e){
            e.printStackTrace();
        }
     }
        
    });
    
   add(gobackButton);
   
   
    //add songs to arraylist
     songLi.add(new songList("bai.mp3"));//0
     songLi.add(new songList("13.mp3"));//1
     //songLi.add(new songList("lee.mp3"));//3
}


public void paint(Graphics g){
  screenPaint=createImage(800,700);//create an off screen image
  graphicObj =screenPaint.getGraphics();//draw on the off screen image
  paintComponents(graphicObj); 
  
  draw((Graphics2D) graphicObj);//call draw method
  g.drawImage(screenPaint,1,1,null);
  
  
}

public void draw(Graphics2D g){ 
    
  
    if(isGamePage){
      g.drawImage(backgroundImage,0,0,null);
      gameboard.draw(g);
   
     }
    

    try {
      Thread.sleep(1);//fixed waiting time of each thread
  
       }catch(Exception e){
       
           e.printStackTrace();
       }
    
    repaint();
  
}



public void songMenuPage(){
    
    startButton.setVisible(false);
    exitButton.setVisible(false);
    isMenuPage=true;
    gobackButton.setVisible(true);
    //text.setVisible(true);
    Button1.setVisible(true);
    Button2.setVisible(true);
    Button3.setVisible(true);
    
    

}



public void playGame(int songPlayedNo){//start game
  isMenuPage=false;
  //startButton.setVisible(false);
  gameboard=new Board(songLi.get(songPlayedNo).getSong());
  Thread t1=new Thread(gameboard,"Thread 1");
  t1.start();
  //game.start();
  

}



public void pressReturn(){//exit from game play
  gameboard.close();
  isGamePage=false;
  songMenuPage();

}

public void pressEsc(){//terminate game
  gameboard.close();
  System.exit(0);

}



}//end