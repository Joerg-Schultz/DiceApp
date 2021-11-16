package de.cctb.android.diceapp.models

import kotlin.random.Random

class Dice(private val sides: Int  = 6) {
    var currentValue: Int? = null

    fun roll() {
        currentValue = Random.nextInt(1, sides)
    }
}