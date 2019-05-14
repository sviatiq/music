public class Song extends Music{

    private String songName;
    private String songSinger;
    private String album;

    public Song(String genre, String country, String language) {
        super(genre, country, language);
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongSinger() {
        return songSinger;
    }

    public void setSongSinger(String songSinger) {
        this.songSinger = songSinger;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", songSinger='" + songSinger + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
}
