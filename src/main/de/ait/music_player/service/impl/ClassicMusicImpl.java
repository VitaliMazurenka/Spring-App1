package main.de.ait.music_player.service.impl;

import main.de.ait.music_player.service.Music;

public class ClassicMusicImpl implements Music {
    @Override
    public String getSong() {
        return "Swan Lake";
    }
}
