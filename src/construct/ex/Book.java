package construct.ex;

public class Book {
    String title;
    String author;
    int page;
    Book(){
        this("","",0);
        //기본생성자를 만들수 없기때문에, 셀프로 기본생성자를 만듦
    }
    Book(String title, String author) {
        this(title,author,0);
    }
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }
    void displayInfo(){
        System.out.println("Title: " + title + ", Author" + author + ", Page: " + page);
    }
}
