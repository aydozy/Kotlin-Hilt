package com.aydanilozyurek.kotlinhilt

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample @Inject constructor(private val myInterfaceImplementer: MyInterface, private val gson: Gson) {

    fun myFunction() : String{
        return "Working: ${myInterfaceImplementer.myPrintFunction()}"
    }

}