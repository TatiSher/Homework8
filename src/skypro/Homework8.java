package skypro;

public class Homework8 {

    public static void main(String[] args) {
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813);
        Author janeAustin = new Author("Jane Austin");
        System.out.println(prideAndPrejudice.getBookTitle() + ", " + janeAustin.getAuthorName() + ", " + prideAndPrejudice.getPublicationYear());
        prideAndPrejudice.setPublicationYear(1977);
        System.out.println(prideAndPrejudice.getBookTitle() + ", " + janeAustin.getAuthorName() + ", " + prideAndPrejudice.getPublicationYear());

        Book greatGatsby  = new Book("The Great Gatsby", 1998);
        Author scottFitzgerald = new Author("F. Scott Fitzgerald");
        System.out.println(greatGatsby.getBookTitle() + ", " + scottFitzgerald.getAuthorName() + ", " + greatGatsby.getPublicationYear());
        greatGatsby.setPublicationYear(2020);
        System.out.println(greatGatsby.getBookTitle() + ", " + scottFitzgerald.getAuthorName() + ", " + greatGatsby.getPublicationYear());
    }
}
