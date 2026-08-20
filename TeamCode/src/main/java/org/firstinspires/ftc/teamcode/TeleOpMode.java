package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class TeleOpMode extends LinearOpMode {
    private Shooter shooter;
    private Intake intake;


    private DcMotor intakeMotor;

    private DcMotor outtakeMotorLeft;
    private DcMotor outtakeMotorRight;

    public TeleOpMode() {

    }

    @Override
    public void runOpMode() {
        telemetry.addData("status", "init");
        telemetry.update();

        intakeMotor = hardwareMap.get(DcMotor.class, "Intake Motor");
        outtakeMotorLeft = hardwareMap.get(DcMotor.class, "Outtake Motor Left");
        outtakeMotorRight = hardwareMap.get(DcMotor.class, "Outtake Motor Right");

        shooter = new Shooter(outtakeMotorLeft, outtakeMotorRight);
        intake = new Intake(intakeMotor);

        waitForStart();
        while (opModeIsActive()) {

            telemetry.addData("status", "running");
            telemetry.update();

            while (gamepad1.b) {
                shooter.shoot(.75);
            }
            while (gamepad1.a) {
                intake.intake(.75);
            }
            while (gamepad1.x) {
                intake.stop();
            }
            while (gamepad1.y) {
                shooter.stop();
            }
        }
    }
}
