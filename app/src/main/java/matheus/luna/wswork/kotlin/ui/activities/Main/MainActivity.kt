package matheus.luna.wswork.kotlin.ui.activities.Main

import org.koin.androidx.viewmodel.ext.android.viewModel
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import matheus.luna.wswork.kotlin.R
import matheus.luna.wswork.kotlin.databinding.ActivityMainBinding
import matheus.luna.wswork.kotlin.repository.RepositoryState
import matheus.luna.wswork.kotlin.ui.adapters.MainAdapter

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val viewModel: MainViewModel by viewModel()
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        viewModel.getListaCarros()
        viewModel.carrosState.observe(this) {
            when (it) {
                is RepositoryState.Success -> {
                    mainAdapter = MainAdapter()
                    binding.rvCarros.adapter = mainAdapter
                    mainAdapter.setListaCarros(it.listaCarros)
                }

                is RepositoryState.Error -> {
                    Toast.makeText(this, it.error.toString(), Toast.LENGTH_SHORT).show()
                }

                is RepositoryState.NotFound -> {
                    Toast.makeText(this, "Lista não encontrada", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}