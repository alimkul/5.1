package ru.netology.Attacments

import ru.netology.Attachments

class Document(
    val id:Int,
    val owner_id:Int,
    val title:String,
    val size:Int,
    val ext:String,
    val url:String,
    val date:Int,
    val _type:Int,
    val preview:Any

)  {
}