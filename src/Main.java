public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("");
        Dish dish = new Dish((int)Math.floor(Math.random()*80)+20);
        Baby baby = new Baby(dish);
        Father father = new Father(dish, baby);
        father.run();
        baby.run();

    }
}
