package lambda_practice.movies_statistics;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cinema {
    public void seeAveragePricesForGenres() {
        List<Movie> movies = buildMovieList();
        Map<Genre, Double> avgPRICE = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.averagingDouble(Movie::getPrice)));
        System.out.println(movies);
        System.out.println(avgPRICE);
    }
    private static List<Movie>buildMovieList(){
        List<Movie> movieList = new ArrayList<>();
        DecimalFormat newFormat = new DecimalFormat("#.##");
        movieList.add(new Movie("Film1", Genre.COMEDY, Double.valueOf(newFormat.format((Math.random()*21)+1))));
        movieList.add(new Movie("Film2", Genre.COMEDY, Double.valueOf(newFormat.format((Math.random()*21)+1))));
        movieList.add(new Movie("Film3", Genre.COMEDY, Double.valueOf(newFormat.format((Math.random()*21)+1))));
        movieList.add(new Movie("Film4", Genre.DRAMA, Double.valueOf(newFormat.format((Math.random()*21)+1))));
        movieList.add(new Movie("Film5", Genre.DRAMA, Double.valueOf(newFormat.format((Math.random()*21)+1))));
        movieList.add(new Movie("Film6", Genre.DRAMA, Double.valueOf(newFormat.format((Math.random()*21)+1))));
        movieList.add(new Movie("Film7", Genre.MUSICAL, Double.valueOf(newFormat.format((Math.random()*21)+1))));
        movieList.add(new Movie("Film8", Genre.MUSICAL, Double.valueOf(newFormat.format((Math.random()*21)+1))));
        movieList.add(new Movie("Film9", Genre.MUSICAL, Double.valueOf(newFormat.format((Math.random()*21)+1))));
        return movieList;
    }
}
