public abstract class Title {
    // Variables
    private String title;
    private String literatureType;
    private static final double rate = 0.067574;

    //Constructor
    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    //Public
    public double calculateRoyalty() {
        return rate*calculatePoints();
    }

    // Protected
    protected abstract double calculatePoints();
//Converter
    protected double convertLiteratureType() {
        if ("BI".equals(literatureType) || "TE".equals(literatureType)) {
            return 3;
        } else if ("LYRIK".equals(literatureType)) {
            return 6;
        } else if ("SKØN".equals(literatureType)) {
            return 1.7;
        } else if("FAG".equals(literatureType)){
            return 1;
        } else {
            return 0;
        }
    }
}