package ru.netology

fun main(){
    val post=Post(
        id=1,
        text = "Archie",
        likes = 25, reposts = 2, authorId = 1
    )
    WallService.add(post)
    val result=   WallService.likeById(post.id)
    print(result)

}