package in.stackroute.springrestjpacodingchallenge.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

@Entity

public class Feedback {
    @Id
    int feedbackId;
    @NotEmpty
    String comment;
    @OneToOne
    Product product;
    @OneToOne
    User user;
    public Feedback(){

    }

    public Feedback(int feedbackId, String comment, Product product, User user) {
        feedbackId = feedbackId;
        this.comment = comment;
        this.product = product;
        this.user = user;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        feedbackId = feedbackId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
