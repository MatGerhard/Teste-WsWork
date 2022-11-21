package matheus.luna.wswork.kotlin.ui.activities.Main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import matheus.luna.wswork.kotlin.repository.CarrosRepository
import matheus.luna.wswork.kotlin.repository.RepositoryState

class MainViewModel (private val repository: CarrosRepository) : ViewModel() {

    val carrosState = MutableLiveData<RepositoryState>()

    fun getListaCarros() {
        viewModelScope.launch {
            when (val response = repository.getCarros()) {
                is RepositoryState.Success -> {
                    carrosState.value = RepositoryState.Success(response.listaCarros)
                }

                is RepositoryState.Error -> {
                    carrosState.value = RepositoryState.Error(response.error)
                }

                is RepositoryState.NotFound -> {
                    carrosState.value = RepositoryState.NotFound
                }
                else -> {}
            }
        }
    }
}