package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Intake extends SubsystemBase {

    private final DcMotor intakeMotor;

    private final Telemetry telemetry;

    public Intake(HardwareMap hMap, Telemetry telemetry) {
        intakeMotor = hMap.get(DcMotor.class, "Intake Motor");
        this.telemetry = telemetry;
    }

    public void intake(double power) {
        intakeMotor.setPower(power);
    }

    public void stop() {
        intakeMotor.setPower(0);
        intakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }

    @Override
    public void periodic() {
        telemetry.addData("Intake", "Initialized");
        telemetry.update();
    }


}
