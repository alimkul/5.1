package ru.netology

import org.junit.Assert.*
import org.junit.Test
import ru.netology.Attacments.Audio
import ru.netology.Attacments.AudioAttachment
import ru.netology.Exception.PostNotFoundException
import java.util.*

class WallServiceTest{
    @Test
    fun updateExisting(){
        val service=WallService
        service.add(
            Post(1,1,1,1,1,"Shynggys",
            1,1,true,
                CommentPost(2,true,false,false,true),
                Copyright(1,"Archie","Sama","KZ"),
                Like(25,true,true,true),
                25,View(25),"Курсы Нетология",Post_source(),
            arrayOf((AudioAttachment("audio", Audio(1,1,"Arhie","My heart",1,"123",
                    1,1,1,1,true,true)))),

            Geo("KZ","Almaty", Place()),1,
            arrayOf(CopyHistory()),
            true,true,true,true,true,true,
            Donut(false,1, Placeholder(),false,"Free","Empty", Date()),
            123)
        )
        service.add(
            Post(2,2,2,1,1,"Shynggys",
                1,1,true,
                CommentPost(2,true,false,false,true),
                Copyright(1,"Archie","Sama","KZ"),
                Like(25,true,true,true),
                25,View(25),"Курсы Нетология",Post_source(),

                arrayOf((AudioAttachment("audio", Audio(1,1,"Arhie","My heart",1,"123",
               1,1,1,1,true,true)))),

                Geo("KZ","Almaty", Place()),1,
                arrayOf(CopyHistory()),
                true,true,true,true,true,true,
                Donut(false,1, Placeholder(),false,"Free","Empty", Date()),
                123)
        )
        val update= Post(1,25,25,1,1,"Shynggys",
                1,1,true,
                CommentPost(2,true,false,false,true),
                Copyright(1,"Archie","Sama","KZ"),
                Like(125,true,true,true),
                25,View(25),"Курсы Нетология",Post_source(),

            arrayOf((AudioAttachment("audio", Audio(1,1,"Alan Walker","My heart",1,"123",
                1,1,1,1,true,true)))),

            Geo("KZ","Almaty", Place()),1,
            arrayOf(CopyHistory()),

                true,true,true,true,true,true,
                Donut(false,1, Placeholder(),false,"Free","Empty", Date()),
                123)
        val result =service.update(update)
        assertTrue(result)
    }
    @Test
    fun updateNullExisting(){
        val service=WallService
        service.add(
            Post(1,1,1,1,1,"Shynggys",
                1,1,true,
                CommentPost(2,true,false,false,true),
                Copyright(1,"Archie","Sama","KZ"),
                Like(25,true,true,true),
                25,View(25),"Курсы Нетология",Post_source(),
                arrayOf((AudioAttachment("audio", Audio(1,1,"Arhie","My heart",1,"123",
                    1,1,1,1,true,true)))),

                Geo("KZ","Almaty", Place()),1,
                arrayOf(CopyHistory()),
                true,true,true,true,true,true,
                Donut(false,1, Placeholder(),false,"Free","Empty", Date()),
                123)
        )
        service.add(
            Post(2,2,2,1,1,"Shynggys",
                1,1,true,
                CommentPost(2,true,false,false,true),
                Copyright(1,"Archie","Sama","KZ"),
                Like(25,true,true,true),
                25,View(25),"Курсы Нетология",Post_source(),

                arrayOf((AudioAttachment("audio", Audio(1,1,"Arhie","My heart",1,"123",
                    1,1,1,1,true,true)))),

                Geo("KZ","Almaty", Place()),1,
                arrayOf(CopyHistory()),
                true,true,true,true,true,true,
                Donut(false,1, Placeholder(),false,"Free","Empty", Date()),
                123)
        )

        val checkUpdate= Post(attachments = emptyArray(),copy_history = emptyArray())
        val result =service.update(checkUpdate)
        assertFalse(result)
    }
    @Test
    fun addTest(){
        val service=WallService
        val id=1
       val result= service.add(
            Post(1,1,1,1,1,"Shynggys",
                1,1,true,
                CommentPost(2,true,false,false,true),
                Copyright(1,"Archie","Sama","KZ"),
                Like(25,true,true,true),
                25,View(25),"Курсы Нетология",Post_source(),

             arrayOf((AudioAttachment("audio", Audio(1,1,"Arhie","My heart",1,"123",
                    1,1,1,1,true,true)))),

                Geo("KZ","Almaty", Place()),1,
                arrayOf(CopyHistory()),
                true,true,true,true,true,true,
                Donut(false,1, Placeholder(),false,"Free","Empty", Date()),
                123)
        )
        assertEquals(id, result.post_id)
    }
    @Test(expected = PostNotFoundException::class)
    fun createCommentTestExp(){// проверка исключения
        val service=WallService

        val comment=Comment(1,1,1,"Asd",null,1,1, emptyArray(), emptyArray(),null)


        service.createComment(comment)
    }
    @Test(expected = PostNotFoundException::class)
    fun createCommentTest(){
        val service=WallService

        val comment=Comment(1,1,1,"Asd",null,1,1, emptyArray(), emptyArray(),null)

        service.add(Post(1,1,1,1,1,"Shynggys",
                1,1,true,
                CommentPost(2,true,false,false,true),
                Copyright(1,"Archie","Sama","KZ"),
                Like(25,true,true,true),
                25,View(25),"Курсы Нетология",Post_source(),

                arrayOf((AudioAttachment("audio", Audio(1,1,"Arhie","My heart",1,"123",
                    1,1,1,1,true,true)))),

                Geo("KZ","Almaty", Place()),1,
                arrayOf(CopyHistory()),
                true,true,true,true,true,true,
                Donut(false,1, Placeholder(),false,"Free","Empty", Date()),
                123)
        )
        service.add(
            Post(2,2,2,1,1,"Shynggys",
                1,1,true,
                CommentPost(2,true,false,false,true),
                Copyright(1,"Archie","Sama","KZ"),
                Like(25,true,true,true),
                25,View(25),"Курсы Нетология",Post_source(),

                arrayOf((AudioAttachment("audio", Audio(1,1,"Arhie","My heart",1,"123",
                    1,1,1,1,true,true)))),

                Geo("KZ","Almaty", Place()),1,
                arrayOf(CopyHistory()),
                true,true,true,true,true,true,
                Donut(false,1, Placeholder(),false,"Free","Empty", Date()),
                123)
        )
        service.createComment(comment)
    }
}