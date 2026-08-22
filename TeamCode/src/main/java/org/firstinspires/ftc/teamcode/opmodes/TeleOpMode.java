package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.commands.IntakeArtifact;
import org.firstinspires.ftc.teamcode.commands.StopIntake;
import org.firstinspires.ftc.teamcode.subsystems.Intake;

@TeleOp
public class TeleOpMode extends CommandOpMode {
    private Intake intake;

    private GamepadEx driver;
    @Override
    public void initialize() {
    driver = new GamepadEx(gamepad1);
        intake = new Intake(hardwareMap);
        intake.setDefaultCommand(new StopIntake(intake));
        driver.getGamepadButton(GamepadKeys.Button.A).whileHeld(new IntakeArtifact(intake));

    }




}

