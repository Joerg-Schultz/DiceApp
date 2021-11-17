# DiceApp
App for teaching basic concepts 
<video src="https://user-images.githubusercontent.com/35415909/142154738-d9624242-71ae-4da8-8e46-39c619d09393.mp4" width=90/>


https://user-images.githubusercontent.com/35415909/142157428-c0cf6ce7-cc15-4e84-8133-8909b1f127d0.mp4



## Kotlin
- val vs var
- data types incl. nullability
- classes (properties, member functions, default values)
- functions
- Collections (list, mutability)

## Android progamming
- jetpack navigation component / Fragments
- ModelViewViewmodel Design
- XML based Layout (might change to compose)

## Possible extensions

### Use FlowState
Collect the state of a dice using flows instead of reading a variable from the viewmodel
New concepts:
- Flow
- StateFlow
- SharedFlow

### Choose number of sides via Start page
Generate a start page which asks for the number of sides of the dice.
New concepts:
- Navigation parameters (pop backstack)
- input from user

### Edit number of sides via Preferences
New concepts:
- Set and store preferences
- storage above runtime

### Different Type of dice
Enable return of string ("You are attacked by Orks")

New conceps:
- abstract class
- inheritance
- enum class

### Store thrown numbers longer than runtime
Store the results of the throws in a Room Database

New concepts:
- SQL Databases
- Room database
