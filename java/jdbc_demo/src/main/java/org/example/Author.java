package org.example;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Author {
    private int authorID;
    private String authorName,gender;
    private String authorEmail;
    private LocalDate joinDate;


}
