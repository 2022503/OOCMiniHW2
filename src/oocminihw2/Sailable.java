/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */
public interface Sailable {
    /* Sets the sail to hoisted*/
    public void hoistSail();
    public void lowerSail();
    public boolean isSailHoisted();
    public void landHo();
    
    public class Sailboat extends Vehicle implements Sailable{
        public Sailboat (String make,String type, int numPassangers){
            this.make = make;
            this.type = type;
            this.numPassengers = numPassengers;
            numSails = 2;
        }
        

     
   
    @Override
    public void landHo(){
        
    }

        @Override
        public void hoistSail() {
      
        }

        @Override
        public void lowerSail() {
      
        }

        @Override
        public boolean isSailHoisted() {
            return true;
        }
    }     
}
