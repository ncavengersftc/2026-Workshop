package org.firstinspires.ftc.teamcode.commandcenter;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.Intake;

public class Stopeth extends CommandBase {
    private final Intake intake;

    public Stopeth(Intake intake) {
        this.intake = intake;
        addRequirements(intake);

    }
    @Override
    public void initialize() {
        intake.stop();
    }
}
