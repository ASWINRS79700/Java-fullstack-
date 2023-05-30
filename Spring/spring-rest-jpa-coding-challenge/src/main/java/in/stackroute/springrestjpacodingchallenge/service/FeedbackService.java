package in.stackroute.springrestjpacodingchallenge.service;

import in.stackroute.springrestjpacodingchallenge.domain.Feedback;
import in.stackroute.springrestjpacodingchallenge.dto.FeedbackDto;

import java.util.List;

public interface FeedbackService {
    Feedback save(Feedback feedback);
    Feedback getFeedById(int id);
    List<Feedback> getAll();
    Feedback editFeedback(Feedback feedback);
    Feedback deleteFeedback(int id);

    
}
