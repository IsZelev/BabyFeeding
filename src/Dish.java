import java.util.ArrayList;

public class Dish
{
    private ArrayList<Integer> bites;
    private int food;
    private int capacity;

    public Dish(int f)
    {
        food = f;
        capacity = 10;
    }

    public void produceBites()
    {
        for (int i = 0; i < capacity; i++)
        {
            food--;
            if(food != 0)
            {
                bites.add(1);
            }else
            {
                System.out.println("Cibo terminato");
            }
        }
    }

    public void consume()
    {
        for (int i = 0; i < capacity; i++)
        {
            
        }
    }

}