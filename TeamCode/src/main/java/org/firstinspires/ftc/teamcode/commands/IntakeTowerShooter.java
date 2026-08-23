package org.firstinspires.ftc.teamcode.commands;

import com.seattlesolvers.solverslib.command.CommandBase;
import com.seattlesolvers.solverslib.command.ParallelCommandGroup;
import com.seattlesolvers.solverslib.command.Subsystem;

import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.Shooter;
import org.firstinspires.ftc.teamcode.subsystems.Tower;

public class IntakeTowerShooter extends ParallelCommandGroup {

    public IntakeTowerShooter(Intake intake, Tower tower, Shooter shooter){
        addCommands(new IntakeArtifact(intake), new RampTransfer(tower), new ShootArtifacts(shooter));
    }
}
