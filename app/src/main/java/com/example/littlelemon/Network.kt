package com.example.littlelemon

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class MenuNetwork(
    @SerialName("id")
    val id: Int,
    @SerialName("title")
    val title: String,
    @SerialName("price")
    val price: Float
)

@Serializable
data class MenuItemNetwork(
    @SerialName("menu")
    val menu: List<MenuNetwork>
) {
    fun toMenuItemRoom() = MenuItemRoom(
        id = menu.first().id,
        title = menu.first().title,
        price = menu.first().price.toDouble()
    )
}
