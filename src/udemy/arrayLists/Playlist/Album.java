package udemy.arrayLists.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    /*Create a program that implements a playlist of songs.

To start you off, implement the following classes:

1.  Album

    -  It has three fields, two Strings called name and artist, and an ArrayList that holds objects of type Song called songs.

    -  A constructor that accepts two Strings (name of the album and artist). It initialises the fields and instantiates songs.

    -  And three methods, they are:

        -  addSong(), has two parameters of type String (title of song), double (duration of song) and returns a boolean. Returns true if the song was added successfully or false otherwise.

        -  findSong(), has one parameter of type String (title of song) and returns a Song. Returns the Song if it exists, null if it doesn't exists.

        -  addToPlayList(), has two parameters of type int (track number of song in album) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using the track number, or false otherwise.

        -  addToPlayList(), has two parameters of type String (title of song) and LinkedList (the playlist) that holds objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using the name of the song, or false otherwise.

*/
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    public boolean addSong(String title, double duration){
        if(findSong(title)==null){
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }
    private Song findSong (String title){
        for (int i=0; i< songs.size(); i++){
            Song checkedSong = this.songs.get(i);
            if(checkedSong.getTitle().equals(title))
                return checkedSong;
        }
        return null;
    }
    public boolean addToPlayList (int trackNumber, LinkedList<Song> playList){
        int index = trackNumber-1;
        if ((index>=0) && (index <=this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track "+trackNumber);
        return false;
    }
    public boolean addToPlayList (String title, LinkedList<Song> playList){
        Song checkedSong = findSong(title);
        if (checkedSong!=null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song "+title+" is not in this album");
        return false;
    }

}
