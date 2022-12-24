package com.hsilva.ungathering.domain.model

import com.hsilva.ungathering.domain.model.types.Goal

data class Quest(
    val id: Int,
    val name: String,
    val description: String,
    val goal: Goal,
    val map: Map,
    val history: MutableList<String>,
    val record: MutableList<Int>
)