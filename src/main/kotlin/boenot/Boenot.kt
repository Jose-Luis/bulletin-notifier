package boenot

import org.wasabifx.wasabi.app.AppServer

val BOENOT_DB = "BOENOT"

fun main(args: Array<String>) {
    val server = AppServer()
    server.get("/", { response.send("Hola, que ase?!") })
    server.post("/bulletin", { response.send("Hola, que ase?!") })
    server.start()
}
