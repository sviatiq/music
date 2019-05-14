public class Country {


    private String language;
    private char currency;

    public Country() {
    }

    public Country(String language, char currency) {
        this.language = language;
        this.currency = currency;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public char getCurrency() {
        return currency;
    }

    public void setCurrency(char currency) {
        this.currency = currency;
    }


}
