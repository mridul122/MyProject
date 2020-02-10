package Practice;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

    @Test
    public  void date() {

        Date dt = new Date();
//        System.out.println(dt);
//        System.out.println(dt.toString());

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy h:m:s E");
        System.out.println(sd.format(dt));
    }
}
