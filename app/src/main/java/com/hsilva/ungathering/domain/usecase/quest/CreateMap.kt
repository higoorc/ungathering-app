package com.hsilva.ungathering.domain.usecase.quest

import com.hsilva.ungathering.domain.model.types.Type

class CreateMap {

    operator fun invoke(
        types: List<Type>,
        length: Int
    ): Array<Array<Type>> {
        val array = Array(length) { Array(length) {types.random()} }
        array.forEach { line ->
            line.forEachIndexed { index, tile ->
                if (index == length - 1) {
                    System.out.println(" $tile")
                }
                System.out.print(" $tile ")
            }
        }

        return array
    }
}