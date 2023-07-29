package com.grupoalv.mapperdecorador

import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class TableEntity(
    val classToMap: KClass<*>,

    )