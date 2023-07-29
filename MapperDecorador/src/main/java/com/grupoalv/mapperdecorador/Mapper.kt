package com.grupoalv.mapperdecorador

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class Mapper(
    val mapperby: String = "",

    )