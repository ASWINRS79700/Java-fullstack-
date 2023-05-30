package in.stackroute.ust.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Movie(
        @JsonProperty("Title") String title,
        @JsonProperty("Year") String year,
        @JsonProperty("Rated") String rated,
        @JsonProperty("Released") String released,
        @JsonProperty("Runtime") String runtime,
        @JsonProperty("Genre") String genre
//        @JsonProperty("Director") String director,
//        @JsonProperty("Writer") String writer,
//        @JsonProperty("Actors") String actors,
//        @JsonProperty("Plot") String plot,
//        @JsonProperty("Language") String language,
//        @JsonProperty("Country") String country,
//        @JsonProperty("Awards") String awards,
//        @JsonProperty("Poster") String poster,
//        @JsonProperty("Metascore") String metaScore,
//        @JsonProperty("imdbRating") String imdbRating,
//        @JsonProperty("imdbVotes") String imdbVotes,
//        @JsonProperty("imdbID") String imdbID,
//        @JsonProperty("Type") String type,
//        @JsonProperty("DVD") String dvd,
//        @JsonProperty("BoxOffice") String boxOffice,
//        @JsonProperty("Production") String production,
//        @JsonProperty("Website") String webSite,
//        @JsonProperty("Response") String resposne,
//        @JsonProperty("Ratings") List<Ratings> ratings
) { }
