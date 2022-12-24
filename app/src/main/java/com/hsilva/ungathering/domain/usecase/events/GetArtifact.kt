package com.hsilva.ungathering.domain.usecase.events

import com.hsilva.ungathering.domain.model.events.Artifact
import com.hsilva.ungathering.domain.model.types.Type

class GetArtifact {

    operator fun invoke(type: Type): Artifact {
        // TODO(): Get new artifact.
        return Artifact(1, "", "", "")
    }
}