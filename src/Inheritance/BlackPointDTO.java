package Inheritance;

public class BlackPointDTO extends CommonDTO{
    private boolean blackYn;

    // setter : 멤버변수 저장용 메소드
    public void setBlackYn(boolean blackYn){
        this.blackYn = blackYn;
    }

    @Override
    public void showPoint() {
        System.out.println("흑백 여부 = " + this.blackYn); // 흑백여부
        super.showPoint(); // 부모 점의 좌표 출력용 메소드
    }

    
}
