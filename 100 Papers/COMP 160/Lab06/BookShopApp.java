public class BookShopApp{
  public static void main (String [] args){
    Book book1 = new Book();
    book1.setTitle("Life of Pi");
    book1.setPages(273);
    book1.setPrice(22.90);
    book1.displayBook();
    Book book2 = new Book();
    book2.setTitle("Mister Pip");
    book2.setPages(240);
    book2.setPrice(22.70);
    book2.displayBook();
    Book book3 = new Book();
    book3.setTitle("50 Shades of Grey");
    book3.setPages(365);
    book3.setPrice(1.69);
    book3.displayBook();
  }
}