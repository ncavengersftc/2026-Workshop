package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private DcMotor outtakeMotorLeft;
    private DcMotor outtakeMotorRight;

    public Shooter(DcMotor outtakeMotorLeftInput, DcMotor outtakeMotorRightInput) {
        outtakeMotorLeft = outtakeMotorLeftInput;
        outtakeMotorRight = outtakeMotorRightInput;
        outtakeMotorLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        outtakeMotorRight.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    public void shoot(double power) {
        outtakeMotorLeft.setPower(power);
        outtakeMotorRight.setPower(power);
    }

    public void stop() {
        outtakeMotorLeft.setPower(0);
        outtakeMotorRight.setPower(0);
        outtakeMotorRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        outtakeMotorLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }

    @Override
    public void periodic() {
        super.periodic();
        telemetry.addData("Outtake Motor Left", outtakeMotorLeft.getPower());
        telemetry.addData("Outtake Motor Right", outtakeMotorRight.getPower());
        telemetry.update();
    }
}