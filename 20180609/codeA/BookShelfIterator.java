public class BookShelfIterator implements Iterator{
  private BookShelf booShelf;
  private int index;
  public BookShelfIterator(BookShelf bookShelf){
    this.index =0;
    this.booShelf = bookShelf;
  }
  public boolean hasNext(){
    if(index<booShelf.getLength()){
      return true;
    }else{
      return false;
    }
  }
  public Object next(){
    Book book = booShelf.getBookAt(index);
    index++;
    return book;
  }
}
