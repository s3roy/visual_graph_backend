package com.visual_graph.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "articles")
public class DataPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "end_year")
    private Integer endYear;

    @Column(name = "citylng")
    private String cityLng;

    @Column(name = "citylat")
    private String cityLat;

    @Column(name = "Integerensity")
    private Integer Integerensity;

    @Column(name = "sector")
    private String sector;

    @Column(name = "topic")
    private String topic;

    @Column(name = "insight", columnDefinition = "TEXT")
    private String insight;

    @Column(name = "swot", columnDefinition = "TEXT")
    private String swot;

    @Column(name = "url")
    private String url;

    @Column(name = "region")
    private String region;

    @Column(name = "start_year")
    private Integer startYear;

    @Column(name = "impact", columnDefinition = "TEXT")
    private String impact;

    @Column(name = "added")
    private String added;

    @Column(name = "published")
    private String published;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "relevance")
    private Integer relevance;

    @Column(name = "pestle")
    private String pestle;

    @Column(name = "source")
    private String source;

    @Column(name = "title", length = 500) // Increase the length to a suitable value
    private String title;


    @Column(name = "likelihood")
    private Integer likelihood;

    // Constructors, getters, and setters

    public DataPoint() {
    }

    public DataPoint(Integer endYear, String citylng, String citylat, Integer Integerensity, String sector, String topic,
                   String insight, String swot, String url, String region, Integer startYear, String impact, String added,
                   String published, String city, String country, Integer relevance, String pestle, String source,
                   String title, Integer likelihood) {
        this.endYear = endYear;
        this.cityLng = citylng;
        this.cityLat = citylat;
        this.Integerensity = Integerensity;
        this.sector = sector;
        this.topic = topic;
        this.insight = insight;
        this.swot = swot;
        this.url = url;
        this.region = region;
        this.startYear = startYear;
        this.impact = impact;
        this.added = added;
        this.published = published;
        this.city = city;
        this.country = country;
        this.relevance = relevance;
        this.pestle = pestle;
        this.source = source;
        this.title = title;
        this.likelihood = likelihood;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public String getCitylng() {
        return cityLng;
    }

    public void setCitylng(String citylng) {
        this.cityLng = citylng;
    }

    public String getCitylat() {
        return cityLat;
    }

    public void setCitylat(String citylat) {
        this.cityLat = citylat;
    }

    public Integer getIntensity() {
        return Integerensity;
    }

    public void setIntensity(Integer Integerensity) {
        this.Integerensity = Integerensity;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getInsight() {
        return insight;
    }

    public void setInsight(String insight) {
        this.insight = insight;
    }

    public String getSwot() {
        return swot;
    }

    public void setSwot(String swot) {
        this.swot = swot;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getRelevance() {
        return relevance;
    }

    public void setRelevance(Integer relevance) {
        this.relevance = relevance;
    }

    public String getPestle() {
        return pestle;
    }

    public void setPestle(String pestle) {
        this.pestle = pestle;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(Integer likelihood) {
        this.likelihood = likelihood;
    }
}

