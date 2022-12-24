package com.hsilva.ungathering.domain.usecase.history

import com.hsilva.ungathering.domain.model.Quest

class InsertVoice {

    operator fun invoke(
        voice: String,
        quest: Quest
    ): Boolean {
        quest.record.add(1)

        // save

        return true
    }
}