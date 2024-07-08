package dip.solution;

public class Movie {

    private final String name;
    private Category category;

    public Movie(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = new DramaCategory();
    }
}
