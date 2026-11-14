package org.firstinspires.ftc.teamcode.sequences;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.subsystems.Intake;

public class StopIntake extends CommandBase {

    private final Intake intake;

    private final Telemetry telemetry;

    public StopIntake(Telemetry telemetry, Intake intake) {
        this.intake = intake;
        this.telemetry = telemetry;

        addRequirements(intake);
    }

    @Override
    public void initialize() {
        intake.stop();
    }

    @Override
    public void execute() {
        telemetry.addData("StopIntake", "Active");
        telemetry.update();
    }





}
