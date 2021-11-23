package com.example.game.dao;

import com.example.game.pojo.Game;

import java.util.List;

public interface gameDao {
    /**
     * 根据游戏名称查询用户信息
     * @param gamename
     * @return
     */
    public Game queryGameByGamename(String gamename);
    /**
     * 查询所有游戏
     * @return
     */
    public List<Game> queryGames();
    /**
     * 添加游戏
     * @param game
     */
    public int addGame(Game game);
    /**
     * 根据游戏Id查询游戏
     * @param id
     * @return
     */
    public Game queryGameById(Integer id);

}
