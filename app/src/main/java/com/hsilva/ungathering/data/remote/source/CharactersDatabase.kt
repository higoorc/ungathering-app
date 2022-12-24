package com.hsilva.ungathering.data.remote.source

import androidx.room.RoomDatabase

abstract class CharactersDatabase : RoomDatabase() {

    abstract val charactersDao: CharactersDao

    companion object {
        const val DB_NAME = "characters_db"
    }
}