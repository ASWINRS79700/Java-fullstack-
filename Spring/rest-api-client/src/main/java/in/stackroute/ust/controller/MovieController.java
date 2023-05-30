package in.stackroute.ust.controller;

import in.stackroute.ust.model.Movie;
import in.stackroute.ust.service.MovieService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/v1/movies")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @Value("${app.baseUrl}")
    private String baseUrl;
    @Value("${app.apiKey}")
    private String apiKey;

    /**
     * http://www.omdbapi.com/?t=Avengers&y=2012&plot=full
     * <p>
     * http://www.omdbapi.com/?t=Avengers&y=2012
     * <p>
     * http://www.omdbapi.com/?t=Avengers&plot=full
     */

    @GetMapping
    public ResponseEntity<Movie> getMovieDetails(
            @RequestParam(name = "t", required = true) String title,
            @RequestParam(name = "y") Optional<String> year,
            @RequestParam(name = "plot") Optional<String> plot) {

        StringBuilder url = new StringBuilder(baseUrl);
        url.append(String.format("?t=%s", title));
        if (year.isPresent()) {
            url.append(String.format("&y=%s", year.get()));
        }
        if (plot.isPresent()) {
            url.append(String.format("&plot=%s", plot.get()));
        }
        url.append(String.format("&apikey=%s", apiKey));
        return ResponseEntity.ok(movieService.getMovieDetails(url.toString()));
    }
}
