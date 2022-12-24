package com.hsilva.ungathering.domain.usecase.character

import com.hsilva.ungathering.domain.model.Character as Character

class CreateCharacter {

    operator fun invoke(
        name: String,
        attack: Int,
        defense: Int,
        health: Int
    ): Boolean {
        val id = 1
        val character = Character(
            id = id,
            name = name,
            artifacts = emptyList(),
            health = health,
            attack = attack,
            defense = defense,
            currentQuest = null,
            quests = emptyList()
        )

        // add to db

        return true
    }

}