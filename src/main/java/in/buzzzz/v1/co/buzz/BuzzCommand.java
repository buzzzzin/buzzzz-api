package in.buzzzz.v1.co.buzz;

import in.buzzzz.co.ValidateCommand;
import in.buzzzz.domain.buzz.Schedule;

import java.util.List;

public class BuzzCommand implements ValidateCommand {

    private String name;
    private String imageName;
    private Boolean isRSVP;
    private String latitude;
    private String longitude;
    private String startTime;
    private String endTime;
    private Schedule.Period period;
    private List<String> tags;
    private List<String> interests;

    @Override
    public boolean validate() {
        return false;
    }
}
