package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.commands.IntakeArtifact;
import org.firstinspires.ftc.teamcode.commands.RampTransfer;
import org.firstinspires.ftc.teamcode.commands.ShootArtifacts;
import org.firstinspires.ftc.teamcode.commands.StopIntake;
import org.firstinspires.ftc.teamcode.commands.StopShooter;
import org.firstinspires.ftc.teamcode.commands.StopTower;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.Shooter;
import org.firstinspires.ftc.teamcode.subsystems.Tower;

@TeleOp
public class TeleOpMode extends CommandOpMode {
    private Intake intake;
    private Shooter shooter;
    private Tower tower;

    private GamepadEx driver;
    @Override
    public void initialize() {
    driver = new GamepadEx(gamepad1);
        intake = new Intake(hardwareMap);
        intake.setDefaultCommand(new StopIntake(intake));

        shooter = new Shooter(hardwareMap);
        shooter.setDefaultCommand(new StopShooter(shooter));

        tower = new Tower(hardwareMap);
        tower.setDefaultCommand(new StopTower(tower));

        driver.getGamepadButton(GamepadKeys.Button.A).whileHeld(new IntakeArtifact(intake));
        driver.getGamepadButton(GamepadKeys.Button.B).whileHeld(new ShootArtifacts(shooter));
        driver.getGamepadButton(GamepadKeys.Button.X).whileHeld(new RampTransfer(tower));



    }




}

