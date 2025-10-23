public class AudioBook extends Title {

    //Variables
    int durationInMinutes;
    int copies;

    // Heirloom from sup to sub (Constructor)
    public AudioBook(String title, String literatureType, int durationInMinutes, int copies) {
        super(title, literatureType);
        this.durationInMinutes = durationInMinutes;
        this.copies = copies;
    }

    // Heirloom from sup to sub (overwriting)
    @Override
    protected double calculatePoints() {
        return durationInMinutes * copies * convertLiteratureType();
    }
}
