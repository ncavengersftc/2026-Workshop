package org.firstinspires.ftc.teamcode.commandcenter;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.Shooter;

public class FireCannon extends CommandBase {
    private final Shooter shooter;

    public FireCannon(Shooter shooter) {
        this.shooter = shooter;
        addRequirements(shooter);

    }
    @Override
    public void initialize() {
        shooter.shoot(0.5);
    }
}
