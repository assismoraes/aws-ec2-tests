package br.assismoraes.securityspring.entities

import br.assismoraes.securityspring.domain.Contact
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "contact")
data class ContactEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long? = null,

    @Column(name = "name")
    val name: String,

    @Column(name = "email")
    val email: String
) {
}

fun ContactEntity.toDomain() = Contact(
    id = this.id,
    name = this.name,
    email = this.email
)
