package subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.SubsystemBase;

public class Intake extends SubsystemBase {

    private final DcMotor intakeMotor;


    public Intake(HardwareMap hMap) {
        intakeMotor = hMap.get(DcMotor.class, "intake Motor");

    }

    public void intake (double power) {
        intakeMotor.setPower(power);
    }


    public void stop(){
            intakeMotor.setPower(0);
            intakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);

        }

    }

}