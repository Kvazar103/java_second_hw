package tsk3;

public class Paper {
    private int number_of_pages;
    private double weight;
    private Paper_type type;

    public Paper(int number_of_pages, double weight, Paper_type type) {
        this.number_of_pages = number_of_pages;
        this.weight = weight;
        this.type = type;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Paper_type getType() {
        return type;
    }

    public void setType(Paper_type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "number_of_pages=" + number_of_pages +
                ", weight=" + weight +
                ", type=" + type +
                '}';
    }
}
