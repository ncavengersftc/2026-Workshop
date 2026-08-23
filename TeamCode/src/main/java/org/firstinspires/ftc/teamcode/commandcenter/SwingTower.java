package org.firstinspires.ftc.teamcode.commandcenter;

import com.seattlesolvers.solverslib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.EiffelTower;

public class SwingTower extends CommandBase {
    private final EiffelTower eiffelTower;

    public SwingTower(EiffelTower eiffelTower) {
        this.eiffelTower = eiffelTower;
        addRequirements(eiffelTower);
    }
    @Override
    public void initialize() {
        eiffelTower.eiffeltower(0.5);
    }
}
