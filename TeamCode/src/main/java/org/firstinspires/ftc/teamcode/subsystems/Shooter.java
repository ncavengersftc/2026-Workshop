package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private final DcMotor outtakeMotorRight;
    private final DcMotor outtakeMotorLeft;

    public Shooter(HardwareMap hMart) {
        outtakeMotorRight = hMart.get(DcMotor.class, "OuttakeMotorRight");
        outtakeMotorLeft = hMart.get(DcMotor.class, "OuttakeMotorLeft");

        outtakeMotorRight.setDirection(DcMotorSimple.Direction.FORWARD);
        outtakeMotorLeft.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void shooter(double power) {
        outtakeMotorLeft.setPower(power);
        outtakeMotorRight.setPower(power);
    }

    public void stop() {
        outtakeMotorRight.setPower(0);
        outtakeMotorRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        outtakeMotorLeft.setPower(0);
        outtakeMotorLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }
}