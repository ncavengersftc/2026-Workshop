package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private final DcMotor outtakeMotorLeft;
    private final DcMotor outtakeMotorRight;
public Shooter(){
    outtakeMotorLeft = hardwareMap.get(DcMotor.class,"OuttakeMotorLeft");
    outtakeMotorRight = hardwareMap.get(DcMotor.class,"OuttakeMotorRight");
}
public void shoot (){
    outtakeMotorLeft.setPower(0.25);
    outtakeMotorRight.setPower(-0.25);
}

    public void stop () {
        outtakeMotorLeft.setPower(0);
        outtakeMotorLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        outtakeMotorRight.setPower(0);
        outtakeMotorLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }


    public void pull () {
        outtakeMotorLeft.setPower(-0.25);
        outtakeMotorRight.setPower(0.25);
    }
}
