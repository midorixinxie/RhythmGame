/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanism;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author pro
 */
public class noteObject implements Runnable {
     private Image noteObject=new ImageIcon(getClass().getResource("/image/orange.png")).getImage();
     //private int score=0;
     private int x;
     private int y;      
     private String noteType;
     private boolean processed=true;
     public Board board;
   
     public noteObject(String noteType){
    
        this.noteType=noteType;
       
       if(noteType.equals("k1")){//D
       
         x=193;
       }
       else if(noteType.equals("k2")){//F
         x=278;      
       }
       else if(noteType.equals("k3")){//SPACE
         x=363;
       }
       else if(noteType.equals("k4")){//J
         x=448;
       }
       else if(noteType.equals("k5")){//K
         x=533;
       }
     }
     
     public void noteDraw(Graphics2D g){
       
           g.drawImage(noteObject,x,y,null);
     }
     
     public boolean isProcessed(){
        
         return processed;
     }
     
     public String getNoteType(){
       return noteType;
     }
     
     public void close(){
     
        processed=false;
     }
     
     public void drop(){
       y+=board.moveSpeed;
     }
     
     @Override
     public void run(){
        try{
          while(true){
            drop();
            
            if(processed){
              Thread.sleep(10);
            }
            else{
               Thread.interrupted();
               break;
            }
            
          }
            
        }
        catch(Exception e){
         System.out.println(e);
        }
         
      }
     
     //key judgement
     public String judge(){
         
       if(y>650){
        
         close();
         return "Miss";
       }
       
       if(y>580&&y<650)
       {
      
         close();
         return "Perfect";
       }
       else if(y>=560&&y<580){
       
         close();
         return "OK";
       }
 
       
       return "None";
     }
     
     
//position for counting 
   public int yPos(){
   
   if(y>650){
      return 650;
  }
  else if(y>585){
   return 585;
 }
  
  return 0;
}

     
     
public int getY(){
   return y;
}
    
    
}
