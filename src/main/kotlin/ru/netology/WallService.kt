package ru.netology

object WallService {
    private var posts = emptyArray<Post>()
    var previousId:Int=0
    fun add(post: Post): Post {
       var post1:Post=post.copy(id= previousId+1)// надо создать var объект, чтоб изменять значения, а то самим post объектом не получиться
        posts += post1
        return posts.last()
    }
    fun update(post: Post):Boolean{
        for((index, currentPost) in posts.withIndex()) {// currentPost- Это объект Post, который мы создали и будем использовать
            if (post.id == currentPost.id) {
                posts[index] = post.copy(owner_id = currentPost.owner_id, date = currentPost.date)
                return true
            }
        }
        return false
    }
    
}
