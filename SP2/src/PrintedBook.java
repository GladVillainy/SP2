public class PrintedBook extends Title {
    //Varibles
    int pages;
    int copies;

    // Heirloom from sup to sub (Constructor)
    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType);
        this.copies = copies;
        this.pages = pages;
    }

    // Heirloom from sup to sub (overwriting)
    @Override
    protected double calculatePoints() {
        return pages * copies * convertLiteratureType();
    }
}
