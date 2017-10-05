package classWork.Maping;

import java.util.Date;

public class Human {

    private String name;



    private int birthdayYear;
    private char sex;

    public Human(String name, int birthdayYear, char sex) {
        this.name = name;
        this.birthdayYear = birthdayYear;
        this.sex = sex;
    }
    public int getBirthdayYear() {
        return birthdayYear;
    }

    public char getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }
}
