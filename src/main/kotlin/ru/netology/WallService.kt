package ru.netology

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }

    fun likeById(postId: Int) :Boolean{
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                val newpost = post.copy(likes = post.likes + 1)
                posts[index] = newpost
                return  true
            }
        }
        return false
    }
}
