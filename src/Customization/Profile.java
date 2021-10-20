package Customization;

import Platform.Component.Show;

public class Profile {

    private String name;

    private MaturityLevel level_restriction;

    private String email;

    private boolean toNotify;

    private String language;

    private Playback playback; // I think Enum or another Class

    private boolean subtitles;

    private Show favorites; // List or Array or Enum

    private Show blocked; // List or Array or Enum

    private Language subtitle_lang; // List or Array or Enum

    public Profile(String name, MaturityLevel level_restriction, String email, boolean toNotify, String language, Playback playback, boolean subtitles, Language subtitle_lang) {
        this.name = name;
        this.level_restriction = level_restriction;
        this.email = email;
        this.toNotify = toNotify;
        this.language = language;
        this.playback = playback;
        this.subtitles = subtitles;
        this.subtitle_lang = subtitle_lang;
    }
    
    
    public void modify_maturity() {
    }

    public void add_favorite() {
    }
}
