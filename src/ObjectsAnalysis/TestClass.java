package ObjectsAnalysis;

import ObjectsAnalysis.EnumClasses.BicycleMaterialMake;
import ObjectsAnalysis.EnumClasses.GasolineType;
import ObjectsAnalysis.Interface.CarbonFootPrint;
import ObjectsAnalysis.Objects.Bicycle;
import ObjectsAnalysis.Objects.Building;
import ObjectsAnalysis.Objects.Car;

import java.util.ArrayList;

public class TestClass {

    /**
     *
     * Type: Road bike, Material: Carbon fiber frame, Manufacturing location: China, Shipping distance: 5,000 miles by cargo ship, Estimated lifespan: 5 years
     */

    /**
     * Car:
     * Make and model: Toyota Corolla, Year of manufacture: 2022, Fuel type: Gasoline, Fuel efficiency: 30 miles per gallon (mpg), Annual mileage: 12,000 miles
     */

    /**
     * Type of building: Office building, Size: 10,000 square feet, Energy source: Electricity from the grid, Annual electricity consumption: 200,000 kilowatt-hours (kWh), Regional electricity emissions factor: 0.4 pounds of CO2 per kWh
     */
    public static void main(String[] args) {
        ArrayList<CarbonFootPrint> arraysOfObjects = new ArrayList<CarbonFootPrint>();
        arraysOfObjects.add(new Bicycle("Road bike", BicycleMaterialMake.CARBON_FIBER, "China", 5000, 5));
        arraysOfObjects.add(new Car("Toyota Corolla", "2022", GasolineType.GASOLINE, 30, 12000));
        arraysOfObjects.add(new Building("Office Building", 10000, "Electricity from the grid", 200000, 0.4));

        for (CarbonFootPrint object : arraysOfObjects){
            System.out.println(object);
        }

    }
}
