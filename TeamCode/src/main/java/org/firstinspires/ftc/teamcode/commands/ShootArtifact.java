package org.firstinspires.ftc.teamcode.commands;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.Shooter;

public class ShootArtifact extends CommandBase {
    private final Shooter shooter;

    public ShootArtifact(Shooter shooter){
        this.shooter = shooter;
        addRequirements(shooter);
    }
    @Override
    public void initialize(){
        shooter.shooter(0.5);
    }
}
