package models

import scala.slick.session.Session
import org.virtuslab.unicorn.ids._

/** Id class for type-safe joins and queries. */
case class UserId(id: Long) extends AnyVal with BaseId

/** Companion object for id class, extends IdMapping
  * and brings all required implicits to scope when needed.
  */
object UserId extends IdCompanion[UserId]

case class User(id: Option[UserId],
                email: String,
                name: String) extends WithId[UserId]

/** Table definition for users. */
object Users extends IdTable[UserId, User]("Users") {

  def email = column[String]("email", O.NotNull)

  def name = column[String]("name", O.NotNull)

  def base = email ~ name

  override def * = id.? ~: base <> (User.apply _, User.unapply _)

  override def insertOne(elem: User)(implicit session: Session): UserId =
    saveBase(base, User.unapply _)(elem)
}