package org.firstinspires.ftc.teamcode.commands;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.Tower;

public class StopTower extends CommandBase {
    private final Tower tower;

    public StopTower(Tower tower){
        this.tower = tower;
        addRequirements(tower);
    }

    @Override
    public void initialize(){
        tower.stop();
    }

}
