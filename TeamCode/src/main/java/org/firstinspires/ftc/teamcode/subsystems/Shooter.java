package org.firstinspires.ftc.teamcode.subsystems;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Shooter extends SubsystemBase {

    private final DcMotor outtakeMotorLeft;
    private final DcMotor outtakeMotorRight;

    private final Telemetry telem;

    public Shooter(HardwareMap hMap, Telemetry telem) {
        outtakeMotorLeft = hMap.get(DcMotor.class, "Outtake Motor Left");
        outtakeMotorRight = hMap.get(DcMotor.class, "Outtake Motor Right");

        this.telem = telem;

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
        outtakeMotorLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }

    @Override
    public void periodic() {
        super.periodic();
        telem.addData("Outtake Motor Left Speed", outtakeMotorLeft.getPower());
        telem.addData("Outtake Motor Right Speed", outtakeMotorRight.getPower());
        telem.update();
    }
}
