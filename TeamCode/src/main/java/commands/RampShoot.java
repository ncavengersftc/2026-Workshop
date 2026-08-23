package commands;

import com.seattlesolvers.solverslib.command.CommandBase;

import subsystems.Intake;
import subsystems.Shooter;

public class RampShoot extends CommandBase {

    private final Shooter shooter;

    public RampShoot(Shooter shooter) {
        this.shooter = shooter;
        addRequirements(shooter);
    }

    @Override
    public void initialize(){
        shooter.shoot(0.5);
        }


    @Override
    public void initialize(){
        shooter.shoot(0.5);

    }

}
