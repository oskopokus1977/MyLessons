package homework;

/**
 * Created by Ura on 19.06.2017.
 */
public class ExchangeVariable {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;
        exchangeVarMath(a, b);
        exchangeVarBinary(a, b);
    }
    public static void exchangeVarMath(int a, int b){
        a = a + b - (b = a);
        System.out.println(a);
        System.out.println(b);
    }

    public static void exchangeVarBinary(int a, int b){
        a = a^b;  //11^111=100
        b = a^b;  //100^111=11
        a = a^b;  //100^11=111
        System.out.println(a);
        System.out.println(b);

    }
}
