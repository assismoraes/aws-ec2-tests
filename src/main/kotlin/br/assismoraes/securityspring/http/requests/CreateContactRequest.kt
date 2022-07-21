package br.assismoraes.securityspring.http.requests

import br.assismoraes.securityspring.domain.Contact

data class CreateContactRequest(val name: String, val email: String)

fun CreateContactRequest.toDomain() = Contact(
    name = this.name,
    email = this.email
)
