import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int [] dataPoints = new int[100];
        int target;
        boolean done = false;

        target = SafeInput.getInt(in, "what value would you like to find?");

        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
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
    }
}