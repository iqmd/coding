import java.util.Scanner;
public class BookService {
    Book book;

    BookService(Book book){
        this.book = book;
    }

    public void getBookDetailsfromUser(){
        Scanner read = new Scanner(System.in);
        System.out.println("Your Book's id :");
        book.setId(read.nextInt());
        read.nextLine();

        System.out.println("Your Book's name :");
        book.setName(read.nextLine());

        System.out.println("Your Book's Author :");
        book.setAuthor(read.nextLine());

        System.out.println("Your Book's Category :");
        book.setCategory(read.nextLine());

        System.out.println("Your Book's Return Date :");
        book.setReturnDate(read.nextLine());

        read.close();
    }

    public void displayBookDetails(){
        System.out.print("Your Book's id : "+book.getId()+"\n");

        System.out.print("Your Book's name : "+book.getName()+"\n");

        System.out.print("Your Book's Author : "+book.getAuthor()+"\n");

        System.out.print("Your Book's Category : "+book.getCategory()+"\n");

        System.out.print("Your Book's Return Date : "+book.getReturnDate()+"\n");

    }
    
    
    
}
