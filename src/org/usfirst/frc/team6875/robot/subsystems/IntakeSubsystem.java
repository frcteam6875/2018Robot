package org.usfirst.frc.team6875.robot.subsystems;

import org.usfirst.frc.team6875.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeSubsystem extends Subsystem {

//    PWM intake1 = new PWM(RobotMap.intake1);
//    PWM intake2 = new PWM(RobotMap.intake2);
	
	WPI_TalonSRX intake1 = new WPI_TalonSRX(RobotMap.intake1);
	WPI_TalonSRX intake2 = new WPI_TalonSRX(RobotMap.intake2);
    

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void move(boolean direction) {
    	if (direction) {
    		intake1.set(RobotMap.intakeForward);
    		intake2.set(RobotMap.intakeForward);
    	} else {
    		intake1.set(RobotMap.intakeBackward);
    		intake2.set(RobotMap.intakeBackward);
    	}
    }
    
    public void notMoving() {
    	intake1.stopMotor();
    	intake2.stopMotor();
    }
    
}

