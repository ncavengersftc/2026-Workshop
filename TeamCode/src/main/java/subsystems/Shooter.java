package subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class Shooter extends SubsystemBase {

    private final DcMotor outtakeMotorLeft;
    private final DcMotor outtakeMotorRight;

    public Shooter(HardwareMap hMap) {
        outtakeMotorLeft = hMap.get(DcMotor.class, "outtake Motor Left");
        outtakeMotorRight = hMap.get(DcMotor.class, "outtake Motor Right");
        outtakeMotorRight.setDirection(DcMotorSimple.Direction.FORWARD);
        outtakeMotorLeft.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    public void shoot(double power) {
        outtakeMotorRight.setPower(power);
        outtakeMotorLeft.setPower(power);
    }

    public void stop(){
        outtakeMotorLeft.setPower(0);
        outtakeMotorLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        outtakeMotorRight.setPower(0);
        outtakeMotorRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }

    public void pull(){
        outtakeMotorLeft.setPower(-0.25);
        outtakeMotorRight.setPower(0.25);

    }





}