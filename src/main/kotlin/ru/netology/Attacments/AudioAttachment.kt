package ru.netology.Attacments

import ru.netology.Attachments

data class AudioAttachment(override val type: String,  val audio: Audio?) : Attachments {

}