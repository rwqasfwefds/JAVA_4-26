package PlanExcercise3;

// 상품에 대한 클래스 : DTO(Data Transfer Object = 데이터를 전송하는 객체다 이 마리야 ㅇㅇ)
public class ProductDTO {
    // 상품 이름
    private String name;
    // 상품 가격
    private int price;
    // 상품 설명
    private String description;
    // 상품 이미지 경로
    private String imageUrl;
    // 상품 색상
    private String color;
    // 상품 크기
    private int size;
    // 상품 할인율
    private int discount;
    // 상품 카테고리Id
    private int categoryId;
    // 상품 등록 일자
    private String createTimestamp;
    // 상품 수정 일자
    private String updateTimestamp;
    // 상품 할인 가격
    private int discountPrice;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getCreateTimestamp() {
        return createTimestamp;
    }
    public void setCreateTimestamp(String createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }
    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
    public int getDiscountPrice() {
        return discountPrice;
    }
    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    
}
