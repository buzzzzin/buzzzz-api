package in.buzzzz.v1.co.buzz;

import in.buzzzz.v1.co.location.LocationCommand;

public class BuzzByInterestCommand extends LocationCommand {
    private String interest;

    @Override
    public String toString() {
        return "BuzzByInterestCommand{" +
                "interest='" + interest + '\'' +
                '}';
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
}
