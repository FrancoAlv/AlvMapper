package com.grupoalv.mapper.entity

import com.grupoalv.decorador.TableEntity
import com.grupoalv.mapper.data.Address

@TableEntity(Address::class)
data class AddressEntity (val addressName:String?=null, val addresMulti:List<Int>?=null)