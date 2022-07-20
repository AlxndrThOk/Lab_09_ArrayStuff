import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        Random rnd = new Random();

        int [] dataPoints = new int[100];
        double total = 0;
        double average;

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
            System.out.print(dataPoints[i] + " | ");
            total += dataPoints[i];
        }
        average = total / 100;

        System.out.println("\nthe total is " + total + "\nthe average is " + average);
    }
}