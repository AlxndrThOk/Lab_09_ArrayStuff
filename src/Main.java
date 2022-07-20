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
    }
}