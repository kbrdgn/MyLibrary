/**
 * Created by Kubra on 25/10/2015.
 */
import java.util.Scanner;

public class Library {
    public static int totalCount = 0;
    public static int loanedCount = 0;

    public static boolean isLoaned( Book book )
    {
        return  book.getLoaned();
    }
    public static void currentLibraryStatus(  )
    {
        System.out.println( "LOANED: " +loanedCount );
        System.out.println( "EXISTING: " +( totalCount - loanedCount ) );
        System.out.println( "TOTAL: " +totalCount );
    }
    public static void setAuthor( Author author, Book book )
    {
        book.setAuthor( author );
    }
    public static void setPublisher( Publisher publisher, Book book )
    {
        book.setPublisher( publisher );
    }

    public static void main( String[] args )
    {
        Scanner inputInt = new Scanner( System.in );
        Scanner inputString = new Scanner( System.in );

        Book book1 = new Book( "ASKA DAIR", 2014 );
        Author author1 = new Author( "ISKENDER", "PALA" );
        Publisher publisher1 = new Publisher( "KAPI" );

        setAuthor( author1, book1 );
        setPublisher( publisher1, book1 );
        book1.setNumOfPages( 167 );
        book1.loanBook( book1 );

        Book book2 = new Book( "SAH VE SULTAN", 2011, 400 );

        setAuthor( author1, book2 );
        setPublisher( publisher1, book2 );

        Book book3 = new Book( "SELVI BOYLUM AL YAZMALIM", 2012 );
        Author author2 = new Author( "CENGIZ", "AYTMATOV" );
        Publisher publisher2 = new Publisher( "ELIPS" );

        setAuthor( author2, book3 );
        setPublisher( publisher2, book3 );
        book3.setNumOfPages( 128 );

        Book book4 = new Book( "GUN OLUR ASRA BEDEL", 2007 );

        setAuthor( author2, book4 );
        setPublisher( publisher2, book4 );

        Book book5 = new Book( "KURK MANTOLU MADONNA", 2015, 164 );
        Author author3 = new Author( "SABAHATTIN" );
        Publisher publisher3 = new Publisher();

        setAuthor( author3, book5 );
        setPublisher( publisher3, book5 );

        Book book6 = new Book( "MUCELLA", 2015, 344 );
        Author author4 = new Author( "NAZAN", "BEKIROGLU" );
        Publisher publisher4 = new Publisher( "TIMAS" );

        setAuthor( author4, book6 );
        setPublisher( publisher4, book6 );

        Book book7 = new Book( "LA:SONSUZLUK HECESI", 2008 );

        setAuthor( author4, book7 );
        setPublisher( publisher4, book7 );
        book7.setNumOfPages( 382 );
        book7.loanBook( book7 );

        Book book8 = new Book( "SOL AYAGIM", 2014 );
        Author author5 = new Author( "CHRISTY", "BROWN" );
        Publisher publisher5 = new Publisher();

        setAuthor( author5, book8 );
        setPublisher( publisher5, book8 );

        System.out.println( "Please enter the book name, year and number of pages, respectively:" );
        Book book9 = new Book( inputString.nextLine(), inputInt.nextInt(), inputInt.nextInt() );
        System.out.println( "Please enter the author name and surname, respectively:" );
        Author author6 = new Author( inputString.nextLine(), inputString.nextLine() );
        System.out.println( "Please enter the publisher name:" );
        Publisher publisher6 = new Publisher( inputString.nextLine() );

        setAuthor( author6, book9 );
        setPublisher( publisher6, book9 );

        System.out.println( "Please enter the book name, year and number of pages, respectively:" );
        Book book10 = new Book( inputString.nextLine(), inputInt.nextInt(), inputInt.nextInt() );
        System.out.println( "Please enter the author name and surname, respectively:" );
        Author author7 = new Author( inputString.nextLine(), inputString.nextLine() );
        System.out.println( "Please enter the publisher name:" );
        Publisher publisher7 = new Publisher( inputString.nextLine() );

        setAuthor( author7, book10 );
        setPublisher( publisher7, book10 );

        System.out.println(  );

        book1.bookInfo();
        book2.bookInfo();
        book3.bookInfo();
        book4.bookInfo();
        book5.bookInfo();
        book6.bookInfo();
        book7.bookInfo();
        book8.bookInfo();
        book9.bookInfo();
        book10.bookInfo();

        System.out.println();
        System.out.println();

        author1.authorInfo();
        author2.authorInfo();
        author3.authorInfo();
        author4.authorInfo();
        author5.authorInfo();
        author6.authorInfo();
        author7.authorInfo();

        System.out.println();
        System.out.println();

        publisher1.publisherInfo();
        publisher2.publisherInfo();
        publisher3.publisherInfo();
        publisher4.publisherInfo();
        publisher5.publisherInfo();
        publisher6.publisherInfo();
        publisher7.publisherInfo();

        System.out.println();
        currentLibraryStatus();
    }
}