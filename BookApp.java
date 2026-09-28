class Book{
    private int pageNum;
    public void setData(int pageNum){
        if(pageNum < 0){
            System.out.println("Page number cannot be negative.");
            this.pageNum = 0; // Set to a default value or handle as needed
        } else {
            this.pageNum = pageNum;
        }
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
