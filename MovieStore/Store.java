package MovieStore;

public class Store {
    private Movie[] movie;

    public Store() {
        this.movie = new Movie[10]; 
    }

    public Movie getMovie(int index) {
        if (movie[index] != null) {
            return new Movie(movie[index]);
        }
        return null; 
    }

    public void setMovie(int index, Movie movie) {
        if (index >= 0 && index < this.movie.length) {
            this.movie[index] = new Movie(movie); 
        }
    }

    @Override
    public String toString() {
        String temp = "";
        for (Movie m : movie) {
            if (m != null) {
                temp += m.toString() + "\n";
            }
        }
        return temp.trim(); 
    }
}
