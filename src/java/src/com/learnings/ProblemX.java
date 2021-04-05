package com.learnings;

import java.util.Scanner;

public class ProblemX
{
    public int boringDayCount(final String line)
    {
        final char[] chArray = line.toCharArray();
        int boringDayCount = 0;
        char prevDayMovie = chArray[0];
        for (int i = 1; i < chArray.length; i++)
        {
            if (prevDayMovie == chArray[i])
                boringDayCount++;
            prevDayMovie = chArray[i];
        }
        return boringDayCount;
    }

    public static void main(String[] args)
    {
        final Scanner s = new Scanner(System.in);
        final ProblemX b = new ProblemX();

        while(true)
        {
            final String line = s.nextLine();
            if (line.contains("0"))
                break;
            int boringDayCount = b.boringDayCount(line);
            System.out.println(boringDayCount);
        }
    }
}
