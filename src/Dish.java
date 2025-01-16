import java.util.ArrayList;

public class Dish
{
    private ArrayList<Integer> bites;
    private int pot;
    private int capacity;

    public Dish(int f)
    {
        pot = f; //la pentola da cui il padre prende i bocconi
        capacity = 10;
        bites = new ArrayList<Integer>();
    }

    public int getFoodLeft()
    {
        return bites.size();
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void produceBites(int b)
    {
        int qty = b;
        for (int i = 0; i < capacity; i++)
        {
            if(pot != 0)
            {
                pot -= qty;//toglie i bocconi dalla pentola
                bites.add(1);
            }else
            {//quando i bocconi nella pentola finiscono
                System.out.println("Cibo terminato");
            }
        }
    }

    public void consume()
    {
        bites.remove(0);
    }

}