package com.hsilva.ungathering.data.remote.source

import androidx.room.*
import com.hsilva.ungathering.domain.model.Character
import kotlinx.coroutines.flow.Flow

@Dao
interface CharactersDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(character: Character)

    @Query("SELECT * FROM character")
    fun getAll(): Flow<List<Character>>

    @Query("SELECT * FROM character WHERE id = :id")
    suspend fun getById(id: Int): Character?

    @Delete
    suspend fun delete(character: Character)
}