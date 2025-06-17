package ch15.example;

public class Member {
    private String name;
    private int age;
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int hashCode(){
        return name.hashCode() + age;
    }
    public boolean equals(Object o){
        if(o instanceof Member target){
            return target.name.equals(name) && (target.age == age);
        }else
            return false;
    }
    public String toString(){
        return name + " " + age;
    }
}
