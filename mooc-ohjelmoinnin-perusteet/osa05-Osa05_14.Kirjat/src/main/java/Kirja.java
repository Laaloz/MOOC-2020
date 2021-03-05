
public class Kirja {

    private String name;
    private int publicationYear;

    public Kirja(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
        
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Kirja)) {
            return false;
        }
        
        Kirja comparedBook = (Kirja) compared;
        
        if (this.name.equals(comparedBook.name) &&
                this.publicationYear == comparedBook.publicationYear) {
            return true;
        }
        return false;
    }

}