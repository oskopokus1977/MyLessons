//Реализовать контейнер для целых чисел. Продумать нужные методы. Продумать инициализацию контейнера.
// Обязательно реализовать sum(), average(), size()

//public class IntHolder<T> {
//
//   public T[] array;
//   T sum = sum();
//
//    public IntHolder(T[]array) {
//        this.array = array;
//    }
//
//    public T sum() {
//        sum = null;
//        for (T n: array) {
//            sum=n;
//        }
//        return sum;
//    }
//
//    public double average() {
//        return (double) sum() / size();
//    }
//
//    public int size() {
//        return array.length;
//    }
//
//    public static void main(String[] args) {
//        Integer[] ass = new Integer[10];
//        for (int i = 0; i < ass.length; i++) {
//            ass[i] = i;
//        }
//        System.out.println(ass.toString());
//       IntHolder<Integer> arr = new IntHolder<Integer>(ass);
//    }
//}
