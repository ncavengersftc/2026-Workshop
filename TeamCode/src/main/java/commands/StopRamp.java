package commands;

import com.seattlesolvers.solverslib.command.CommandBase;

import subsystems.Ramp;

public class StopRamp extends CommandBase {
    private final Ramp ramp;


    public StopRamp(Ramp ramp) {
        this.ramp = ramp;
        addRequirements(ramp);
    }

    @Override
    public void initialize(){
        ramp.stop();

    }

}
