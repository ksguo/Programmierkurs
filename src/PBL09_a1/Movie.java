package PBL09_a1;

public class Movie {

    private static int  numMovie = 0;

    private String title;

    //kons
    public Movie(String title){
        this.title = title;
        numMovie++;

    }


    public static int getNumMovie() {
        return numMovie;
    }

    public static void setNumMovie(int numMovie) {
        Movie.numMovie = numMovie;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                '}';
    }
}
