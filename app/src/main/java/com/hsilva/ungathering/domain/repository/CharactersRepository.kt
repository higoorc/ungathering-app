package com.hsilva.ungathering.domain.repository

import com.hsilva.ungathering.domain.model.Character
import kotlinx.coroutines.flow.Flow

interface CharactersRepository {

    fun getAll(): Flow<List<Character>>

    suspend fun getById(id: Int): Character?

    suspend fun insert(character: Character)

    suspend fun delete(character: Character)
}