package PlanExcercise2;

// DB에서 데이터를 가져와서 클래스 객체에 저장
// 첨부파일 DTO 클래스
public class AttachDTO {
    // 파일 번호(PK)
    private int idx;
    // 게시글 번호(FK)
    private int boardIdx;
    // 원본 파일명
    private String originalName;
    // 저장 파일명
    private String saveName;
    // 파일 크기
    private int size;

    // 맴버 변수의 현재 내용 출력
    public void info(){
        System.out.println("idx = " + this.idx + 
                            ", boardIdx = " + this.boardIdx + 
                            ", originalName = " + this.originalName + 
                            ", saveName = " + this.saveName + 
                            ", size = " + this.size);
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getBoardIdx() {
        return boardIdx;
    }

    public void setBoardIdx(int boardIdx) {
        this.boardIdx = boardIdx;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
}
