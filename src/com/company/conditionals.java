package com.company;

public class conditionals {

    public static boolean chimpTrouble(boolean aSmile, boolean bSmile)
    {
        if (aSmile == bSmile)
            return true;
        else
            return false;
    }

    public static boolean negPos(int i1, int i2, boolean neg)
    {
        if (neg)
            return (i1 < 0 && i2 < 0);
        else
            return (i1 > 0 && i2 < 0)||(i1 < 0 && i2 > 0);
    }

    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep)
    {
        if (isAsleep)
            return false;
        else if (isMorning)
            return isMom;
        else
            return true;
    }

    public static String setAlarm(int day, boolean vacation)
    {
        boolean weekday = true;

        if (day==0||day==6)
            weekday = false;

        if (vacation)
            if (weekday)
                return "10:00";
            else
                return "off";

        else
            if (weekday)
                return "7:00";
            else
                return "10:00";
    }

    public static boolean onesDigitSame(int a, int b, int c)
    {
        if (a%10==b%10||b%10==c%10||a%10==c%10)
            return true;
        else
            return false;
    }

    public static int blackjack(int x, int y)
    {
        if (x>21 && y>21)
            return 0;

        else if (x-y>=0)
            if (x<=21)
                return x;
            else
                return y;

        else
            if (y<=21)
                return y;
            else
                return x;
    }

    public static void main(String[] args)
    {
        System.out.println("\nChimp Trouble:");
        System.out.println(chimpTrouble(true,true));
        System.out.println(chimpTrouble(false,false));
        System.out.println(chimpTrouble(true,false));
        System.out.println(chimpTrouble(false,true));
        System.out.println(" ");

        System.out.println("Neg Pos:");
        System.out.println(negPos(1,-1,false));
        System.out.println(negPos(-1,1,false));
        System.out.println(negPos(1,1,false));
        System.out.println(negPos(-1,-1,false));
        System.out.println(negPos(-4,-5,true));
        System.out.println(negPos(-4,5,true));
        System.out.println(negPos(4,5,true));
        System.out.println(negPos(4,-5,true));
        System.out.println(" ");

        System.out.println("Pick Up Phone:");
        System.out.println(pickUpPhone(false,false,true));
        System.out.println(pickUpPhone(true,true,true));
        System.out.println(pickUpPhone(true,true,false));
        System.out.println(pickUpPhone(false,true,false));
        System.out.println(pickUpPhone(true,false,false));
        System.out.println(pickUpPhone(false,false,false));
        System.out.println(" ");

        System.out.println("Set Alarm:");
        System.out.println(setAlarm(1,false));
        System.out.println(setAlarm(5,false));
        System.out.println(setAlarm(0,false));
        System.out.println(setAlarm(2,true));
        System.out.println(setAlarm(4,true));
        System.out.println(setAlarm(6,true));
        System.out.println(" ");

        System.out.println("Ones Digit Same:");
        System.out.println(onesDigitSame(23, 19, 13));
        System.out.println(onesDigitSame(23, 19, 12));
        System.out.println(onesDigitSame(23, 19, 3));
        System.out.println(onesDigitSame(423, 13, 3));
        System.out.println(onesDigitSame(23, 29, 25));
        System.out.println(" ");

        System.out.println("Blackjack:");
        System.out.println(blackjack(19,21));
        System.out.println(blackjack(21,19));
        System.out.println(blackjack(19,22));
        System.out.println(blackjack(8,8));
        System.out.println(blackjack(25,24));
    }
}

