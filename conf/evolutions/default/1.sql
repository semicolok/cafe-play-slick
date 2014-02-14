# --- Created by Slick DDL
# To stop Slick DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table `Boards` (`id` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,`title` VARCHAR(254) NOT NULL,`content` VARCHAR(254) NOT NULL,`user` BIGINT NOT NULL,`date` TIMESTAMP NOT NULL);
create table `Users` (`id` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,`email` VARCHAR(254) NOT NULL,`name` VARCHAR(254) NOT NULL);
alter table `Boards` add constraint `board_user_fk` foreign key(`user`) references `Users`(`id`) on update NO ACTION on delete NO ACTION;

# --- !Downs

ALTER TABLE Boards DROP FOREIGN KEY board_user_fk;
drop table `Boards`;
drop table `Users`;

