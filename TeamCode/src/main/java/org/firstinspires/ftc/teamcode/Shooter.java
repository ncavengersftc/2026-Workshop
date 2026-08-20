package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private final DcMotor outtakeMotorLeft;
    private final DcMotor outtakeMotorRight;
    public Shooter(){
        outtakeMotorLeft = hardwareMap.get(DcMotor.class,"Outtake Motor Left");
        outtakeMotorRight = hardwareMap.get(DcMotor.class,"Outtake Motor Right");
        outtakeMotorLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        outtakeMotorRight.setDirection(DcMotorSimple.Direction.FORWARD);
}
    public void shoot(double power) {
        outtakeMotorLeft.setPower(power);
        outtakeMotorRight.setPower(power);
    }

    public void stop(){
    outtakeMotorLeft.setPower(0);
    outtakeMotorLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        outtakeMotorRight.setPower(0);
        outtakeMotorRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }
    public void reverse (){
        outtakeMotorLeft.setPower(-.25);
        outtakeMotorRight.setPower(.25);
    }
    @Override
    public void periodic() {
        super.periodic();
        telemetry.addData("Outtake Motor Left Speed", outtakeMotorLeft.getPower());
        telemetry.addData("Outtake Motor Right Speed", outtakeMotorRight.getPower());
        telemetry.update();
    }

    }