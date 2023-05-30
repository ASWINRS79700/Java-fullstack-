package in.stackroute.ust.domain;

import javax.persistence.*;
import java.time.LocalDate;
//Entity Inheritance
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "publication_type")
public class Publication {

    @Id
    @GeneratedValue
    private int id;

    private String title;

    private LocalDate publishedDate;

    public Publication() {
    }
}
