package leecode;

public class MaxProfitStock2
{
    // A method that computes the maximum profit using the cost of the stock
    public int stockBuySell(int p[], int size)
    {

// maximumProfit adds up to the difference between the adjacent
// elements, only if they are lying in the ascending order
        int maximumProfit = 0;

// The loop begins from 1
// as it is doing comparison with the previous value
        for (int j = 1; j < size; j++)
        {
            if (p[j] > p[j - 1])
            {
                System.out.println(" :"+p[j] +" > "+p[j-1]);

                maximumProfit = maximumProfit + p[j] - p[j - 1];
            }
        }
        return maximumProfit;
    }

    // main method
    public static void main(String argvs[])
    {
// creating an object of the class MaxProfitStock2
        MaxProfitStock2 obj = new MaxProfitStock2();

// price of stock on the consecutive days
        int p[] = {50, 90, 130, 155, 20, 267, 347};
        int size = p.length; // computing the size

        System.out.println("The price of the stock on different days is: ");

        for(int i = 0; i < size; i++)
        {
// displaying the stock price
            System.out.print(p[i] + " ");
        }

        System.out.println("\n");

// invoking the method stockBuySell()
        //obj.stockBuySell(p, size);

        int ans  = obj.stockBuySell(p, size);

        System.out.print("The maximum profit earned is: ");

        System.out.print(ans);

    }
}
