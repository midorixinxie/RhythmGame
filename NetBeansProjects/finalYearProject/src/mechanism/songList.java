/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanism;

/**
 *
 * @author pro
 */
public class songList {
    private String songname;
    
    public songList(String song){
       this.songname=song;
    }
    
    public String getSong(){// get song name
      return songname;
    }
    
    
    public void setSong(String song){ //set song name
     this.songname=song;
    }
    
    
    
}
