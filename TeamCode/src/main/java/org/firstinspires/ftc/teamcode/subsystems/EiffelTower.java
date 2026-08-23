package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class EiffelTower extends SubsystemBase {
    private final CRServo frontLeftServo;
    private final CRServo backLeftServo;
    private final CRServo frontRightServo;
    private final CRServo backRightServo;

    public EiffelTower(HardwareMap hardwareMap) {
        frontLeftServo = hardwareMap.get(CRServo.class, "Front Left Servo");
        backLeftServo = hardwareMap.get(CRServo.class, "Front Left Servo");
        frontRightServo = hardwareMap.get(CRServo.class, "Front Left Servo");
        backRightServo = hardwareMap.get(CRServo.class, "Front Left Servo");
        frontLeftServo.setDirection(DcMotorSimple.Direction.FORWARD);
        backLeftServo.setDirection(DcMotorSimple.Direction.FORWARD);
        frontRightServo.setDirection(DcMotorSimple.Direction.REVERSE);
        backRightServo.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    public void eiffeltower(double power){
        frontLeftServo.setPower(power);
        backLeftServo.setPower(power);
        frontRightServo.setPower(power);
        backRightServo.setPower(power);
    }
}