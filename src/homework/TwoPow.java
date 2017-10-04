package homework;

public class TwoPow {
    public static void main(String[] args) {
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
}
