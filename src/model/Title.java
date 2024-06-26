package model;

import manager.DateManager;
import manager.TimeManager;

import java.time.LocalDate;
import java.time.Year;

public class Title {

    public Title() {
    }

    private String showId;
    private String type;
    private String title;
    private String director;
    private String cast;
    private String country;
    private LocalDate dateAdded;
    private Year releaseYear;
    private String rating;
    private Integer duration;
    private String listedIn;
    private String description;

    public String getShowId() {
        return showId;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
    }

    public String getCountry() {
        return country;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    public String getRating() {
        return rating;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getListedIn() {
        return listedIn;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "{title: " + this.title + ";" +
                "type: " + this.type + ";" +
                "release_year: " + this.releaseYear + "}";
    }

    public static class Builder {
        private final Title title = new Title();

        public Builder showId(String showId) {
            this.title.showId = showId;
            return this;
        }

        public Builder type(String type) {
            this.title.type = type;
            return this;
        }

        public Builder title(String title) {
            this.title.title = title;
            return this;
        }

        public Builder director(String director) {
            if (!director.equals("null")) {
                this.title.director = director;
            }
            return this;
        }

        public Builder cast(String cast) {
            if (!cast.equals("null")) {
                this.title.cast = cast;
            }
            return this;
        }

        public Builder country(String country) {
            if (!country.equals("null")) {
                this.title.country = country;
            }
            return this;
        }

        public Builder dateAdded(String dateAdded) {
            if (!dateAdded.equals("null")) {
                this.title.dateAdded = DateManager.dateAdded(dateAdded);
            }
            return this;
        }

        public Builder releaseYear(String releaseYear) {
            if (!releaseYear.equals("null")) {
                this.title.releaseYear = DateManager.releaseYear(releaseYear);
            }
            return this;
        }

        public Builder rating(String rating) {
            if (!rating.equals("null")) {
                this.title.rating = rating;
            }
            return this;
        }

        public Builder duration(String duration) {
            if (!duration.equals("null")) {
                this.title.duration = TimeManager.duration(duration);
            }
            return this;
        }

        public Builder listedIn(String listedIn) {
            if (!listedIn.equals("null")) {
                this.title.listedIn = listedIn;
            }
            return this;
        }

        public Builder description(String description) {
            if (!description.equals("null")) {
                this.title.description = description;
            }
            return this;
        }

        public Title build() {
            return this.title;
        }

    }

}
