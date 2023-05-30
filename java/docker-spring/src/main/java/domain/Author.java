package domain;

public class Author {
    String email,fullName,genere;

    public Author(String email, String fullName, String genere) {
        this.email = email;
        this.fullName = fullName;
        this.genere = genere;
    }
    public Author(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
