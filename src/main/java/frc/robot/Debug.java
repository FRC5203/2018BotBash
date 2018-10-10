package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.Timer;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

/**
 * The class dedicated to debugging the robot (i.e. calling methods to send info to the smartdashboard)
 */
public class Debug {

    /**
     * Get the data from important sources (i.e. the encoder) and display it on the SmartDashboard
     */
    public static void record(){
        /*
        SmartDashboard.putString("DB/String 0","" + EncoderP.getPos());
        SmartDashboard.putString("DB/String 1", "" + EncoderP.getVel());
        SmartDashboard.putString("DB/String 2", "" + EncoderP.getRotations(0, EncoderP.getPos()));
        SmartDashboard.putString("DB/String 3", LimitSwitch.talon.getSensorCollection());
        SmartDashboard.putString("DB/String 3", LimitSwitch.talon.getSensorCollection());
        SmartDashboard.putString("DB/String 3", LimitSwitch.talon.getSensorCollection());
        SmartDashboard.putString("DB/String 3", LimitSwitch.talon.getSensorCollection());
        SmartDashboard.putString("DB/String 3", LimitSwitch.talon.getSensorCollection());
        */
    }

    public static void RunMotorFor(WPI_TalonSRX motor, int timeInSeconds){
        double startTime = Timer.getFPGATimestamp();
        motor.set(0.5);
        while(Timer.getFPGATimestamp() - startTime < timeInSeconds){
            
        }
        motor.set(0);
    }
    public static void RunMotorFor(Spark motor, int timeInSeconds){
        double startTime = Timer.getFPGATimestamp();
        motor.set(0.5);
        while(Timer.getFPGATimestamp() - startTime < timeInSeconds){
            
        }
        motor.set(0);
    }
    public static void RunMotorGroupFor(SpeedControllerGroup group, int timeInSeconds){
        double startTime = Timer.getFPGATimestamp();
        group.set(0.5);
        while(Timer.getFPGATimestamp() - startTime < timeInSeconds){
            
        }
        group.set(0);
    }

}