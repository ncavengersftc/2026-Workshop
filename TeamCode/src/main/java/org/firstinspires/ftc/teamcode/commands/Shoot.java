package org.firstinspires.ftc.teamcode.commands;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.Shooter;

public class Shoot extends CommandBase {

    private final Shooter shooter;

    public Shoot(Shooter shooter, Intake intake) {
        this.shooter = shooter;
        addRequirements(shooter, intake);
    }

    @Override
    public void execute() {
        shooter.shoot(0.25);
    }

}
