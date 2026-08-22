package commands;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.seattlesolvers.solverslib.command.CommandBase;

import subsystems.Intake;

public class Intakestop extends CommandBase {

    private final Intake intake;public Intakestop(Intake intake){
        this.intake = intake;
        addRequirements(intake);

    }
     @Override
     public void initialize() {
        intake.stop();
     }

}
