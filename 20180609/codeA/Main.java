public class Main{
  public static void main(String[] args) {
    BookShelf booShelf = new BookShelf(4);
    booShelf.appendBook(new Book("bookA"));
    booShelf.appendBook(new Book("bookB"));
    booShelf.appendBook(new Book("bookC"));
    booShelf.appendBook(new Book("bookD"));
    Iterator it = booShelf.iterator();
    while(it.hasNext()){
      Book book = (Book)it.next();
      System.out.println(book.getName());
    }
  }
}
