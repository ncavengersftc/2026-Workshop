package org.firstinspires.ftc.teamcode.commands;

import com.seattlesolvers.solverslib.command.CommandBase;
import org.firstinspires.ftc.teamcode.subsystems.Intake;

public class IntakeArtifact extends CommandBase {
    private final Intake intake;
    public IntakeArtifact(Intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    @Override
    public void initialize() {
        intake.intake(0.25);
    }
}
