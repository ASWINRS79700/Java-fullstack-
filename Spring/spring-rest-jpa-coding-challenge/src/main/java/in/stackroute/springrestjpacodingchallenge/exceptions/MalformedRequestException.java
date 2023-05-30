package in.stackroute.springrestjpacodingchallenge.exceptions;

public class MalformedRequestException extends RuntimeException{
    public MalformedRequestException(){
        super("MalformedRequest");
    }
}
