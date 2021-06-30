
class Geek
{
    public String name;
    public int id;
    Geek(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    public boolean equals(Object obj)
    {
        if(this == obj)
            return false;

        Geek geek = (Geek) obj;
        return (geek.name == this.name && geek.id == this.id);
    }

    public int hashCode()
    {
        return this.id;
    }
}

public class EqualsHashCode {
    public static void main(String[] args)
    {
        Geek g1 = new Geek("aa", 1);
        Geek g2 = new Geek("aa", 1);
        if(g1.hashCode() == g2.hashCode())
        {
            if(g1.equals(g2))
                System.out.println("Both objects are equal");
            else
                System.out.println("Both objects are not equal");
        }
        else
            System.out.println("Both objects are not equal");

    }
}
