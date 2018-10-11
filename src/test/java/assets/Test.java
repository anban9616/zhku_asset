package assets;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
        Date date = new Date();
        String year = sdf.format(date);
        System.out.println(year);
        DecimalFormat df = new DecimalFormat("0000");
        String id = df.format(5); //次id即为四位不重复的流水号
        System.out.println(id);
	}
}
