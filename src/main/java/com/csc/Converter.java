package com.csc;

/*public class Converter {

  public String toPounds(int ounces) {
    throw new UnsupportedOperationException("Unimplemented method 'toPounds'");
  }

  public String toPoundsAndOunces(int ounces) {
    throw new UnsupportedOperationException("Unimplemented method 'toPoundsAndOunces'");
  }
}
  */

import java.util.Scanner;
public class Converter 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter number of ounces ");
        int ounces = in.nextInt();

        if (ounces == 16)
        {

            System.out.printf("%7.4f lb ", toPounds(ounces));
        }
        else
        {
            System.out.printf("%7.4f lbs ", toPounds(ounces));
        }
        System.out.println();

        if (ounces == 16)
        {

            System.out.print(toPoundsAndOunces(ounces));
        }
        else
        {
            System.out.print(toPoundsAndOunces(ounces));
        }
        System.out.println();

        in.close();
    }
    

    


public static double toPounds(int ounces)
{
    final double POUNDS_CONVERSION=16.0; 
    double pounds = ounces / POUNDS_CONVERSION;
    return pounds; 
}
public static String toPoundsAndOunces(int ounces)
{
    final int POUNDS_CONVERSION=16; 
    int pounds = ounces / POUNDS_CONVERSION;
    int remaining_ounces= ounces % POUNDS_CONVERSION;
    String S = "";
    if (pounds > 1)
        {
            S= pounds + " lbs " + remaining_ounces + " oz";
        }
    else 
        {
            S= pounds + " lb " + remaining_ounces + " oz";
        }
    return S; 
}

}