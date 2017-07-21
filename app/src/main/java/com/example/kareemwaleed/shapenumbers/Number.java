package com.example.kareemwaleed.shapenumbers;

/**
 * Created by Kareem Waleed on 2/7/2017.
 */

public class Number
{
    private Integer number;

    public Number(int number)
    {
        this.number = number;
    }

    public boolean isTriangular()
    {
        int triangularNumber = 1;
        int counter = 2;
        while(triangularNumber < number)
        {
            triangularNumber += counter;
            counter++;
        }

        if(triangularNumber == number)
            return true;
        return false;
    }

    public boolean isSquare()
    {
        int squareNumber = 1;
        int counter = 2;
        while(squareNumber < number)
        {
            squareNumber = counter * counter;
            counter++;
        }
        if(squareNumber == number)
            return true;
        return false;
    }

    public String getNumber()
    {
        return number.toString();
    }
}
