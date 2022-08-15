import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Map<DaysOfTheWeek, Integer> map = new LinkedHashMap<>();
        DaysOfTheWeek daysOfTheWeek1 = new DaysOfTheWeek("Monday");
        DaysOfTheWeek daysOfTheWeek2 = new DaysOfTheWeek("Tuesday");
        DaysOfTheWeek daysOfTheWeek3 = new DaysOfTheWeek("Wednesday");
        DaysOfTheWeek daysOfTheWeek4 = new DaysOfTheWeek("Thursday");
        DaysOfTheWeek daysOfTheWeek5 = new DaysOfTheWeek("Friday");
        DaysOfTheWeek daysOfTheWeek6 = new DaysOfTheWeek("Saturday");
        DaysOfTheWeek daysOfTheWeek7 = new DaysOfTheWeek("Sunday");
        int randomDay = random.nextInt(100);
        for (int i = 0; i <= 365; i++) {
            map.put(daysOfTheWeek1, randomDay);
            map.put(daysOfTheWeek2, randomDay);
            map.put(daysOfTheWeek3, randomDay);
            map.put(daysOfTheWeek4, randomDay);
            map.put(daysOfTheWeek5, randomDay);
            map.put(daysOfTheWeek6, randomDay);
            map.put(daysOfTheWeek7, randomDay);
        }
        for (Map.Entry<DaysOfTheWeek, Integer> entry: map.entrySet()) {
            System.out.println(entry);
        }
    }
}
