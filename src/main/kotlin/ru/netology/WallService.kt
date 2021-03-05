package ru.netology

class WallService() {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }
    fun update(post: Post):Boolean{
        for( check: Post in posts ){
            if(check.id==post.id){
                posts.set(check.id,post)
                return true
            }
        }
        return false
    }
}
