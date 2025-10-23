import java.text.DecimalFormat;

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        //BI, TE, LYRIK, SKØN, FAG

        Author A1 = new Author("Jorden Petersen");
        PrintedBook Rules2 = new PrintedBook("12 Rules to life: more", "FAG", 60, 432);
        A1.addTitle(Rules2);

        PrintedBook Rules1 = new PrintedBook("12 Rules to life: Chaos", "FAG", 60, 448);
        A1.addTitle(Rules1);

        AudioBook mapsOfmeaning = new AudioBook("Maps of Meaning", "FAG", 1852, 10);
        A1.addTitle(mapsOfmeaning);


        System.out.print(new DecimalFormat("0.00").format( Rules1.calculateRoyalty()+Rules2.calculateRoyalty()+mapsOfmeaning.calculateRoyalty())+"kr-."+"\n"+A1.getName());


    }
}

