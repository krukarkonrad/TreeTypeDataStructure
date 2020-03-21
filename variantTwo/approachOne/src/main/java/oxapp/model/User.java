package oxapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    private String name;

    private String username;

    private String email;

    @OneToOne
    private Adress adress;

    private String phone;

    private String website;

    @OneToOne
    private Company company;

    @OneToMany(mappedBy = "userId")
    private Set<Post> postSet;
}
