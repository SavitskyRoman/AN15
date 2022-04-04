package com.teachMeSkills.an15.SavitskyRoman.hw6.task1.impl;

import com.teachMeSkills.an15.SavitskyRoman.hw6.task1.Transport;
import com.teachMeSkills.an15.SavitskyRoman.hw6.task1.TransportService;

public class TransportServiceImpl implements TransportService {
    @Override
    public double calculatePower(Transport transport) {

        return transport.getPower() * 0.74;
    }

    @Override
    public void printCalculatedPower(Transport transport) {
        System.out.println("Мощность в кв/ч = " + calculatePower(transport));
    }
}
