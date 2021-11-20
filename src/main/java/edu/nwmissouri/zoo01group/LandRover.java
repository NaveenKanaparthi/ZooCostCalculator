/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 * This is LandRover class which is extended from FourWheeler
 *
 * @author Naveen Kumar Kanparthi
 */
public class LandRover extends FourWheeler {

    private double price;
    private String fuelType;
    private int noOfCylinder;

  
    /**
     *
     * @param price // price of land rover
     * @param fuelType // type of the fuel vehicle runs on
     * @param noOfCylinder // no of cylinder
     */
    public LandRover(double price, String fuelType, int noOfCylinder) {
        super(30, 120.3);
        this.price = price;
        this.fuelType = fuelType;
        this.noOfCylinder = noOfCylinder;
    }

    /**
     *
     * @return price // price of land rover
     */

    public double getPrice() {
        return price;
    }

    /**
     *
     * @param price // price of land rover
     */

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @return fuelType // type of the fuel vehicle runs on
     */

    public String getFuelType() {
        return fuelType;
    }

    /**
     *
     * @param fuelType // type of the fuel vehicle runs on
     */

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     *
     * @return noOfCylinder // no of cylinder
     */

    public int getNoOfCylinder() {
        return noOfCylinder;
    }

    /**
     *
     * @param noOfCylinder // no of cylinder
     */

    public void setNoOfCylinder(int noOfCylinder) {
        this.noOfCylinder = noOfCylinder;
    }

    /**
     *
     * @return maxPower // max power of the engine
     */

    /**
     * This method returns max power
     *
     * @return maxPower // maxPower of the engine
     */
    public String maxPower() {
        String maxPower = "557.86bhp@6000-6500rpm";
        return maxPower;
    }

    /**
     * This method returns max torque
     *
     * @return maxTorque // maxTorque of the engine
     */
    public String maxTorque() {
        String maxTorque = "700Nm@3500-5000rpm";
        return maxTorque;
    }
    public static void Casting()
    {
        int i=9;
        double d=(double) i;
        System.out.println("casted from int to double "+d);
    }
    public static void Exception()
    {
        int a=0;
        int g=8;
        try{
            int i=g/a;
            System.out.println("Print divided value"+i);
            }
        catch(Exception E){
            System.out.println("Generated Exceptions"+E);
        }
    }
     
    public static void main(String[] args)
    {
       Casting(); 
       Exception();
    }
}
