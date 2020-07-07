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
public class beatsInfo {
    private double time;
    private String noteName;
    
     public beatsInfo(double time,String noteName){
       this.time=time;
       this.noteName=noteName;
       
    }
    
    
    public double getTime(){
      return time;
    }
    
    public void setTime(double Time){
      this.time=time;
    }
    
    public String getNoteName(){
      return noteName;
    }
    
    public void setNoteName(String noteName){
      this.noteName=noteName;
    }
    
    
}
