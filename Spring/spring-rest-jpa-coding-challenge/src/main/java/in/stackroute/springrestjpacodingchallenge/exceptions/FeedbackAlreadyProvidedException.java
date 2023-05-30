package in.stackroute.springrestjpacodingchallenge.exceptions;

public class FeedbackAlreadyProvidedException extends RuntimeException{
    public FeedbackAlreadyProvidedException(){
        super("FeedbackAlreadyProvided");
    }
}
