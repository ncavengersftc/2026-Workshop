package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.CRServo;
import com.seattlesolvers.solverslib.hardware.motors.Motor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Tower extends SubsystemBase {

    private final CRServo frontLeft;
    private final CRServo frontRight;
    private final CRServo backLeft;
    private final CRServo backRight;

    private final Telemetry telem;

    public Tower(HardwareMap hMap, Telemetry telem) {
        frontLeft = hMap.get(CRServo.class, "Front Left Servo");
        frontRight = hMap.get(CRServo.class, "Front Right Servo");
        backLeft = hMap.get(CRServo.class, "Back Left Servo");
        backRight = hMap.get(CRServo.class, "Back Right Servo");

        this.telem = telem;
    }

    public void spin(double power) {
        frontLeft.setPower(power);
        frontRight.setPower(power);
        backLeft.setPower(power);
        backRight.setPower(power);
    }

    public void stop() {
        frontLeft.setPower(0);
        frontRight.setPower(0);
        backLeft.setPower(0);
        backRight.setPower(0);
    }
}
