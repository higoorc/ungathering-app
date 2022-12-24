package com.hsilva.ungathering.domain.model.events

import com.hsilva.ungathering.domain.model.types.Event

data class Artifact(
    val id: Int,
    val name: String,
    val description: String,
    val image: String
): Event