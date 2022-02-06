package com.mhhoekstra.builders;

import com.mhhoekstra.cars.CarType;
import com.mhhoekstra.components.Engine;
import com.mhhoekstra.components.GPSNavigator;
import com.mhhoekstra.components.Transmission;
import com.mhhoekstra.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
