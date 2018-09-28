package frc.robot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.SensorCollection;

/**
 * The class dedicated to the encoder for the catapult
 */
public class EncoderP {

    public static int pulsesPerRot = 4096;
    
    public static void init(){
        //Catapult.talon.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder,0,0);
    }
    
    /**
     * Used to check for certain scenarios on the encoder and update information
     */
    public static void update(){
        /*if(getVel() == 0){
            setPos(0,0);
        } */
    }
    
   /* public static SensorCollection getEncoder(){
        return Catapult.talon.getSensorCollection();
    }
    public static int getPos(){
        return Catapult.talon.getSensorCollection().getQuadraturePosition();
    }
    public static void setPos(int newPosition, int timeoutMs){
        Catapult.talon.getSensorCollection().setQuadraturePosition(newPosition, timeoutMs);
    }
    public static int getVel(){
        return Catapult.talon.getSensorCollection().getQuadratureVelocity();
    }
    */
    /** Get and return the number of rotations that would have been done between the specified 
    * start position (start pulses) and the specified end position (end pulses)
    **/
    public static double getRotations(int startPos, int endPos){
        return (endPos - startPos) / 4096;
    }
    /**Given a specified number of rotations, calculate and return the number of pulses that it would be
    **/
    public static int rotationsToPulses(int rotations){
        return rotations * 4096;
    }
    
    //Only usefull if drive train has encoders; converts any number of inches to pulses the drive train needs to move
    public static double driveInchesToPulses(int inches){
        //200.58 is the pulses per inch based on the wheel circumference of the drive train
        return inches * 200.58;

    }
}