import java.util.ArrayList;

public class Author {

    //Author information
    private String name;
    public String getName() {return name;} //Getter
    public Author(String name) {this.name = name;} // Constructor



    //Title information
    private ArrayList<Title> titles = new ArrayList<>();
    public void addTitle(Title title){titles.add(title);}

    // Royalties
    public double calculateRoyalties() {
        return 10;
    }


}
