package matheus.luna.wswork.kotlin.repository

import matheus.luna.wswork.kotlin.data.model.CarroModel

sealed class RepositoryState {

    object NotFound : RepositoryState()
    data class Success(val listaCarros: List<CarroModel>) : RepositoryState()
    data class Error(val error: Throwable) : RepositoryState()
}