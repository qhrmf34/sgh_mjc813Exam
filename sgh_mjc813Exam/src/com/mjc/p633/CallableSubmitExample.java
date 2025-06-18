package com.mjc.p633;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CallableSubmitExample {
    public static void main(String[] args) {
        Long ms = System.currentTimeMillis();

        ISumLoop loop = (sum)->
                System.out.printf("리턴값: %d\n",sum);

        ExecutorService executor = Executors.newFixedThreadPool(5);


        for (int i = 0; i <= 100000; i++) {
            final int idx=i;
            executor.execute(new Runnable() {

                public void run() {
                    Thread thread = Thread.currentThread();
                    Long sum = 0L;
                        for (Long i = 1L; i <= idx; i++) {
                            sum += i;
                        }
//                    System.out.println("["+thread.getName()+"] 1~"+idx+"합 계산");
                        loop.print(sum);

                }
            });
        }
        executor.shutdown();
        ms = System.currentTimeMillis() - ms;
        System.out.printf("totalMills = %d\n", ms);
    }
}
