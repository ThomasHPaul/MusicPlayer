import java.io.File;
import java.util.Random;

public class Song {
    private final String title;
    private final String createdBy;
    private Genre genre;
    private SoundClip soundClip;

    public Song(String title, double songDuration, String createdBy) {
        this.title = title;
        this.createdBy = createdBy;
        createSoundClip(songDuration);
    }

    private void createSoundClip(double songDuration) {
        this.soundClip = new SoundClip("Simulated Binary File", songDuration);
    }

    public void setGenre() {}

    private triggerSongCreate() {}
}
