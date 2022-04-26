package Inheritance;

// 부모 클래스
public class CommonDTO {
    int x;
    int y;

    // 좌표 저장용 메소드
    public void set (int x, int y){
        this.x = x;
        this.y = y;
    }

    // 좌표 출력용 메소드
    public void showPoint(){
        // 좌표 출력
        System.out.println("x = " + this.x + ", y = " + this.y + " (" + x + "," + y + ")");
    }
}
