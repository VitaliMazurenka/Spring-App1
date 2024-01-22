package main.de.ait.music_player;

import main.de.ait.music_player.controller.MusicPlayer;
import main.de.ait.music_player.service.Music;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MusicPlayerSpringAppl {
    public static void main(String[] args) {
        // Сценарий 1 - есть только 1 бин с музыкой и 1 плеер
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("musicBean", Music.class);

        // подключим плеер
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        // Сценарий 2
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer2", MusicPlayer.class);
        musicPlayer2.playMusic();

        context.close();
    }

}

