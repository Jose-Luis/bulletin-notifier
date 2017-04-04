package boenot.entity

import java.util.*

val BULLETIN_COLLECTION = "BULLETIN"

data class Bulletin(val date : Date, val location : String, val text: String)
