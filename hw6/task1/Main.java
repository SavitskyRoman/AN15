package com.teachMeSkills.an15.SavitskyRoman.hw6.task1;

import com.teachMeSkills.an15.SavitskyRoman.hw6.task1.groundTransport.LightGroundTransport;
import com.teachMeSkills.an15.SavitskyRoman.hw6.task1.impl.LightTransportServiceImpl;
import com.teachMeSkills.an15.SavitskyRoman.hw6.task1.impl.TransportServiceImpl;
import com.teachMeSkills.an15.SavitskyRoman.hw6.task1.transport.airTransport.MilitaryAirTransport;

public class Main {
    public static void main(String[] args) {
        MilitaryAirTransport militaryAirTransport = new MilitaryAirTransport();
        militaryAirTransport.setPower(14);

        TransportService transportService = new TransportServiceImpl();

        LightGroundTransport lightGroundTransport = new LightGroundTransport();
        lightGroundTransport.setMaxSpeed(18);
        lightGroundTransport.setRashod(7.5);
        lightGroundTransport.setPower(5);
        lightGroundTransport.setBrand("Audi");

        LightTransportService lightTransportService = new LightTransportServiceImpl();
        lightTransportService.printCalculatingResult(4, lightGroundTransport);

        transportService.printCalculatedPower(lightGroundTransport);
    }
}
