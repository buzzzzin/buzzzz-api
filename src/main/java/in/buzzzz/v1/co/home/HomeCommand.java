package in.buzzzz.v1.co.home;

/**
 * Created by ekansh on 26/9/15.
 */
public class HomeCommand {

    private String latitude;
    private String longitude;
    private Integer radius;

    @Override
    public String toString() {
        return "HomeCommand{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", radius=" + radius +
                '}';
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }
}
