package optianaltask;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;

public class SecondTask {
    public static List<Integer> findMonthNumbers(String[] args) {
        List<Integer> result = new ArrayList<>();
        for (String s : args) {
            int temp = Integer.parseInt(s);
            if (temp >= 1 && temp <=12 && !result.contains(temp)) {
                result.add(temp);
            }
        }
        return result;
    }

    public static void getMonthFromNumber(String[] args) {
        List<Integer> months = findMonthNumbers(args);
        String[] monthNames = new DateFormatSymbols().getMonths();
        for (int month : months) {
            System.out.println(monthNames[month - 1] + "(" + month + "), ");
        }
    }

    public static void main(String[] args) {
        getMonthFromNumber(args);
    }
}
