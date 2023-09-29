// BreadItemDecorator.java

public class BreadItemDecorator implements BreadItem
{
    protected BreadItem breadItem;

    public BreadItemDecorator(BreadItem breadItem)
    {
        this.breadItem = breadItem;
    }

    @Override
    public float cost() {
        return breadItem.cost();
    }
}
