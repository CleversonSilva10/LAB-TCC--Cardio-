package br.com.tcc.tcccardiot21.di

import br.com.tcc.tcccardiot21.page.PageRepository
import br.com.tcc.tcccardiot21.page.presentation.viewmodel.PageViewModel
import br.com.tcc.tcccardiot21.page.presentation.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    factory { PageRepository() }
    viewModel { MainViewModel(get()) }
    viewModel { PageViewModel(get()) }
}