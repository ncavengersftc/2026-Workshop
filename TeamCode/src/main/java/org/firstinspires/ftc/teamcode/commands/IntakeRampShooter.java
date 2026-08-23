package org.firstinspires.ftc.teamcode.commands;

import com.seattlesolvers.solverslib.command.ParallelCommandGroup;

import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.Ramp;
import org.firstinspires.ftc.teamcode.subsystems.Shooter;

public class IntakeRampShooter extends ParallelCommandGroup {
    public IntakeRampShooter(Intake intake, Ramp ramp, Shooter shooter) {
        addCommands(new IntakeArtifact(intake), new RampTransfer(ramp), new ShootArtifact(shooter));
    }
}
