package ru.netology

import ru.netology.Exception.PostNotFoundException

object WallService {
    private var posts = emptyArray<Post>()
    private var comments= emptyArray<Comment>()
    var previousId:Int=0

    fun add(post: Post): Post {
        previousId++
       var post1:Post=post.copy(post_id= previousId)// надо создать var объект, чтоб изменять значения, а то самим post объектом не получиться
        posts += post1
        return posts.last()
    }
    fun update(post: Post):Boolean{
        for((index, currentPost) in posts.withIndex()) {// currentPost- Это объект Post, который мы создали и будем использовать
            if (post.post_id == currentPost.post_id) {
                posts[index] = post.copy(owner_id = currentPost.owner_id, date = currentPost.date)
                return true
            }
        }
        return false
    }
    fun createComment(comment: Comment){
        var check = false
        for (currentPost in posts) {
            print(currentPost.post_id)
            if (comment.id == currentPost.post_id) {//мы используем новый айди поста, когда добавили пост в массив его айди изменился
                comments += comment
                check = true
                break
            }
        }
        if (!check) {
            throw PostNotFoundException()
        } else {
            print("Add comment")
        }
    }

}
