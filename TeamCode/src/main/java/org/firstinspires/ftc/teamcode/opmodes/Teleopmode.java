package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

import org.firstinspires.ftc.teamcode.commandcenter.FireCannon;
import org.firstinspires.ftc.teamcode.commandcenter.Intakeartifact;
import org.firstinspires.ftc.teamcode.commandcenter.ReloadCannon;
import org.firstinspires.ftc.teamcode.commandcenter.Stopeth;
import org.firstinspires.ftc.teamcode.commandcenter.SwingTower;
import org.firstinspires.ftc.teamcode.commandcenter.SwingTowerStop;
import org.firstinspires.ftc.teamcode.subsystems.EiffelTower;
import org.firstinspires.ftc.teamcode.subsystems.Intake;
import org.firstinspires.ftc.teamcode.subsystems.Shooter;

@TeleOp
public class Teleopmode extends CommandOpMode {

    @Override
    public void initialize() {
        GamepadEx driver = new GamepadEx(gamepad1);

        Intake intake = new Intake(hardwareMap);
        intake.setDefaultCommand(new Stopeth(intake));

        driver.getGamepadButton(GamepadKeys.Button.A)
                .whileHeld(new Intakeartifact(intake));

        EiffelTower eiffelTower = new EiffelTower(hardwareMap);
        eiffelTower.setDefaultCommand(new SwingTowerStop(eiffelTower));

        driver.getGamepadButton(GamepadKeys.Button.B)
                .whileHeld(new SwingTower(eiffelTower));

        Shooter shooter = new Shooter(hardwareMap);
        shooter.setDefaultCommand(new ReloadCannon(shooter));

        driver.getGamepadButton(GamepadKeys.Button.RIGHT_BUMPER)
                .whileHeld(new FireCannon(shooter));
    }
}