package ch14.sec05;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i <= 100; i++) {
            final int idx=i;
            Future<Integer> future = executor.submit(new Callable<Integer>() {
                public Integer call() throws Exception {
                    int sum=0;
                    for(int i=1;i<=idx;i++){
                        sum+=i;
                    }
                    Thread.sleep(500);
                    Thread thread=Thread.currentThread();
                    System.out.println("["+thread.getName()+"] 1~"+idx+"합 계산");
                    return sum;
                }
            });
            try {
                int result=future.get();
                System.out.println("\t리턴값: "+result);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
