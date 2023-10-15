/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */
public interface Drivable {
    public void accelerate(float speed);
    public void brake();
    public void turn(float angle);
    public float getDirection(); 
    public float getSpeed();   
    public String getMake();    
    public String getType();
    
    public class Tracter extends Vehicle implements Drivable{
        public Tracter(String make,String type, int numPassangers){
            this.make = make;
            this.type = type;
            this.numPassengers = numPassengers;
            numWheels = 4;
        }
     @Override
     public void accelerate(float speed){
         
     }
     @Override 
     public void brake(){
         
     }
     @Override
     public void turn(float angle){
         
     }
     @Override
     public float getDirection(){
         return direction;
     }
     @Override 
     public float getSpeed(){
         return speed;
     }
     @Override
     public String getMake(){
         return make;
         
     }
     @Override
     public String getType(){
         return type;
     }
    }
}
