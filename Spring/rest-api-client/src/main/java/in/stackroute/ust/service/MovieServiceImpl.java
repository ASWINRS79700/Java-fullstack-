package in.stackroute.ust.service;

import in.stackroute.ust.model.Movie;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieServiceImpl implements MovieService {

    private RestTemplate restTemplate;

    public MovieServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Movie getMovieDetails(String url) {
        return restTemplate.getForObject(url, Movie.class);
    }
}
