public abstract class Music {

    private String genre;
    private String country;
    private String language;


    public Music() {
    }

    public Music(String genre, String country, String language) {
        this.genre = genre;
        this.country = country;
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
