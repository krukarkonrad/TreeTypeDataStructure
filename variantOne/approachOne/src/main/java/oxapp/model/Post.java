package oxapp.model;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {

    @Id
    private Long id;

    private Long userId;

    private String title;

    private String body;

//    @ManyToOne
//    @JoinColumn(foreignKey = @ForeignKey(name = "userId"))
//    private User user;

    public Post(){}
}
