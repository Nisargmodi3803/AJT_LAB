// ButterSpread.java

public class ButterSpread extends BreadItemDecorator
{
    public ButterSpread(BreadItem breadItem)
    {
        super(breadItem);
    }

    @Override
    public float cost()
    {
        return breadItem.cost()+5;
    }
}
