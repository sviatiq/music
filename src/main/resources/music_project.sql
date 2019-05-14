DROP TABLE IF EXISTS Album;
DROP TABLE IF EXISTS Song;
DROP TABLE IF EXISTS Singer;


CREATE TABLE Singer(
  singer_name VARCHAR(40) NOT NULL,
  singer_country VARCHAR(15) NOT NULL,
  PRIMARY KEY(singer_name)
);


CREATE TABLE Song(
  singer_name VARCHAR(40) NOT NULL,
  song_name VARCHAR(40) NOT NULL,
  song_genre varchar(25) NOT NULL,
  PRIMARY KEY(song_name),
  FOREIGN KEY(singer_name) REFERENCES Singer(singer_name)
);

CREATE TABLE Album(
  album_name VARCHAR(30) NOT NULL,
  song_name VARCHAR(40) NOT NULL,
  album_year INTEGER NOT NULL,
  PRIMARY KEY(album_name),
  FOREIGN KEY(song_name) REFERENCES Song(song_name) ON DELETE RESTRICT
);