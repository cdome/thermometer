package com.vendavo.interview.thermometer;

public interface Thermometer {

    /**
     * 
     * Cases:
     * 
     * over 40> ... RED
     * <35 - 40) ... ORANGE
     * <25 - 35) ... YELLOW
     * <10 - 25) ... GREEN
     *  <5 - 10) ... LIGHT_BLUE
     * <-10 - 5) ... BLUE 
     * below -10) ... DARK_BLUE
     * 
     * @param temperature current temperature
     * @return color according to given temperature
     */
    Color measure(double temperature) throws IllegalAccessException;
}
