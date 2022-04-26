package PlanExcercise;

public class Test {
    public static void main(String[] args) {
        CommonDTO dto1 = new CommonDTO();
        CommentDTO dto2 = new CommentDTO();

        dto1.setPaginationInfo("1번 페이지");
        dto1.setDeleteYn(true);
        dto1.setInsertTime("2022-04-24");
        dto1.setUpdateTime("2022-04-25");
        dto1.setDeleteTime("2022-04-26");

        dto1.info();

        
        dto2.setIdx(1);
        dto2.setBoardIdx(1);
        dto2.setContent("자유게시판");
        dto2.setWriter("건잭");

        dto2.info();
    }
}
