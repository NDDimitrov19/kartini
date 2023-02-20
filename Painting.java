import java.util.Scanner;

public class Painting
{
    private String name;
    private String author;
    private double price;
    private int year;
    private int uniqueNumber;

    public Painting()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter author: ");
        this.author = sc.nextLine();
        System.out.print("Enter price: ");
        this.price = sc.nextDouble();
        System.out.print("Enter id: ");
        this.uniqueNumber = sc.nextInt();
    }

    public Painting(String name, String author, double price, int year, int uniqueNumber)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.uniqueNumber = uniqueNumber;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getUniqueNumber()
    {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber)
    {
        this.uniqueNumber = uniqueNumber;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
        System.out.println(uniqueNumber);
    }
}




