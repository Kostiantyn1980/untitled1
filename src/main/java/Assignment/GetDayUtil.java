package Assignment;


import java.util.ArrayList;

    public class GetDayUtil {

        public String getDay(Integer dayNumber) {
            ArrayList<String> daysList = new ArrayList<>();
            daysList.add("Sunday");
            daysList.add("Sunday1");
            daysList.add("Sunday2");
            daysList.add("Monday");
            daysList.add("Tuesday");
            daysList.add("Wednesday");
            daysList.add("Thursday");
            daysList.add("Friday");
            daysList.add("Saturday");
            if (dayNumber == null) {
                throw new NullPointerException();
            } else if (dayNumber < 1) {
                return "The number should be equal or larger than 1";
            } else if (dayNumber > 7) {
                return "The number should be equal or smaller than 7";
            } else {
                return daysList.get(dayNumber - 1);
            }
        }
    }

