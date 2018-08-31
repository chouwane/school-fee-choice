#CREATE SCHEMA `school_db` DEFAULT CHARACTER SET utf8 ;


INSERT INTO `school_db`.`t_student` (`xsid`, `sfzid`, `name`,`grade`, `class`, `parent`, `contact`) VALUES ('1', '360822198609284091', '张三','1年级', '3班', '张三丰', '13587452034');
INSERT INTO `school_db`.`t_student` (`xsid`, `sfzid`, `name`,`grade`, `class`, `parent`, `contact`) VALUES ('2', '360822198305022623', '李四','2年级', '3班', '李思', '18889462034');
INSERT INTO `school_db`.`t_student` (`xsid`, `sfzid`, `name`,`grade`, `class`, `parent`, `contact`) VALUES ('3', '36082219750711058X', '王五','2年级', '3班', '王倩', '19987462034');



INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('1','1年级', '社会实践活动费', '100', '1');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('2','1年级', '伙食费', '300', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('3','1年级', '学平险', '150', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('4','1年级', '校服费', '250', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('5','1年级', '牛奶费', '90', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('6','1年级', '教辅用书', '240', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('7','1年级','科目一', '100', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('8','1年级', '科目二', '200', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('9','1年级','科目三', '300', '0');



INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('10','2年级', '社会实践活动费', '110', '1');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('11','2年级', '伙食费', '310', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('12','2年级', '学平险', '160', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('13','2年级', '校服费', '260', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('14','2年级', '牛奶费', '100', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('15','2年级', '教辅用书', '250', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('16','2年级','科目一', '110', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('17','2年级', '科目二', '210', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`,`grade`, `xmmc`, `amount`, `essential`) VALUES ('18','2年级','科目三', '310', '0');