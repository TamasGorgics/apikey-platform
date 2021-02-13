package com.gorgics.apikeyplatform.apikey.repository

import com.gorgics.apikeyplatform.apikey.domain.ApiKey
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface ApiKeyJpaRepository : JpaRepository<ApiKey, UUID>
