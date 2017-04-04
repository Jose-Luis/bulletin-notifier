package boenot.boundary

import boenot.entity.Bulletin
import org.litote.kmongo.KMongo
import org.litote.kmongo.getCollection

class BulletinService {

    fun saveBoletin() {
        val client = KMongo.createClient()
        val database = client.getDatabase(boenot.BOENOT_DB)
        val collection = database.getCollection<Bulletin>()
    }
}