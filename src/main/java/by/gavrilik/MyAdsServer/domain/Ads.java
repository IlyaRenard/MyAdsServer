package by.gavrilik.MyAdsServer.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Ads {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //private User user;
    private String description;
    private int rating;
    private String image_url;
    private Date creation_date;


    public Ads() {
    }

    public Ads(String description, String rating) {
    }

    public Ads(String description, int rating, String image_url, Date creation_date) {
        this.description = description;
        this.rating = rating;
        this.image_url = image_url;
        this.creation_date = creation_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
