package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Shooter extends SubsystemBase {

    private final Telemetry telemetry;

    private final DcMotor outtakeMotorLeft;
    private final DcMotor outtakeMotorRight;

    public Shooter(Telemetry telemetry, HardwareMap hMap) {
        this.telemetry = telemetry;

        outtakeMotorLeft = hMap.get(DcMotor.class, "Outtake Motor Left");
        outtakeMotorRight = hMap.get(DcMotor.class, "Outtake Motor Right");
        outtakeMotorLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        outtakeMotorRight.setDirection(DcMotorSimple.Direction.REVERSE);
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

    @Override
    public void periodic() {
        telemetry.addData("Shooter", "Initialized");
        telemetry.update();
    }

}
