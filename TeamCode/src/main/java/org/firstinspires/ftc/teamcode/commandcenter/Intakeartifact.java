package org.firstinspires.ftc.teamcode.commandcenter;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.Intake;

public class Intakeartifact extends CommandBase {
    private final Intake intake;

    public Intakeartifact(Intake intake) {
        this.intake = intake;
        addRequirements(intake);

    }
    @Override
    public void initialize() {
        intake.intake(0.5);
    }
}
