package in.stackroute.ust.Domain;


import javax.persistence.*;

@Entity
@Table(name="users")

public class User {
    @Id
    @GeneratedValue
    @Column(name="id")
   private Long id;
    @Column(name="name")

    private String name;
    @Column(name="email")

   private String email;
    @Column(name="password")

  private String password;
    public Long getId() {
        return id;
    }
User (){

}
    public User(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
