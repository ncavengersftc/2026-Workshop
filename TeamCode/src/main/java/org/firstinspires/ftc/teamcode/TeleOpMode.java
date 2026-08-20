package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TeleOpMode extends LinearOpMode {
    private final Shooter shooter;
    private final  Intake intake;
public TeleOpMode(){
    shooter=new Shooter();
    intake=new Intake();

}
@Override
    public void runOpMode(){
    telemetry.addData("status","init");
    telemetry.update();
        waitForStart();
        while (opModeIsActive()){
            telemetry.addData("status","running");
            telemetry.update();


            while (gamepad1.a) {
                shooter.shoot(.25);
            }
            while(gamepad1.b){
                intake.intake(.25);
            }
            while(gamepad1.x){
                shooter.stop();
            }
            while(gamepad1.y){
                intake.stop();
            }
        }
    }
}
