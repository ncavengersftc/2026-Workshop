package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private final DcMotor outtakeMotorLeft;
    private final DcMotor outtakeMotorRight;

    public Shooter(HardwareMap hardwareMap) {
        outtakeMotorLeft = hardwareMap.get(DcMotor.class, "Outtake Motor Left");
        outtakeMotorRight = hardwareMap.get(DcMotor.class, "Outtake Motor Right");
    }

    public void shoot(double power) {
        outtakeMotorLeft.setPower(power);
        outtakeMotorRight.setPower(power);
    }

    public void stop() {
        outtakeMotorLeft.setPower(0);
        outtakeMotorLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        outtakeMotorRight.setPower(0);
        outtakeMotorRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }
}
