package com.grupoalv.mapper.entity

import com.grupoalv.decorador.TableEntity
import com.grupoalv.mapper.data.Correo


@TableEntity(Correo::class)
data class CorreoEntity(val id:String?=null,
                   val nombre:String?=null,
                   val fecha:String?=null,)