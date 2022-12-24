package com.hsilva.ungathering.domain.model

import com.hsilva.ungathering.domain.model.events.Artifact

data class Character(
    val id: Int,
    val name: String,
    val artifacts: List<Artifact>,
    val health: Int,
    val attack: Int,
    val defense: Int,
    val currentQuest: Quest,
    val quests: List<Quest>
)