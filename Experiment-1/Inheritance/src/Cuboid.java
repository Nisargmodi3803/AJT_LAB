// Cuboid.java

public class Cuboid extends Rectangle
{
    int height;

    Cuboid(int h)
    {
        super(10,20);

        this.height = h;
    }

    int Volume()
    {
        return(length*breadth*height);
    }
}
