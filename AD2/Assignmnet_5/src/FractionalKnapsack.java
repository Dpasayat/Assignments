import java.util.Arrays;
import java.util.Comparator;

class Item 
{
	int itemNO;
    int weight;
    int value;
    Double cost;

    // item value function
    public Item(int itemNO,int weight, int value) 
    {
    	this.itemNO=itemNO;
        this.weight = weight;
        this.value = value;
        cost = (double)value/(double)weight;
    }
}

public class FractionalKnapsack 
{

    // function to get maximum value
    private static double getMaxValue(int[] itno,int[] wt, int[] val, int capacity) 
    {
        Item[] iVal = new Item[wt.length];

        for (int i = 0; i < wt.length; i++) 
        {
            iVal[i] = new Item(itno[i],wt[i], val[i]);
        }

        // sorting items by value;
        Arrays.sort(iVal, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o2.cost.compareTo(o1.cost);
            }
        });

        double totalValue = 0d;
        
        
        System.out.println("Items selected: ");
        for (Item i : iVal) {
            int curWt = (int) i.weight;
            int curVal = (int) i.value;
            if (capacity - curWt >= 0) 
            {
                // this weight can be picked while
                capacity = capacity - curWt;
                totalValue += curVal;
                System.out.println(i.itemNO);

            } 
            else 
            {
                // item can't be picked whole
                double fraction = ((double)capacity/(double)curWt);
                totalValue += (curVal*fraction);
                capacity = (int)(capacity - (curWt*fraction));
                break;
            }
        }

        return totalValue;
    }

    // Driver code
    public static void main(String[] args) 
    {
    	int[] itno= {1,2,3,4,5};
        int[] wt = {2,4,3,6,6};
        int[] val = {32,28,15,24,28};
        int capacity = 11;

        double maxValue = getMaxValue(itno,wt, val, capacity);

        // Function call
        System.out.printf("Maximum value we can obtain = %.2f%n" , maxValue);
    }
}

