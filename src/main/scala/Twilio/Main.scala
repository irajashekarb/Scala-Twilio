package Twilio

import com.twilio.Twilio
import com.twilio.`type`.PhoneNumber
import com.twilio.rest.api.v2010.account.Message
import com.typesafe.config.ConfigFactory

object Main extends App {
  val config = ConfigFactory.load()

  val ACCOUNT_SID = "Account SID"
  val AUTH_TOKEN = "Authorization Token"

  Twilio.init(ACCOUNT_SID, AUTH_TOKEN)

  val from = new PhoneNumber("+12055709305")
  val to = new PhoneNumber("+919963185520")
  val body = "This is the test Twilio message"

  val message = Message.creator(to, from, body).create()
  println(s"Message is sent to $to with ID ${message.getSid}")
}
