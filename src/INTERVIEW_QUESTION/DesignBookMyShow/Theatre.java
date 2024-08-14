package INTERVIEW_QUESTION.DesignBookMyShow;

import INTERVIEW_QUESTION.DesignBookMyShow.Enums.City;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    int theatreId;
    String address;
    City city;
    List<Screen> screens = new ArrayList<>();
    List<Show> shows = new ArrayList<>();

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public List<Show> getShows() {
        return shows;
    }
}
