package org.firstinspires.ftc.teamcode.commands;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.telemetry;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.Shooter;

public class Shoot extends CommandBase {

    private final Shooter shooter;

    private final Telemetry telem;

    public Shoot(Telemetry telem, Shooter shooter, Intake intake) {
        this.telem = telem;
        this.shooter = shooter;
        addRequirements(shooter, intake);
    }

    @Override
    public void initialize() {
        shooter.shoot(0.25);
        telem.addData("Shoot Command", "Running");
        telem.update();
    }

}
