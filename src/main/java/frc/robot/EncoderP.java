package frc.robot;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.SensorCollection;

/**
 * The class dedicated to the encoder for the catapult
 */
public class EncoderP {

    public static int pulsesPerRot = 4096;

    /*
    * Initiates the encoder on the talon for the catapult
    */
    static{
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
    
    /**
     * Calls on the talon from the catapult to get the encoder sensor information (collection)
     * @return The encoder information for the catapult
     */
    public static SensorCollection getEncoder(){
        return Catapult.talon.getSensorCollection();
    }
    /**
     * Calls on the sensor collection from the Catapult encoder
     * @return The quadrature position of the encoder on the catapult
     */
    public static int getPos(){
        return Catapult.talon.getSensorCollection().getQuadraturePosition();
    }
    /**
     * Sets the number of pulses or position (in code, NOT in the real world) of the encoder on the catapult
     */
    public static void setPos(int newPosition, int timeoutMs){
        Catapult.talon.getSensorCollection().setQuadraturePosition(newPosition, timeoutMs);
    }
    /**
     * Calls on the sensor collection from the catapult encoder
     * @return The quadrature velocity of the encoder
     */
    public static int getVel(){
        return Catapult.talon.getSensorCollection().getQuadratureVelocity();
    }
    
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
    /**
     * Converts the given inches into encoder pulses (encoder measurement)
     * @param inches
     * @return The given number of inches multiplyed by the circumference of the wheels
     */
    public static double driveInchesToPulses(int inches){
        //200.58 is the pulses per inch based on the wheel circumference of the drive train
        return inches * 200.58;

    }
}