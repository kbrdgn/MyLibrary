/**
 * Created by Kubra on 25/10/2015.
 */
public class Author {
    private String firstName;
    private String lastName;
    private int numOfBooks = 0;

    public Author( String firstName )
    {
        this.firstName = firstName;
    }
    public Author( String firstName, String lastName )
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }
    public String getFirstName(  )
    {
        return firstName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }
    public String getLastName(  )
    {
        if( lastName != null ) {
            return lastName;
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

    public void authorInfo(  )
    {
        System.out.println( "AUTHOR NAME: " +getFirstName() );
        System.out.println( "AUTHOR SURNAME: " +getLastName() );
        System.out.println( "NUMBER OF BOOKS OF THE AUTHOR: " +getNumOfBooks() );
        System.out.println( "**********************************" );
    }

    public int numOfBooks( Author author )
    {
        return author.getNumOfBooks();
    }

}