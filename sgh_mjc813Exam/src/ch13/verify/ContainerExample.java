package ch13.verify;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> c = new Container<>();
        c.set("홍길동");
        String s = c.get();

        Container<Integer> c2 = new Container<>();
        c2.set(6);
        int value=c2.get();
        Container2<String, String> c3 = new Container2<>();
        c3.set("홍길동","도적");
        String name1=c3.getKey();
        String job=c3.getValue();

        Container2<String, Integer> c4 = new Container2<>();
        c4.set("홍길동",35);
        String name2=c4.getKey();
        int age=c4.getValue();
    }
}
