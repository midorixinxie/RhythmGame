/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanism;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;



/**
 *
 * @author pro
 */
public class keyInput extends KeyAdapter {

 public static Frame mf=new Frame();
 
 
 @Override
 public void keyPressed(KeyEvent e){
     
     if(mf.gameboard==null){
      return;
    }
  
    //control keys
    switch(e.getKeyCode()){
        case KeyEvent.VK_SPACE:
            mf.gameboard.keyPress("SPACE");
            break;
        
        case KeyEvent.VK_D:
            mf.gameboard.keyPress("D");
            break;
        
        case KeyEvent.VK_F:
            mf.gameboard.keyPress("F");
            break;
        
        case KeyEvent.VK_J:
            mf.gameboard.keyPress("J");
            break;
        
        case KeyEvent.VK_K:
            mf.gameboard.keyPress("K");
            break;
        
        //other keys
        case KeyEvent.VK_ENTER:
            mf.pressReturn();
            break;    
            
            
        case KeyEvent.VK_ESCAPE:
            mf.pressEsc();
            break;   
         
    }
    
 
 }
 
public void keyReleased(KeyEvent e){

    if(mf==null){
      return;
    }
    switch(e.getKeyCode()){
        
        case KeyEvent.VK_SPACE:
            mf.gameboard.keyRelease("SPACE");
            break;
        
        case KeyEvent.VK_D:
            mf.gameboard.keyRelease("D");
            break;
            
        case KeyEvent.VK_F:
            mf.gameboard.keyRelease("F");
            break;
        
        case KeyEvent.VK_J:
            mf.gameboard.keyRelease("J");
            break;
        
        case KeyEvent.VK_K:
            mf.gameboard.keyRelease("K");
            break;
            
        //
        case KeyEvent.VK_ENTER:
            mf.pressReturn();
            break;    
        
        case KeyEvent.VK_ESCAPE:
            mf.pressEsc();
            break;
     
    }
    
}



}

