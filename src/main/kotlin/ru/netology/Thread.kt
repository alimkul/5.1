package ru.netology

class Thread(
    var count:Int,// количество комментариев в ветке.
    var items:Array<Comment>,//массив объектов комментариев к записи (только для метода wall.getComments).
    var can_post:Boolean,//– может ли текущий пользователь оставлять комментарии в этой ветке.
    var show_reply_button:Boolean,// нужно ли отображать кнопку «ответить» в ветке.
    var groups_can_post:Boolean//могут ли сообщества оставлять комментарии в ветке.
) {
}