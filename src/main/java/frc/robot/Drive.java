package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The class dedicated the to drive train and drive related methods.
 */
public class Drive {
    
    public static WPI_TalonSRX frontLeft = new WPI_TalonSRX(1);
    public static WPI_TalonSRX frontRight = new WPI_TalonSRX(3);
    public static WPI_TalonSRX rearLeft = new WPI_TalonSRX(2);
    public static WPI_TalonSRX rearRight = new WPI_TalonSRX(4);
    public static SpeedControllerGroup rightSpeedGroup = new SpeedControllerGroup(frontRight,rearRight);
    public static SpeedControllerGroup leftSpeedGroup = new SpeedControllerGroup(frontLeft,rearLeft);
    public static final DifferentialDrive robotDrive = new DifferentialDrive(leftSpeedGroup,rightSpeedGroup);
    public static double secondsPerInch;
    
    /*
    * Initiates the safety on the drive train.
    */
    static{
        robotDrive.setSafetyEnabled(true);
       /* for(WPI_TalonSRX talon : new WPI_TalonSRX[]{frontLeft,frontRight,rearLeft,rearRight}){
            talon.configPeakCurrentLimit(amps, timeoutMs)
        } */
    }
    
    /**
     * The same thing as arcade drive but used to eliminate calling on the actual differential drive
     * of this class (Prevents more typing).
     * 
     * @param xSpeed Forward or reverse power
     * @param zRotation Left or right turning power
     */
    public static void customDrive(double xSpeed, double zRotation){
        robotDrive.arcadeDrive(xSpeed, zRotation);
    }

    /**
     * Will drive the robot with the designated parameters for the designated amount of seconds.
     * Uses a while loop that checks elapsed time and compares it to {@code}timeInSeconds{@code} variable.
     * 
     * @param xSpeed Forward or reverse power
     * @param zRotation Left or right turning power
     */
    public static void driveForTime(double xSpeed, double zRotation, double timeInSeconds){
        double startTime = Timer.getFPGATimestamp();
        while(Timer.getFPGATimestamp() - startTime < timeInSeconds){
            robotDrive.arcadeDrive(xSpeed, zRotation);
        }
        robotDrive.arcadeDrive(0, 0);
    }

    /**
     * Will drive the robot with the designated parameters for the given amount of time.
     * Creates a local variable that uses the predetermined {@code}secondsPerInch{@code} variable to
     * find the time it will take to drive the distance.
     * 
     * @param xSpeed The speed to run the robot (forward/backward)
     * @param zRotation The speed to rotate at (left/right)
     * @param distanceInInches The distance to ATTEMPT to drive (in inches)
     */
    public static void driveByInches(double xSpeed, double zRotation, double distanceInInches){
        double startTime = Timer.getFPGATimestamp();
        double estimatedTime = secondsPerInch * distanceInInches;
        while(Timer.getFPGATimestamp() - startTime < estimatedTime){

        }
    }
    /**
     * Drives the robot with the predetermined controls for the controller (includes).
     */
    public static void controllerDrive(){
        if(Robot.m_stick.getY() > 0.01 || Robot.m_stick.getY() < 0.01 || Robot.m_stick.getX() > 0.01 || Robot.m_stick.getX() < 0.01){
            robotDrive.arcadeDrive(Math.pow(Robot.m_stick.getY(),3), Robot.m_stick.getX());
        }
        else{
            robotDrive.arcadeDrive(0,0);
        }
    }
   /* if(Robot.m_stick.getY() > 0.1 || Robot.m_stick.getY() < -0.1 || Robot.m_stick.getX() > 0.1 || Robot.m_stick.getX() < -0.1){
        robotDrive.arcadeDrive(Math.pow(Robot.m_stick.getY(),3), Robot.m_stick.getX());
    }
    else{
        robotDrive.arcadeDrive(0,0);
    }*/
    /**
     * Don't attempt to use unless an encoder is on the drive train.
     * Drives the robot using encoders by checking the distance on the encoder in a while loop.
     */
    public static void autoDriveByInch(int inches){

        rearLeft.getSensorCollection().setQuadraturePosition(0, 0);
        
        while(rearLeft.getSensorCollection().getQuadraturePosition() < EncoderP.driveInchesToPulses(inches)){
          rearLeft.set(5);
        }
        rearLeft.set(0);
        rearLeft.getSensorCollection().setQuadraturePosition(0, 0);

    }

    /**
     * Don't attempt to use unless and encoder is on the drive train.
     * Drives the robot by checking the number of pulses on the encoder and
     * then calculates the rotations based on pulses (4096 pulses per rotation).
     * 
     * @param rotations Number of rotations for the drive train to complete
     */
    public static void autoDriveByRot(int rotations){
        
        rearLeft.getSensorCollection().setQuadraturePosition(0, 0);
        
        while(rearLeft.getSensorCollection().getQuadraturePosition() < EncoderP.rotationsToPulses(rotations)){
          rearLeft.set(5);
        }
        rearLeft.set(0);
        rearLeft.getSensorCollection().setQuadraturePosition(0, 0);
    }

}