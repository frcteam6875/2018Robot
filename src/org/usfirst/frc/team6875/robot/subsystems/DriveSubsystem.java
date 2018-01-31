package org.usfirst.frc.team6875.robot.subsystems;

import org.usfirst.frc.team6875.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
/**
 *
 */
public class DriveSubsystem extends Subsystem {

	    WPI_TalonSRX topRight = new WPI_TalonSRX(RobotMap.topRight);
	    WPI_TalonSRX topLeft = new WPI_TalonSRX(RobotMap.topLeft);
	    WPI_TalonSRX bottomRight = new WPI_TalonSRX (RobotMap.bottomRight);
	    WPI_TalonSRX bottomLeft = new WPI_TalonSRX (RobotMap.bottomLeft);
    
    SpeedControllerGroup right = new SpeedControllerGroup(topRight, bottomRight);
    SpeedControllerGroup left = new SpeedControllerGroup(topLeft, bottomLeft);
    
    DifferentialDrive robotDrive;
    
    public DriveSubsystem() {
    	
    	topRight.setInverted(RobotMap.isTopRightInverted);
    	topLeft.setInverted(RobotMap.isTopLeftInverted);
    	bottomRight.setInverted(RobotMap.isBottomRightInverted);
    	bottomLeft.setInverted(RobotMap.isBottomLeftInverted);
    	
    	robotDrive = new DifferentialDrive(left, right);
    	
    	//robotDrive.setSafetyEnabled(true);
    }
    
    public void move(Joystick joystick, double speed) {
    	robotDrive.arcadeDrive(joystick.getY() *speed, joystick.getX() *speed);
    	
    }
    
    public void notMoving() {
    	robotDrive.stopMotor();
    }
    

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

