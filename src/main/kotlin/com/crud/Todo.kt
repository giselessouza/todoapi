package com.example.micronautrediscrud.domain

import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.MappedEntity

@MappedEntity
data class Todo(
    @field:Id
    @field:GeneratedValue
    val id: Long?,
    val title: String,
    val description: String?
)
