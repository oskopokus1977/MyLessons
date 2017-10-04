package homework;

enum EnumMounth {
    January("31"), February("28"), March("31"), April("30"), May("31"), June("30"),
    Jule("31"), August("31"), September("30"), October("31"), November("30"), December("31");

    String days;

    EnumMounth(String days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return this.name() + " " + this.days;
    }
}

class Month {

    public static void main(String[] args) {
        System.out.println(EnumMounth.October);
    }
}
