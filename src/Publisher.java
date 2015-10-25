/**
 * Created by Kubra on 25/10/2015.
 */
public class Publisher {
    private String name;
    private int numOfBooks = 0;

    public Publisher( )
    { }
    public Publisher( String name )
    {
        this.name = name;
    }

    public void setName( String name )
    {
        this.name = name;
    }
    public String getName(  )
    {
        if( name != null ) {
            return name;
        }
        else{
            return "(?)";
        }
    }

    public void setNumOfBooks(  )
    {
        numOfBooks += 1;
    }
    public int getNumOfBooks(  )
    {
        return numOfBooks;
    }

    public void publisherInfo(  )
    {
        System.out.println( "PUBLISHER NAME:" +getName() );
        System.out.println( "NUMBER OF BOOKS OF THE PUBLISHER: " +getNumOfBooks() );
        System.out.println( "**********************************" );
    }

    public int numOfBooks( Publisher publisher )
    {
        return publisher.getNumOfBooks();
    }

}