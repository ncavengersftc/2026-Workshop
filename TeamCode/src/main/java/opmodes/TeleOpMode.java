package opmodes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

import commands.IntakeBall;
import commands.Intakestop;
import commands.StopShooter;
import subsystems.Intake;
import subsystems.Shooter;

@TeleOp
public class TeleOpMode extends CommandOpMode {
    private Intake intake;
    private Shooter shooter;
    private  GamepadEx driver;

    @Override
    public void initialize() {
        driver=new GamepadEx(gamepad1);

        intake = new Intake(hardwareMap);
        intake.setDefaultCommand(new Intakestop(intake));
        shooter = new Shooter(hardwareMap);
        shooter.setDefaultCommand(new StopShooter(shooter));

        driver.getGamepadButton(GamepadKeys.Button.A).whileHeld(new IntakeBall(intake));

    }
}
