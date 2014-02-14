package services.query

import models._
import play.api.db.slick.Config.driver.simple._
import org.virtuslab.unicorn.ids.services._

trait UserQueries extends BaseIdQueries[UserId, User] {
  override def table = Users
}

trait UserQueryService extends BaseIdService[UserId, User] with UserQueries