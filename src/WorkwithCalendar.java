import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;
import  static  java.lang.System.out;

public class WorkwithCalendar {

    public static void main(String[] args) {
        Date data=new Date();
        data.getDay();
        Calendar calendar=Calendar.getInstance();
        calendar.set(2004,0,7,15,40,41);
        long day=calendar.getTimeInMillis();
        day +=1000*60*60;
        calendar.setTimeInMillis(day);
        System.out.println("Новый час "+calendar.get(calendar.HOUR_OF_DAY));
        calendar.add(calendar.DATE,35);
        System.out.println("Добавить 35 дней "+calendar.getTime());
        calendar.roll(calendar.DATE,-5);
        System.out.println("Прокручивает 35 дней "+calendar.getTime());
        calendar.set(calendar.DATE,1);
        System.out.println("Устанавливаем дату в 1 "+calendar.getTime());
        System.out.println(calendar.ZONE_OFFSET);

       }

}
