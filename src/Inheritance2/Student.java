package Inheritance2;

public class Student extends Person{
    public void setStudent(){
        name = "홍길동";
        age = 30;
        height = 175;
        setWeight(99);
    }

    @Override
    public void info() {
        setStudent();
        super.info();
    }

}
