public class Book {
    String nameBook;
    String author;
    int yearPublic;

    public Book(String nameBook, String author, int yearPublic) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearPublic() {
        return this.yearPublic;
    }

    public int setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
        return yearPublic;
    }

}