package Interface;

// 인터페이스 : 메소드 목록 이름만 있는 것(메소드 목록 명세서)
public interface CommentService {
    public void registerComment(String params);
    public void deleteComment(Long idx);
    public void getCommentList(String params);
}
