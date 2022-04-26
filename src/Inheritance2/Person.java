package Inheritance2;

public class Person {
    String name;
    int age;
    int height;
    int weight;

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void info(){
        System.out.println("이름 = " + this.name + ", 나이 = " + this.age + ", 키 = " + this.height + ", 몸무게 = " + this.getWeight());
    }
}
