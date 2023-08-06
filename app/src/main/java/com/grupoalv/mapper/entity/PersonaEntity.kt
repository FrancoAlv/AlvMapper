package com.grupoalv.mapper.entity

import com.grupoalv.decorador.IgnoreField
import com.grupoalv.decorador.Mapper
import com.grupoalv.decorador.MapperName
import com.grupoalv.decorador.PrimaryMapper
import com.grupoalv.decorador.TableEntity
import com.grupoalv.mapper.data.Correo
import com.grupoalv.mapper.data.Persona


@TableEntity(Persona::class)
data class PersonaEntity(
    val id: String? = null,
    val nombre: String? = null,
    @MapperName("edad") val edad_old:Int?=null,
    @Mapper val correo: CorreoEntity? = null,
    @IgnoreField val final_id:String?=null,

)