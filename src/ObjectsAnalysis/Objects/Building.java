package ObjectsAnalysis.Objects;

import ObjectsAnalysis.Interface.CarbonFootPrint;

public class Building implements CarbonFootPrint {

    private String buildingType;
    private double sizeInSquareFeet;
    private String electricitySource;
    private double annualElectricityConsumption;
    private double electricityEmissionFactor;

    public Building(String buildingType, double sizeInSquareFeet, String electricitySource, double annualElectricityConsumption, double electricityEmissionFactor) {
        this.buildingType = buildingType;
        this.sizeInSquareFeet = sizeInSquareFeet;
        this.electricitySource = electricitySource;
        this.annualElectricityConsumption = annualElectricityConsumption;
        this.electricityEmissionFactor = electricityEmissionFactor;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public double getSizeInSquareFeet() {
        return sizeInSquareFeet;
    }

    public void setSizeInSquareFeet(double sizeInSquareFeet) {
        this.sizeInSquareFeet = sizeInSquareFeet;
    }

    public String getElectricitySource() {
        return electricitySource;
    }

    public void setElectricitySource(String electricitySource) {
        this.electricitySource = electricitySource;
    }

    public double getAnnualElectricityConsumption() {
        return annualElectricityConsumption;
    }

    public void setAnnualElectricityConsumption(double annualElectricityConsumption) {
        this.annualElectricityConsumption = annualElectricityConsumption;
    }

    public double getElectricityEmissionFactor() {
        return electricityEmissionFactor;
    }

    public void setElectricityEmissionFactor(double electricityEmissionFactor) {
        this.electricityEmissionFactor = electricityEmissionFactor;
    }

    @Override
    public String toString() {
        return "Building{" +
                "buildingType='" + getBuildingType() + '\'' +
                ", sizeInSquareFeet=" + getSizeInSquareFeet() +
                ", electricitySource='" + getElectricitySource() + '\'' +
                ", annualElectricityConsumption=" + getAnnualElectricityConsumption() +
                ", electricityEmissionFactor=" + getElectricityEmissionFactor() +
                ", carbon footprint=" + getCarbonFootprint() + "kg CO2" +
                '}';
    }
    @Override
    public double getCarbonFootprint() {
        /**
         *
         * Step 1: Calculate the annual electricity consumption in kilowatt-hours (kWh)
         * Annual electricity consumption = 200,000 kWh
         *
         * Step 2: Convert the electricity consumption to carbon emissions using the regional emissions factor
         * Carbon emissions from electricity consumption = Annual electricity consumption x Emissions factor = 200,000 kWh x 0.4 lbs CO2/kWh x 0.453592 kg/lbs / 1000 = 36,287.8 kg CO2
         */
        return getAnnualElectricityConsumption() * getElectricityEmissionFactor() * 0.453592;
    }
}
