public class Function2 {

    public static void main(String[] args )
    {
        int result;
        result = CalculateArea (2, 3);
        System.out.println(result);
    }
    public static int CalculateArea(int l, int w){
         int area = l*w;
        System.out.println("The area of the rectangle is " + area);
    }
}