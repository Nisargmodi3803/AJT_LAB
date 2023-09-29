// Foodtest.java

public class FoodTest
{
    public static void main(String[] args)
    {
        System.out.println("Price of Sandwich : "+new Sandwich().cost());
        System.out.println("Price of Burger : "+new Burger().cost());

        System.out.println("Price of Sandwich with Butter Spread : "+new ButterSpread(new Sandwich()).cost());
        System.out.println("Price of Burger with Cheese Spread : "+new CheeseSpread(new Burger()).cost());

        Burger burger = new Burger();
        BreadItem burgerWithCheeseSpread = new CheeseSpread(burger);
        BreadItem burgerWithCheeseAndButterSpread = new ButterSpread(burgerWithCheeseSpread);
        System.out.println("Price of Burger with Cheese & Butter Spread : "+burgerWithCheeseAndButterSpread.cost());
    }
}
