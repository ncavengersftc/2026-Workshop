package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;
import com.seattlesolvers.solverslib.hardware.motors.CRServo;
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
        frontLeft.set(power);
        frontRight.set(power);
        backLeft.set(power);
        backRight.set(power);
    }

    public void stop() {
        frontLeft.set(0);
        frontLeft.setZeroPowerBehavior(Motor.ZeroPowerBehavior.FLOAT);
        frontRight.set(0);
        frontRight.setZeroPowerBehavior(Motor.ZeroPowerBehavior.FLOAT);
        backLeft.set(0);
        backLeft.setZeroPowerBehavior(Motor.ZeroPowerBehavior.FLOAT);
        backRight.set(0);
        backRight.setZeroPowerBehavior(Motor.ZeroPowerBehavior.FLOAT);
    }
}
