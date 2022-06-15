package com.lamarck.myretrofit



import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query
import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {








        @GET("/todos")
        suspend fun getTodos(): Response<List<Todo>>



}