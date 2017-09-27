package wangtuo.domain.statistics;

import org.springframework.data.annotation.Transient;

import wangtuo.domain.core.Season;
import wangtuo.domain.core.Team;

/**
 * 赛季-球队 数据统计
 * 
 * @author wangtuo0k
 *
 */
public class SeasonTeamStatistics {
	private String id;
	
	// 球队
	private Team team;
	
	// 赛季
	private Season season;
	
	// 总比赛场数
	private Integer games;
	
	// 主场比赛数
	private Integer homeGames;
	
	// 胜场数
	private Integer wins;
	
	// 主场胜场数
	private Integer homeWins;
	
	// 总得分
	private Integer points;
	
	// 最高得分
	@Transient
	private Integer highestPoints;
	
	// 总失分
	private Integer opponentPoints;
	
	// 最高失分
	@Transient
	private Integer highestOpponentPoints;
	
	// 总篮板
	private Integer rebounds;

	// 最高篮板
	@Transient
	private Integer highestRebounds;

	// 总失篮板
	private Integer opponentRebounds;

	// 最高篮板
	@Transient
	private Integer highestOpponentRebounds;
	
	// 助攻
	private Integer assists;

	// 最高助攻
	@Transient
	private Integer highestAssists;

	// 对方助攻
	private Integer opponentAssists;

	// 最高对方失助攻
	@Transient
	private Integer highestOpponentAssists;

	// 失误
	private Integer turnovers;

	// 最高失误
	@Transient
	private Integer highestTurnovers;

	// 对方失误
	private Integer opponentTurnovers;

	// 最高对方失误
	@Transient
	private Integer highestOpponentTurnovers;

	// 抢断
	private Integer steals;

	// 最高抢断
	@Transient
	private Integer highestSteals;

	// 被抢断
	private Integer opponnentSteals;

	// 最高被抢断
	@Transient
	private Integer highestOpponentSteals;

	// 盖帽
	private Integer blocks;

	// 最高盖帽
	@Transient
	private Integer highestBlocks;

	// 被盖帽
	private Integer opponentBlocks;

	// 最高被盖帽
	@Transient
	private Integer highestOpponentBlocks;

	// 犯规
	private Integer fouls;

	// 最高犯规
	@Transient
	private Integer highestfouls;

	// 被犯规
	private Integer opponentFouls;

	// 最高被犯规
	@Transient
	private Integer highestOpponentfouls;

	// 投三分球
	private Integer threeThrowAttempts;

	// 最高投三分球数
	@Transient
	private Integer highestThreeThrowAttempts;
	
	// 对方投三分球
	private Integer opponentThreeThrowAttempts;

	// 最高对方投三分球数
	@Transient
	private Integer highestOpponentThreeThrowAttempts;

	// 命中三分球
	private Integer threeThrowGoals;

	// 最高命中三分球数
	@Transient
	private Integer highestThreeThrowGoals;

	// 对方命中三分球
	private Integer opponentThreeThrowGoals;

	// 最高对方命中三分球数
	@Transient
	private Integer highestOpponentThreeThrowGoals;

	// 投两分球
	private Integer twoThrowAttempts;

	// 最高投两分球数
	@Transient
	private Integer highestTwoThrowAttempts;

	// 对方投两分球
	private Integer opponentTwoThrowAttempts;

	// 最高对方投两分球数
	@Transient
	private Integer highestOpponentTwoThrowAttempts;

	// 命中两分球
	private Integer twoThrowGoals;

	// 最高命中两分球数
	@Transient
	private Integer highestTwoThrowGoals;

	// 对方命中两分球
	private Integer oppoentTwoThrowGoals;

	// 最高对方命中两分球数
	@Transient
	private Integer highestOpponentTwoThrowGoals;

	// 投罚篮
	private Integer freeThrowAttempts;

	// 最高投罚篮数
	@Transient
	private Integer highestFreeThrowAttempts;

	// 对方投罚篮
	private Integer opponentFreeThrowAttempts;

	// 最高对方投罚篮数
	@Transient
	private Integer highestOpponentFreeThrowAttempts;

	// 命中罚篮
	private Integer freeThrowGoals;

	// 最高命中罚篮数
	@Transient
	private Integer highestFreeThrowGoals;

	// 对方命中罚篮
	private Integer opponentFreeThrowGoals;

	// 最高对方命中罚篮数
	@Transient
	private Integer highestOpponentFreeThrowGoals;

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

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public Integer getGames() {
		return games;
	}

	public void setGames(Integer games) {
		this.games = games;
	}

	public Integer getHomeGames() {
		return homeGames;
	}

	public void setHomeGames(Integer homeGames) {
		this.homeGames = homeGames;
	}

	public Integer getWins() {
		return wins;
	}

	public void setWins(Integer wins) {
		this.wins = wins;
	}

	public Integer getHomeWins() {
		return homeWins;
	}

	public void setHomeWins(Integer homeWins) {
		this.homeWins = homeWins;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Integer getHighestPoints() {
		return highestPoints;
	}

	public void setHighestPoints(Integer highestPoints) {
		this.highestPoints = highestPoints;
	}

	public Integer getOpponentPoints() {
		return opponentPoints;
	}

	public void setOpponentPoints(Integer opponentPoints) {
		this.opponentPoints = opponentPoints;
	}

	public Integer getHighestOpponentPoints() {
		return highestOpponentPoints;
	}

	public void setHighestOpponentPoints(Integer highestOpponentPoints) {
		this.highestOpponentPoints = highestOpponentPoints;
	}

	public Integer getRebounds() {
		return rebounds;
	}

	public void setRebounds(Integer rebounds) {
		this.rebounds = rebounds;
	}

	public Integer getHighestRebounds() {
		return highestRebounds;
	}

	public void setHighestRebounds(Integer highestRebounds) {
		this.highestRebounds = highestRebounds;
	}

	public Integer getHighestOpponentRebounds() {
		return highestOpponentRebounds;
	}

	public void setHighestOpponentRebounds(Integer highestOpponentRebounds) {
		this.highestOpponentRebounds = highestOpponentRebounds;
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

	public Integer getHighestAssists() {
		return highestAssists;
	}

	public void setHighestAssists(Integer highestAssists) {
		this.highestAssists = highestAssists;
	}

	public Integer getOpponentAssists() {
		return opponentAssists;
	}

	public void setOpponentAssists(Integer opponentAssists) {
		this.opponentAssists = opponentAssists;
	}

	public Integer getHighestOpponentAssists() {
		return highestOpponentAssists;
	}

	public void setHighestOpponentAssists(Integer highestOpponentAssists) {
		this.highestOpponentAssists = highestOpponentAssists;
	}

	public Integer getTurnovers() {
		return turnovers;
	}

	public void setTurnovers(Integer turnovers) {
		this.turnovers = turnovers;
	}

	public Integer getHighestTurnovers() {
		return highestTurnovers;
	}

	public void setHighestTurnovers(Integer highestTurnovers) {
		this.highestTurnovers = highestTurnovers;
	}

	public Integer getOpponentTurnovers() {
		return opponentTurnovers;
	}

	public void setOpponentTurnovers(Integer opponentTurnovers) {
		this.opponentTurnovers = opponentTurnovers;
	}

	public Integer getHighestOpponentTurnovers() {
		return highestOpponentTurnovers;
	}

	public void setHighestOpponentTurnovers(Integer highestOpponentTurnovers) {
		this.highestOpponentTurnovers = highestOpponentTurnovers;
	}

	public Integer getSteals() {
		return steals;
	}

	public void setSteals(Integer steals) {
		this.steals = steals;
	}

	public Integer getHighestSteals() {
		return highestSteals;
	}

	public void setHighestSteals(Integer highestSteals) {
		this.highestSteals = highestSteals;
	}

	public Integer getOpponnentSteals() {
		return opponnentSteals;
	}

	public void setOpponnentSteals(Integer opponnentSteals) {
		this.opponnentSteals = opponnentSteals;
	}

	public Integer getHighestOpponentSteals() {
		return highestOpponentSteals;
	}

	public void setHighestOpponentSteals(Integer highestOpponentSteals) {
		this.highestOpponentSteals = highestOpponentSteals;
	}

	public Integer getBlocks() {
		return blocks;
	}

	public void setBlocks(Integer blocks) {
		this.blocks = blocks;
	}

	public Integer getHighestBlocks() {
		return highestBlocks;
	}

	public void setHighestBlocks(Integer highestBlocks) {
		this.highestBlocks = highestBlocks;
	}

	public Integer getOpponentBlocks() {
		return opponentBlocks;
	}

	public void setOpponentBlocks(Integer opponentBlocks) {
		this.opponentBlocks = opponentBlocks;
	}

	public Integer getHighestOpponentBlocks() {
		return highestOpponentBlocks;
	}

	public void setHighestOpponentBlocks(Integer highestOpponentBlocks) {
		this.highestOpponentBlocks = highestOpponentBlocks;
	}

	public Integer getFouls() {
		return fouls;
	}

	public void setFouls(Integer fouls) {
		this.fouls = fouls;
	}

	public Integer getHighestfouls() {
		return highestfouls;
	}

	public void setHighestfouls(Integer highestfouls) {
		this.highestfouls = highestfouls;
	}

	public Integer getOpponentFouls() {
		return opponentFouls;
	}

	public void setOpponentFouls(Integer opponentFouls) {
		this.opponentFouls = opponentFouls;
	}

	public Integer getHighestOpponentfouls() {
		return highestOpponentfouls;
	}

	public void setHighestOpponentfouls(Integer highestOpponentfouls) {
		this.highestOpponentfouls = highestOpponentfouls;
	}

	public Integer getThreeThrowAttempts() {
		return threeThrowAttempts;
	}

	public void setThreeThrowAttempts(Integer threeThrowAttempts) {
		this.threeThrowAttempts = threeThrowAttempts;
	}

	public Integer getHighestThreeThrowAttempts() {
		return highestThreeThrowAttempts;
	}

	public void setHighestThreeThrowAttempts(Integer highestThreeThrowAttempts) {
		this.highestThreeThrowAttempts = highestThreeThrowAttempts;
	}

	public Integer getOpponentThreeThrowAttempts() {
		return opponentThreeThrowAttempts;
	}

	public void setOpponentThreeThrowAttempts(Integer opponentThreeThrowAttempts) {
		this.opponentThreeThrowAttempts = opponentThreeThrowAttempts;
	}

	public Integer getHighestOpponentThreeThrowAttempts() {
		return highestOpponentThreeThrowAttempts;
	}

	public void setHighestOpponentThreeThrowAttempts(Integer highestOpponentThreeThrowAttempts) {
		this.highestOpponentThreeThrowAttempts = highestOpponentThreeThrowAttempts;
	}

	public Integer getThreeThrowGoals() {
		return threeThrowGoals;
	}

	public void setThreeThrowGoals(Integer threeThrowGoals) {
		this.threeThrowGoals = threeThrowGoals;
	}

	public Integer getHighestThreeThrowGoals() {
		return highestThreeThrowGoals;
	}

	public void setHighestThreeThrowGoals(Integer highestThreeThrowGoals) {
		this.highestThreeThrowGoals = highestThreeThrowGoals;
	}

	public Integer getOpponentThreeThrowGoals() {
		return opponentThreeThrowGoals;
	}

	public void setOpponentThreeThrowGoals(Integer opponentThreeThrowGoals) {
		this.opponentThreeThrowGoals = opponentThreeThrowGoals;
	}

	public Integer getHighestOpponentThreeThrowGoals() {
		return highestOpponentThreeThrowGoals;
	}

	public void setHighestOpponentThreeThrowGoals(Integer highestOpponentThreeThrowGoals) {
		this.highestOpponentThreeThrowGoals = highestOpponentThreeThrowGoals;
	}

	public Integer getTwoThrowAttempts() {
		return twoThrowAttempts;
	}

	public void setTwoThrowAttempts(Integer twoThrowAttempts) {
		this.twoThrowAttempts = twoThrowAttempts;
	}

	public Integer getHighestTwoThrowAttempts() {
		return highestTwoThrowAttempts;
	}

	public void setHighestTwoThrowAttempts(Integer highestTwoThrowAttempts) {
		this.highestTwoThrowAttempts = highestTwoThrowAttempts;
	}

	public Integer getOpponentTwoThrowAttempts() {
		return opponentTwoThrowAttempts;
	}

	public void setOpponentTwoThrowAttempts(Integer opponentTwoThrowAttempts) {
		this.opponentTwoThrowAttempts = opponentTwoThrowAttempts;
	}

	public Integer getHighestOpponentTwoThrowAttempts() {
		return highestOpponentTwoThrowAttempts;
	}

	public void setHighestOpponentTwoThrowAttempts(Integer highestOpponentTwoThrowAttempts) {
		this.highestOpponentTwoThrowAttempts = highestOpponentTwoThrowAttempts;
	}

	public Integer getTwoThrowGoals() {
		return twoThrowGoals;
	}

	public void setTwoThrowGoals(Integer twoThrowGoals) {
		this.twoThrowGoals = twoThrowGoals;
	}

	public Integer getHighestTwoThrowGoals() {
		return highestTwoThrowGoals;
	}

	public void setHighestTwoThrowGoals(Integer highestTwoThrowGoals) {
		this.highestTwoThrowGoals = highestTwoThrowGoals;
	}

	public Integer getOppoentTwoThrowGoals() {
		return oppoentTwoThrowGoals;
	}

	public void setOppoentTwoThrowGoals(Integer oppoentTwoThrowGoals) {
		this.oppoentTwoThrowGoals = oppoentTwoThrowGoals;
	}

	public Integer getHighestOpponentTwoThrowGoals() {
		return highestOpponentTwoThrowGoals;
	}

	public void setHighestOpponentTwoThrowGoals(Integer highestOpponentTwoThrowGoals) {
		this.highestOpponentTwoThrowGoals = highestOpponentTwoThrowGoals;
	}

	public Integer getFreeThrowAttempts() {
		return freeThrowAttempts;
	}

	public void setFreeThrowAttempts(Integer freeThrowAttempts) {
		this.freeThrowAttempts = freeThrowAttempts;
	}

	public Integer getHighestFreeThrowAttempts() {
		return highestFreeThrowAttempts;
	}

	public void setHighestFreeThrowAttempts(Integer highestFreeThrowAttempts) {
		this.highestFreeThrowAttempts = highestFreeThrowAttempts;
	}

	public Integer getOpponentFreeThrowAttempts() {
		return opponentFreeThrowAttempts;
	}

	public void setOpponentFreeThrowAttempts(Integer opponentFreeThrowAttempts) {
		this.opponentFreeThrowAttempts = opponentFreeThrowAttempts;
	}

	public Integer getHighestOpponentFreeThrowAttempts() {
		return highestOpponentFreeThrowAttempts;
	}

	public void setHighestOpponentFreeThrowAttempts(Integer highestOpponentFreeThrowAttempts) {
		this.highestOpponentFreeThrowAttempts = highestOpponentFreeThrowAttempts;
	}

	public Integer getFreeThrowGoals() {
		return freeThrowGoals;
	}

	public void setFreeThrowGoals(Integer freeThrowGoals) {
		this.freeThrowGoals = freeThrowGoals;
	}

	public Integer getHighestFreeThrowGoals() {
		return highestFreeThrowGoals;
	}

	public void setHighestFreeThrowGoals(Integer highestFreeThrowGoals) {
		this.highestFreeThrowGoals = highestFreeThrowGoals;
	}

	public Integer getOpponentFreeThrowGoals() {
		return opponentFreeThrowGoals;
	}

	public void setOpponentFreeThrowGoals(Integer opponentFreeThrowGoals) {
		this.opponentFreeThrowGoals = opponentFreeThrowGoals;
	}

	public Integer getHighestOpponentFreeThrowGoals() {
		return highestOpponentFreeThrowGoals;
	}

	public void setHighestOpponentFreeThrowGoals(Integer highestOpponentFreeThrowGoals) {
		this.highestOpponentFreeThrowGoals = highestOpponentFreeThrowGoals;
	}

	@Override
	public String toString() {
		return "SeasonTeamStatistics [id=" + id + ", team=" + team + ", season=" + season + ", games=" + games
				+ ", homeGames=" + homeGames + ", wins=" + wins + ", homeWins=" + homeWins + ", points=" + points
				+ ", highestPoints=" + highestPoints + ", opponentPoints=" + opponentPoints + ", highestOpponentPoints="
				+ highestOpponentPoints + ", rebounds=" + rebounds + ", highestRebounds=" + highestRebounds
				+ ", highestOpponentRebounds=" + highestOpponentRebounds + ", opponentRebounds=" + opponentRebounds
				+ ", assists=" + assists + ", highestAssists=" + highestAssists + ", opponentAssists=" + opponentAssists
				+ ", highestOpponentAssists=" + highestOpponentAssists + ", turnovers=" + turnovers
				+ ", highestTurnovers=" + highestTurnovers + ", opponentTurnovers=" + opponentTurnovers
				+ ", highestOpponentTurnovers=" + highestOpponentTurnovers + ", steals=" + steals + ", highestSteals="
				+ highestSteals + ", opponnentSteals=" + opponnentSteals + ", highestOpponentSteals="
				+ highestOpponentSteals + ", blocks=" + blocks + ", highestBlocks=" + highestBlocks
				+ ", opponentBlocks=" + opponentBlocks + ", highestOpponentBlocks=" + highestOpponentBlocks + ", fouls="
				+ fouls + ", highestfouls=" + highestfouls + ", opponentFouls=" + opponentFouls
				+ ", highestOpponentfouls=" + highestOpponentfouls + ", threeThrowAttempts=" + threeThrowAttempts
				+ ", highestThreeThrowAttempts=" + highestThreeThrowAttempts + ", opponentThreeThrowAttempts="
				+ opponentThreeThrowAttempts + ", highestOpponentThreeThrowAttempts="
				+ highestOpponentThreeThrowAttempts + ", threeThrowGoals=" + threeThrowGoals
				+ ", highestThreeThrowGoals=" + highestThreeThrowGoals + ", opponentThreeThrowGoals="
				+ opponentThreeThrowGoals + ", highestOpponentThreeThrowGoals=" + highestOpponentThreeThrowGoals
				+ ", twoThrowAttempts=" + twoThrowAttempts + ", highestTwoThrowAttempts=" + highestTwoThrowAttempts
				+ ", opponentTwoThrowAttempts=" + opponentTwoThrowAttempts + ", highestOpponentTwoThrowAttempts="
				+ highestOpponentTwoThrowAttempts + ", twoThrowGoals=" + twoThrowGoals + ", highestTwoThrowGoals="
				+ highestTwoThrowGoals + ", oppoentTwoThrowGoals=" + oppoentTwoThrowGoals
				+ ", highestOpponentTwoThrowGoals=" + highestOpponentTwoThrowGoals + ", freeThrowAttempts="
				+ freeThrowAttempts + ", highestFreeThrowAttempts=" + highestFreeThrowAttempts
				+ ", opponentFreeThrowAttempts=" + opponentFreeThrowAttempts + ", highestOpponentFreeThrowAttempts="
				+ highestOpponentFreeThrowAttempts + ", freeThrowGoals=" + freeThrowGoals + ", highestFreeThrowGoals="
				+ highestFreeThrowGoals + ", opponentFreeThrowGoals=" + opponentFreeThrowGoals
				+ ", highestOpponentFreeThrowGoals=" + highestOpponentFreeThrowGoals + "]";
	}
	
}
