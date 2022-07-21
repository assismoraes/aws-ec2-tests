package br.assismoraes.securityspring.repositories

import br.assismoraes.securityspring.entities.ContactEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ContactRepository : CrudRepository<ContactEntity, Long>
