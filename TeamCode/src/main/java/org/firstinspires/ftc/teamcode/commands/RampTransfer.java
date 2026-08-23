package org.firstinspires.ftc.teamcode.commands;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.Tower;

public class RampTransfer extends CommandBase {
    private Tower tower;

    public RampTransfer (Tower tower){
        this.tower = tower;
        addRequirements(tower);

    }

    @Override
    public void initialize(){
        tower.transfer(.25);
    }
}
