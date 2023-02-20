import java.util.ArrayList;
import java.util.List;

public class Paintings {
    private List<Painting> paintings;
    public Paintings()
    {
        this.paintings = new ArrayList<>();
    }
    public List<Painting> getPaintings() {
        return paintings;
    }
    public void setPaintings(List<Painting> paintings)
    {
        this.paintings = paintings;
    }
    public void addPainting(Painting painting)
    {
        for (Painting p : paintings) {
            if (p.getUniqueNumber() == painting.getUniqueNumber()) {
                System.out.println("Error");
            }
        }
        paintings.add(painting);
    }
    public void removePainting(int uniqueNumber)
    {
        for (int i = 0; i < paintings.size(); i++)
        {
            if (paintings.get(i).getUniqueNumber() == uniqueNumber)
            {
                paintings.remove(i);
                System.out.println(uniqueNumber);
            }
        }
        System.out.println(uniqueNumber);
    }

    public static void Main() {
        System.out.println("MENU:");
        System.out.println("1.Add picture");
        System.out.println("2.Delete picture");
        System.out.println("3.Info for picture by author");
        System.out.println("4.Find most expensive by author");
        System.out.println("5.Find average price");
        System.out.println("0.Exit");
    }
}