package homework;

import java.util.Scanner;

/**
 * Created by Ura on 15.06.2017.
 */
public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entered degrees Cesium, to finish enter 'exit':\n=>");

        while (!scanner.hasNext("exit")) {
            int cesium = scanner.nextInt();
            System.out.println(cesium + " degrees Cesium equally " + temperatureConverter(cesium) + " degrees Fahrenheit.\n " +
                    "Enter degrees Cesium: ");
        }
        System.out.println("BayBay!");
    }

    public static int temperatureConverter(int cesium) {

        return cesium * 9 / 5 + 32;
    }
}
