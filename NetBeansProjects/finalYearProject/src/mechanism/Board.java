/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanism;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author pro
 */
public class Board implements Runnable {
    
    private Image noteHitD=new ImageIcon(getClass().getResource("/image/orange.png")).getImage();
    private Image noteHitF=new ImageIcon(getClass().getResource("/image/orange.png")).getImage(); 
    private Image noteHitSpace=new ImageIcon(getClass().getResource("/image/orange.png")).getImage(); 
    private Image noteHitJ=new ImageIcon(getClass().getResource("/image/orange.png")).getImage(); 
    private Image noteHitK=new ImageIcon(getClass().getResource("/image/orange.png")).getImage(); 
    private Image redline=new ImageIcon(getClass().getResource("/image/rl.png")).getImage(); 
    private Image judgeIma;
    public static int moveSpeed=3;
    public static int sleeptime = 10;
    ArrayList<noteObject> noteList=new ArrayList<noteObject>();
    private audioIO audio;
    private String currSongName;
    private int miss=0;
    private int perfect=0;
    private int ok=0;
    beatsInfo[] b;
    ArrayList<songList> sl=new ArrayList<songList>();

public Board(String currSongName){
    
    this.currSongName=currSongName;
    audio=new audioIO(this.currSongName,false);
    
}
    
    
public void draw(Graphics2D g){
      
    

 
    g.drawImage(noteHitD, 193, 600,null);//y values smaller,position higher
    g.drawImage(noteHitF, 278, 600,null);//x+100 each time
    g.drawImage(noteHitSpace, 363, 600,null);
    g.drawImage(noteHitJ, 448, 600,null);
    g.drawImage(noteHitK, 533, 600,null);
    g.drawImage(redline,5,570,null);//60px height(y)//575
    g.drawImage(redline,5,610,null);//60px height(y)
 
    
    
  
    g.setColor(Color.black);
    g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    g.setFont(new Font("Arial",Font.CENTER_BASELINE,15)); 
    //(149,249,339,449,549)
    g.drawString("D", 200, 630);
    g.drawString("F", 298, 630);
    g.drawString("Space", 383, 630);
    g.drawString("J", 468, 630);
    g.drawString("K", 553, 630);
    
    for(int i=0;i<noteList.size();i++){
          
        noteObject note=noteList.get(i);
        
       if(note.getY()>650&&(!note.judge().equals("Perfect"))&&(!note.judge().equals("OK"))
               &&(!note.judge().equals("None")))
      {
        miss=miss+1;
        System.out.println("Miss");
      }
      
       if(!note.isProcessed())
      {
          noteList.remove(i);
          i--;
      }
      else
      {
          note.noteDraw(g);
       }
      
    } //end for loop
    
  
    g.setColor(Color.RED);
    g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    g.setFont(new Font("Verdana",Font.ITALIC,18)); 
   
    g.drawString("Missed: "+miss, 640, 310);
    g.drawString("Perfect : "+perfect,640, 210);
    g.drawString("Music: "+currSongName,640, 100);
    //g.drawString("OK : "+ok,650, 260);
   
    g.setColor(Color.WHITE);
    g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
    g.setFont(new Font("Verdana",Font.BOLD,12));
    g.drawString("To exit: ecs ",700 , 665);
    g.drawString("go back: return/enter",650,650);
        
      
    //g.drawString("score: "+score, 100, 110);
  
    
 }
    
    
public void Animation(){
    
    //time for one beat in millisec 60000/bpm
  
 if(currSongName.equals("bai.mp3")){
   //second to millisecond
  
   double firstb=3590;
  
   double beatDuration=330; //range: 0.2 to 0.4s assume 330 milliseconds per beat for a given song.
   b=
   new beatsInfo[]
   {
     new beatsInfo(firstb,"k1"),
     new beatsInfo(firstb+beatDuration,"k2"),
     new beatsInfo(firstb+beatDuration*2,"k5"),
     //4,5,6
     new beatsInfo(firstb+beatDuration*4,"k1"),
     new beatsInfo(firstb+beatDuration*5,"k2"),
     new beatsInfo(firstb+beatDuration*6,"k4"),//1980
     //8,9,10
     new beatsInfo(firstb+beatDuration*8,"k1"),
     new beatsInfo(firstb+beatDuration*9,"k2"),
     new beatsInfo(firstb+beatDuration*10,"k5"), 
     new beatsInfo(firstb+beatDuration*12,"k1"),
     new beatsInfo(firstb+beatDuration*13,"k2"),
     new beatsInfo(firstb+beatDuration*14,"k4"),
     new beatsInfo(firstb+beatDuration*16,"k1"),
     new beatsInfo(firstb+beatDuration*17,"k2"),
     new beatsInfo(firstb+beatDuration*18,"k5"),
     new beatsInfo(firstb+beatDuration*20,"k1"),
     new beatsInfo(firstb+beatDuration*21,"k2"),
     new beatsInfo(firstb+beatDuration*22,"k4"),
     new beatsInfo(firstb+beatDuration*24,"k1"),
     new beatsInfo(firstb+beatDuration*25,"k2"),
     new beatsInfo(firstb+beatDuration*26,"k5"),
     new beatsInfo(firstb+beatDuration*28,"k1"),
     new beatsInfo(firstb+beatDuration*29,"k2"),//9570
     new beatsInfo(firstb+beatDuration*30,"k4"),
     new beatsInfo(firstb+beatDuration*32,"k1"),
     new beatsInfo(firstb+beatDuration*33,"k2"),
     new beatsInfo(firstb+beatDuration*34,"k5"),
     new beatsInfo(firstb+beatDuration*36,"k1"),
     new beatsInfo(firstb+beatDuration*37,"k2"),
     new beatsInfo(firstb+beatDuration*38,"k4"),
     new beatsInfo(firstb+beatDuration*40,"k1"),
     new beatsInfo(firstb+beatDuration*41,"k2"),//13530
     new beatsInfo(firstb+beatDuration*42,"k5"),
     new beatsInfo(firstb+beatDuration*44,"k1"),
     new beatsInfo(firstb+beatDuration*45,"k2"),
     new beatsInfo(firstb+beatDuration*46,"k4"),
     new beatsInfo(firstb+beatDuration*48,"k1"),
     new beatsInfo(firstb+beatDuration*49,"k2"),
     new beatsInfo(firstb+beatDuration*50,"k5"),
     new beatsInfo(firstb+beatDuration*52,"k1"),//17160
     new beatsInfo(firstb+beatDuration*53,"k2"),
     new beatsInfo(firstb+beatDuration*54,"k4"),
     new beatsInfo(firstb+beatDuration*56,"k1"),
     new beatsInfo(firstb+beatDuration*57,"k2"),
     new beatsInfo(firstb+beatDuration*58,"k5"),
     //
     new beatsInfo(firstb+beatDuration*64,"k1"),//21120
     new beatsInfo(firstb+beatDuration*65,"k2"),//21450
     new beatsInfo(firstb+beatDuration*66,"k3"),//21780
     new beatsInfo(firstb+beatDuration*68,"k1"),//22440
     new beatsInfo(firstb+beatDuration*69,"k2"),
     new beatsInfo(firstb+beatDuration*70,"k3"),
     new beatsInfo(firstb+beatDuration*72,"k1"),//23760
     new beatsInfo(firstb+beatDuration*73,"k2"),
     new beatsInfo(firstb+beatDuration*74,"k3"),
     new beatsInfo(firstb+beatDuration*76,"k1"),
     new beatsInfo(firstb+beatDuration*77,"k2"),
     new beatsInfo(firstb+beatDuration*78,"k3"),
    // 160 168 176 184 192 200
    new beatsInfo(firstb+beatDuration*97,"k1"),//32010
    new beatsInfo(firstb+beatDuration*98,"k2"),//32340
    new beatsInfo(firstb+beatDuration*99,"k4"),
    new beatsInfo(firstb+beatDuration*101,"k1"),
    new beatsInfo(firstb+beatDuration*102,"k2"),
    new beatsInfo(firstb+beatDuration*103,"k5"),
    new beatsInfo(firstb+beatDuration*105,"k1"),
    new beatsInfo(firstb+beatDuration*106,"k2"),
    new beatsInfo(firstb+beatDuration*107,"k4"),
    new beatsInfo(firstb+beatDuration*109,"k1"),
    new beatsInfo(firstb+beatDuration*110,"k2"),//36330
    new beatsInfo(firstb+beatDuration*111,"k5"),
    new beatsInfo(firstb+beatDuration*113,"k1"),
    new beatsInfo(firstb+beatDuration*114,"k2"),
    new beatsInfo(firstb+beatDuration*115,"k4"),
    new beatsInfo(firstb+beatDuration*117,"k1"),//38610
    new beatsInfo(firstb+beatDuration*118,"k2"),
    new beatsInfo(firstb+beatDuration*119,"k5"),
    new beatsInfo(firstb+beatDuration*121,"k1"),
    new beatsInfo(firstb+beatDuration*122,"k2"),
    new beatsInfo(firstb+beatDuration*123,"k4"),
    new beatsInfo(firstb+beatDuration*125,"k1"),
    new beatsInfo(firstb+beatDuration*126,"k2"),
    new beatsInfo(firstb+beatDuration*127,"k4"),
    new beatsInfo(firstb+beatDuration*127,"k5"),
    ///
    
    new beatsInfo(firstb+beatDuration*161,"k3")
    
     }; //#83
   
   }//bai.mp3
 
 
  
 if(currSongName.equals("13.mp3")){
   //second to millisecond
   double firstb=2550;// time the first beat occurs(in ms)
   double beatDuration=442;//
   b=
   new beatsInfo[]
   {
    
     new beatsInfo(firstb,"k3"),
 
     new beatsInfo(firstb+beatDuration*2,"k1"),
     new beatsInfo(firstb+beatDuration*3,"k5"),
     new beatsInfo(firstb+beatDuration*4,"k2"),
     new beatsInfo(firstb+beatDuration*5,"k4"),
     new beatsInfo(firstb+beatDuration*6,"k1"),
     new beatsInfo(firstb+beatDuration*7,"k5"),
     new beatsInfo(firstb+beatDuration*8,"k2"),
     new beatsInfo(firstb+beatDuration*9,"k4"),
     new beatsInfo(firstb+beatDuration*10,"k1"),
     new beatsInfo(firstb+beatDuration*11,"k5"),
     new beatsInfo(firstb+beatDuration*12,"k2"),
     new beatsInfo(firstb+beatDuration*13,"k4"),
     new beatsInfo(firstb+beatDuration*14,"k1"),
     new beatsInfo(firstb+beatDuration*15,"k5"),
     new beatsInfo(firstb+beatDuration*16,"k2"),
     new beatsInfo(firstb+beatDuration*17,"k4"),
     ////////////////////
     new beatsInfo(firstb+beatDuration*18,"k1"),
     //new beatsInfo(firstb+beatDuration*18.5,"k1"),
     new beatsInfo(firstb+beatDuration*19,"k3"),
     new beatsInfo(firstb+beatDuration*20,"k2"),
     //new beatsInfo(firstb+beatDuration*20.5,"k2"),
     new beatsInfo(firstb+beatDuration*21,"k3"),
     new beatsInfo(firstb+beatDuration*22,"k1"),
    // new beatsInfo(firstb+beatDuration*22.5,"k1"),
     new beatsInfo(firstb+beatDuration*23,"k3"),
     new beatsInfo(firstb+beatDuration*24,"k2"),
     //new beatsInfo(firstb+beatDuration*24.5,"k2"),
     new beatsInfo(firstb+beatDuration*25,"k3"),
     new beatsInfo(firstb+beatDuration*26,"k1"),
     //new beatsInfo(firstb+beatDuration*26.5,"k1"),
     new beatsInfo(firstb+beatDuration*27,"k3"),
     new beatsInfo(firstb+beatDuration*28,"k2"),
     //new beatsInfo(firstb+beatDuration*28.5,"k2"),
     new beatsInfo(firstb+beatDuration*29,"k3"),
     new beatsInfo(firstb+beatDuration*30,"k1"),
     //new beatsInfo(firstb+beatDuration*30.5,"k1"),
     new beatsInfo(firstb+beatDuration*31,"k3"),
     new beatsInfo(firstb+beatDuration*32,"k2"),
     //new beatsInfo(firstb+beatDuration*32.5,"k2"),
     new beatsInfo(firstb+beatDuration*33,"k3"),
     new beatsInfo(firstb+beatDuration*34,"k1"),
     //new beatsInfo(firstb+beatDuration*34.5,"k1"),
     new beatsInfo(firstb+beatDuration*35,"k3"),
     new beatsInfo(firstb+beatDuration*36,"k2"),
    // new beatsInfo(firstb+beatDuration*36.5,"k2"),
     new beatsInfo(firstb+beatDuration*37,"k3"),
     new beatsInfo(firstb+beatDuration*38,"k1"),
     //new beatsInfo(firstb+beatDuration*38.5,"k1"),
     new beatsInfo(firstb+beatDuration*39,"k3"),
     new beatsInfo(firstb+beatDuration*40,"k2"),
     //new beatsInfo(firstb+beatDuration*40.5,"k2"),
     new beatsInfo(firstb+beatDuration*41,"k3"),
     new beatsInfo(firstb+beatDuration*42,"k1"),
     //new beatsInfo(firstb+beatDuration*42.5,"k1"),
     new beatsInfo(firstb+beatDuration*43,"k3"),
     new beatsInfo(firstb+beatDuration*44,"k2"),
     //new beatsInfo(firstb+beatDuration*44.5,"k2"),
     new beatsInfo(firstb+beatDuration*45,"k3"),
     new beatsInfo(firstb+beatDuration*46,"k1"),
     //new beatsInfo(firstb+beatDuration*46.5,"k1"),
     new beatsInfo(firstb+beatDuration*47,"k3"),
     new beatsInfo(firstb+beatDuration*48,"k2"),
     //new beatsInfo(firstb+beatDuration*48.5,"k2"),
     new beatsInfo(firstb+beatDuration*49,"k3"),
     ////
    
     new beatsInfo(firstb+beatDuration*50,"k1"),
     //new beatsInfo(firstb+beatDuration*50.5,"k1"),
     new beatsInfo(firstb+beatDuration*51,"k3"),
     new beatsInfo(firstb+beatDuration*52,"k2"),
     //new beatsInfo(firstb+beatDuration*52.5,"k2"),
     new beatsInfo(firstb+beatDuration*53,"k3"),
     new beatsInfo(firstb+beatDuration*54,"k1"),
     //new beatsInfo(firstb+beatDuration*54.5,"k1"),
     new beatsInfo(firstb+beatDuration*55,"k3"),
     new beatsInfo(firstb+beatDuration*56,"k2"),
     //new beatsInfo(firstb+beatDuration*56.5,"k2"),
     new beatsInfo(firstb+beatDuration*57,"k3"),
     new beatsInfo(firstb+beatDuration*58,"k1"),
     //new beatsInfo(firstb+beatDuration*58.5,"k1"),
     new beatsInfo(firstb+beatDuration*59,"k3"),
     new beatsInfo(firstb+beatDuration*60,"k2"),
     //new beatsInfo(firstb+beatDuration*60.5,"k2"),
     new beatsInfo(firstb+beatDuration*61,"k3"),
     new beatsInfo(firstb+beatDuration*62,"k1"),
     //new beatsInfo(firstb+beatDuration*62.5,"k1"),
     new beatsInfo(firstb+beatDuration*63,"k3"),
     new beatsInfo(firstb+beatDuration*64,"k2"),
     //new beatsInfo(firstb+beatDuration*64.5,"k2"),
     new beatsInfo(firstb+beatDuration*65,"k3"),
     
     new beatsInfo(firstb+beatDuration*66,"k1"),
     new beatsInfo(firstb+beatDuration*67,"k3"),
     new beatsInfo(firstb+beatDuration*68,"k2"),
     new beatsInfo(firstb+beatDuration*69,"k3"),
     new beatsInfo(firstb+beatDuration*70,"k1"),
     new beatsInfo(firstb+beatDuration*71,"k3"),
     new beatsInfo(firstb+beatDuration*72,"k2"),
     new beatsInfo(firstb+beatDuration*73,"k3"),
     new beatsInfo(firstb+beatDuration*74,"k1"),
     new beatsInfo(firstb+beatDuration*75,"k3"),
     new beatsInfo(firstb+beatDuration*76,"k2"),
     new beatsInfo(firstb+beatDuration*77,"k3"),
      
     new beatsInfo(firstb+beatDuration*80,"k3"),
     new beatsInfo(firstb+beatDuration*80.5,"k3"),
     new beatsInfo(firstb+beatDuration*81,"k3"),
     
     new beatsInfo(firstb+beatDuration*83,"k1"),
    // new beatsInfo(firstb+beatDuration*84,"k3"),
      new beatsInfo(firstb+beatDuration*85,"k2"),
    // new beatsInfo(firstb+beatDuration*86,"k3"),
      new beatsInfo(firstb+beatDuration*87,"k4"),
     //new beatsInfo(firstb+beatDuration*88,"k3"),
      new beatsInfo(firstb+beatDuration*89,"k5"),
     //new beatsInfo(firstb+beatDuration*90,"k3"),
      new beatsInfo(firstb+beatDuration*91,"k1"),
     //new beatsInfo(firstb+beatDuration*92,"k3"),
      new beatsInfo(firstb+beatDuration*93,"k2"),
     //new beatsInfo(firstb+beatDuration*94,"k3"),
      new beatsInfo(firstb+beatDuration*95,"k4"),
     //new beatsInfo(firstb+beatDuration*96,"k5"),
      new beatsInfo(firstb+beatDuration*97,"k5"),
     //new beatsInfo(firstb+beatDuration*98,"k3"),
      new beatsInfo(firstb+beatDuration*99,"k1"),
     new beatsInfo(firstb+beatDuration*101,"k2"),
      new beatsInfo(firstb+beatDuration*103,"k4"),
     new beatsInfo(firstb+beatDuration*105,"k5"),
     ///////
      new beatsInfo(firstb+beatDuration*107.5,"k1"),
     new beatsInfo(firstb+beatDuration*108,"k2"), 
     new beatsInfo(firstb+beatDuration*108.5,"k3"),
     new beatsInfo(firstb+beatDuration*109,"k4"),
      new beatsInfo(firstb+beatDuration*109.5,"k5"),
       new beatsInfo(firstb+beatDuration*110,"k3"),
    ///
       
     new beatsInfo(firstb+beatDuration*114.5,"k1"),
     new beatsInfo(firstb+beatDuration*115,"k2"),
     new beatsInfo(firstb+beatDuration*115.5,"k3"),
     new beatsInfo(firstb+beatDuration*116.5,"k1"),
     new beatsInfo(firstb+beatDuration*117,"k4"),
     new beatsInfo(firstb+beatDuration*117.5,"k5"),
     new beatsInfo(firstb+beatDuration*118.5,"k1"),
     new beatsInfo(firstb+beatDuration*119,"k2"),
     new beatsInfo(firstb+beatDuration*119.5,"k3"),
     new beatsInfo(firstb+beatDuration*120.5,"k1"),
     new beatsInfo(firstb+beatDuration*121,"k4"),
     new beatsInfo(firstb+beatDuration*121.5,"k5"),   
     new beatsInfo(firstb+beatDuration*122.5,"k1"),
     new beatsInfo(firstb+beatDuration*123,"k2"),
     new beatsInfo(firstb+beatDuration*123.5,"k3"),
     new beatsInfo(firstb+beatDuration*124.5,"k1"),
     new beatsInfo(firstb+beatDuration*125,"k4"),
     new beatsInfo(firstb+beatDuration*125.5,"k5"),
     new beatsInfo(firstb+beatDuration*126.5,"k1"),
     new beatsInfo(firstb+beatDuration*127,"k2"),
     new beatsInfo(firstb+beatDuration*127.5,"k3"),
     
     new beatsInfo(firstb+beatDuration*128.5,"k1"),
     new beatsInfo(firstb+beatDuration*129,"k4"),
     new beatsInfo(firstb+beatDuration*129.5,"k5"),
     new beatsInfo(firstb+beatDuration*130.5,"k1"),
     new beatsInfo(firstb+beatDuration*131,"k2"),
     new beatsInfo(firstb+beatDuration*131.5,"k3"),
     new beatsInfo(firstb+beatDuration*132.5,"k1"),
     new beatsInfo(firstb+beatDuration*133,"k4"),
     new beatsInfo(firstb+beatDuration*133.5,"k5"),
   
     new beatsInfo(firstb+beatDuration*134.5,"k1"),
     new beatsInfo(firstb+beatDuration*135,"k2"),
     new beatsInfo(firstb+beatDuration*135.5,"k3"),
     new beatsInfo(firstb+beatDuration*136.5,"k1"),
     new beatsInfo(firstb+beatDuration*137,"k4"),
     new beatsInfo(firstb+beatDuration*137.5,"k5"),
     new beatsInfo(firstb+beatDuration*138.5,"k1"),
     new beatsInfo(firstb+beatDuration*139,"k2"),
     new beatsInfo(firstb+beatDuration*139.5,"k3"),
       new beatsInfo(firstb+beatDuration*140.5,"k1"),
     new beatsInfo(firstb+beatDuration*141,"k4"),
     new beatsInfo(firstb+beatDuration*141.5,"k5"),
     new beatsInfo(firstb+beatDuration*142.5,"k1"),
     new beatsInfo(firstb+beatDuration*143,"k2"),
     new beatsInfo(firstb+beatDuration*143.5,"k3"),
       new beatsInfo(firstb+beatDuration*144.5,"k1"),
     new beatsInfo(firstb+beatDuration*145,"k4"),
     new beatsInfo(firstb+beatDuration*145.5,"k5"),
     new beatsInfo(firstb+beatDuration*146.5,"k1"),
     new beatsInfo(firstb+beatDuration*147,"k2"),
     new beatsInfo(firstb+beatDuration*147.5,"k3"),
     
     new beatsInfo(firstb+beatDuration*148.5,"k1"),
     new beatsInfo(firstb+beatDuration*149,"k4"),
     new beatsInfo(firstb+beatDuration*149.5,"k5"),
     new beatsInfo(firstb+beatDuration*150.5,"k1"),
     new beatsInfo(firstb+beatDuration*151,"k2"),
     new beatsInfo(firstb+beatDuration*151.5,"k3"),
     new beatsInfo(firstb+beatDuration*152.5,"k1"),
     new beatsInfo(firstb+beatDuration*153,"k4"),
     new beatsInfo(firstb+beatDuration*153.5,"k5"),
     new beatsInfo(firstb+beatDuration*154.5,"k1"),
     new beatsInfo(firstb+beatDuration*155,"k2"),
     new beatsInfo(firstb+beatDuration*155.5,"k3"),
     new beatsInfo(firstb+beatDuration*156.5,"k1"),
     new beatsInfo(firstb+beatDuration*157,"k4"),
     new beatsInfo(firstb+beatDuration*157.5,"k5"),
     new beatsInfo(firstb+beatDuration*158.5,"k1"),
     new beatsInfo(firstb+beatDuration*159,"k2"),
     new beatsInfo(firstb+beatDuration*159.5,"k3"),
     new beatsInfo(firstb+beatDuration*160.5,"k1"),
     new beatsInfo(firstb+beatDuration*161,"k4"),
     new beatsInfo(firstb+beatDuration*161.5,"k5"),
     new beatsInfo(firstb+beatDuration*162.5,"k1"),
     new beatsInfo(firstb+beatDuration*163,"k2"),
     new beatsInfo(firstb+beatDuration*163.5,"k3"),
     new beatsInfo(firstb+beatDuration*164.5,"k1"),
     new beatsInfo(firstb+beatDuration*165,"k4"),
     new beatsInfo(firstb+beatDuration*165.5,"k5"),
     new beatsInfo(firstb+beatDuration*166.5,"k1"),
     new beatsInfo(firstb+beatDuration*167,"k2"),
     new beatsInfo(firstb+beatDuration*167.5,"k3"),
     new beatsInfo(firstb+beatDuration*168.5,"k1"),
     new beatsInfo(firstb+beatDuration*169,"k4"),
     new beatsInfo(firstb+beatDuration*169.5,"k5"),
     new beatsInfo(firstb+beatDuration*170.5,"k1"),
     new beatsInfo(firstb+beatDuration*171,"k2"),
     new beatsInfo(firstb+beatDuration*171.5,"k3"),
     new beatsInfo(firstb+beatDuration*172.5,"k1"),
     new beatsInfo(firstb+beatDuration*173,"k4"),
     new beatsInfo(firstb+beatDuration*173.5,"k5"),
     new beatsInfo(firstb+beatDuration*174.5,"k1"),
     new beatsInfo(firstb+beatDuration*175,"k2"),
     new beatsInfo(firstb+beatDuration*175.5,"k3"),
     new beatsInfo(firstb+beatDuration*176.5,"k1"),
     new beatsInfo(firstb+beatDuration*177,"k4"),
     new beatsInfo(firstb+beatDuration*177.5,"k5"),
     new beatsInfo(firstb+beatDuration*178.5,"k1"),
     new beatsInfo(firstb+beatDuration*179,"k2"),
     new beatsInfo(firstb+beatDuration*179.5,"k3"),
     new beatsInfo(firstb+beatDuration*180.5,"k1"),
     new beatsInfo(firstb+beatDuration*181,"k4"),
     new beatsInfo(firstb+beatDuration*181.5,"k5"),
     
     new beatsInfo(firstb+beatDuration*186,"k3"),
     


   };
           
}//13.mp3
  

 
  int i=0;
  
  audio.start();
  //spawn notes
  while(i<b.length){
    boolean dropped=false;
    if(b[i].getTime()<=audio.getPos()) {    
        
        //map note to its column
        noteObject note=new noteObject(b[i].getNoteName());
        //execute t2
        Thread t2 = new Thread(note,"Thread 2");
        t2.start();
        noteList.add(note);
        i++;
        dropped =true;
    }
    
    
    if(!dropped){
      try{
        Thread.sleep(5);
      }catch(Exception e){
        System.out.println(e);
      }
    }
  
  }//end while loop

   
  
  
  
}
    
    
public void close(){
   //audio.close();
   audio.close();
   Thread.interrupted();
}


 @Override
    public void run(){
      Animation();
       
    }

 public void keyPress(String k){
   ////key press //////////////
   if(k.equals("D")){
       
       ShowStatus("k1");
       ShowScore("k1");
      //change image of each noteHit button
      noteHitD=new ImageIcon(getClass().getResource("/image/light2.png")).getImage(); 
      
   }
   
   else if(k.equals("F")){
       
       ShowStatus("k2");
       ShowScore("k2");
       //change image of each noteHit button
       noteHitF=new ImageIcon(getClass().getResource("/image/light2.png")).getImage();   
   
   }
   
   else if(k.equals("SPACE")){
       ShowStatus("k3");
       ShowScore("k3");
      //change image of each noteHit button
     noteHitSpace=new ImageIcon(getClass().getResource("/image/light2.png")).getImage();    
   
   }
   
   else if(k.equals("J")){
       
       ShowStatus("k4");
       ShowScore("k4");
       //change image of each noteHit button
      noteHitJ=new ImageIcon(getClass().getResource("/image/light2.png")).getImage();     
   
   }
   
   else if(k.equals("K")){
   
        ShowStatus("k5");
        ShowScore("k5");
 
       //change image of each noteHit button
      noteHitK=new ImageIcon(getClass().getResource("/image/light2.png")).getImage();
   
   } 
 
 }
 
 
public void keyRelease(String k){
    
    if(k.equals("D")){
    
         //change the image from square to orange.png
         noteHitD=new ImageIcon(getClass().getResource("/image/orange.png")).getImage();
    
    }
    
    else if(k.equals("F")){
       
        noteHitF=new ImageIcon(getClass().getResource("/image/orange.png")).getImage();
        
    }
    
    else if(k.equals("SPACE")){
    
        noteHitSpace=new ImageIcon(getClass().getResource("/image/orange.png")).getImage();
    
    }
    
    else if(k.equals("J")){
        
        noteHitJ=new ImageIcon(getClass().getResource("/image/orange.png")).getImage();
    }
    
    else if(k.equals("K")){
     
        noteHitK=new ImageIcon(getClass().getResource("/image/orange.png")).getImage();
    
    }


}
    
   

public void ShowStatus(String hit){
  for(int i=0;i<noteList.size();i++){
    noteObject note=noteList.get(i);
    if(hit.equals(note.getNoteType())){//k1,k2,k3,k4,k5
       status(note.judge());//judge the hit is miss,perfect
       break;
    } 
  } 

 
}


  

public void status(String s){  
    if(s.equals("None")){
      
      System.out.println("none");
      
     }
    
    if(s.equals("Miss")){
      
      System.out.println("miss");
   }
    
    else if(s.equals("Perfect")){
     
      System.out.println("perfect");
        
    }
 
 
    
}


//score system
public void ShowScore(String hit){
  for(int i=0;i<noteList.size();i++){
    noteObject note=noteList.get(i);
    if(hit.equals(note.getNoteType())){
       scoreStatus(note.yPos());//for counting 
      break;
    } 
  } 
 
}

public void scoreStatus(int s){//'s' corresponds to yPos
  
    if(s>=580&&s<650){
     perfect=perfect+1;
   
     }
    //if(s>=570&&s<580){
   //score=+200;
     // ok=ok+1;
   //System.out.println("OK");
//}
  

}







}//end
