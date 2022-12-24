package com.hsilva.ungathering.domain.model.events

import com.hsilva.ungathering.domain.model.types.Event

data class Creature(
    val id: Int,
    val name: String,
    val description: String,
    val image: String,
    val level: Int,
    val health: Int,
    val attack: Int,
    val defense: Int
): Event