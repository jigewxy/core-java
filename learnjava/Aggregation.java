
package corejava.learnjava;

public class Aggregation {

    public static void main (String[] args){

        Author author = new Author("Yu Hua", 50, "China");
        Book book = new Book ("Alive", 30, author);
        book.showDetail();
    }


}

class Author
{
    String authorName;
    int age;
    String place;
    Author(String name,int age,String place)
    {
        this.authorName=name;
        this.age=age;
        this.place=place;
    }
    public String getAuthorName()
    {
        return authorName;
    }
    public int getAge()
    {
        return age;
    }
    public String getPlace()
    {
        return place;
    }
}

class Book
{
    String name;
    int price;
    Author auth;

    Book(String name, int price, Author auth)
    {
        this.name = name;
        this.price = price;
        this.auth = auth;
    }

    public void showDetail()
    {
        System.out.println("Book is"+name);
        System.out.println("price "+price);
        System.out.println("Author is "+auth.getAuthorName());
    }
}
