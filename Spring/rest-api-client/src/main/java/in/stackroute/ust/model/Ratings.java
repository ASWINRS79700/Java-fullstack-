package in.stackroute.ust.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Ratings(
        @JsonProperty("Source") String source,
        @JsonProperty("Value") String value) { }
