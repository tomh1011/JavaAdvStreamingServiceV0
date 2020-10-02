package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS(),
    OLDER_KIDS("vanaf 7 jaar"),
    TEENS("vanaf 12 jaar"),
    MATURE("vanaf 16 jaar");

    private String maturityRating;
    private int minimumAge;

    Rating() {

    }

    Rating(String maturityRating) {
        this.maturityRating = maturityRating;
    }

    public String getMaturityRating() {
        return maturityRating;
    }

    public int getMinimumAge() {
        return minimumAge;
    }
}