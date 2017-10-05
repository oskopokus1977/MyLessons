package classWork.Maping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapMain {
    public static void main(String[] args) {
        List<Human>listHuman = new ArrayList<>();
        listHuman.add(new Human("Yurii", 1977, 'm'));
        listHuman.add(new Human("Den", 1978, 'm'));
        listHuman.add(new Human("Alice", 2000, 'f'));
        listHuman.add(new Human("Bill", 1987, 'm'));
        listHuman.add(new Human("Nataly", 1985, 'f'));
        listHuman.add(new Human("July", 1988, 'f'));
        listHuman.add(new Human("Andrey", 1997, 'm'));
        listHuman.add(new Human("Jenny", 1992, 'f'));
        listHuman.add(new Human("Yurii", 1990, 'm'));
        listHuman.add(new Human("Elena", 1973, 'f'));


        System.out.println(listHuman.stream().filter(human -> human.getName().equals("Yurii")).count());
        System.out.println(listHuman.stream().filter(human -> human.getBirthdayYear() == 1977).count());

        System.out.println(listHuman.stream()
                .filter((human) -> human.getBirthdayYear() > 1980 && human.getBirthdayYear() < 1995
                        && human.getSex() == 'm')
                .collect(Collectors.toList()));

        System.out.println(listHuman.stream().mapToInt(Human::getBirthdayYear).average());




    }


}
