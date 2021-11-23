package com.example.game.dao.impl;

import com.example.game.dao.gameDao;
import com.example.game.pojo.Game;

import java.util.List;

public class gameDaoImpl extends baseDao implements gameDao {
    @Override
    public Game queryGameByGamename(String gamename) {
        String sql = "select * from game where gamename = ?";
        return queryForOne(Game.class,sql,gamename);
    }

    @Override
    public List<Game> queryGames() {
        String sql = "select * from game";
        return queryForList(Game.class,sql);
    }

    @Override
    public int addGame(Game game) {
        String sql = "insert into game('gamename','gameprice','about','platform') values(?,?,?,?)";
        return update(sql,game.getGamename(),game.getGameprice(),game.getAbout(),game.getPlatform());
    }

    @Override
    public Game queryGameById(Integer id) {
        String sql = "select * from game where id = ?";
        return queryForOne(Game.class,sql,id);
    }
}
