/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */

public class Robot extends IterativeRobot {

  public static final Joystick m_stick = new Joystick(0);
  public static final Timer m_timer = new Timer();
  SendableChooser<String> autoChooser = new SendableChooser<>();

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {
    EncoderP.init();
    Catapult.init();
    Drive.init();
    CameraServer.getInstance().startAutomaticCapture();
    autoChooser.addDefault("Default Autonomous Mode", "Default");
    autoChooser.addObject("Cross the Line (Anywhere)", "Cross the Line");
    autoChooser.addObject("Get the switch", "Switch");
  }

  /**
   * This function is run once each time the robot enters autonomous mode.
   */
  @Override
  public void autonomousInit() {
    EncoderP.init();
    Drive.init();
    m_timer.reset();
    m_timer.start();

  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    
    EncoderP.update();
  }

  /**
   * This function is called once each time the robot enters teleoperated mode.
   */
  @Override
  public void teleopInit() {
    EncoderP.init();
    Drive.init();
  }
  /**
   * This function is called periodically during teleoperated mode.
   */
  @Override
  public void teleopPeriodic() {

    EncoderP.update();
    Debug.record();
    
    //Drives the robot with the right joystick (see drive class)
    Drive.controllerDrive();

    Timer.delay(0.005);

  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
    EncoderP.update();
    Debug.record();

    if(m_stick.getRawButtonReleased(1)){
      robotInit();
    }
    else if(m_stick.getRawButtonReleased(2)){
      
    }
  }
}