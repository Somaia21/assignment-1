/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tv.ass;

/**
 *
 * @author NoteBook
 */
public class TvAss {

    public static void main(String[] args) {
       TV tv1=new TV();
       tv1.TurnON();
       tv1.Setchannel(50);
       tv1.Setvolumel(4);
       
       
       TV tv2=new TV();
       tv2.TurnON();;
       tv2.channel1Up();
       tv2.channel1Up();
       tv1.volumeUp();
       
       System.out.println("tv1's channel is"+tv1.channel+"and volume level is "+tv1.volumelevel);
       System.out.println("tv2's channel is"+tv2.channel+"and volume level is "+tv2.volumelevel);
       
       
       
       
    }
    
}
