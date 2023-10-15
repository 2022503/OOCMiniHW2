/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweis
 */
public interface Flyable extends Drivable {
    public void changeAltitude(float change);
    public float getAltitude();
    
    public class Airplane extends Vehicle implements Flyable{
   public Airplane(String make, String type, int numPassangers){
        this.type = type;
        this.make = make;
        numWheels = 3;
    }
    @Override
    public void accelerate( float speed){
        
   
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
    @Override
    public void changeAltitude(float change){
        
    }
    @Override
    public float getAltitude(){
        return 0;
    }

        @Override
        public void brake() {
//implement the breaks
        }
    }
}
