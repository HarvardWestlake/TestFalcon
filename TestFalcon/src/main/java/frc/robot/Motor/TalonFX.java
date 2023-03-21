package frc.robot.Motor;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class TalonFX extends WPI_TalonFX {
    public TalonFX(int deviceNumber) {
        super(deviceNumber);
    }


    public void setVoltage(double voltage) {
        this.setVoltage(voltage);
    }

    public double getPos() {
        return this.getSelectedSensorPosition();
    }

    
}