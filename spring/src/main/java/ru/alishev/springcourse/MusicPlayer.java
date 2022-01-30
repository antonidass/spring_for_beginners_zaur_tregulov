package ru.alishev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
public class MusicPlayer {
    private Music music;
    private Music music2;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(@Qualifier("rockMusic") Music music,
                       @Qualifier("classicalMusic") Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    public void playMusic(Enum<MusicEnum> musicEnumEnum) {
        if (musicEnumEnum == MusicEnum.CLASSICAL) {
            System.out.println("Music = " + music2.getSong()[0]);
        } else {
            System.out.println("Music = " + music.getSong()[0]);
        }
    }
}
