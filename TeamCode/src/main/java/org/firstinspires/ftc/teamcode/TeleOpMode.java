package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TeleOpMode extends LinearOpMode {
    private final Shooter shooter;

    public TeleOpMode() {
        this.shooter = new Shooter();
    }

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Wait for game to start
        waitForStart();

        // Runs until driver pressed STOP
        while (opModeIsActive()) {
            telemetry.addData("Status", "Running");
            telemetry.update();

            while (gamepad1.a) {
                shooter.shoot();
            }

            // Updates telemetry
            shooter.updateTelemetry();
        }
    }


}
