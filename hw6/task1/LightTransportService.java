package com.teachMeSkills.an15.SavitskyRoman.hw6.task1;

import com.teachMeSkills.an15.SavitskyRoman.hw6.task1.groundTransport.LightGroundTransport;

public interface LightTransportService {
    double calculateDistance(int hours, LightGroundTransport lightGroundTransport);
    double calculateFuel(double calculatedDistance, LightGroundTransport lightGroundTransport);
    void printCalculatingResult(int hours, LightGroundTransport lightGroundTransport);

}
