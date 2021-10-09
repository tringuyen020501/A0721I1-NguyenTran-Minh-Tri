package bai4_lop_doi_tuong.bai_tap;

import java.util.concurrent.TimeUnit;

public class StopWatch {
    public static ClassStopWatch classStopWatch= new ClassStopWatch();
    public StopWatch() {
    }

    public static void main(String[] args) throws InterruptedException {
       startWatch();
        TimeUnit.SECONDS.sleep(2);
        endWatch();
       classStopWatch.setElapsedTime(classStopWatch.getEndTime()- classStopWatch.getStartTime());
        System.out.println(classStopWatch.getElapsedTime());

    }
    private static void startWatch(){
        classStopWatch.setStartTime(System.currentTimeMillis());
    }
    private static void endWatch(){
        classStopWatch.setEndTime(System.currentTimeMillis());
    }
}
