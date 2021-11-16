package de.cctb.android.diceapp.viewmodels

import androidx.lifecycle.ViewModel
import de.cctb.android.diceapp.models.Dice
import kotlin.random.Random

class MainViewModel : ViewModel() {
    var dice = Dice()
    var currentValue = dice.currentValue ?: 0
    var history = mutableListOf<Int>()

    fun rollDice() {
        dice.roll()
        currentValue = dice.currentValue ?: 0
        history.add(currentValue)
    }
}