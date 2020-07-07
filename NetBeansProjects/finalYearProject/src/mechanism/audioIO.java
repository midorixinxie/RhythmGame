/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanism;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javazoom.jl.player.Player;

/**
 *
 * @author pro
 */
public class audioIO extends Thread{
    private Player player;
    private boolean isPlay;
    //private File file;
    private InputStream fs;
    private BufferedInputStream bs;
    
    public audioIO(String name,boolean isLoop){
        try{
         this.isPlay= isPlay;
         fs=this.getClass().getResourceAsStream("/music/"+name);
         bs=new BufferedInputStream(fs);//reads the file's inputstream
         player = new Player(bs);
      }
      catch(Exception e){
        System.out.print(e);
      
      }
    }
    
    //Retrieves the position in milliseconds of the current audio sample being played
    public int getPos(){
      if(player==null){
        return 0;
      }
      return player.getPosition();
    
    }
    
    public void close(){
      isPlay=false;
      player.close();
      //Thread.interrupted();
      this.interrupt();
    }
    
   @Override
   public synchronized void run(){
    try{
      do{
        player.play();
        //fs=new FileInputStream(file);
        //fs=new InputStream();
        bs=new BufferedInputStream(fs);
        player=new Player(bs);
      
      }while(isPlay);
  
    
    }catch(Exception e){
     e.printStackTrace();
    }
   
   }
}
