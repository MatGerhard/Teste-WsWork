package matheus.luna.wswork.kotlin.repository

import matheus.luna.wswork.kotlin.data.model.CarroModel

interface CarrosRepository {

    suspend fun getCarros() : RepositoryState
    suspend fun getUsuarios()
}