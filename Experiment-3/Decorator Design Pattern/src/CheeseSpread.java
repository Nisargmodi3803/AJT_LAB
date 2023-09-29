// CheeseSpread.java

public class CheeseSpread extends BreadItemDecorator
{
    public CheeseSpread(BreadItem breadItem)
    {
        super(breadItem);
    }

    @Override
    public float cost()
    {
        return breadItem.cost()+10;
    }
}
