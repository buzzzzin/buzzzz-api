package in.buzzzz.v1.data.interest;

import in.buzzzz.data.interest.InterestData;

public class InterestDto implements InterestData {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
