package commands;

import com.seattlesolvers.solverslib.command.CommandBase;

import subsystems.Intake;

public class IntakeBall extends CommandBase {

    private final Intake intake;

    public IntakeBall(Intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }

    @Override
    public void initialize(){
        intake.intake(0.5);

    }


}
