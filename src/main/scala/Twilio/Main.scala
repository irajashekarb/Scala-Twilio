package Twilio

import com.twilio.Twilio
import com.twilio.`type`.PhoneNumber
import com.twilio.rest.api.v2010.account.Message
import com.typesafe.config.ConfigFactory

object Main extends App {
  val config = ConfigFactory.load()

  val ACCOUNT_SID = "AC8c9da165e8bb394ef9d130a332fd14c1"
  val AUTH_TOKEN = "45a1d6e156841a85783993010ed60f72"

  Twilio.init(ACCOUNT_SID, AUTH_TOKEN)

  val from = new PhoneNumber("+12055709305")
  val to = new PhoneNumber("+919963185520")
  val body = "This is the test Twilio message"

  val message = Message.creator(to, from, body).create()
  println(s"Message is sent to $to with ID ${message.getSid}")
}
