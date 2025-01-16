public class Father implements Runnable
{
    Dish dish;
    Baby son;
    int hunger;
    int bites;

    public Father(Dish d, Baby b)
    {
        dish = d;
        son = b;
    }

    @Override
    public void run()
    {
        while(son.getHunger() != 0)//checks if baby is hungry
        {
            bites = (int) Math.floor(Math.random()*10)*1;//produces from 1 to 10 bites and checks if they will fit on the plate
            if(dish.getFoodLeft() < bites)
            {
                dish.produceBites(bites);
            }else
            {
                System.out.println("tutti quei bocconi non entreranno nel piatto per ora");
                /*
                    inserire il wait nella risorsa condivisa e il sleep nei thread
                 * try
                {
                    wait();
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                 */
            }
        }
        System.out.println("il bambino non ha più fame");
    }
}
