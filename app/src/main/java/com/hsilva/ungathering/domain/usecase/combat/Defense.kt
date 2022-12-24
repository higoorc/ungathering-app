package com.hsilva.ungathering.domain.usecase.combat

import com.hsilva.ungathering.domain.model.Character
import com.hsilva.ungathering.domain.model.events.Creature

class Defense {

    operator fun invoke(
        character: Character,
        creature: Creature,
        result: Int
    ): Character {
        // TODO(): Calculate if character receive damage.
        return character
    }
}