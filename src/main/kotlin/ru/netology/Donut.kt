package ru.netology

import java.util.*

class Donut(
    val is_donut:Boolean,//запись доступна только платным подписчикам VK Donut;
    val paid_duration:Int,//время, в течение которого запись будет доступна только платным подписчикам VK Donut;
    val placeholder: Placeholder,//заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи.
    val can_publish_free_copy:Boolean,//— можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;
    val edit_mode:String,//информация о том, какие значения VK Donut можно изменить в записи.
    val all:String,
    val duration: Date
) {
}