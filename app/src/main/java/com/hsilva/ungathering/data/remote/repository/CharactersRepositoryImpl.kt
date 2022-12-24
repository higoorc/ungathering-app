package com.hsilva.ungathering.data.remote.repository

import com.hsilva.ungathering.data.remote.source.CharactersDao
import com.hsilva.ungathering.domain.model.Character
import com.hsilva.ungathering.domain.repository.CharactersRepository
import kotlinx.coroutines.flow.Flow

class CharactersRepositoryImpl(
    private val dao: CharactersDao
) : CharactersRepository {

    override fun getAll(): Flow<List<Character>> =
        dao.getAll()

    override suspend fun getById(id: Int): Character? =
        dao.getById(id)

    override suspend fun insert(character: Character) =
        dao.insert(character)

    override suspend fun delete(character: Character) =
        dao.delete(character)
}