package ru.netology

class Repost(
    val count:Int,//число пользователей, скопировавших запись;
    val user_reposted:Boolean//наличие репоста от текущего пользователя (1 — есть, 0 — нет).
) {
}