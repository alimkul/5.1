package ru.netology.Attacments

import ru.netology.Attachments

class Video(
    val id: Int,
    val owner_id:Int,
    val title:String,
    val description:String,
    val dutation:Int,
    val photo_130:String,
    val photo_320:String,
    val photo_640:String,
    val photo_800:String,
    val photo_1280:String,
    val first_flame_130:String,
    val first_flame_320:String,
    val first_flame_640:String,
    val first_flame_800:String,
    val first_flame_1280:String,
    val date:Int,
    val adding_date:Int,
    val views:Int,
    val comments:Int,
    val player:String,
    val platform:String,
    val can_edit:Boolean,
    val can_add:Boolean,
    val is_private:Boolean,
    val acces_key:String,
    val proccessing:Boolean
)