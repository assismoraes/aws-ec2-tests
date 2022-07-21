package br.assismoraes.securityspring.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.ZonedDateTime
import java.util.UUID

@RestController
class HomeController {

    @GetMapping
    fun home() : ResponseEntity<Any> {
        return ResponseEntity.ok(
            mapOf(
                "message" to "Application running",
                "date" to ZonedDateTime.now(),
                "id" to UUID.randomUUID().toString().replace("-", "").uppercase()
            )
        )
    }

}