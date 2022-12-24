package com.hsilva.ungathering.domain.usecase.character

import com.hsilva.ungathering.domain.model.Character

class DeleteCharacter {

    operator fun invoke(character: Character): Boolean {
        // TODO(): Delete character at database.
        return true
    }

}