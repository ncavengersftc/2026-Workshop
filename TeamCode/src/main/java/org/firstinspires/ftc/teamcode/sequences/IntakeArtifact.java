package org.firstinspires.ftc.teamcode.sequences;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.subsystems.Intake;

public class IntakeArtifact extends CommandBase {

    private final Intake intake;

    private final Telemetry telemetry;

    public IntakeArtifact(Telemetry telemetry, Intake intake) {
        this.intake = intake;

        this.telemetry = telemetry;

        addRequirements(intake);
    }

    @Override
    public void initialize() {
        intake.intake(0.5);
    }

    @Override
    public void execute() {
        telemetry.addData("IntakeFuel", "Active");
        telemetry.update();
    }

}
