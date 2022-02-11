package com.conamobile.pdpobjectsendandback.mode

import java.io.Serializable

class User(var name:String): Serializable {

    override fun toString(): String {
        return "Object: $name"
    }

}