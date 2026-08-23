package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;
import com.seattlesolvers.solverslib.drivebase.MecanumDrive;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.hardware.motors.Motor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Drive extends SubsystemBase {

    private final Motor frontLeft;
    private final Motor frontRight;
    private final Motor backLeft;
    private final Motor backRight;

    private final MecanumDrive drive;

    private final Telemetry telemetry;

    public Drive(Telemetry telemetry, HardwareMap hMap) {
        frontLeft = new Motor(hMap, "Front Wheel Left");
        frontRight = new Motor(hMap, "Front Wheel Right");
        backLeft = new Motor(hMap, "Back Wheel Left");
        backRight = new Motor(hMap, "Back Wheel Right");

        drive = new MecanumDrive(frontLeft, frontRight, backLeft, backRight);

        this.telemetry = telemetry;
    }

    public void drive(double strafeSpeed, double forwardSpeed, double turnSpeed) {
        drive.driveRobotCentric(strafeSpeed, forwardSpeed, turnSpeed);
    }




}
