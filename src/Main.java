import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        double [] dataPoints = new double[100];

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        System.out.println("average of data points is " + getAverage(dataPoints));
    }

    public static double getAverage(double[] values)
    {
        double total = 0;

        for (int i = 0; i < values.length; i++)
        {
            total += values[i];
        }
        return total / values.length;
    }
}