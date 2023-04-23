public class LabelCompany {

    public LabelCompany() {}

    public void songCreate(Song song) {
        song.assignGenre();
        createRecord();
        addSongToArtistSongPoolOrCreatePool();

    }

    private void addSongToArtistSongPool() {}

    private void createSongPool() {}

    private void createRecord() {}

    public void signArtistLabelContract() {}

}
