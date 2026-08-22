package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.sequences.IntakeArtifact;
import org.firstinspires.ftc.teamcode.sequences.Shoot;
import org.firstinspires.ftc.teamcode.sequences.StopIntake;
import org.firstinspires.ftc.teamcode.sequences.StopShooter;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.Shooter;

@TeleOp
public class TeleOpMode extends CommandOpMode {
    private GamepadEx driverOp;

    private Intake intake;
    private Shooter shooter;

    @Override
    public void initialize() {
        telemetry.addData("Status", "Running");
        telemetry.update();

        driverOp = new GamepadEx(gamepad1);

        intake = new Intake(hardwareMap, telemetry);
        intake.setDefaultCommand(new StopIntake(telemetry, intake));
        shooter = new Shooter(telemetry, hardwareMap);
        shooter.setDefaultCommand(new StopShooter(telemetry, shooter));

        driverOp.getGamepadButton(GamepadKeys.Button.A)
                .whileHeld(new IntakeArtifact(telemetry, intake));

        driverOp.getGamepadButton(GamepadKeys.Button.B)
                .whileHeld(new Shoot(telemetry, shooter));
    }

}
