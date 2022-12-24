package com.hsilva.ungathering.domain.usecase.events

import com.hsilva.ungathering.domain.model.events.NPC
import com.hsilva.ungathering.domain.model.types.Type

class GetNPC {

    operator fun invoke(type: Type): NPC {
        // TODO(): Get new NPC.
        return NPC(1)
    }
}