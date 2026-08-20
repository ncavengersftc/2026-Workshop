package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TeleOpMode extends LinearOpMode {
    private final Shooter shooter;
    private final Intake intake;
    public TeleOpMode() {
        intake =  new Intake();
        shooter = new Shooter();
    }
    @Override
    public void runOpMode(){
        telemetry.addData("status", "init");
        telemetry.update();
        waitForStart();
        while (opModeIsActive()){
            telemetry.addData("status", "running");
            telemetry.update();
            shooter.shoot(.25);
            intake.intake(.25);
            while (gamepad1.x){
                shooter.shoot (.25);
            }
            while (gamepad1.a){
                intake.intake(.25);
            }
            while (gamepad1.b){
               intake.stop();
               shooter.stop();
            }
        }
    }
}