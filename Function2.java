public class Function2 {

    public static void main(String[] args )
    {
        int x;
        x = CalculateArea (5, 3);
        System.out.println(x);
    }
    public static int CalculateArea(int l, int w){
         int area = l*w;
       // System.out.println("The area of the rectangle is " + area);
        return area;
    }
}