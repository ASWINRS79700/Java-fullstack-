package in.stackroute.springrestjpacodingchallenge.service;

import in.stackroute.springrestjpacodingchallenge.domain.Feedback;
import in.stackroute.springrestjpacodingchallenge.dto.FeedbackDto;
import in.stackroute.springrestjpacodingchallenge.exceptions.FeedbackAlreadyProvidedException;
import in.stackroute.springrestjpacodingchallenge.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FeedbackServiceImpl implements FeedbackService{
    @Autowired
    FeedbackRepository feedbackRepository;

    @Override
    public Feedback save(Feedback feedback) {
        if(feedbackRepository.findById(feedback.getFeedbackId()).isPresent()){
            throw new FeedbackAlreadyProvidedException();
        }
        feedbackRepository.save(feedback);
        return feedback;
    }

    @Override
    public Feedback getFeedById(int id) {
        return feedbackRepository.findById(id).get();
    }

    @Override
    public List<Feedback> getAll() {
        return feedbackRepository.findAll();
    }

    @Override
    public Feedback editFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
        return feedback;
    }

    @Override
    public Feedback deleteFeedback(int id) {
        var feed=feedbackRepository.findById(id);
        feedbackRepository.deleteById(id);
        return feed.get();
    }
}
