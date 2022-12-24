package com.hsilva.ungathering.data.remote.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hsilva.ungathering.domain.model.Quest

@Database(
    entities = [Quest::class],
    version = 1
)
abstract class QuestsDatabase : RoomDatabase() {

    abstract val questsDao: QuestsDao

    companion object {
        const val DB_NAME = "quests_db"
    }
}