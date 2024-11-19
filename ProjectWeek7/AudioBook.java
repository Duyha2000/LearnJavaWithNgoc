package ProjectWeek7;

public class AudioBook extends Book {
    private int duration;
    private String audioFormat;

    public AudioBook(String bookName, int year, double price, String genre, boolean status, int duration,
            String audioFormat) {
        super(bookName, year, price, genre, status);
        this.duration = duration;
        this.audioFormat = audioFormat;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Duration : " + duration +
                "AudioFormat : " + audioFormat;
    }
}