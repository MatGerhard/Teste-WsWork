package matheus.luna.wswork.kotlin.repository

import matheus.luna.wswork.kotlin.data.local.UsuarioDao
import matheus.luna.wswork.kotlin.data.remoto.ServiceAPI

class CarrosRepositoryImpl constructor(
    private val api: ServiceAPI,
    private val dao: UsuarioDao
) : CarrosRepository {
    override suspend fun getCarros(): RepositoryState {

        return try {
            val response = api.getCarros()
            if (response.isNotEmpty()) {
                RepositoryState.Success(response)
            } else {
                RepositoryState.NotFound
            }
        } catch (error: Exception) {
            RepositoryState.Error(error)
        }
    }

    override suspend fun getUsuarios() {
        dao.getUsuarios()
    }

}