package com.company

public class conditionals2 {
    
    public static boolean isLeapYear(int year)
    {
        if (year%4==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Is Leap Year:");
        System.out.println("2000" + isLeapYear(2000));
        System.out.println("2004" + isLeapYear(2004));
        System.out.println("2003" + isLeapYear(2003));
        System.out.println("2010" + isLeapYear(2010));
    }
}
