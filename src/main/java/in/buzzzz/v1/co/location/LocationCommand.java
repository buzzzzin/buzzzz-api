package in.buzzzz.v1.co.location;

import in.buzzzz.v1.co.pagination.PaginationCommand;

public class LocationCommand extends PaginationCommand {

    private Double latitude = 28.6328;
    private Double longitude = 77.2197;
    private Integer radius = 10000;

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
