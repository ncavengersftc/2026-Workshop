package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    private final DcMotor outtakeMotorLeft;
    private final DcMotor outtakeMotorRight;
    public Shooter(){
        outtakeMotorLeft=hardwareMap.get(DcMotor.class,"Outtake Motor Left");
        outtakeMotorRight=hardwareMap.get(DcMotor.class,"Outtake Motor Right");
        outtakeMotorLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        outtakeMotorRight.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    public void shoot(double power){
        outtakeMotorLeft.setPower(power);
        outtakeMotorRight.setPower(power);
    }
    public void stop(){
        outtakeMotorLeft.setPower(0);
        outtakeMotorRight.setPower(0);
        outtakeMotorLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        outtakeMotorRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    @Override
    public void periodic() {
        super.periodic();
        telemetry.addData("out take motor power", outtakeMotorLeft.getPower());
        telemetry.addData("out take motor power", outtakeMotorRight.getPower());
        telemetry.update();


    }}