package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class TeleOpMode extends LinearOpMode {
    private final Shooter shooter;
    public TeleOpMode() {
        this.shooter=new Shooter();
    }
    @Override
    public void runOpMode(){
        waitForStart();
        while (opModeIsActive()){
            shooter.shoot();

        }
    }
}
