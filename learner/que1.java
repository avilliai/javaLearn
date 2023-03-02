package learninging0910.learner;

import java.util.Calendar;

public class que1 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        for (int year = 1999; year < 114514; year+=100) {
            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,11);
            calendar.set(Calendar.DAY_OF_MONTH,31);
            if (calendar.get(Calendar.DAY_OF_WEEK)==1){
                System.out.println(year);
                break;

            }
        }
    }
}
