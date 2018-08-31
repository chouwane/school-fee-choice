#CREATE SCHEMA `school_db` DEFAULT CHARACTER SET utf8 ;


INSERT INTO `school_db`.`t_student` (`xsid`, `sfzid`, `name`, `class`, `parent`, `contact`) VALUES ('1', '360822198609284091', '张三', '3班', '张三丰', '13587452034');
INSERT INTO `school_db`.`t_student` (`xsid`, `sfzid`, `name`, `class`, `parent`, `contact`) VALUES ('2', '360822198305022623', '李四', '3班', '李思', '18889462034');
INSERT INTO `school_db`.`t_student` (`xsid`, `sfzid`, `name`, `class`, `parent`, `contact`) VALUES ('3', '36082219750711058X', '王五', '3班', '王倩', '19987462034');



INSERT INTO `school_db`.`t_fee_item` (`xmid`, `xmmc`, `amount`, `essential`) VALUES ('1', '社会实践活动费', '100', '1');
INSERT INTO `school_db`.`t_fee_item` (`xmid`, `xmmc`, `amount`, `essential`) VALUES ('2', '伙食费', '300', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`, `xmmc`, `amount`, `essential`) VALUES ('3', '学平险', '150', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`, `xmmc`, `amount`, `essential`) VALUES ('4', '校服费', '250', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`, `xmmc`, `amount`, `essential`) VALUES ('5', '牛奶费', '90', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`, `xmmc`, `amount`, `essential`) VALUES ('6', '教辅用书', '240', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`, `xmmc`, `amount`, `essential`) VALUES ('7', '科目一', '100', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`, `xmmc`, `amount`, `essential`) VALUES ('8', '科目二', '200', '0');
INSERT INTO `school_db`.`t_fee_item` (`xmid`, `xmmc`, `amount`, `essential`) VALUES ('9', '科目三', '300', '0');