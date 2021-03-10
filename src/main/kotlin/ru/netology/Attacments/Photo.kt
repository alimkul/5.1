package ru.netology.Attacments

class Photo (
        val id: Int,
        val album_id:Int,
        val owner_id:Int,
        val user_id:Int,
        val text:String,
        val date:Int,
        val sizes:Array<Size>,
        val wight:Int,
        val height:Int

        )