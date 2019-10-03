package deezer.model;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import deezer.model.interfaces.Commentable;
import deezer.model.interfaces.Searchable;
import util.URLTypeAdapter;

import java.io.Serializable;
import java.net.URL;
import java.util.Objects;

public class Artist implements Serializable, Searchable, Commentable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    @JsonAdapter(URLTypeAdapter.class)
    private URL link;
    @JsonAdapter(URLTypeAdapter.class)
    private URL share;
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
    @SerializedName("nb_album")
    private Integer numberOfAlbums;
    @SerializedName("nb_fan")
    private Integer numberOfFans;
    @SerializedName("radio")
    private Boolean hasRadio;
    @JsonAdapter(URLTypeAdapter.class)
    private URL tracklist;

    private Integer position;

    public Long getId() {
        return this.id;
    }

    public Artist setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Artist setName(String name) {
        this.name = name;
        return this;
    }

    public URL getLink() {
        return this.link;
    }

    public Artist setLink(URL link) {
        this.link = link;
        return this;
    }

    public URL getShare() {
        return this.share;
    }

    public Artist setShare(URL share) {
        this.share = share;
        return this;
    }

    public URL getPicture() {
        return this.picture;
    }

    public Artist setPicture(URL picture) {
        this.picture = picture;
        return this;
    }

    public URL getSmallPicture() {
        return this.smallPicture;
    }

    public Artist setSmallPicture(URL smallPicture) {
        this.smallPicture = smallPicture;
        return this;
    }

    public URL getMediumPicture() {
        return this.mediumPicture;
    }

    public Artist setMediumPicture(URL mediumPicture) {
        this.mediumPicture = mediumPicture;
        return this;
    }

    public URL getBigPicture() {
        return this.bigPicture;
    }

    public Artist setBigPicture(URL bigPicture) {
        this.bigPicture = bigPicture;
        return this;
    }

    public URL getXlPicture() {
        return this.xlPicture;
    }

    public Artist setXlPicture(URL xlPicture) {
        this.xlPicture = xlPicture;
        return this;
    }

    public Integer getNumberOfAlbums() {
        return this.numberOfAlbums;
    }

    public Artist setNumberOfAlbums(Integer numberOfAlbums) {
        this.numberOfAlbums = numberOfAlbums;
        return this;
    }

    public Integer getNumberOfFans() {
        return this.numberOfFans;
    }

    public Artist setNumberOfFans(Integer numberOfFans) {
        this.numberOfFans = numberOfFans;
        return this;
    }

    public Boolean getHasRadio() {
        return this.hasRadio;
    }

    public Artist setHasRadio(Boolean hasRadio) {
        this.hasRadio = hasRadio;
        return this;
    }

    public URL getTracklist() {
        return this.tracklist;
    }

    public Artist setTracklist(URL tracklist) {
        this.tracklist = tracklist;
        return this;
    }

    public Integer getPosition() {
        return this.position;
    }

    public Artist setPosition(Integer position) {
        this.position = position;
        return this;
    }

    @Override
    public String toString() {
        return  "Artist{" +
                "id=" + this.id + ", " +
                "name=" + (this.name == null ? null : "'" + this.name + "'") + ", " +
                "link=" + this.link + ", " +
                "share=" + this.share + ", " +
                "picture=" + this.picture + ", " +
                "smallPicture=" + this.smallPicture + ", " +
                "mediumPicture=" + this.mediumPicture + ", " +
                "bigPicture=" + this.bigPicture + ", " +
                "xlPicture=" + this.xlPicture + ", " +
                "numberOfAlbums=" + this.numberOfAlbums + ", " +
                "numberOfFans=" + this.numberOfFans + ", " +
                "hasRadio=" + this.hasRadio + ", " +
                "tracklist=" + this.tracklist + ", " +
                "position=" + this.position +
                "}";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || this.getClass() != other.getClass())
            return false;
        Artist artist = (Artist) other;
        return  Objects.equals(this.id, artist.id) &&
                Objects.equals(this.name, artist.name) &&
                Objects.equals(this.link, artist.link) &&
                Objects.equals(this.share, artist.share) &&
                Objects.equals(this.picture, artist.picture) &&
                Objects.equals(this.smallPicture, artist.smallPicture) &&
                Objects.equals(this.mediumPicture, artist.mediumPicture) &&
                Objects.equals(this.bigPicture, artist.bigPicture) &&
                Objects.equals(this.xlPicture, artist.xlPicture) &&
                Objects.equals(this.numberOfAlbums, artist.numberOfAlbums) &&
                Objects.equals(this.numberOfFans, artist.numberOfFans) &&
                Objects.equals(this.hasRadio, artist.hasRadio) &&
                Objects.equals(this.tracklist, artist.tracklist) &&
                Objects.equals(this.position, artist.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.link, this.share, this.picture, this.smallPicture,
                            this.mediumPicture, this.bigPicture, this.xlPicture, this.numberOfAlbums, this.numberOfFans,
                            this.hasRadio, this.tracklist, this.position);
    }

}
