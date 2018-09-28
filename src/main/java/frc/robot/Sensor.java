package frc.robot;

import edu.wpi.first.wpilibj.Ultrasonic;

public class Sensor {

    Ultrasonic ultrasonic = new Ultrasonic(0, 1);

    public static boolean SonicTriggered(){
        return false;
    }

}