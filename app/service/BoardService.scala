package services

import models._
import services.query.BoardQueryService

import play.api.db.slick.DB
import scala.slick.session.Session
import play.api.Play.current 

object BoardService {
  
  object BoardQueryService extends BoardQueryService

  def save(board: Board): BoardId =  {
    DB.withSession { implicit session: Session =>
      BoardQueryService save board
    }
  }

  def findById(id: Long): Option[Board] = {
    DB.withSession { implicit session: Session =>
      BoardQueryService findById BoardId(id)
    }
  }
}