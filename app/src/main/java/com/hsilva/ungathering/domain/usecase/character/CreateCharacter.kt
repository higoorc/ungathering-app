package com.hsilva.ungathering.domain.usecase.character

import com.hsilva.ungathering.domain.model.Character

class CreateCharacter {

    operator fun invoke(character: Character): Boolean {
        // TODO(): Insert character at database.
        return true
    }

}