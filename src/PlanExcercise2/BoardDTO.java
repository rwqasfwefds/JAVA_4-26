package PlanExcercise2;

// DB에서 데이터를 가져와서 클래스 객체에 저장
// 게시판 DTO클래스
public class BoardDTO {
    // 번호(PK)
    private int idx;
    // 제목
    private String title;
    // 내용
    private String content;
    // 작성자
    private String writer;
    // 조회수
    private int viewCnt;
    // 공지 여부
    private Boolean noticeYn;
    // 비밀 여부
    private Boolean secretYn;
    // 파일 변경 여부
    private Boolean changeYn;
    // 파일 인덱스 리스트
    private int fileIdxs;

    // 맴버 변수의 현재 내용 출력
    public void info(){
        System.out.println("idx = " + this.idx + 
                            ", title = " + this.title + 
                            ", content = " + this.content + 
                            ", writer = " + this.writer + 
                            ", viewCnt = " + this.viewCnt + 
                            ", noticeYn = " + this.noticeYn + 
                            ", secretYn = " + this.secretYn + 
                            ", changeYn = " + this.changeYn + 
                            ", fileIdxs = " + this.fileIdxs);
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getViewCnt() {
        return viewCnt;
    }

    public void setViewCnt(int viewCnt) {
        this.viewCnt = viewCnt;
    }

    public Boolean getNoticeYn() {
        return noticeYn;
    }

    public void setNoticeYn(Boolean noticeYn) {
        this.noticeYn = noticeYn;
    }

    public Boolean getSecretYn() {
        return secretYn;
    }

    public void setSecretYn(Boolean secretYn) {
        this.secretYn = secretYn;
    }

    public Boolean getChangeYn() {
        return changeYn;
    }

    public void setChangeYn(Boolean changeYn) {
        this.changeYn = changeYn;
    }

    public int getFileIdxs() {
        return fileIdxs;
    }

    public void setFileIdxs(int fileIdxs) {
        this.fileIdxs = fileIdxs;
    }

    
}
