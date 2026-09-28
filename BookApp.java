class Book{
    private int pageNum;
    public void setData(int pageNum){
        this.pageNum = pageNum;
    }
    public void getData(){
        System.out.println("Page Number: " + pageNum);
    }
}
public class BookApp {
    public static void main(String[] args) {
        Book b = new Book();
        b.setData(-100);
        b.getData();
    }
    
}
