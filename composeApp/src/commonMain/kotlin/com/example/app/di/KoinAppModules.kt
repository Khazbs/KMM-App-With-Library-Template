package com.example.app.di

import com.example.app.data.InMemoryMuseumStorage
import com.example.app.data.MuseumRepository
import com.example.app.data.MuseumStorage
import com.example.app.screens.detail.DetailScreenModel
import com.example.app.screens.list.ListScreenModel
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val dataModule = module {
    single<MuseumStorage> { InMemoryMuseumStorage() }
    single {
        MuseumRepository(get(), get()).apply {
            initialize()
        }
    }
}

val screenModelsModule = module {
    factoryOf(::ListScreenModel)
    factoryOf(::DetailScreenModel)
}
