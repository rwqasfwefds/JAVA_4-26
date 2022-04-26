package Interface;

// Service라는 이름을 갖고있는 클래스 : 비지니스 로직을 구성하는 메소드
public class CommentServiceImpl implements CommentService{

    @Override
    public void deleteComment(Long idx) {
        System.out.println("첨언 삭제");
    }

    @Override
    public void getCommentList(String params) {
        System.out.println("첨언 목록 가져오기");
    }

    @Override
    public void registerComment(String params) {
        System.out.println("첨언 등록");
    }
    
}
