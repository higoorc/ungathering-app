package com.hsilva.ungathering.domain.repository

import com.hsilva.ungathering.domain.model.Quest
import kotlinx.coroutines.flow.Flow

interface QuestsRepository {

    fun getAll(): Flow<List<Quest>>

    suspend fun getById(id: Int): Quest?

    suspend fun insert(quest: Quest)

    suspend fun delete(quest: Quest)
}