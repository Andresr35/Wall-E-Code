// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class driveSubsystem extends SubsystemBase 
{

  Victor leftBack, leftFront, rightBack, rightFront;
  SpeedControllerGroup rightSide, leftSide;
  DifferentialDrive drive;


  /** Creates a new driveSubsystem. */
  public driveSubsystem() 
  {
    this.leftBack = new Victor(0);
    this.leftFront = new Victor(5);
    this.rightFront= new Victor(8);
    this.rightBack= new Victor(3);
    this.rightSide = new SpeedControllerGroup(rightBack, rightFront);
    this.leftSide = new SpeedControllerGroup(leftBack, leftFront);
    this.drive = new DifferentialDrive(leftSide, rightSide);

    //fork test 

    // damn you copied a lot of my code. the "this" thing is kinda complicated and i forgot why i did it. I saw some
    // other team do it and i think it made some warning go away?
    // i forgot what it was but you should prob learn why the other teams did this in their code.
    // I think since you declare those variables inside this contrusctor the 'this' thing allows you to grab
    /* whatever you set it equal to somewhere else in your code. So for example its like if you made a variable inside your constructor.
    you shouldn't be able to grab that variable somewhere else outside your constructor, but if you do the "this" thing
    it tells ur compiler or sum to look at that variable/ object if its not declared somewhere else. Remember I was in season 
    when i learned most of coding so i was low on sleep, prob dead, and just looking for the best solutions for my code 
    so this might not be the best way to do it? it certainly is more confusing, but i think it made it faster or something
    to update the drive with the joystick values cause of the scheduler.
    */


  }

  public void tankDrive(double leftJoystick, double rightJoystick)
  {
    double leftSpeed = leftJoystick, rightSpeed = rightJoystick;

    drive.tankDrive(leftSpeed, rightSpeed);
    
  }




  @Override
  public void periodic() 
  {
    // This method will be called once per scheduler run
  }
}
