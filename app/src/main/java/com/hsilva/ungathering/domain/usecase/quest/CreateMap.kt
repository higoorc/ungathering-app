package com.hsilva.ungathering.domain.usecase.quest

import com.hsilva.ungathering.domain.model.types.Type

class CreateMap {

    operator fun invoke(
        types: List<Type>,
        length: Int
    ): Boolean {
        val arr = arrayOf(
            arrayOf(types.random(), types.random(), types.random(), types.random()),
            arrayOf(types.random(), types.random(), types.random(), types.random()),
            arrayOf(types.random(), types.random(), types.random(), types.random())
        )

        val arr2 = Array(length) {Array(length) {types.random()} }

        return true
    }
}