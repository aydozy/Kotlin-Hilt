package com.aydanilozyurek.kotlinhilt

import javax.inject.Inject
import javax.inject.Singleton


// Constructor Injection
@Singleton
class Musicians @Inject constructor(instrument: Instrument, band: Band) {

    fun sing() {
        println("working..")
    }
}