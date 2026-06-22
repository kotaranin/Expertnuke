package rs.expertnuke.model;

import java.util.LinkedList;
import java.util.List;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import rs.expertnuke.model.enums.ExternalPower;
import rs.expertnuke.model.enums.IncreasedIodineActivity;
import rs.expertnuke.model.enums.PORVStatus;
import rs.expertnuke.model.enums.PumpStatus;
import rs.expertnuke.model.enums.ReactorType;
import rs.expertnuke.model.enums.RodStatus;
import rs.expertnuke.model.enums.WaterLevel;

public class Reactor {

	@NotNull
	private ReactorType reactorType;
	@Min(0)
	@Max(120)
	private double power;
	@Min(0)
	private int minutesOnLowPower;
	private boolean requestedPowerIncrease;
	@Min(0)
	@Max(100)
	private double rodsPulled;
	private RodStatus rodStatus;
	@Min(0)
	private double pressure;
	private PORVStatus porvStatus;
	@Min(0)
	private double pressureDrop;
	@Min(0)
	private double temperature;
	private PumpStatus pumpStatus;
	@NotNull
	private WaterLevel waterLevel;
	private boolean testInProgress;
	private boolean eccsOff;
	private boolean scramOff;
	private boolean fluxMonitoringOff;
	private boolean pumpsOff;
	@NotNull
	private ExternalPower externalPower;
	@Min(0)
	private int secondsUntilDiesel;
	@Min(0)
	@Max(100)
	private double hydrogenConcentration;
	@Min(0)
	private double radiation;
	private boolean gasLeaks;
	private IncreasedIodineActivity increasedIodineActivity;
	private List<Recommendation> recommendations = new LinkedList<>();

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

	public List<Recommendation> getRecommendations() {
		return recommendations;
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
