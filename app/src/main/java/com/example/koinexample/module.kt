package com.example.koinexample

import org.koin.dsl.module


/**
 * module  - used to create a module
 * single - used to create singleton instance
 * factory - used when we want a new instance of the class every time we call it
 * get() - is used to get required dependency only if it has been specified in the module
 */
val appModule = module {
    single { Course() }
    factory { Friend() }
    factory { Student(get(), get()) }
}