package com.learnings;

import java.util.Scanner;

public class ProblemY
{
    public static void main(String[] args)
    {
        final Scanner s = new Scanner(System.in);

        while(true)
        {
            final String line = s.nextLine();
            final int num = Integer.parseInt(line);
            if (num==0)
                break;
            int count = 0;
            for (int i=1; i<=Math.sqrt(num); i++)
            {
                if (num%i==0)
                {
                    if (num/i == i)
                        count++;

                    else
                        count+=2;
                }
            }
            count = count-2; // Remove for 1 and num
            if (count == 0)
            {
                System.out.println("No solution.");
                continue;
            }
            System.out.println(count);
        }

    }
}
