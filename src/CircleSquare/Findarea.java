package CircleSquare;

public class Findarea {
    public int Area(int x,int y)
    {
        int c= x*y;
        return c;

    }
    public int Area(int x)
    {
        int c= x*x;
        return c;

    }

    public static void main(String[] args) {
        Findarea ob = new Findarea();
        int result1 = ob.Area(12,60);
        int result2 = ob.Area(12);
        System.out.println("Area of Rectangle" +result1);
        System.out.println("Area of Square" +result2);
    }
}

