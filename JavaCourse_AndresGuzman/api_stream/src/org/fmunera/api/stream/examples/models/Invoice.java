package org.fmunera.api.stream.examples.models;

public class Invoice {

    private String details;
    private User user;

    public Invoice(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
