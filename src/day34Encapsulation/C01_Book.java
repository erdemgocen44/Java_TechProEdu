package day34Encapsulation;

public class C01_Book {

  private String bookName;
  private String authorName;

  public C01_Book(String bookName, String authorName) {
    this.bookName = bookName;
    this.authorName = authorName;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }
}
