package ch14.sec05;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try{
            sumThread.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(sumThread.getSum());
        sumThread.setSum(0);
        System.out.println(sumThread.getSum());
    }
}
