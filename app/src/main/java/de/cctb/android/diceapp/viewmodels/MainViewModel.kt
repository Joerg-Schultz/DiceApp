package de.cctb.android.diceapp.viewmodels

import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {
    var currentNumber = 0
    var history = mutableListOf<Int>()

    //https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.random/next-int.html
    fun throwDice() {
        currentNumber = Random.nextInt(1,6)
        history.add(currentNumber)
    }
}