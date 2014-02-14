package controllers

import play.api.mvc.{Action, Controller}
import play.api.libs.json.Json

object BoardController extends Controller {

  val boardList = Map("test1" -> 1, "test2" -> 2, "test3" -> 3, "test4" -> 4)
  def findAll = Action {
    Ok(Json.toJson(boardList))
  }
}