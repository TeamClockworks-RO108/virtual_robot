package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.Servo;
import org.firstinspires.ftc.robotcore.external.navigation.*;

/**
 * Example OpMode. Demonstrates use of gyro, color sensor, encoders, and telemetry.
 *
 */
@TeleOp(name = "Workshop Opmode", group = "ArmBot")
public class WorkshoOpmode extends LinearOpMode {

    public void runOpMode() {
        DcMotor m1 = hardwareMap.dcMotor.get("left_motor");
        DcMotor m2 = hardwareMap.dcMotor.get("right_motor");
        DcMotor arm = hardwareMap.dcMotor.get("arm_motor");
        Servo handServo = hardwareMap.servo.get("hand_servo");
        m1.setDirection(DcMotor.Direction.REVERSE);
        m2.setDirection(DcMotor.Direction.REVERSE);
        m1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        m2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        m1.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        m2.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);


        waitForStart();

        while (opModeIsActive()) {

            if (gamepad1.x) {
                arm.setPower(1);
            }
            if (gamepad1.y) {
                arm.setPower(-1);
            }
        }

        m1.setPower(0);
        m2.setPower(0);
    }
}
