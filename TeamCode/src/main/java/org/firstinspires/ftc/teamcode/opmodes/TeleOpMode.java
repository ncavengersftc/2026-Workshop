package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.commands.IntakeArtifact;
import org.firstinspires.ftc.teamcode.commands.IntakeRampShooter;
import org.firstinspires.ftc.teamcode.commands.IntakeStop;
import org.firstinspires.ftc.teamcode.commands.RampStop;
import org.firstinspires.ftc.teamcode.commands.RampTransfer;
import org.firstinspires.ftc.teamcode.commands.ShootArtifact;
import org.firstinspires.ftc.teamcode.commands.StopShooter;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.Ramp;
import org.firstinspires.ftc.teamcode.subsystems.Shooter;

@TeleOp
public class TeleOpMode extends CommandOpMode {
    private Intake intake;

    private Ramp ramp;

    private Shooter shooter;
    private GamepadEx driver;

    @Override
    public void initialize() {
        driver = new GamepadEx(gamepad1);
        intake = new Intake(hardwareMap);
        intake.setDefaultCommand(new IntakeStop(intake));

        shooter = new Shooter(hardwareMap);
        shooter.setDefaultCommand(new StopShooter(shooter));

        ramp = new Ramp(hardwareMap);
        ramp.setDefaultCommand(new RampStop(ramp));

        driver.getGamepadButton(GamepadKeys.Button.X).whileHeld(new IntakeArtifact(intake));
        driver.getGamepadButton(GamepadKeys.Button.A).whileHeld(new RampTransfer(ramp));
        driver.getGamepadButton(GamepadKeys.Button.Y).whileHeld(new ShootArtifact(shooter));
        driver.getGamepadButton(GamepadKeys.Button.B).whileHeld(new IntakeRampShooter(intake, ramp, shooter));
    }

}
