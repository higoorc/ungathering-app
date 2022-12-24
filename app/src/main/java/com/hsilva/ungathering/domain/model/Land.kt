package com.hsilva.ungathering.domain.model

import com.hsilva.ungathering.domain.model.types.Event
import com.hsilva.ungathering.domain.model.types.Type

data class Land(
    val id: Int,
    val name: String,
    val description: String,
    val image: String,
    val color: Type,
    val event: Event
)