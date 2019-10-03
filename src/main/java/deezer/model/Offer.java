package deezer.model;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import util.URLTypeAdapter;

import java.io.Serializable;
import java.net.URL;
import java.util.Objects;

public class Offer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Float amount;
    private String currency;
    @SerializedName("displayed_amount")
    private String displayedAmount;
    @SerializedName("tc") @JsonAdapter(URLTypeAdapter.class)
    private URL termsAndConditions;
    @SerializedName("tc_html") @JsonAdapter(URLTypeAdapter.class)
    private URL htmlTermsAndConditions;
    @SerializedName("tc_txt") @JsonAdapter(URLTypeAdapter.class)
    private URL textTermsAndConditions;
    @SerializedName("try_and_buy")
    private Integer tryAndBuy;

    public long getId() {
        return this.id;
    }

    public Offer setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Offer setName(String name) {
        this.name = name;
        return this;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Offer setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getDisplayedAmount() {
        return this.displayedAmount;
    }

    public Offer setDisplayedAmount(String displayedAmount) {
        this.displayedAmount = displayedAmount;
        return this;
    }

    public URL getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public Offer setTermsAndConditions(URL termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
        return this;
    }

    public URL getHtmlTermsAndConditions() {
        return this.htmlTermsAndConditions;
    }

    public Offer setHtmlTermsAndConditions(URL htmlTermsAndConditions) {
        this.htmlTermsAndConditions = htmlTermsAndConditions;
        return this;
    }

    public URL getTextTermsAndConditions() {
        return this.textTermsAndConditions;
    }

    public Offer setTextTermsAndConditions(URL textTermsAndConditions) {
        this.textTermsAndConditions = textTermsAndConditions;
        return this;
    }

    public Integer getTryAndBuy() {
        return this.tryAndBuy;
    }

    public Offer setTryAndBuy(Integer tryAndBuy) {
        this.tryAndBuy = tryAndBuy;
        return this;
    }

    public Float getAmount() {
        return this.amount;
    }

    public Offer setAmount(Float amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        return  "Offer{" +
                "id=" + this.id + ", " +
                "name=" + (this.name == null ? null : "'" + this.name + "'") + ", " +
                "amount=" + this.amount + ", " +
                "currency=" + (this.currency == null ? null : "'" + this.currency + "'") + ", " +
                "displayedAmount=" + (this.displayedAmount == null ? null : "'" + this.displayedAmount + "'") + ", " +
                "termsAndConditions=" + this.termsAndConditions + ", " +
                "htmlTermsAndConditions=" + this.htmlTermsAndConditions + ", " +
                "textTermsAndConditions=" + this.textTermsAndConditions + ", " +
                "tryAndBuy=" + this.tryAndBuy +
                "}";
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || this.getClass() != other.getClass())
            return false;
        Offer offer = (Offer) other;
        return  Objects.equals(this.id, offer.id) &&
                Objects.equals(this.name, offer.name) &&
                Objects.equals(this.amount, offer.amount) &&
                Objects.equals(this.currency, offer.currency) &&
                Objects.equals(this.displayedAmount, offer.displayedAmount) &&
                Objects.equals(this.termsAndConditions, offer.termsAndConditions) &&
                Objects.equals(this.htmlTermsAndConditions, offer.htmlTermsAndConditions) &&
                Objects.equals(this.textTermsAndConditions, offer.textTermsAndConditions) &&
                Objects.equals(this.tryAndBuy, offer.tryAndBuy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.amount, this.currency, this.displayedAmount,
                            this.termsAndConditions, this.htmlTermsAndConditions, this.textTermsAndConditions,
                            this.tryAndBuy);
    }

}
