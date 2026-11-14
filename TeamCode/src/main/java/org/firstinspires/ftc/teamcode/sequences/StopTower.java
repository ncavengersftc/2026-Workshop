package org.firstinspires.ftc.teamcode.sequences;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.subsystems.Tower;

public class StopTower extends CommandBase {

    private final Tower tower;

    private final Telemetry telemetry;

    public StopTower(Telemetry telemetry, Tower tower) {
        this.tower = tower;
        this.telemetry = telemetry;

        addRequirements(tower);
    }

    @Override
    public void initialize() {
        tower.stop();
    }

}
