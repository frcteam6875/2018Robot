package org.usfirst.frc.team6875.robot.subsystems;

import org.usfirst.frc.team6875.robot.RobotMap;

import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RampSubsystem extends Subsystem {

    PWM motor = new PWM(RobotMap.windowMotor);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void move() {
    	motor.setSpeed(1);    	
    }
}
