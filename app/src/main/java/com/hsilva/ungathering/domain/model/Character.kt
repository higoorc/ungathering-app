package com.hsilva.ungathering.domain.model

import com.hsilva.ungathering.domain.model.events.Artifact

data class Character(
    val id: Int,
    val name: String,
    var artifacts: List<Artifact>,
    var health: Int,
    var attack: Int,
    var defense: Int,
    var currentQuest: Quest? = null,
    var quests: List<Quest>
)