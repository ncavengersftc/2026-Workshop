package org.firstinspires.ftc.teamcode.sequences;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.subsystems.Shooter;

public class StopShooter extends CommandBase {

    private final Shooter shooter;

    private final Telemetry telemetry;

    public StopShooter(Telemetry telemetry, Shooter shooter) {
        this.shooter = shooter;
        this.telemetry = telemetry;

        addRequirements(shooter);
    }

    @Override
    public void initialize() {
        shooter.stop();
    }

    @Override
    public void execute() {
        telemetry.addData("StopShooter", "Active");
        telemetry.update();
    }

}
