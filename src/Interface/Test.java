package Interface;

public class Test {
    public static void main(String[] args) {
        BoardServiceImpl b = new BoardServiceImpl();
        b.registerBoard("params");
        b.getBoardDetail(new Long(1));
        b.deleteBoard(new Long(2));
        b.getBoardList("params");
        b.getAttachFileList(new Long(4));
        b.getAttachDetail(new Long(3));

        CommentServiceImpl c = new CommentServiceImpl();
        c.registerComment("params");
        c.deleteComment(new Long(1));
        c.getCommentList("params");
    }
}
