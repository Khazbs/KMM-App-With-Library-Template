package com.example.app.di

import org.koin.core.context.startKoin

fun initKoin() {
    startKoin {
        modules(
            dataModule,
            networkModule,
            screenModelsModule,
        )
    }
}
