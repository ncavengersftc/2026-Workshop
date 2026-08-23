package commands;

import com.seattlesolvers.solverslib.command.CommandBase;

import subsystems.Ramp;

public class RampUp extends CommandBase {
    private final Ramp ramp;


    public RampUp (Ramp ramp) {
        this.ramp = ramp;
        addRequirements(ramp);
    }

    @Override
    public void initialize(){
        ramp.transfer(0.5);

    }

}
