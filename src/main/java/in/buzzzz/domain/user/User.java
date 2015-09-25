package in.buzzzz.domain.user;

/**
 * Created by ekansh on 25/9/15.
 */

public class User {

    public enum Gendre {
        MALE,
        FEMALE
    }

    private Long id;
    private String name;
    private Gendre gendre;


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

    public Gendre getGendre() {
        return gendre;
    }

    public void setGendre(Gendre gendre) {
        this.gendre = gendre;
    }
}
