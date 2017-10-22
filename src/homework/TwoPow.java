package homework;

public class TwoPow   {
   public static void main(String[] args) throws InterruptedException {
int number = 3;
       twoPow(number);

    }



    public static void twoPow(int number){
        if((number&(number-1))==0){
            System.out.println("This number is power of two!");
        }
        else {
            System.out.println("This number is not power of two");
        }
    }


    public static int divisorSum(int n){
        int a = 0;
        for(int i = 1; i<=n; i++){
            if((n % i)==0){
                a=i+a;
            }
        }
        return a;
    }
}
