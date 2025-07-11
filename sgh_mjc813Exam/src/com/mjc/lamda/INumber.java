package com.mjc.lamda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class INumber {
    private static List<Integer> test=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    public static void main(String[] args) {
        Person person = new Person();

        person.printHuman((name, age) -> {
            System.out.printf("%s님의 나이는 %d 입니다.\n", name, age);
        });
        person.printCar((name, age) -> {
            System.out.printf("자동차 %s의 년식은 %d 입니다.\n", name, age);
        });
        person.printArray((List<Integer> a)->{
            Long sum=ssum(a);
            System.out.printf("합은 {%d} 입니다.\n", sum);
            return sum;
        });
        person.printArray((List<Integer> a)->{
            Long sum=ssum(a);
            Long result=sum/a.size();
            System.out.printf("평균은 {%d} 입니다.\n",result);
            return result;
        });


        INumberProc aa = (name,age)->System.out.printf("자동차 %s의 년식은 %d 입니다.\n", name, age);
        aa.process("카니발",33);
        IArrayProc arraySum=((List<Integer> a)->{
            Long sum=ssum(a);
            System.out.printf("합은 {%d} 입니다.\n", sum);
            return sum;
        });
        arraySum.process(test);
        IArrayProc arrayAvg=((List<Integer> a)->{
            long sum=ssum(a);
            long result=(sum/a.size());
            return result;
        });
        System.out.printf("평균은 {%d} 입니다.\n",arrayAvg.process(test));
    }

    public static Long ssum(List<Integer> a) {
        Long sum=0L;
        for(Integer i:a){
            sum+=i;
        }
        return sum;
    }
}
