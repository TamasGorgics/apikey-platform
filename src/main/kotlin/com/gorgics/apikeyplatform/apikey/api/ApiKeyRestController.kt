package com.gorgics.apikeyplatform.apikey.api

import com.gorgics.apikeyplatform.apikey.repository.ApiKeyJpaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController("api-keys")
class ApiKeyRestController @Autowired constructor(
    val apiKeyJpaRepository: ApiKeyJpaRepository
) {
    @GetMapping
    fun getAll() = apiKeyJpaRepository.findAll()

    @GetMapping("{id}")
    fun getApiKey(@PathVariable("id") apiKeyUuid: UUID) = apiKeyJpaRepository.findById(apiKeyUuid)
}
