package com.gorgics.apikeyplatform.apikey.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import java.time.Instant
import java.util.UUID
import javax.persistence.Entity

@Entity(name = "api_key")
data class ApiKey(
    @Id
    val uuid: UUID,
    val value: String,
    @CreatedDate
    val createdAt: Instant
)
