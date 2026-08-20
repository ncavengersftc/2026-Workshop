package org.firstinspires.ftc.teamcode;


import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class Intake  extends SubsystemBase {
    private final DcMotor intakeMotor;

    public Intake(){
        intakeMotor=hardwareMap.get(DcMotor.class,"intakeMotor");
    }
    public void intake(double power){
        intakeMotor.setPower(power);
    }
    public void stop(){
        intakeMotor.setPower(0);
        intakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    @Override
    public void periodic() {
        super.periodic();
        telemetry.addData("",intakeMotor.getPower());
        telemetry.update();
    }
}
