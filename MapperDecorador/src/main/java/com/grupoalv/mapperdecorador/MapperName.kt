package com.grupoalv.mapperdecorador

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class MapperName(
    val nombreValue:String=""
)