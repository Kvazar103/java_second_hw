package tsk3;

public class Book extends Paper {
    private Genre genre;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(int number_of_pages, double weight, Paper_type type, Genre genre, String name) {
        super(number_of_pages, weight, type);
        this.genre=genre;
        this.name=name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "genre=" + genre +'\''+
                super.toString()+
                '}';
    }
}
