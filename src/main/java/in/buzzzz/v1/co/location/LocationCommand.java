package in.buzzzz.v1.co.location;

/**
 * Created by ekansh on 26/9/15.
 */
public class LocationCommand {

    private Double latitude;
    private Double longitude;
    private Integer radius;

    @Override
    public String toString() {
        return "HomeCommand{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", radius=" + radius +
                '}';
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }
}
