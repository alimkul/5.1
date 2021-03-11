package ru.netology.Attacments

import ru.netology.Attachments

data class PhotoAttachment(override val type: String, val photo: Photo) : Attachments {
}