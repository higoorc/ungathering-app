package com.hsilva.ungathering.data.remote.source

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [com.hsilva.ungathering.domain.model.Character::class],
    version = 1
)
abstract class CharactersDatabase : RoomDatabase() {

    abstract val charactersDao: CharactersDao

    companion object {
        const val DB_NAME = "characters_db"
    }
}