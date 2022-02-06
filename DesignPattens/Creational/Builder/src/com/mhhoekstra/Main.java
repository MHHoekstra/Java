package com.mhhoekstra;

import com.mhhoekstra.builders.CarBuilder;
import com.mhhoekstra.builders.CarManualBuilder;
import com.mhhoekstra.cars.Car;
import com.mhhoekstra.cars.Manual;
import com.mhhoekstra.director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
