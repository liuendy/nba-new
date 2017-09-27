# nba-new
spring boot + sharding jdbc + mysql + spring security
设计有core，20152016,20162017 三个数据库
数据库core，包含season,team,court,player,coach,game表
20152016,20162017，包含对应赛季的详细信息，每场比赛一张表，例如game_movement_${game.id}。
采用dangdang的sharding-jdbc分库分表中间件，自定义分库分表规则。以yml文件填写规则配置，通过properties读取规则配置，模拟了springboot与sjdbc整合的配置类。
