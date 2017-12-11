package org.usfirst.frc.team5700.robot.commands;

import org.usfirst.frc.team5700.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class MotorFullSpeed extends Command {

    public MotorFullSpeed() {
    	requires(Robot.motorSystem);
    }
        

   
    protected void initialize() {
    	Robot.motorSystem.fullSpeed();
    }

    
    protected void execute() {
    }

    
    protected boolean isFinished() {
        return false;
    }

    
    protected void end() {
    	Robot.motorSystem.stopMotor();
    }

    
    protected void interrupted() {
    	end();
    }
}
