package rs.expertnuke.model;

import rs.expertnuke.model.enums.ExternalPower;
import rs.expertnuke.model.enums.IncreasedIodineActivity;
import rs.expertnuke.model.enums.PORVStatus;
import rs.expertnuke.model.enums.PumpStatus;
import rs.expertnuke.model.enums.ReactorType;
import rs.expertnuke.model.enums.RodStatus;
import rs.expertnuke.model.enums.WaterLevel;

public class Reactor {
	private ReactorType reactorType;
	private double power;
	private int minutesOnLowPower;
	private boolean requestedPowerIncrease;
	private double rodsPulled;
	private RodStatus rodStatus;
	private double pressure;
	private PORVStatus porvStatus;
	private double pressureDrop;
	private double temperature;
	private PumpStatus pumpStatus;
	private WaterLevel waterLevel;
	private boolean testInProgress;
	private boolean eccsOff;
	private boolean scramOff;
	private boolean fluxMonitoringOff;
	private boolean pumpsOff;
	private ExternalPower externalPower;
	private int secondsUntilDiesel;
	private double hydrogenConcentration;
	private double radiation;
	private boolean gasLeaks;
	private IncreasedIodineActivity increasedIodineActivity;

	public ReactorType getReactorType() {
		return reactorType;
	}

	public void setReactorType(ReactorType reactorType) {
		this.reactorType = reactorType;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public int getMinutesOnLowPower() {
		return minutesOnLowPower;
	}

	public void setMinutesOnLowPower(int minutesOnLowPower) {
		this.minutesOnLowPower = minutesOnLowPower;
	}

	public boolean isRequestedPowerIncrease() {
		return requestedPowerIncrease;
	}

	public void setRequestedPowerIncrease(boolean requestedPowerIncrease) {
		this.requestedPowerIncrease = requestedPowerIncrease;
	}

	public double getRodsPulled() {
		return rodsPulled;
	}

	public void setRodsPulled(double rodsPulled) {
		this.rodsPulled = rodsPulled;
	}

	public RodStatus getRodStatus() {
		return rodStatus;
	}

	public void setRodStatus(RodStatus rodStatus) {
		this.rodStatus = rodStatus;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public PORVStatus getPorvStatus() {
		return porvStatus;
	}

	public void setPorvStatus(PORVStatus porvStatus) {
		this.porvStatus = porvStatus;
	}

	public double getPressureDrop() {
		return pressureDrop;
	}

	public void setPressureDrop(double pressureDrop) {
		this.pressureDrop = pressureDrop;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public PumpStatus getPumpStatus() {
		return pumpStatus;
	}

	public void setPumpStatus(PumpStatus pumpStatus) {
		this.pumpStatus = pumpStatus;
	}

	public WaterLevel getWaterLevel() {
		return waterLevel;
	}

	public void setWaterLevel(WaterLevel waterLevel) {
		this.waterLevel = waterLevel;
	}

	public boolean isTestInProgress() {
		return testInProgress;
	}

	public void setTestInProgress(boolean testInProgress) {
		this.testInProgress = testInProgress;
	}

	public boolean isEccsOff() {
		return eccsOff;
	}

	public void setEccsOff(boolean eccsOff) {
		this.eccsOff = eccsOff;
	}

	public boolean isScramOff() {
		return scramOff;
	}

	public void setScramOff(boolean scramOff) {
		this.scramOff = scramOff;
	}

	public boolean isFluxMonitoringOff() {
		return fluxMonitoringOff;
	}

	public void setFluxMonitoringOff(boolean fluxMonitoringOff) {
		this.fluxMonitoringOff = fluxMonitoringOff;
	}

	public boolean isPumpsOff() {
		return pumpsOff;
	}

	public void setPumpsOff(boolean pumpsOff) {
		this.pumpsOff = pumpsOff;
	}

	public ExternalPower getExternalPower() {
		return externalPower;
	}

	public void setExternalPower(ExternalPower externalPower) {
		this.externalPower = externalPower;
	}

	public int getSecondsUntilDiesel() {
		return secondsUntilDiesel;
	}

	public void setSecondsUntilDiesel(int secondsUntilDiesel) {
		this.secondsUntilDiesel = secondsUntilDiesel;
	}

	public double getHydrogenConcentration() {
		return hydrogenConcentration;
	}

	public void setHydrogenConcentration(double hydrogenConcentration) {
		this.hydrogenConcentration = hydrogenConcentration;
	}

	public double getRadiation() {
		return radiation;
	}

	public void setRadiation(double radiation) {
		this.radiation = radiation;
	}

	public boolean isGasLeaks() {
		return gasLeaks;
	}

	public void setGasLeaks(boolean gasLeaks) {
		this.gasLeaks = gasLeaks;
	}

	public IncreasedIodineActivity getIncreasedIodineActivity() {
		return increasedIodineActivity;
	}

	public void setIncreasedIodineActivity(IncreasedIodineActivity increasedIodineActivity) {
		this.increasedIodineActivity = increasedIodineActivity;
	}

	public double getUpperPressureLimit() {
		switch (reactorType) {
		case RBMK:
			return 80;
		case VVER_PWR:
			return 165;
		case BWR:
			return 85;
		default:
			return 0;
		}
	}

	public double getNominalTemperature() {
		switch (reactorType) {
		case RBMK:
			return 284;
		case VVER_PWR:
			return 320;
		case BWR:
			return 286;
		default:
			return 0;
		}
	}

}
