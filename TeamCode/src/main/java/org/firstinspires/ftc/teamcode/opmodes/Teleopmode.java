package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.commandcenter.Intakeartifact;
import org.firstinspires.ftc.teamcode.commandcenter.Stopeth;
import org.firstinspires.ftc.teamcode.subsystems.Intake;

@TeleOp
public class Teleopmode extends CommandOpMode {

    @Override
    public void initialize() {
        GamepadEx driver = new GamepadEx(gamepad1);

        Intake intake = new Intake(hardwareMap);
        intake.setDefaultCommand(new Stopeth(intake));

        driver.getGamepadButton(GamepadKeys.Button.A)
                .whileHeld(new Intakeartifact(intake));
    }
}