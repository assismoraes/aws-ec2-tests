package br.assismoraes.securityspring.services

import br.assismoraes.securityspring.domain.Contact
import br.assismoraes.securityspring.domain.toEntity
import br.assismoraes.securityspring.entities.toDomain
import br.assismoraes.securityspring.repositories.ContactRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ContactService {

    @Autowired
    private lateinit var repository: ContactRepository

    fun create(contact: Contact): Contact {
        return this.repository.save(contact.toEntity()).toDomain()
    }

    fun list(): List<Contact> {
        return repository.findAll().map { it.toDomain() }
    }
}
