import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SalesLogger<formatForDateNow> implements Logger{
    protected int num = 1;
    private static SalesLogger instance;
    String time;
    String msg;
    private static SalesLogger logger;

    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private SalesLogger() {
        this.time = dateFormat.format(date);
        this.num = num;
    }

    public static SalesLogger getInstance() {
        if (instance == null) instance = new SalesLogger();
        return instance;
    }

    @Override
    public void log(String msg) {
        System.out.println( " [" + time + ", " + num++ + "] " + msg  );
    }

}
