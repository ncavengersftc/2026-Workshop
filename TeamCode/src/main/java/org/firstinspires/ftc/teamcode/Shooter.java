package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private final DcMotor outtakeMotorLeft;
    private final DcMotor outtakeMotorRight;
    public Shooter(){
        outtakeMotorLeft=hardwareMap.get(DcMotor.class,"Outtake Motor Left");
        outtakeMotorRight=hardwareMap.get(DcMotor.class,"Outtake Motor Right");
    }

    public void shoot(){
        outtakeMotorLeft.setPower(.25);
        outtakeMotorRight.setPower(-.25);
    }
    public void stop(){
        outtakeMotorLeft.setPower(0);
        outtakeMotorRight.setPower(0);
        outtakeMotorLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        outtakeMotorRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
}
