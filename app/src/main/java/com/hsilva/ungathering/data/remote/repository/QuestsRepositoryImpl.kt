package com.hsilva.ungathering.data.remote.repository

import com.hsilva.ungathering.data.remote.source.QuestsDao
import com.hsilva.ungathering.domain.model.Quest
import com.hsilva.ungathering.domain.repository.QuestsRepository
import kotlinx.coroutines.flow.Flow

class QuestsRepositoryImpl(
    private val dao: QuestsDao
) : QuestsRepository {

    override fun getAll(): Flow<List<Quest>> =
        dao.getAll()

    override suspend fun getById(id: Int): Quest? =
        dao.getById(id)

    override suspend fun insert(quest: Quest) =
        dao.insert(quest)

    override suspend fun delete(quest: Quest) =
        dao.delete(quest)
}