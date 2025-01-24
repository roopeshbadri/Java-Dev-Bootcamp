package MovieStore;

public class Movie {
    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    public Movie(Movie other) {
        this.name = other.name;
        this.format = other.format;
        this.rating = other.rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("The name cannot be null or blank");
        }
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if(format==null || format.trim().isEmpty()){
            throw new IllegalArgumentException("The name cannot be null or blank");
        }
        this.format = format;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if(rating<0 || rating>10){
            throw new IllegalArgumentException("The rating must be between 0 and 10");
        }
        this.rating = rating;
    }

    @Override
    public String toString() {
        return this.rating + "\t" + this.format + "\t" + this.name;
    }
}
