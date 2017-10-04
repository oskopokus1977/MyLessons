package homework;//Форматировать дату LocalDate в виде 17 July 2017
import java.time.LocalDate;

public class FormatDate {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 7, 17);

        // Output must be 17 July 2017
        System.out.println(String.format("%3i", date));
    }
}


