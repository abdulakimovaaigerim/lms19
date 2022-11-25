import java.util.Scanner;

import static java.util.Calendar.*;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        DayOfWeek[] dayOfWeeks = DayOfWeek.values();
        while (true) {
            System.out.println("Enter a DayOfWeek in English");
            String getDayOfWeek = input.next().toUpperCase();
            for (DayOfWeek dayOfWeek : dayOfWeeks) {
                if (dayOfWeek.name().equals(getDayOfWeek))

                    switch (dayOfWeek) {
                        case MONDAY -> System.out.println(" Дуйшомбу куну Жава окуйм ");
                        case TUESDAY -> System.out.println(" Шейшемби куну Англис тилин окуйм ");
                        case WEDNESDAY -> System.out.println(" Шаршемби куну Техн сабак окуйм");
                        case THURSDAY -> System.out.println(" Бейшемби куну Soft Skills ");
                        case FRIDAY -> System.out.println(" Жума куну Event");
                        case SATURDAY -> System.out.println("Entrance Saturday");
                        case SUNDAY -> System.out.println("Entrance Sunday");
                    }
            }
        }
    }
}