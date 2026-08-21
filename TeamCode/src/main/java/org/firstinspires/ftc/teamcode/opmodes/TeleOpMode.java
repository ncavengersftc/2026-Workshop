package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.command.CommandScheduler;

import org.firstinspires.ftc.teamcode.commands.IntakeFuel;
import org.firstinspires.ftc.teamcode.commands.Shoot;
import org.firstinspires.ftc.teamcode.commands.StopIntake;
import org.firstinspires.ftc.teamcode.commands.StopShooter;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.Shooter;

@TeleOp
public class TeleOpMode extends LinearOpMode {
    private Shooter shooter;
    private Intake intake;

    public void initialize() {
        shooter = new Shooter(hardwareMap, telemetry);
        intake = new Intake(hardwareMap);

        CommandScheduler.getInstance().enable();

        shooter.setDefaultCommand(new StopShooter(shooter, intake));
        intake.setDefaultCommand(new StopIntake(intake));
    }

    @Override
    public void runOpMode() {

        initialize();

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Wait for game to start
        waitForStart();

        // Runs until driver pressed STOP
        while (opModeIsActive()) {

            CommandScheduler.getInstance().run();

            telemetry.addData("Status", "Running");
            telemetry.update();

            // Controller mapping
            while (gamepad1.a) {
                new Shoot(telemetry, shooter, intake);
            }

            while (gamepad1.b) {
                new IntakeFuel(intake);
            }

        }

        CommandScheduler.getInstance().reset();

    }


}
