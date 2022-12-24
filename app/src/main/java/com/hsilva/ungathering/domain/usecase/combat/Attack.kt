package com.hsilva.ungathering.domain.usecase.combat

import com.hsilva.ungathering.domain.model.Character
import com.hsilva.ungathering.domain.model.events.Creature

class Attack {

    operator fun invoke(
        character: Character,
        creature: Creature,
        result: Int
    ): Creature {
        // TODO(): Calculate if creature receive damage.
        return creature
    }
}