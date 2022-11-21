package tsk3;

public class Comics extends Book{
    private double price;

    public Comics(int number_of_pages, double weight, Paper_type type, Genre genre, String name,double price) {
        super(number_of_pages, weight, type, genre, name);
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "price=" + price +'\''+super.toString()+
                '}';
    }
}
