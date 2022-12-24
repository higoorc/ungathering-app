package com.hsilva.ungathering.domain.usecase.events

import com.hsilva.ungathering.domain.model.Character
import com.hsilva.ungathering.domain.model.events.Artifact


class LootArtifact {

    operator fun invoke(
        character: Character,
        artifact: Artifact
    ): Boolean {
        // TODO(): Save new artifact.
        return true
    }
}