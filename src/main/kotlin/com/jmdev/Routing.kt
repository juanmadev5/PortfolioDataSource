package com.jmdev

import com.jmdev.data.getPortfolioData
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    install(ContentNegotiation) {
        json()
    }
    routing {
        staticResources("static", "static")
        get("/") {
            call.respond(
                getPortfolioData()
            )
        }
    }
}