package wangtuo.domain.statistics;

import wangtuo.domain.core.Game;
import wangtuo.domain.core.Player;

/**
 * 比赛-球员 数据统计
 * @author wangtuo0k
 *
 */
public class GamePlayerStatistics {
	private String id;

	// 球员
	private Player player;

	// 比赛
	private Game game;

	// 得分
	private Integer points;

	// 篮板
	private Integer rebounds;

	// 助攻
	private Integer assists;

	// 失误
	private Integer turnovers;

	// 抢断
	private Integer steals;

	// 盖帽
	private Integer blocks;

	// 犯规
	private Integer fouls;

	// 投三分球
	private Integer threeThrowAttempts;

	// 命中三分球
	private Integer threeThrowGoals;

	// 投两分球
	private Integer twoThrowAttempts;

	// 命中两分球
	private Integer twoThrowGoals;

	// 投罚篮
	private Integer freeThrowAttempts;

	// 命中罚篮
	private Integer freeThrowGoals;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getRebounds() {
		return rebounds;
	}

	public void setRebounds(Integer rebounds) {
		this.rebounds = rebounds;
	}

	public Integer getAssists() {
		return assists;
	}

	public void setAssists(Integer assists) {
		this.assists = assists;
	}

	public Integer getTurnovers() {
		return turnovers;
	}

	public void setTurnovers(Integer turnovers) {
		this.turnovers = turnovers;
	}

	public Integer getSteals() {
		return steals;
	}

	public void setSteals(Integer steals) {
		this.steals = steals;
	}

	public Integer getBlocks() {
		return blocks;
	}

	public void setBlocks(Integer blocks) {
		this.blocks = blocks;
	}

	public Integer getFouls() {
		return fouls;
	}

	public void setFouls(Integer fouls) {
		this.fouls = fouls;
	}

	public Integer getThreeThrowAttempts() {
		return threeThrowAttempts;
	}

	public void setThreeThrowAttempts(Integer threeThrowAttempts) {
		this.threeThrowAttempts = threeThrowAttempts;
	}

	public Integer getThreeThrowGoals() {
		return threeThrowGoals;
	}

	public void setThreeThrowGoals(Integer threeThrowGoals) {
		this.threeThrowGoals = threeThrowGoals;
	}

	public Integer getTwoThrowAttempts() {
		return twoThrowAttempts;
	}

	public void setTwoThrowAttempts(Integer twoThrowAttempts) {
		this.twoThrowAttempts = twoThrowAttempts;
	}

	public Integer getTwoThrowGoals() {
		return twoThrowGoals;
	}

	public void setTwoThrowGoals(Integer twoThrowGoals) {
		this.twoThrowGoals = twoThrowGoals;
	}

	public Integer getFreeThrowAttempts() {
		return freeThrowAttempts;
	}

	public void setFreeThrowAttempts(Integer freeThrowAttempts) {
		this.freeThrowAttempts = freeThrowAttempts;
	}

	public Integer getFreeThrowGoals() {
		return freeThrowGoals;
	}

	public void setFreeThrowGoals(Integer freeThrowGoals) {
		this.freeThrowGoals = freeThrowGoals;
	}

	@Override
	public String toString() {
		return "GamePlayerStatistics [id=" + id + ", player=" + player + ", game=" + game + ", points=" + points
				+ ", rebounds=" + rebounds + ", assists=" + assists + ", turnovers=" + turnovers + ", steals=" + steals
				+ ", blocks=" + blocks + ", fouls=" + fouls + ", threeThrowAttempts=" + threeThrowAttempts
				+ ", threeThrowGoals=" + threeThrowGoals + ", twoThrowAttempts=" + twoThrowAttempts + ", twoThrowGoals="
				+ twoThrowGoals + ", freeThrowAttempts=" + freeThrowAttempts + ", freeThrowGoals=" + freeThrowGoals
				+ "]";
	}
}
