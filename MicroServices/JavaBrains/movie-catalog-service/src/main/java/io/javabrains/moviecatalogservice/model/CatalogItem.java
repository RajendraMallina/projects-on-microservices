package io.javabrains.moviecatalogservice.model;

public class CatalogItem {

    private int id;
    private String movieId;
    private String userId;
    private int rating;

    public CatalogItem(){}

    public CatalogItem(String movieId, String userId, int rating) {
        this.movieId = movieId;
        this.userId = userId;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
