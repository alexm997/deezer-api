package deezer.model;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import util.URLTypeAdapter;

import java.net.URL;

public class Podcast {

    private Long id;
    private String title;
    private String description;
    @SerializedName("available")
    private Boolean isAvailable;
    private Integer rating;
    @SerializedName("fans")
    private Integer numberOfFans;
    @JsonAdapter(URLTypeAdapter.class)
    private URL link;
    @JsonAdapter(URLTypeAdapter.class)
    private URL picture;
    @SerializedName("picture_small") @JsonAdapter(URLTypeAdapter.class)
    private URL smallPicture;
    @SerializedName("picture_medium") @JsonAdapter(URLTypeAdapter.class)
    private URL mediumPicture;
    @SerializedName("picture_big") @JsonAdapter(URLTypeAdapter.class)
    private URL bigPicture;
    @SerializedName("picture_xl") @JsonAdapter(URLTypeAdapter.class)
    private URL xlPicture;

    private Integer position;

    public Long getId() {
        return this.id;
    }

    public Podcast setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public Podcast setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Podcast setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getIsAvailable() {
        return this.isAvailable;
    }

    public Podcast setAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    public Integer getRating() {
        return this.rating;
    }

    public Podcast setRating(Integer rating) {
        this.rating = rating;
        return this;
    }

    public Integer getNumberOfFans() {
        return this.numberOfFans;
    }

    public Podcast setNumberOfFans(Integer numberOfFans) {
        this.numberOfFans = numberOfFans;
        return this;
    }

    public URL getLink() {
        return this.link;
    }

    public Podcast setLink(URL link) {
        this.link = link;
        return this;
    }

    public URL getPicture() {
        return this.picture;
    }

    public Podcast setPicture(URL picture) {
        this.picture = picture;
        return this;
    }

    public URL getSmallPicture() {
        return this.smallPicture;
    }

    public Podcast setSmallPicture(URL smallPicture) {
        this.smallPicture = smallPicture;
        return this;
    }

    public URL getMediumPicture() {
        return this.mediumPicture;
    }

    public Podcast setMediumPicture(URL mediumPicture) {
        this.mediumPicture = mediumPicture;
        return this;
    }

    public URL getBigPicture() {
        return this.bigPicture;
    }

    public Podcast setBigPicture(URL bigPicture) {
        this.bigPicture = bigPicture;
        return this;
    }

    public URL getXlPicture() {
        return this.xlPicture;
    }

    public Podcast setXlPicture(URL xlPicture) {
        this.xlPicture = xlPicture;
        return this;
    }

    public Integer getPosition() {
        return this.position;
    }

    public Podcast setPosition(Integer position) {
        this.position = position;
        return this;
    }
    
}