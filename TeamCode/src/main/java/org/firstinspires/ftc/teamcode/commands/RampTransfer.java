package org.firstinspires.ftc.teamcode.commands;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.Ramp;

public class RampTransfer extends CommandBase {
    private final Ramp ramp;

    public RampTransfer (Ramp ramp) {
        this.ramp = ramp;
        addRequirements(ramp);
    }

    @Override
    public void initialize() {
        ramp.transfer(0.75);
    }
}
