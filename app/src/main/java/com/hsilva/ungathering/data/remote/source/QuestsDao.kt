package com.hsilva.ungathering.data.remote.source

import androidx.room.*
import com.hsilva.ungathering.domain.model.Quest
import kotlinx.coroutines.flow.Flow

@Dao
interface QuestsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(quest: Quest)

    @Query("SELECT * FROM quest")
    fun getAll(): Flow<List<Quest>>

    @Query("SELECT * FROM quest WHERE id = :id")
    suspend fun getById(id: Int): Quest?

    @Delete
    suspend fun delete(quest: Quest)
}