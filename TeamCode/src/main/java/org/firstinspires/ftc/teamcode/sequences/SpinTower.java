package org.firstinspires.ftc.teamcode.sequences;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.subsystems.Tower;

public class SpinTower extends CommandBase {

    private final Tower tower;

    private final Telemetry telemetry;

    public SpinTower(Telemetry telemetry, Tower tower) {
        this.tower = tower;
        this.telemetry = telemetry;
    }

    @Override
    public void initialize() {
        tower.spin(0.5);
    }

}
