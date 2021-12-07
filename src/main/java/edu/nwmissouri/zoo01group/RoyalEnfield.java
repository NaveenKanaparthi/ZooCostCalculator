/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 *
 * @author Sreebharath Mallampati
 */
public class RoyalEnfield extends Motorbike {

    private double maxSpeed_milesperhour;
    private double distanceTravelled;

    public RoyalEnfield() {
        super("Royal Enfield");
    }

    public double getMaxSpeed(double fuelConsumed) {
        try {
            return this.distanceTravelled / fuelConsumed;
        } catch (Exception ex) {
            throw ex;
        }
    }

}
