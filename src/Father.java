import java.util.ArrayList;

public class Father implements Runnable
{
    private int food = 20;
    private ArrayList<Integer> bites;
    
    @Override
    public void run()
    {
        for (int i = 0; i < 6; i++)
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
}
