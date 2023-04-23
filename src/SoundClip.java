import java.util.Random;

public class SoundClip {
    private final String fileByte;
    private final FileType fileType;
    private final double songDuration;
    private Random fileTypePicker;

    public SoundClip(String fileByte, double songDuration) {
        this.fileByte = fileByte;
        this.fileType = getRandomFileType(); //Simulated
        this.songDuration = songDuration;
        this.fileTypePicker = new Random();
    }

    public FileType getFileType() {
        return this.fileType;
    }

    public double getSongDuration() {
        return this.songDuration;
    }

    private FileType getRandomFileType() {
        int fileTypeNum = fileTypePicker.nextInt(FileType.values().length);
        return FileType.values()[fileTypeNum];
    }

}
