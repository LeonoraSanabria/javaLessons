class Main
{
    static double dividingNumbers(double h, double g)
    {
        return h/g;
    }
    static double subtractingNumbers(double e, double f)
    {
        return e - f;
    }
    static double addingNumbers(double ... numbers)
    {
        double result = 0.0;
        for(int i = 0; i < numbers.length; i++)
        {
            result += numbers[i];
        }
        return result;
    }
    static double multiplyNumbers(double ... numbers)
    {
        //adds an array of numbers together
        if(numbers.length ==0)
        {
            return 0.0;
        }
        double result = 0.0;
        for(int i =0; i < numbers.length; i++)
        {
            result = result* numbers[i];
        }
        return result;
    }
    static void printPyramid(int num)
    { 
        //takes a number and prints a pyramid up to that value
          for(int i = 0; i < 12; i++)
            {
                for(int j = 0; j <= i; j++)
                {
                    System.out.print(j +1);
                }
                System.out.println();
             }
     }
    public static void main(String[] args) 
    {
       System.out.println(multiplyNumbers(3,2));
       System.out.println(addingNumbers(2,2));
       System.out.println(subtractingNumbers(4,3));
       System.out.println(dividingNumbers(4,3));
    }
}