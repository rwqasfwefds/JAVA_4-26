package PlanExcercise2;

public class Test {
    public static void main(String[] args) {
        BoardDTO bd = new BoardDTO();
        AttachDTO ad = new AttachDTO();

        bd.setIdx(1);
        bd.setTitle("title");
        bd.setContent("content");
        bd.setWriter("writer");
        bd.setViewCnt(1);
        bd.setNoticeYn(true);
        bd.setSecretYn(true);
        bd.setChangeYn(true);
        bd.setFileIdxs(1);

        bd.info();


        ad.setIdx(2);
        ad.setBoardIdx(1);
        ad.setOriginalName("originalName");
        ad.setSaveName("saveName");
        ad.setSize(1);

        ad.info();
    }
}
