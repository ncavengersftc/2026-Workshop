package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TeleOpMode extends LinearOpMode {
    private final Shooter shooter;
    private final Intake intake;
    public TeleOpMode() {
        shooter=new Shooter();
        intake=new Intake();
        }
    @Override
    public void runOpMode(){
        telemetry.addData("status",init();
        telemetry.update();
        waitForStart();
        while (opModeIsActive()){
            telemetry.addData("status","running");
            telemetry.update();
            shooter.shoot(.5);
            intake.intake(.5);
            while (gamepad1.b) {
                shooter.shoot(.5);
            while (gamepad1.a) {
                intake.intake(.5);
            }
            while (gamepad1.a) {
                intake.stop;
            }
            while (gamepad1.b) {
                shooter.stop;
            }

        }
    }
}
