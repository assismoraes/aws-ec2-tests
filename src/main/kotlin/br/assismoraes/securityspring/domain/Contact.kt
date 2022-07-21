package br.assismoraes.securityspring.domain

import br.assismoraes.securityspring.entities.ContactEntity

data class Contact(
    val id: Long? = null,
    val name: String,
    val email: String
)

fun Contact.toEntity() = ContactEntity(
    id = this.id,
    name = this.name,
    email = this.email
)

