package ObjectsAnalysis.Objects;

import ObjectsAnalysis.EnumClasses.BicycleMaterialMake;
import ObjectsAnalysis.Interface.CarbonFootPrint;

public class Bicycle implements CarbonFootPrint {


    private String bikeType;

    private BicycleMaterialMake materialMake;
    private String makeLocation;
    private double shippingDistance;
    private double estimatedLifespanYears;

    public Bicycle(String bikeType, BicycleMaterialMake materialMake, String makeLocation, double shippingDistance, double estimatedLifespanYears) {
        this.bikeType = bikeType;
        this.materialMake = materialMake;
        this.makeLocation = makeLocation;
        this.shippingDistance = shippingDistance;
        this.estimatedLifespanYears = estimatedLifespanYears;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public BicycleMaterialMake getMaterialMake() {
        return materialMake;
    }

    public void setMaterialMake(BicycleMaterialMake materialMake) {
        this.materialMake = materialMake;
    }

    public String getMakeLocation() {
        return makeLocation;
    }

    public void setMakeLocation(String makeLocation) {
        this.makeLocation = makeLocation;
    }

    public double getShippingDistance() {
        return shippingDistance;
    }

    public void setShippingDistance(double shippingDistance) {
        this.shippingDistance = shippingDistance;
    }

    public double getEstimatedLifespanYears() {
        return estimatedLifespanYears;
    }

    public void setEstimatedLifespanYears(double estimatedLifespanYears) {
        this.estimatedLifespanYears = estimatedLifespanYears;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "bikeType='" + getBikeType() + '\'' +
                ", materialMake=" + getMaterialMake() +
                ", makeLocation='" + getMakeLocation() + '\'' +
                ", shippingDistance=" + getShippingDistance() +
                ", estimatedLifespanYears=" + getEstimatedLifespanYears() +
                ", carbon footprint=" + getCarbonFootprint() + "kg CO2" +
                '}';
    }

    @Override
    public double getCarbonFootprint() {
        /**
         * Step 1: Calculate the emissions from manufacturing the bicycle
         * Carbon emissions from manufacturing = (Carbon emissions per unit distance x Shipping distance) + Carbon emissions from production
         * Assuming a shipping emissions factor of 0.12 kg CO2 per ton-mile for cargo ships, and a carbon emissions factor of 0.3 kg CO2 per kg of carbon fiber production (source: World Steel Association), we get:
         * Carbon emissions from manufacturing = (0.12 kg CO2/ton-mile x 5,000 miles x 0.5 tons) + (0.3 kg CO2/kg x 2.5 kg) = 75 kg CO2
         *
         * Step 2: Estimate the emissions from use by assuming zero emissions
         * Assuming the bike is powered by human energy and not motorized, we can assume zero emissions during use.
         *
         * Step 3: Estimate the emissions from disposal by assuming landfill disposal
         * Assuming the bike is not recycled and is sent to a landfill at the end of its lifespan, we can estimate the carbon emissions from landfilling. According to the EPA, 1 metric ton of municipal solid waste generates 0.77 metric tons of CO2-equivalent emissions. Assuming the bike weighs 10 kg and the landfill emissions factor is 0.77 metric tons CO2 per metric ton of waste, we get:
         * Carbon emissions from disposal = (10 kg / 1000 kg/metric ton) x 0.77 metric tons CO2/kg = 0.0077 metric tons CO2
         *
         * Total carbon footprint of the bicycle = Carbon emissions from manufacturing + Carbon emissions from use + Carbon emissions from disposal = 75 kg CO2 + 0 kg CO2 + 0.0077 metric tons CO2 = 75.0077 kg CO2
         *
         * Note that these calculations are based on assumptions and approximations, and the actual carbon footprint may vary depending on various factors such as the specific fuel and electricity sources, production processes, and disposal methods.
         *
         *
         *
         *
         *

         */

        /**
         *  Total carbon footprint of the bicycle = Carbon emissions from manufacturing + Carbon emissions from use + Carbon emissions from disposal
         */
        return 75.0077;
    }
}
