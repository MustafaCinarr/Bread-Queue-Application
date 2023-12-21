import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //checkout queue application
        /*
        Between 1 (included) and 10 (included) bread will
        come out of the oven. People in the queue will try to
        get the bread.
        */
        System.out.println("Bread Queue Application...");



        Queue<String> breadQueue = new LinkedList<String>();

        // added in order(Murat is the first person)

        breadQueue.offer("Murat");
        breadQueue.offer("Hasan");
        breadQueue.offer("Okan");
        breadQueue.offer("Ayşe");
        breadQueue.offer("Merve");
        breadQueue.offer("Ezgi");
        breadQueue.offer("Gizem");
        breadQueue.offer("Mehmet");
        breadQueue.offer("Oğuz");
        breadQueue.offer("Azer");


        //I determine the number of baked bread randomly between 1-10.

        Random random = new Random();
        int numberOfBread = 1 + random.nextInt(10);

        System.out.println("Breads are being prepared...");
        System.out.println("");
        System.out.println("Number of breads baked : " + numberOfBread);
        System.out.println("");

        // 3 second waiting
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        /*
        We have a loop that rotates until the bread runs out.
        We use the queue interface to get the bread at the
        beginning of the bread queue.
         */

        while(numberOfBread != 0)
        {
            /*We find the person at the beginning of
            the queue using the poll method.
            */

            System.out.println(breadQueue.poll() + " bought the bread...");
            numberOfBread--;
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }

        }
        System.out.println("There is no bread left...");

    }
}