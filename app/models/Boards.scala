package models

import org.joda.time.DateTime
import scala.slick.session.Session
import org.virtuslab.unicorn.ids._

case class BoardId(id: Long) extends AnyVal with BaseId

object BoardId extends IdCompanion[BoardId]


case class Board(id: Option[BoardId],
                 title: String,
                 content: String,
                 userId: UserId,
                 date: DateTime) extends WithId[BoardId]


object Boards extends IdTable[BoardId, Board]("Boards") {

  def title = column[String]("title")
  
  def content = column[String]("content")

  // you can use your type-safe ID here - it will be mapped to long in database
  def userId = column[UserId]("user")

  def user = foreignKey("board_user_fk", userId, Users)(_.id)

  def date = column[DateTime]("date")

  def base = title ~ content ~ userId ~ date

  override def * = id.? ~: base <> (Board.apply _, Board.unapply _)

  override def insertOne(elem: Board)(implicit session: Session): BoardId =
    saveBase(base, Board.unapply _)(elem)

}