package data

object Protocol {
  case class CardCreated(card: Card)

  case class Card(id: Int, name: String)
}
