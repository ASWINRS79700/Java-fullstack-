package in.stackroute.ust.collection;

public class Blog {
    String content;
    Blog(){
    }

    public Blog(String content, String date, int id) {
        this.content = content;
        this.date = date;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String date;
    int id;
}
