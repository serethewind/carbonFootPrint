package ObjectsAnalysis.Objects;

import ObjectsAnalysis.EnumClasses.GasolineType;
import ObjectsAnalysis.Interface.CarbonFootPrint;

public class Car implements CarbonFootPrint {

    private String carInformation;
    private String yearOfMake;
    private GasolineType fuelType;
    private double fuelEfficiencyMilesPerGallon;
    private double annualMileage;

    private static final double co2EmissionFactorInKg = 8.887;



    public Car(String carInformation, String yearOfMake, GasolineType fuelType, double fuelEfficiencyMilesPerGallon, double annualMileage) {
        this.carInformation = carInformation;
        this.yearOfMake = yearOfMake;
        this.fuelType = fuelType;
        this.fuelEfficiencyMilesPerGallon = fuelEfficiencyMilesPerGallon;
        this.annualMileage = annualMileage;
    }

    public String getCarInformation() {
        return carInformation;
    }

    public void setCarInformation(String carInformation) {
        this.carInformation = carInformation;
    }

    public String getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(String yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    public GasolineType getFuelType() {
        return fuelType;
    }

    public void setFuelType(GasolineType fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelEfficiencyMilesPerGallon() {
        return fuelEfficiencyMilesPerGallon;
    }

    public void setFuelEfficiencyMilesPerGallon(double fuelEfficiencyMilesPerGallon) {
        this.fuelEfficiencyMilesPerGallon = fuelEfficiencyMilesPerGallon;
    }

    public double getAnnualMileage() {
        return annualMileage;
    }

    public void setAnnualMileage(double annualMileage) {
        this.annualMileage = annualMileage;
    }

    @Override
    public String toString() {
        return  "carInformation: " + getCarInformation() +
                ", yearOfMake: " + getYearOfMake()  +
                ", fuelType: " + getFuelType() +
                ", fuelEfficiencyMilesPerGallon: " + getFuelEfficiencyMilesPerGallon() +
                ", annualMileage: " + getAnnualMileage() +
                ", carbon footprint: " + getCarbonFootprint() + "kg CO2"
                ;
    }

    @Override
    public double getCarbonFootprint() {
        /**
         * Step 1: Calculate the annual fuel consumption in gallons
         * Annual fuel consumption = Annual mileage / Fuel efficiency = 12,000 miles / 30 mpg = 400 gallons
         *
         * Step 2: Convert the fuel consumption to carbon emissions using the CO2 emissions factor for gasoline
         * Carbon emissions from fuel consumption = Annual fuel consumption x CO2 emissions factor for gasoline = 400 gallons x 8.887 kg CO2/gallon (source: EPA) = 3,554.8 kg CO2
         *
         */
        double annualFuelConsumption = getAnnualMileage() / getFuelEfficiencyMilesPerGallon();
        return annualFuelConsumption * co2EmissionFactorInKg;
    }
}
