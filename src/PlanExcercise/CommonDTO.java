package PlanExcercise;

// DTO 기본형 : 멤버변수 + GETTER/SETTER
// DTO(Data Transfer Object) : DB에서 정보를 저장할 클래스
public class CommonDTO {
    // 페이징 정보
    private String paginationInfo;
    // 삭제 여부
    private Boolean deleteYn;
    // 등록일
    private String insertTime;
    // 수정일
    private String updateTime;
    // 삭제일
    private String deleteTime;

    // 맴버변수 출력용 메소드
    // 보통 디버깅 목적으로 하나 만들어줌(안에 뭐가 들어있는지 확인 할려구 ㅇㅇ)
    public void info(){
        System.out.println("paginationInfo = " + this.paginationInfo + 
                            ", deleteYn = " + this.deleteYn + 
                            ", insertTime = " + this.insertTime + 
                            ", updateTime = " + this.updateTime + 
                            ", deleteTime = " + this.deleteTime);
    }

    public String getPaginationInfo() {
        return paginationInfo;
    }

    public void setPaginationInfo(String paginationInfo) {
        this.paginationInfo = paginationInfo;
    }

    public Boolean getDeleteYn() {
        return deleteYn;
    }

    public void setDeleteYn(Boolean deleteYn) {
        this.deleteYn = deleteYn;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

}
