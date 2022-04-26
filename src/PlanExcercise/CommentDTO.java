package PlanExcercise;

// DTO 기본형 : 멤버변수 + GETTER/SETTER
// DTO(Data Transfer Object) : DB에서 정보를 저장할 클래스
public class CommentDTO {
    private int idx;
    private int boardIdx;
    private String content;
    private String writer;

    public void info(){
        System.out.println(" idx = " + this.idx + 
                            ", boardIdx = " + this.boardIdx + 
                            ", content = " + this.content + 
                            ", writer = " + this.writer);
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
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }

    
}
