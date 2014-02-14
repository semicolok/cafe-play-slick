package controllers

import play.api.mvc.{Action, Controller}
import play.api.libs.json.Json
import models.User
import services.UserService

object UserController extends Controller {

  def test = Action {
    val user = User(None, "test@email.com", "tester1")
    val userId = UserService save user
    println(userId)
    Ok(Json.toJson("success"+userId))
  }

  def findById(id: Long) = Action {
    UserService findById id match {
      case Some(user) => println(user)
      case None => println("None")
    }
    Ok(Json.toJson("user"))
  }
}