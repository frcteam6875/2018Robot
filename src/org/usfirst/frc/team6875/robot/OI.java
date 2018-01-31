/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6875.robot;

import org.usfirst.frc.team6875.robot.commands.IntakeCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**DFLKNSKJGBKRJGSBK
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick joystick1 = new Joystick(0);
	Joystick joystick2 =new Joystick(1);
	
	Button j2ButtonX = new JoystickButton(joystick2, 3);
	Button j2ButtonY = new JoystickButton(joystick2, 4);
	
	Button j2LeftButton = new JoystickButton(joystick2, 5);
	Button j2RightButton = new JoystickButton(joystick2, 6);
	
	public Joystick getJoystick1() {
	return joystick1;
	}
	
	public OI() {
		j2ButtonX.whenInactive(new IntakeCommand(false));
	}
}
