package domain;

/**
 * @author panzhixiong
 * @date 2018/10/22
 */
public class Person {
    private Long id;
    private String name;

    public Person() {
        super();
    }

    public Person(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
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
}
