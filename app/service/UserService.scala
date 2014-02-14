package services

import models._
import services.query.UserQueryService

import play.api.db.slick.DB
import scala.slick.session.Session
import play.api.Play.current 

object UserService {
  
  object UserQueryService extends UserQueryService

  def save(user: User): UserId = {
    DB.withSession { implicit session: Session =>
      UserQueryService save user
    }
  }

  def findById(id: Long): Option[User] = {
    DB.withSession { implicit session: Session =>
      UserQueryService findById UserId(id)
    }
  }
}