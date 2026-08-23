package commands;

import com.seattlesolvers.solverslib.command.CommandBase;

import subsystems.Intake;
import subsystems.Shooter;

public class StopShooter extends CommandBase {

    private final Shooter shooter;

    public StopShooter(Shooter shooter) {
        this.shooter = shooter;
        addRequirements(shooter);
    }

    @Override
    public void initialize(){
        shooter.stop();

    }
}
