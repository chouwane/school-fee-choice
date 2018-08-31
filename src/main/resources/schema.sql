create table if not exists t_student(
  xsid int primary key ,
  sfzid varchar(20) not null ,
  name varchar(16) not null ,
  grade varchar(20) not null ,
  class varchar(20) not null ,
  parent varchar(16) not null ,
  contact varchar(15) not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists t_fee_item(
  xmid int primary key ,
  grade varchar(20) not null ,
  xmmc varchar(50) not null ,
  amount decimal(10,2) not null ,
  essential int not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table if not exists t_student_fee(
  xsid int not null,
  xmid int not null ,
  choosed int not null,
  primary key(xsid, xmid)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;