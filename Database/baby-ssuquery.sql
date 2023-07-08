Create database babySSU_db;
show databases;
use babySSU_db;
CREATE Table user(
  user_no int UNSIGNED not null AUTO_INCREMENT,
  user_id varchar(20) not null,
  user_password varchar(20) not null,
  name varchar(5) not null,
  primary key(user_no)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE Table mRobot(
  mRobot_id int UNSIGNED not null AUTO_INCREMENT,
  m_startTime TIMESTAMP,
  container_time TIMESTAMP,
  servo_container tinyint UNSIGNED not null,
  m_battery int UNSIGNED not null,
  primary key(mRobot_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER TABLE mRobot ADD INDEX idx_container_time (container_time);

CREATE Table sRobot(
  sRobot_id int UNSIGNED not null AUTO_INCREMENT,
  s_startTime TIMESTAMP,
  s_battery int UNSIGNED not null,
  primary key(sRobot_id),
  foreign key(s_startTime)
  REFERENCES mRobot(container_time) on UPDATE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE Table mRobot_info(
  mRobot_info_id int UNSIGNED not null AUTO_INCREMENT,
  mHumidity float not null,
  mTemp float not null,
  mLocate double not null,
  primary key(mRobot_info_id),
  foreign key(mRobot_info_id)
  REFERENCES mRobot(mRobot_id) on UPDATE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE Table sRobot_info(
  sRobot_info_id int UNSIGNED not null AUTO_INCREMENT,
  sHumidity float not null,
  sTemp float not null,
  sLocate double not null,
  primary key(sRobot_info_id),
  foreign key(sRobot_info_id)
  REFERENCES sRobot(sRobot_id) on UPDATE CASCADE
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE Table mRobot_Video(
  mVideo_id int UNSIGNED not null AUTO_INCREMENT,
  mVideo_name varChar(10) not null,
  mVideo_film LONGBLOB not null,
  primary key(mVideo_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE Table sRobot_Video(
  sVideo_id int UNSIGNED not null AUTO_INCREMENT,
  sVideo_name varChar(10) not null,
  sVideo_film LONGBLOB not null,
  primary key(sVideo_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into user (user_id, user_password, name) values ('admin', '0000' , 'Admin');
