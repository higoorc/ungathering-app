package com.hsilva.ungathering.domain.usecase.events

import com.hsilva.ungathering.domain.model.events.Artifact
import com.hsilva.ungathering.domain.model.events.Enchantment
import com.hsilva.ungathering.domain.model.types.Type

class GetEnchantment {

    operator fun invoke(type: Type): Enchantment {
        // TODO(): Get new enchantment.
        return Enchantment(1, "", "", "")
    }
}