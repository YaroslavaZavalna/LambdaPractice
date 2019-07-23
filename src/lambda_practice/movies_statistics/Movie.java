package lambda_practice.movies_statistics;

public class Movie {
    private Genre genre;
    private Double price;
    private String title;

    public Movie(String title, Genre genre, Double price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movie: " +"title: "+ title+
                ", genre=" + genre +
                ", price=" + price +
                "\n";
    }
}
