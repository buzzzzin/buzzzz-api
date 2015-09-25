package in.buzzzz.v1.co.buzz;

import in.buzzzz.co.ValidateCommand;
import in.buzzzz.domain.buzz.Schedule;

public class BuzzCommand implements ValidateCommand {

    private String name;
    private String imageName;
    private Boolean isRSVP;
    private String latitude;
    private String longitude;
    private String startTime;
    private String endTime;
    private Schedule.Period period;

    @Override
    public boolean validate() {
        return false;
    }
}
