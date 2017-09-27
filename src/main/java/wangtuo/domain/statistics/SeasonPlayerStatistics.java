package wangtuo.domain.statistics;

import org.springframework.data.annotation.Transient;

import wangtuo.domain.core.Player;
import wangtuo.domain.core.Season;

/**
 * 赛季-球员 数据统计
 * 
 * @author wangtuo0k
 *
 */
public class SeasonPlayerStatistics {
	private String id;

	private Player player;

	private Season season;

	// 总比赛场数
	private Integer games;

	// 主场比赛数
	private Integer homeGames;

	// 总胜场数
	private Integer wins;

	// 主场胜场数
	private Integer homeWins;

	// 总得分
	private Integer points;

	// 最高得分
	@Transient
	private Integer highestPoints;

	// 总篮板
	private Integer rebounds;

	// 最高篮板
	@Transient
	private Integer highestRebounds;

	// 助攻
	private Integer assists;

	// 最高助攻
	@Transient
	private Integer highestAssists;

	// 失误
	private Integer turnovers;

	// 最高失误
	@Transient
	private Integer highestTurnovers;

	// 抢断
	private Integer steals;

	// 最高抢断
	@Transient
	private Integer highestSteals;

	// 盖帽
	private Integer blocks;

	// 最高盖帽
	@Transient
	private Integer highestBlocks;

	// 犯规
	private Integer fouls;

	// 最高犯规
	@Transient
	private Integer highestfouls;

	// 投三分球
	private Integer threeThrowAttempts;

	// 最高投三分球数
	@Transient
	private Integer highestThreeThrowAttempts;

	// 命中三分球
	private Integer threeThrowGoals;

	// 最高命中三分球数
	@Transient
	private Integer highestThreeThrowGoals;

	// 投两分球
	private Integer twoThrowAttempts;

	// 最高投两分球数
	@Transient
	private Integer highestTwoThrowAttempts;

	// 命中两分球
	private Integer twoThrowGoals;

	// 最高命中两分球数
	@Transient
	private Integer highestTwoThrowGoals;

	// 投罚篮
	private Integer freeThrowAttempts;

	// 最高投罚篮数
	@Transient
	private Integer highestFreeThrowAttempts;

	// 命中罚篮
	private Integer freeThrowGoals;

	// 最高命中罚篮数
	@Transient
	private Integer highestFreeThrowGoals;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeasonPlayerStatistics other = (SeasonPlayerStatistics) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SeasonPlayerStatistics [id=" + id + ", player=" + player + ", season=" + season + ", games=" + games
				+ ", homeGames=" + homeGames + ", wins=" + wins + ", homeWins=" + homeWins + ", points=" + points
				+ ", highestPoints=" + highestPoints + ", rebounds=" + rebounds + ", highestRebounds=" + highestRebounds
				+ ", assists=" + assists + ", highestAssists=" + highestAssists + ", turnovers=" + turnovers
				+ ", highestTurnovers=" + highestTurnovers + ", steals=" + steals + ", highestSteals=" + highestSteals
				+ ", blocks=" + blocks + ", highestBlocks=" + highestBlocks + ", fouls=" + fouls + ", highestfouls="
				+ highestfouls + ", threeThrowAttempts=" + threeThrowAttempts + ", highestThreeThrowAttempts="
				+ highestThreeThrowAttempts + ", threeThrowGoals=" + threeThrowGoals + ", highestThreeThrowGoals="
				+ highestThreeThrowGoals + ", twoThrowAttempts=" + twoThrowAttempts + ", highestTwoThrowAttempts="
				+ highestTwoThrowAttempts + ", twoThrowGoals=" + twoThrowGoals + ", highestTwoThrowGoals="
				+ highestTwoThrowGoals + ", freeThrowAttempts=" + freeThrowAttempts + ", highestFreeThrowAttempts="
				+ highestFreeThrowAttempts + ", freeThrowGoals=" + freeThrowGoals + ", highestFreeThrowGoals="
				+ highestFreeThrowGoals + "]";
	}
}
