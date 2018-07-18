package Main;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by liqiang on 2018/7/18 23:30.
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private BigDecimal balance;

}

































