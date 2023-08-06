package com.grupoalv.mapper.entity

import com.grupoalv.decorador.Mapper
import com.grupoalv.decorador.PrimaryMapper
import com.grupoalv.decorador.TableEntity
import com.grupoalv.mapper.data.Persona

@TableEntity(Persona::class)
data class PersonawithAdress (
    @PrimaryMapper
    val personaEntity: PersonaEntity?=null,
    @Mapper
    val addressEntity: AddressEntity?=null)