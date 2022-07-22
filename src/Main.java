import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int [] dataPoints = new int[100];
        int min;
        int max;
        int target;
        int counter = 0;
        int total = 0;
        boolean done = false;

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        min = dataPoints[0];
        max = dataPoints[0];
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (dataPoints[i] < min)
            {
                min = dataPoints[i];
            }
            else if (dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }
        System.out.println("the min is " + min + "\nthe max is " + max);


        target = SafeInput.getInt(in, "what value would you like to count?");
        for (int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == target)
            {
                counter += 1;
            }
        }
        System.out.println("the number " + target + " was found " + counter + " times");

        for (int i = 0; i < dataPoints.length; i++)
        {
            total += dataPoints[i];
        }
        System.out.println("the total is " + total);

        for (int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == target)
            {
                System.out.println("the number " + target + " was found at pos " + i);
                done = true;
                break;
            }
        }
        if (!done)
        {
            System.out.println("the number " + target + " was not found");
        }

        System.out.println("\nFunction outputs:");

        System.out.println("the minimum found by the function is " + min(dataPoints));
        System.out.println("the maximum found by the function is " + max(dataPoints));
        System.out.println("the occurrence of the target found by the function is " + occuranceScan(dataPoints, target));
        System.out.println("the sum of the values in the array found by the function is " + sum(dataPoints));
        System.out.println("the function found that it is " + contains(dataPoints, target) + " that the target is in the array");
    }


    public static int min(int[] values)
    {
        int min = values[0];
        for (int value : values)
        {
            if (value < min)
            {
                min = value;
            }
        }
        return min;
    }
    public static int max(int[] values)
    {
        int max = values[0];
        for (int value : values)
        {
            if (value > max)
            {
                max = value;
            }
        }
        return max;
    }
    public static int occuranceScan(int[] values, int target)
    {
        int counter = 0;

        for (int value : values)
        {
            if (value == target)
            {
                counter += 1;
            }
        }
        return counter;
    }
    public static int sum(int[] values)
    {
        int total = 0;
        for (int value : values)
        {
            total += value;
        }
        return  total;
    }
    public static boolean contains(int[] values, int target)
    {
        boolean targetFound = false;
        for (int value : values)
        {
            if (value == target) {
                targetFound = true;
                break;
            }
        }
        return targetFound;
    }
}