package wangtuo.domain.detail;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import wangtuo.domain.core.Game;
import wangtuo.domain.core.Player;
import wangtuo.domain.core.Season;
import wangtuo.domain.enumeration.Side;

/**
 * 比赛-运动轨迹
 * @author wangtuo0k
 *
 */
@Entity
public class GameMovement {
	@Id
	@GeneratedValue(generator = "game-movement-uuid")
	@GenericGenerator(strategy = "uuid", name = "game-movement-uuid")
	@Column(length = 36)
	private String id;
	
	@ManyToOne(targetEntity=Season.class)
	private Season season;
	
	@ManyToOne(targetEntity=Game.class)
	private Game game;
	
	// 球员
	@ManyToOne(targetEntity=Player.class)
	private Player player;
	
	// 左（右）脚
	@Column
	private Side side;
	
	// 落地时间
	@Column
	private LocalTime landTime;
	
	// 抬起时间
	@Column
	private LocalTime liftTime;
	
	// x坐标
	@Column
	private Double xCoordinate;
	
	// y坐标
	@Column
	private Double yCoordinate;
	
	// 是否控球
	@Column
	private Boolean ballControl;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public LocalTime getLandTime() {
		return landTime;
	}

	public void setLandTime(LocalTime landTime) {
		this.landTime = landTime;
	}

	public LocalTime getLiftTime() {
		return liftTime;
	}

	public void setLiftTime(LocalTime liftTime) {
		this.liftTime = liftTime;
	}

	public Double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(Double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public Double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(Double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public Boolean getBallControl() {
		return ballControl;
	}

	public void setBallControl(Boolean ballControl) {
		this.ballControl = ballControl;
	}

	@Override
	public String toString() {
		return "GameMovement [id=" + id + ", season=" + season + ", game=" + game + ", player=" + player + ", side="
				+ side + ", landTime=" + landTime + ", liftTime=" + liftTime + ", xCoordinate=" + xCoordinate
				+ ", yCoordinate=" + yCoordinate + ", ballControl=" + ballControl + "]";
	}
}
