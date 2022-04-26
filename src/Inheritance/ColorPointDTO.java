package Inheritance;


public class ColorPointDTO extends CommonDTO{
    private String color;

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public void showPoint() {
        System.out.println("컬러색상 = " + this.color); // 색상정보
        super.showPoint(); // 부모 점의 좌표 출력용 메소드
    }
    
}
