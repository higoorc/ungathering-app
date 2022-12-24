package com.hsilva.ungathering.domain.usecase.history

import com.hsilva.ungathering.domain.model.Quest

class InsertText {

    operator fun invoke(
        text: String,
        quest: Quest
    ): Boolean {
        quest.history.add(text)

        // save

        return true
    }

}