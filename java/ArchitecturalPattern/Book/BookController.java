public class BookController {

    public static void main(String args[]){

        Book book = new Book();
        // BookView bk;

        BookService  library = new BookService(book);
        library.getBookDetailsfromUser();
        library.displayBookDetails();
    }
}
