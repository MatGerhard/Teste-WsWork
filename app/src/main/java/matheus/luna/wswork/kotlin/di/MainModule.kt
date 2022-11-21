package matheus.luna.wswork.kotlin.di

import matheus.luna.wswork.kotlin.repository.CarrosRepository
import matheus.luna.wswork.kotlin.repository.CarrosRepositoryImpl
import matheus.luna.wswork.kotlin.ui.activities.Main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module{
    single<CarrosRepository> {
        CarrosRepositoryImpl(api = get(), dao = get())
    }

    viewModel {
        MainViewModel(get())
    }
}