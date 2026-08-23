package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class Ramp extends SubsystemBase {
    private final CRServo frontLeft;
    private final CRServo frontRight;
    private final CRServo backLeft;
    private final CRServo backRight;

    public Ramp(HardwareMap hMart) {
        frontLeft = hMart.get(CRServo.class, "Front Left Servo");
        frontRight = hMart.get(CRServo.class, "Front Right Servo");
        backRight = hMart.get(CRServo.class, "Back Right Servo");
        backLeft = hMart.get(CRServo.class, "Back Left Servo");

        frontLeft.setDirection(CRServo.Direction.REVERSE);
        frontRight.setDirection(CRServo.Direction.FORWARD);
        backLeft.setDirection(CRServo.Direction.REVERSE);
        backRight.setDirection(CRServo.Direction.FORWARD);
    }
    public void transfer(double power){
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
