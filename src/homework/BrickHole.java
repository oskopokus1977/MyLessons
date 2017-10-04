package homework;

//. Написать класс, в котором будет метод, который проверяет,
// сколькими сторонами кирпич пролезет через отверстие заданного диаметра
// (входные параметры - x, y, z кирпича и диаметр отверстия)
public class BrickHole {
    public static void main(String[] args) {
        int holeDiameter = (int) (Math.random() * 10);
        double brickLength = Math.random() * 10;
        double brickWeight = Math.random() * 10;
        double brickHeight = Math.random() * 10;

        System.out.println(brickVsHole(holeDiameter, brickLength, brickWeight, brickHeight));
    }

    static int brickVsHole(int holeDiameter, double brickLength, double brickWeight, double brickHeight) {
        int rezult = 0;
        double hypotenuseOne = Math.sqrt(Math.pow(brickLength, 2) + Math.pow(brickWeight, 2));
        double hypotenuseTwo = Math.sqrt(Math.pow(brickLength, 2) + Math.pow(brickHeight, 2));
        double hypotenuseThree = Math.sqrt(Math.pow(brickWeight, 2) + Math.pow(brickHeight, 2));
        double[] array = {hypotenuseOne, hypotenuseTwo, hypotenuseThree};
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= holeDiameter) {
                rezult++;
            }
        }
        return rezult;
    }
}
