package dev.mama1emon.hat.navigation

import androidx.navigation.NamedNavArgument

sealed class Screens(val route: String, val args: List<NamedNavArgument> = listOf()) {

    object Greeting : Screens(route = "greeting")
}
