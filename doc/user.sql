create DATABASE ssm;
use ssm;

CREATE TABLE user(
  id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(50) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user VALUES(1,'小明');
INSERT INTO user VALUES(2,'小红');
INSERT INTO user VALUES(3,'小美');
