package in.buzzzz.v1.data.buzz;

import in.buzzzz.data.buzz.BuzzData;
import in.buzzzz.domain.buzz.Location;

public class LocationDto implements BuzzData {
    private String city;
    private String latitude;
    private String longitude;
    private String address;
    private String pincode;

    public LocationDto() {
    }

    public LocationDto(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public LocationDto(Location location) {
        this.city = location.getCity() != null ? location.getCity() : "";
        this.latitude = location.getLatitude() != null ? location.getLatitude() : "";
        this.longitude = location.getLongitude() != null ? location.getLongitude() : "";
        this.address = location.getAddress() != null ? location.getAddress() : "";
        this.pincode = location.getPincode() != null ? location.getPincode() : "";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
