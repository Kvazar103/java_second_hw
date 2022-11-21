package tsk3;

public class Magazine extends Comics{
    private  Magazine_genre magazine_genre;

    public Magazine(int number_of_pages, double weight, Paper_type type, Genre genre, String name, double price,Magazine_genre magazine_genre) {
        super(number_of_pages, weight, type, genre, name, price);
        this.magazine_genre=magazine_genre;
    }

    public Magazine_genre getMagazine_genre() {
        return magazine_genre;
    }

    public void setMagazine_genre(Magazine_genre magazine_genre) {
        this.magazine_genre = magazine_genre;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "magazine_genre=" + magazine_genre +
                '}';
    }
}
