package services.query

import models._
import play.api.db.slick.Config.driver.simple._
import org.virtuslab.unicorn.ids.services._

trait BoardQueries extends BaseIdQueries[BoardId, Board] {
  override def table = Boards
}

trait BoardQueryService extends BaseIdService[BoardId, Board] with BoardQueries