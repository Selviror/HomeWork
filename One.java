
public class One {
	public static void main(String[] args) {
       int time = 4500;
       int sec, min, hour, day, week;
       sec = time;
       min = time/60;
       hour = time/3600;
       day = time/86400;
       week = time/604800;
       System.out.println(" second is: " + sec);
       System.out.println(" minutes is: " + min + " second is: " + sec%60);
       System.out.println(" hour is: " + hour + ", minutes is: " +min%60 + ", second is: " + sec%60);
       System.out.println(" days is: " + day + ", hour is: " + hour%24 + ", minutes is: " + min%60 + ", second is: " + sec%60);
       System.out.println(" week is: " + week + ", days is: " + day%7 + ", hour is: " + hour%24 + ", minutes is: " + min%60 + ", second is: " + sec%60);
       
    }
}
