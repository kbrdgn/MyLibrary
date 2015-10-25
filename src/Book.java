/**
 * Created by Kubra on 25/10/2015.
 */
public class Book {
    private String name;
    private int year;
    private int numOfPages = 0;
    private Author author;
    private Publisher publisher;
    private boolean isLoaned = false;

    public Book( String name, int year ){
        this.name = name;

        if( 1000 <= year && year <= 2015 ) {
            this.year = year;
        }
        else {
            System.out.println( "You entered an invalid value for year!" );
        }
        Library.totalCount++;
    }
    public Book( String name, int year, int numOfPages )
    {
        this.name = name;

        if( 1000 <= year && year <= 2015 ) {
            this.year = year;
        }
        else{
            System.out.println( "You entered an invalid value for year!" );
        }

        if( numOfPages > 0 ){
            this.numOfPages = numOfPages;
        }
        else{
            System.out.println( "You entered an invalid value for number of pages!" );
        }
        Library.totalCount++;
    }

    public void setName( String name )
    {
        this.name = name;
    }
    public String getName(  )
    {
        return name;
    }

    public void setYear( int year )
    {
        if( 1000 <= year && year <= 2015 ) {
            this.year = year;
        }
        else {
            System.out.println( "You entered an invalid value for year!" );
        }
    }
    public int getYear(  )
    {
        return year;
    }

    public void setNumOfPages( int numOfPages )
    {
        if( numOfPages > 0 ){
            this.numOfPages = numOfPages;
        }
        else{
            System.out.println( "You entered an invalid value for number of pages!" );
        }
    }
    public int getNumOfPages(  )
    {
        return numOfPages;
    }

    public void setAuthor( Author author )
    {
        this.author = author;
        author.setNumOfBooks();
    }
    public String getAuthor(  )
    {
        if( author.getFirstName() != null && author.getLastName() != null ) {
            return author.getFirstName() + " " + author.getLastName();
        }
        else{
            return author.getFirstName();
        }
    }

    public void setPublisher( Publisher publisher )
    {
        this.publisher = publisher;
        publisher.setNumOfBooks();

    }
    public String getPublisher(  )
    {
        if( publisher.getName() != null ) {
            return publisher.getName();
        }
        else{
            return "(?)";
        }
    }

    public void setLoaned( boolean isLoaned )
    {
        this.isLoaned = isLoaned;
    }
    public boolean getLoaned(  )
    {
        return isLoaned;
    }

    public void loanBook( Book book )
    {
        book.setLoaned( true );
        Library.loanedCount++;
    }
    public void bookInfo(  )
    {
        System.out.println( "BOOK NAME: " +getName() );
        if( 1000 <= year && year <= 2015 ) {
            System.out.println("YEAR: " + getYear());
        }
        else{
            System.out.println( "YEAR: (?)" );
        }
        if( numOfPages != 0 ) {
            System.out.println("PAGE COUNT: " + getNumOfPages());
        }
        else{
            System.out.println( "PAGE COUNT: (?)" );
        }
        System.out.println( "AUTHOR: " +getAuthor() );
        System.out.println( "PUBLISHER: " +getPublisher() );
        if( getLoaned()) {
            System.out.println("LOANED?: YES");
        }
        else{
            System.out.println( "LOANED?: NO" );
        }
        System.out.println( "**********************************" );
    }

}