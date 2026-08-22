package org.firstinspires.ftc.teamcode.sequences;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.subsystems.Shooter;

public class Shoot extends CommandBase {

    private final Shooter shooter;

    private final Telemetry telemetry;

    public Shoot(Telemetry telemetry, Shooter shooter) {
        this.shooter = shooter;
        this.telemetry = telemetry;

        addRequirements(shooter);
    }

    @Override
    public void initialize() {
        shooter.shoot(0.50);
    }

    @Override
    public void execute() {
        telemetry.addData("Shoot", "Active");
        telemetry.update();
    }

}
