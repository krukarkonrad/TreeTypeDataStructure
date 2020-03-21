package oxapp.model;

import javax.persistence.*;

@Entity
@Table(name = "geo")
public class Geo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String lat;

    private String lng;

}
