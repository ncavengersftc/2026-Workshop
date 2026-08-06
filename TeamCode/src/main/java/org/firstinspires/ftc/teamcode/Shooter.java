package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class Shooter extends SubsystemBase {

    private final DcMotor shooterMotor;

    public Shooter() {
        shooterMotor = hardwareMap.get(DcMotor.class, "shooterMotor");
    }

    public void shoot() {
        shooterMotor.setPower(0.25);
    }

    public void updateTelemetry() {
        telemetry.addData("Shooter Motor Speed", shooterMotor.getPower());
        telemetry.update();
    }

}
