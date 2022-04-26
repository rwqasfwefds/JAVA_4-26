package Inheritance2;

public class Staff extends Person{
    public void setStaff(){
        age = 30;
        name = "이순신";
        height = 180;
        setWeight(87);
    }

    @Override
    public void info() {
        setStaff();
        super.info();
    }
}