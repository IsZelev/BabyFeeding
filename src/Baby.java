public class Baby implements Runnable
{
    private int hunger;
    private Dish dish;

    public Baby(Dish d)
    {
        hunger = (int) Math.floor(Math.random() * 60) + 10;
        dish = d;
    }

    public int getHunger()
    {
        return hunger;
    }
    
    @Override
    public void run()
    {
        if(dish.getFoodLeft() != 0)
        {
            for (int i = 0; i < dish.getCapacity(); i++)
            {
                dish.consume();
            }
        }else
        {
            System.out.println("il piatto ha spazio");
            notifyAll();
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
