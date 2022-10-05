package p.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import p.B2Application;

@Entity
@Table(name = "A2_table")
@Data
public class A2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static A2Repository repository() {
        A2Repository a2Repository = B2Application.applicationContext.getBean(
            A2Repository.class
        );
        return a2Repository;
    }
}
