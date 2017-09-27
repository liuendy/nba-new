package wangtuo.domain.statistics;

import wangtuo.domain.core.Game;
import wangtuo.domain.core.Team;

/**
 * 比赛-球队 数据统计
 * @author wangtuo0k
 *
 */
public class GameTeamStatistics {
	private String id;
	
	// 球队
	private Team team;
	
	// 比赛
	private Game game;
	
	// 总比赛场数
	private Integer games;
	
	// 得分
	private Integer points;
	
	// 失分
	private Integer opponentPoints;
	
	// 篮板
	private Integer rebounds;
	
	// 失篮板
	private Integer opponentRebounds;

	// 助攻
	private Integer assists;

	// 对方助攻
	private Integer opponentAssists;

	// 失误
	private Integer turnovers;

	// 对方失误
	private Integer opponentTurnovers;

	// 抢断
	private Integer steals;

	// 被抢断
	private Integer opponnentSteals;

	// 盖帽
	private Integer blocks;

	// 被盖帽
	private Integer opponentBlocks;

	// 犯规
	private Integer fouls;

	// 被犯规
	private Integer opponentFouls;

	// 投三分球
	private Integer threeThrowAttempts;
	
	// 对方投三分球
	private Integer opponentThreeThrowAttempts;

	// 命中三分球
	private Integer threeThrowGoals;

	// 对方命中三分球
	private Integer opponentThreeThrowGoals;

	// 投两分球
	private Integer twoThrowAttempts;

	// 对方投两分球
	private Integer opponentTwoThrowAttempts;

	// 命中两分球
	private Integer twoThrowGoals;

	// 对方命中两分球
	private Integer oppoentTwoThrowGoals;

	// 投罚篮
	private Integer freeThrowAttempts;

	// 对方投罚篮
	private Integer opponentFreeThrowAttempts;

	// 命中罚篮
	private Integer freeThrowGoals;

	// 对方命中罚篮
	private Integer opponentFreeThrowGoals;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Integer getGames() {
		return games;
	}

	public void setGames(Integer games) {
		this.games = games;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getOpponentPoints() {
		return opponentPoints;
	}

	public void setOpponentPoints(Integer opponentPoints) {
		this.opponentPoints = opponentPoints;
	}

	public Integer getRebounds() {
		return rebounds;
	}

	public void setRebounds(Integer rebounds) {
		this.rebounds = rebounds;
	}

	public Integer getOpponentRebounds() {
		return opponentRebounds;
	}

	public void setOpponentRebounds(Integer opponentRebounds) {
		this.opponentRebounds = opponentRebounds;
	}

	public Integer getAssists() {
		return assists;
	}

	public void setAssists(Integer assists) {
		this.assists = assists;
	}

	public Integer getOpponentAssists() {
		return opponentAssists;
	}

	public void setOpponentAssists(Integer opponentAssists) {
		this.opponentAssists = opponentAssists;
	}

	public Integer getTurnovers() {
		return turnovers;
	}

	public void setTurnovers(Integer turnovers) {
		this.turnovers = turnovers;
	}

	public Integer getOpponentTurnovers() {
		return opponentTurnovers;
	}

	public void setOpponentTurnovers(Integer opponentTurnovers) {
		this.opponentTurnovers = opponentTurnovers;
	}

	public Integer getSteals() {
		return steals;
	}

	public void setSteals(Integer steals) {
		this.steals = steals;
	}

	public Integer getOpponnentSteals() {
		return opponnentSteals;
	}

	public void setOpponnentSteals(Integer opponnentSteals) {
		this.opponnentSteals = opponnentSteals;
	}

	public Integer getBlocks() {
		return blocks;
	}

	public void setBlocks(Integer blocks) {
		this.blocks = blocks;
	}

	public Integer getOpponentBlocks() {
		return opponentBlocks;
	}

	public void setOpponentBlocks(Integer opponentBlocks) {
		this.opponentBlocks = opponentBlocks;
	}

	public Integer getFouls() {
		return fouls;
	}

	public void setFouls(Integer fouls) {
		this.fouls = fouls;
	}

	public Integer getOpponentFouls() {
		return opponentFouls;
	}

	public void setOpponentFouls(Integer opponentFouls) {
		this.opponentFouls = opponentFouls;
	}

	public Integer getThreeThrowAttempts() {
		return threeThrowAttempts;
	}

	public void setThreeThrowAttempts(Integer threeThrowAttempts) {
		this.threeThrowAttempts = threeThrowAttempts;
	}

	public Integer getOpponentThreeThrowAttempts() {
		return opponentThreeThrowAttempts;
	}

	public void setOpponentThreeThrowAttempts(Integer opponentThreeThrowAttempts) {
		this.opponentThreeThrowAttempts = opponentThreeThrowAttempts;
	}

	public Integer getThreeThrowGoals() {
		return threeThrowGoals;
	}

	public void setThreeThrowGoals(Integer threeThrowGoals) {
		this.threeThrowGoals = threeThrowGoals;
	}

	public Integer getOpponentThreeThrowGoals() {
		return opponentThreeThrowGoals;
	}

	public void setOpponentThreeThrowGoals(Integer opponentThreeThrowGoals) {
		this.opponentThreeThrowGoals = opponentThreeThrowGoals;
	}

	public Integer getTwoThrowAttempts() {
		return twoThrowAttempts;
	}

	public void setTwoThrowAttempts(Integer twoThrowAttempts) {
		this.twoThrowAttempts = twoThrowAttempts;
	}

	public Integer getOpponentTwoThrowAttempts() {
		return opponentTwoThrowAttempts;
	}

	public void setOpponentTwoThrowAttempts(Integer opponentTwoThrowAttempts) {
		this.opponentTwoThrowAttempts = opponentTwoThrowAttempts;
	}

	public Integer getTwoThrowGoals() {
		return twoThrowGoals;
	}

	public void setTwoThrowGoals(Integer twoThrowGoals) {
		this.twoThrowGoals = twoThrowGoals;
	}

	public Integer getOppoentTwoThrowGoals() {
		return oppoentTwoThrowGoals;
	}

	public void setOppoentTwoThrowGoals(Integer oppoentTwoThrowGoals) {
		this.oppoentTwoThrowGoals = oppoentTwoThrowGoals;
	}

	public Integer getFreeThrowAttempts() {
		return freeThrowAttempts;
	}

	public void setFreeThrowAttempts(Integer freeThrowAttempts) {
		this.freeThrowAttempts = freeThrowAttempts;
	}

	public Integer getOpponentFreeThrowAttempts() {
		return opponentFreeThrowAttempts;
	}

	public void setOpponentFreeThrowAttempts(Integer opponentFreeThrowAttempts) {
		this.opponentFreeThrowAttempts = opponentFreeThrowAttempts;
	}

	public Integer getFreeThrowGoals() {
		return freeThrowGoals;
	}

	public void setFreeThrowGoals(Integer freeThrowGoals) {
		this.freeThrowGoals = freeThrowGoals;
	}

	public Integer getOpponentFreeThrowGoals() {
		return opponentFreeThrowGoals;
	}

	public void setOpponentFreeThrowGoals(Integer opponentFreeThrowGoals) {
		this.opponentFreeThrowGoals = opponentFreeThrowGoals;
	}

	@Override
	public String toString() {
		return "GameTeamStatistics [id=" + id + ", team=" + team + ", game=" + game + ", games=" + games + ", points="
				+ points + ", opponentPoints=" + opponentPoints + ", rebounds=" + rebounds + ", opponentRebounds="
				+ opponentRebounds + ", assists=" + assists + ", opponentAssists=" + opponentAssists + ", turnovers="
				+ turnovers + ", opponentTurnovers=" + opponentTurnovers + ", steals=" + steals + ", opponnentSteals="
				+ opponnentSteals + ", blocks=" + blocks + ", opponentBlocks=" + opponentBlocks + ", fouls=" + fouls
				+ ", opponentFouls=" + opponentFouls + ", threeThrowAttempts=" + threeThrowAttempts
				+ ", opponentThreeThrowAttempts=" + opponentThreeThrowAttempts + ", threeThrowGoals=" + threeThrowGoals
				+ ", opponentThreeThrowGoals=" + opponentThreeThrowGoals + ", twoThrowAttempts=" + twoThrowAttempts
				+ ", opponentTwoThrowAttempts=" + opponentTwoThrowAttempts + ", twoThrowGoals=" + twoThrowGoals
				+ ", oppoentTwoThrowGoals=" + oppoentTwoThrowGoals + ", freeThrowAttempts=" + freeThrowAttempts
				+ ", opponentFreeThrowAttempts=" + opponentFreeThrowAttempts + ", freeThrowGoals=" + freeThrowGoals
				+ ", opponentFreeThrowGoals=" + opponentFreeThrowGoals + "]";
	}
}
