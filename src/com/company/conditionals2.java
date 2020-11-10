package com.company;

public class conditionals2 {
    
    public static boolean isLeapYear(int year)
    {
        if (year%400==0)
            return true;
        else if (year%100==0)
            return false;
        else if (year%4==0)
            return true;
        else
            return false;
    }

    public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2)
    {
        if (year1>year2)
            return true;
        else if (year2>year1)
            return false;
        else
            if (month1>month2)
                return true;
            else if (month2>month1)
                return false;
            else
                return day1 > day2;
    }

    public static String bestMatch(int r, int g, int b)
    {
        if (r>g && r>b)
            return "RED";
        else if (g>r && g>b)
            return "GREEN";
        else if (b>r && b>g)
            return "BLUE";
        else if (r==g && r>b)
            return "YELLOW";
        else if (g==b && g>r)
            return "CYAN";
        else if (r==b && r>g)
            return "MAGENTA";
        else
            return "GRAY";
    }

    public static int findBestFit(int size1, int size2, int space)
    {
        int fit;

        if (size1+size2<=space)
            fit = 3;
        else if (size1>space && size2>space)
            fit = 0;
        else if (size1>size2)
            if (size1<space)
                fit = 1;
            else
                fit = 2;
        else
            if (size2<space)
                fit = 2;
            else
                fit = 1;

        return fit;
    }

    public static boolean makeBench(int small, int big, int goal)
    {
        int g1 = goal%5;             //amount of small benches needed
        int g5 = (goal-g1)/5;        //amount of large benches needed

        if (small<g1)                //case in which there are less smalls given than needed
            return false;
        else if (big<g5)             //case in which there are less larges given than needed
            return (big*5 + small >= goal);         //returns if there are enough smalls to compensate
        else                         //this case is only reached if there are enough smalls and larges given
            return true;
    }

    public static void main(String[] args)
    {
        System.out.println("\nIs Leap Year:");
        System.out.println("Is 2000 a leap year?: " + isLeapYear(2000));
        System.out.println("Is 2004 a leap year?: " + isLeapYear(2004));
        System.out.println("Is 2003 a leap year?: " + isLeapYear(2003));
        System.out.println("Is 2100 a leap year?: " + isLeapYear(2100));

        System.out.println("\nIs Later:");
        System.out.println("1/2/2010 is later than 1/2/2011: " + isLater(1,2,2010,1,2,2011));
        System.out.println("1/2/2011 is later than 1/2/2010: " + isLater(1,2,2011,1,2,2010));
        System.out.println("1/5/2010 is later than 3/2/2010: " + isLater(1,5,2010,3,2,2010));
        System.out.println("3/2/2010 is later than 1/2/2010: " + isLater(3,2,2010,1,2,2010));
        System.out.println("1/3/2010 is later than 1/2/2010: " + isLater(1,3,2010,1,2,2010));
        System.out.println("1/2/2010 is later than 1/3/2010: " + isLater(1,2,2010,1,3,2010));
        System.out.println("1/2/2010 is later than 1/2/2010: " + isLater(1,2,2010,1,2,2010));
        System.out.println("4/8/2010 is later than 1/2/2011: " + isLater(4,8,2010,1,2,2011));

        System.out.println("\nBest Match: ");
        System.out.println("Red = 2, Green = 3, Blue = 4: " + bestMatch(2,3,4));
        System.out.println("Red = 4, Green = 3, Blue = 3: " + bestMatch(4,3,3));
        System.out.println("Red = 3, Green = 8, Blue = 4: " + bestMatch(3,8,4));
        System.out.println("Red = 4, Green = 3, Blue = 4: " + bestMatch(4,3,4));
        System.out.println("Red = 2, Green = 4, Blue = 4: " + bestMatch(2,4,4));
        System.out.println("Red = 8, Green = 8, Blue = 4: " + bestMatch(8,8,4));
        System.out.println("Red = 4, Green = 4, Blue = 4: " + bestMatch(4,4,4));

        System.out.println("\nBest Fit:");
        System.out.println("Best fit of 2 and 3 into 6: " + findBestFit(2,3,6));
        System.out.println("Best fit of 4 and 3 into 6: " + findBestFit(4,3,6));
        System.out.println("Best fit of 3 and 4 into 6: " + findBestFit(3,4,6));
        System.out.println("Best fit of 2 and 3 into 1: " + findBestFit(2,3,1));
        System.out.println("Best fit of 6 and 3 into 4: " + findBestFit(6,3,4));
        System.out.println("Best fit of 3 and 6 into 4: " + findBestFit(3,6,4));

        System.out.println("\nMake Bench:");
        System.out.println("Small benches: 3, Large Benches: 1, Goal: 8, Possible?: " + makeBench(3,1,8));
        System.out.println("Small benches: 3, Large Benches: 1, Goal: 9, Possible?: " + makeBench(3,1,9));
        System.out.println("Small benches: 11, Large Benches: 1, Goal: 15, Possible?: " + makeBench(11,1,15));
        System.out.println("Small benches: 4, Large Benches: 2, Goal: 15, Possible?: " + makeBench(4,2,15));
        System.out.println("Small benches: 20, Large Benches: 0, Goal: 20, Possible?: " + makeBench(20,0,20));
        System.out.println("Small benches: 3, Large Benches: 4, Goal: 20, Possible?: " + makeBench(3,4,20));
        System.out.println("Small benches: 0, Large Benches: 6, Goal: 30, Possible?: " + makeBench(0,6,30));
        System.out.println("Small benches: 0, Large Benches: 5, Goal: 30, Possible?: " + makeBench(0,5,30));
    }
}
