public class currenttime {
    public static void main(String[] args)
    {
        long totalmilisecound = System.currentTimeMillis();

        long totalsecound = totalmilisecound / 1000;

        long currentsecound = totalsecound % 60;

        long totalminute = totalsecound / 60;

        long currentminute = totalminute % 60;

        long totalhours = totalminute /60;

        long currenthour = totalhours % 24;

        System.out.println("Current time is " + currenthour + ":" + currentminute + ":" + currentsecound + " GMT");
    }
}
