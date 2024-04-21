package homework_postresql.qwerty;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer number;

    public Test() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getName() {
        return number;
    }

    public void setName(Integer name) {
        this.number = name;
    }


    public Test(Integer name) {
        this.number = name;
    }
}
