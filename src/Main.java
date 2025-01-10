public class Main
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("");
        Father father = new Father();
        Baby baby = new Baby();
        Dish dish = new Dish(father.getFood());
    }
}
