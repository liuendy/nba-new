-- ----------------------------
-- database
-- ----------------------------
USE 'core';
-- ----------------------------
-- TABLE of coach
-- ----------------------------
CREATE TABLE coach (
	id varchar(36) NOT NULL, 
	birthday tinyblob NOT NULL, 
	gender integer NOT NULL, 
	name varchar(255) NOT NULL, 
	team_id varchar(36) NOT NULL, 
	PRIMARY KEY (id)
);
-- ----------------------------
-- TABLE of court
-- ----------------------------
CREATE TABLE court (
	id varchar(36) NOT NULL, 
	location varchar(1000) NOT NULL, 
	name varchar(255) NOT NULL, 
	PRIMARY KEY (id)
);
-- ----------------------------
-- TABLE of coach
-- ----------------------------
CREATE TABLE game (
	id varchar(36) NOT NULL, 
	date tinyblob NOT NULL, 
	type integer NOT NULL, 
	away_team_id varchar(36) NOT NULL, 
	court_id varchar(36) NOT NULL, 
	home_team_id varchar(36) NOT NULL, 
	season_id varchar(36) NOT NULL, 
	PRIMARY KEY (id)
);
-- ----------------------------
-- TABLE of coach
-- ----------------------------
CREATE TABLE player (
	id varchar(36) NOT NULL, 
	birthday tinyblob NOT NULL, 
	gender integer NOT NULL, 
	height decimal(6, 2) NOT NULL, 
	name varchar(255) NOT NULL, 
	number integer NOT NULL, 
	weight decimal(6, 2) NOT NULL, 
	team_id varchar(36) NOT NULL, 
	PRIMARY KEY (id)
);
-- ----------------------------
-- TABLE of coach
-- ----------------------------
CREATE TABLE season (
	id varchar(36) NOT NULL, 
	end_date tinyblob NOT NULL, 
	name varchar(255) NOT NULL, 
	start_date tinyblob NOT NULL, 
	PRIMARY KEY (id)
);
-- ----------------------------
-- TABLE of coach
-- ----------------------------
CREATE TABLE team (
	id varchar(36) NOT NULL, 
	name varchar(255) NOT NULL, 
	rank integer NOT NULL, 
	score integer NOT NULL, 
	PRIMARY KEY (id)
);
-- ----------------------------
-- constraints
-- ----------------------------
ALTER TABLE coach ADD CONSTRAINT UKfuj9cs7tp4gibkfxivrd2ttdg UNIQUE (team_id);
ALTER TABLE player ADD CONSTRAINT UKrgl364whl9qn7bo7qkm2ynseh UNIQUE (team_id, number);
ALTER TABLE season ADD CONSTRAINT UKh8gpicoby9c670n138txw7ft0 UNIQUE (name);
ALTER TABLE team ADD CONSTRAINT UKg2l9qqsoeuynt4r5ofdt1x2td UNIQUE (name);
ALTER TABLE coach ADD CONSTRAINT FK2b7tbul2a80o2e94ld65otqdb FOREIGN KEY (team_id) REFERENCES team (id);
ALTER TABLE coach ADD CONSTRAINT FK2b7tbul2a80o2e94ld65otqdb FOREIGN KEY (team_id) REFERENCES team (id);
ALTER TABLE game ADD CONSTRAINT FKaowpughmnfa6ifikwfy6wf4g2 FOREIGN KEY (away_team_id) REFERENCES team (id);
ALTER TABLE game ADD CONSTRAINT FK51yuyu3ukyq5e8nsvywbof2ws FOREIGN KEY (home_team_id) REFERENCES team (id);
ALTER TABLE game ADD CONSTRAINT FKjebsrjxrfslf63c9yfq4qy9vp FOREIGN KEY (court_id) REFERENCES court (id);
ALTER TABLE game ADD CONSTRAINT FK3xfbgv78vv6qrx7or7wnamon FOREIGN KEY (season_id) REFERENCES season (id);
ALTER TABLE player ADD CONSTRAINT FKdvd6ljes11r44igawmpm1mc5s FOREIGN KEY (team_id) REFERENCES team (id);
-- ----------------------------
-- database
-- ----------------------------
USE '20152016';
-- ----------------------------
-- TABLES of game_movement
-- ----------------------------
CREATE TABLE game_movement_402891815e7a02f0015e7a02f592000d (
	id varchar(36) NOT NULL, 
	ball_control bit, 
	land_time tinyblob, 
	lift_time tinyblob, 
	side integer, 
	x_coordinate double, 
	y_coordinate double, 
	game_id varchar(36), 
	player_id varchar(36), 
	season_id varchar(36), 
	PRIMARY KEY (id)
);
CREATE TABLE game_movement_402891815e7a02f0015e7a02f597000e (
	id varchar(36) NOT NULL, 
	ball_control bit, 
	land_time tinyblob, 
	lift_time tinyblob, 
	side integer, 
	x_coordinate double, 
	y_coordinate double, 
	game_id varchar(36), 
	player_id varchar(36), 
	season_id varchar(36), 
	PRIMARY KEY (id)
);
CREATE TABLE game_movement_402891815e7a02f0015e7a02f59d000f (
	id varchar(36) NOT NULL, 
	ball_control bit, 
	land_time tinyblob, 
	lift_time tinyblob, 
	side integer, 
	x_coordinate double, 
	y_coordinate double, 
	game_id varchar(36), 
	player_id varchar(36), 
	season_id varchar(36), 
	PRIMARY KEY (id)
);
CREATE TABLE game_movement_402891815e7a02f0015e7a02f5a20010 (
	id varchar(36) NOT NULL, 
	ball_control bit, 
	land_time tinyblob, 
	lift_time tinyblob, 
	side integer, 
	x_coordinate double, 
	y_coordinate double, 
	game_id varchar(36), 
	player_id varchar(36), 
	season_id varchar(36), 
	PRIMARY KEY (id)
);
CREATE TABLE game_movement_402891815e7a02f0015e7a02f5a60011 (
	id varchar(36) NOT NULL, 
	ball_control bit, 
	land_time tinyblob, 
	lift_time tinyblob, 
	side integer, 
	x_coordinate double, 
	y_coordinate double, 
	game_id varchar(36), 
	player_id varchar(36), 
	season_id varchar(36), 
	PRIMARY KEY (id)
);
CREATE TABLE game_movement_402891815e7a02f0015e7a02f5ab0012 (
	id varchar(36) NOT NULL, 
	ball_control bit, 
	land_time tinyblob, 
	lift_time tinyblob, 
	side integer, 
	x_coordinate double, 
	y_coordinate double, 
	game_id varchar(36), 
	player_id varchar(36), 
	season_id varchar(36), 
	PRIMARY KEY (id)
);
CREATE TABLE game_movement_402891815e7a02f0015e7a02f5af0013 (
	id varchar(36) NOT NULL, 
	ball_control bit, 
	land_time tinyblob, 
	lift_time tinyblob, 
	side integer, 
	x_coordinate double, 
	y_coordinate double, 
	game_id varchar(36), 
	player_id varchar(36), 
	season_id varchar(36), 
	PRIMARY KEY (id)
);

-- ----------------------------
-- database
-- ----------------------------
USE '20162017';
-- ----------------------------
-- TABLES of game_movement
-- ----------------------------
CREATE TABLE game_movement_402891815e7a02f0015e7a02f5700006 (
	id varchar(36) NOT NULL, 
	ball_control bit, 
	land_time tinyblob, 
	lift_time tinyblob, 
	side integer, 
	x_coordinate double, 
	y_coordinate double, 
	game_id varchar(36), 
	player_id varchar(36), 
	season_id varchar(36), 
	PRIMARY KEY (id)
);
CREATE TABLE game_movement_402891815e7a02f0015e7a02f5750007 (
	id varchar(36) NOT NULL, 
	ball_control bit, 
	land_time tinyblob, 
	lift_time tinyblob, 
	side integer, 
	x_coordinate double, 
	y_coordinate double, 
	game_id varchar(36), 
	player_id varchar(36), 
	season_id varchar(36), 
	PRIMARY KEY (id)
);
CREATE TABLE game_movement_402891815e7a02f0015e7a02f57c0008 (
	id varchar(36) NOT NULL, 
	ball_control bit, 
	land_time tinyblob, 
	lift_time tinyblob, 
	side integer, 
	x_coordinate double, 
	y_coordinate double, 
	game_id varchar(36), 
	player_id varchar(36), 
	season_id varchar(36), 
	PRIMARY KEY (id)
);
CREATE TABLE game_movement_402891815e7a02f0015e7a02f5800009 (
	id varchar(36) NOT NULL, 
	ball_control bit, 
	land_time tinyblob, 
	lift_time tinyblob, 
	side integer, 
	x_coordinate double, 
	y_coordinate double, 
	game_id varchar(36), 
	player_id varchar(36), 
	season_id varchar(36), 
	PRIMARY KEY (id)
);
CREATE TABLE game_movement_402891815e7a02f0015e7a02f585000a (
	id varchar(36) NOT NULL, 
	ball_control bit, 
	land_time tinyblob, 
	lift_time tinyblob, 
	side integer, 
	x_coordinate double, 
	y_coordinate double, 
	game_id varchar(36), 
	player_id varchar(36), 
	season_id varchar(36), 
	PRIMARY KEY (id)
);
CREATE TABLE game_movement_402891815e7a02f0015e7a02f589000b (
	id varchar(36) NOT NULL, 
	ball_control bit, 
	land_time tinyblob, 
	lift_time tinyblob, 
	side integer, 
	x_coordinate double, 
	y_coordinate double, 
	game_id varchar(36), 
	player_id varchar(36), 
	season_id varchar(36), 
	PRIMARY KEY (id)
);
CREATE TABLE game_movement_402891815e7a02f0015e7a02f58e000c (
	id varchar(36) NOT NULL, 
	ball_control bit, 
	land_time tinyblob, 
	lift_time tinyblob, 
	side integer, 
	x_coordinate double, 
	y_coordinate double, 
	game_id varchar(36), 
	player_id varchar(36), 
	season_id varchar(36), 
	PRIMARY KEY (id)
);