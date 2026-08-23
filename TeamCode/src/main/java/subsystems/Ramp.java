package subsystems;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class Ramp extends SubsystemBase {
    private final CRServo frontLeftServo;
    private final CRServo frontRightServo;
    private final CRServo backLeftServo;
    private final CRServo backRightServo;

    public Ramp(HardwareMap hardwareMap){
        backLeftServo = hardwareMap.get(CRServo .class, "backLeftServo");
        backRightServo = hardwareMap.get(CRServo.class, "BackRightServo");
        frontRightServo = hardwareMap.get(CRServo.class, "frontRightServo");
        frontLeftServo = hardwareMap.get(CRServo.class, "frontLeftServo");

        frontLeftServo.setDirection(CRServo.Direction.FORWARD);
        frontRightServo.setDirection(CRServo.Direction.FORWARD);
        backLeftServo.setDirection(CRServo.Direction.FORWARD);
        backRightServo.setDirection(CRServo.Direction.FORWARD);
    }

    public void transfer (double power){
        frontLeftServo.setPower(power);
        frontRightServo.setPower(power);
        backRightServo.setPower(power);
        backLeftServo.setPower(power);
    }

    public void stop(){
        frontLeftServo.setPower(0);
        frontRightServo.setPower(0);
        backRightServo .setPower(0);
        backLeftServo  .setPower(0);
    }


}
