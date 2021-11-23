package com.example.game.pojo;

import java.math.BigDecimal;

public class Game {
    private Integer gameid;
    private String gamename;
    private BigDecimal gameprice;
    private String about;
    private String platform;

    public Game() {
    }

    public Game(String gamename, BigDecimal gameprice, String about, String platform) {
        this.gamename = gamename;
        this.gameprice = gameprice;
        this.about = about;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameid=" + gameid +
                ", gamename='" + gamename + '\'' +
                ", gameprice=" + gameprice +
                ", about='" + about + '\'' +
                ", platform='" + platform + '\'' +
                '}';
    }

    public Integer getGameid() {
        return gameid;
    }

    public void setGameid(Integer gameid) {
        this.gameid = gameid;
    }

    public String getGamename() {
        return gamename;
    }

    public void setGamename(String gamename) {
        this.gamename = gamename;
    }

    public BigDecimal getGameprice() {
        return gameprice;
    }

    public void setGameprice(BigDecimal gameprice) {
        this.gameprice = gameprice;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
