public class Function3 {
    public static void main(String[] args){
        order(22, 76, 625);
    }
    public static void order(int num1, int num2, int num3)
    {
        int high = num1;
        int mid = num2;
        int low = num3;


        if(num1>num2&&num1>num3){
            high = num1;
        }else if (num1>num2&&num1<num3){
            mid = num1;
        }else if (num1<num2&&num1<num3){
            low = num1;
        }
       


        if(num2>num1&&num2>num3){
            high = num2;
        }else if (num2>num1&&num2<num3){
            mid = num2;
        }else if (num2<num1&&num2<num3){
            low = num2;
        }
        

        if(num3>num2&&num3>1){
            high = num3;
        }else if (num3>num1&&num3<num2){
            mid = num3;
        }else if (num3<num1&&num3<num2){
            low = num3;
        }
       System.out.println(low);
       System.out.println(mid);
       System.out.println(high);


        
    }
}

