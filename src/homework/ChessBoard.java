package homework;

public class ChessBoard {
    public static void main(String... args) {
        int size = 10;
        printChess(size);
    }

    public static void printChess(int size){
        for (int i = 0; i<size; i++){
            for (int j = 0; j<size; j++){
                if (i%2==0){
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print(" "+"*");}
            }
            System.out.println();
        }
    }
}
