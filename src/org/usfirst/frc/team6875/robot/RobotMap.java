/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6875.robot;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// PWM channels
	public static int windowMotor = 0;
	
	// CANBus motors
	
	 public static boolean isTopRightInverted = true;
	 public static boolean isTopLeftInverted = false;
	 public static boolean isBottomRightInverted = false;
	 public static boolean isBottomLeftInverted = true;
	 
	 
	public static int topRight = 1;
   	public static int bottomLeft = 2;
   	public static int topLeft = 3;
   	public static int bottomRight = 4;
    
    	public static int intake1 = 5;
    	public static int intake2 = 6;
    
    //Speed constant
    public static double intakeForward = 1;
    public static double intakeBackward = -1;
    
   
    
    
   
}
