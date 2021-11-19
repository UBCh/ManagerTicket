package ru.netologi.domain;

public class Ticket implements Comparable<Ticket> {

    private  int id;
    private int price;
    private String departureIATA;
    private String arrivalIATA;
    private int travelTime;

    public Ticket(int id, int price, String departureIATA, String arrivalIATA, int travelTime) {
        this.id = id;
        this.price = price;
        this.departureIATA = departureIATA;
        this.arrivalIATA = arrivalIATA;
        this.travelTime = travelTime;
    }

    public Ticket() {
    }

    @Override
    public int compareTo(Ticket o) {
        int result = compareTo(Ticket o)-price;
        if (result >1){ return +1;};
        if (result < 1){ return -1;}
        return 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepartureIATA() {
        return departureIATA;
    }

    public void setDepartureIATA(String departureIATA) {
        this.departureIATA = departureIATA;
    }

    public String getArrivalIATA() {
        return arrivalIATA;
    }

    public void setArrivalIATA(String arrivalIATA) {
        this.arrivalIATA = arrivalIATA;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }
}
