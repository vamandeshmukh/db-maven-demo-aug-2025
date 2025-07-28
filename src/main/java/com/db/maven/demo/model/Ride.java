package com.db.maven.demo.model;


public class Ride {
    private String riderName;
    private String from;
    private String to;
    private Double fare;

    public Ride(String riderName, String from, String to, Double fare) {
        this.riderName = riderName;
        this.from = from;
        this.to = to;
        this.fare = fare;
    }

    public String getRiderName() {
        return riderName;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Double getFare() {
        return fare;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "riderName='" + riderName + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", fare=" + fare +
                '}';
    }
}