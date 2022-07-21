package br.assismoraes.securityspring.controllers

import br.assismoraes.securityspring.http.requests.CreateContactRequest
import br.assismoraes.securityspring.http.requests.toDomain
import br.assismoraes.securityspring.services.ContactService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["contacts"])
class ContactController {

    @Autowired
    private lateinit var contactService: ContactService

    @PostMapping
    fun create(@RequestBody createContactRequest: CreateContactRequest): ResponseEntity<Any> {
        val contact = contactService.create(createContactRequest.toDomain())
        return ResponseEntity.ok(contact)
    }

    @GetMapping
    fun list(): ResponseEntity<Any> {
        return ResponseEntity.ok(contactService.list())
    }

}