package matheus.luna.wswork.kotlin.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import matheus.luna.wswork.kotlin.data.model.CarroModel
import matheus.luna.wswork.kotlin.databinding.ItemCarBinding

class MainAdapter : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    private var clickEvent: ((CarroModel) -> Unit)? = null
    fun clickEvent(listener: (CarroModel) -> Unit) {
        clickEvent = listener
    }

    inner class MainViewHolder(val binding: ItemCarBinding) : RecyclerView.ViewHolder(binding.root)

    private var listaCarros = mutableListOf<CarroModel>()

    fun setListaCarros(listaCarros: List<CarroModel>) {
        this.listaCarros = listaCarros.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            ItemCarBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val carro = listaCarros[position]
        holder.binding.apply {
            tvId.text = carro.id.toString()
            tvMarcaId.text = carro.marca_id.toString()
            tvMarcaNome.text = carro.marca_nome
            tvModeloNome.text = carro.nome_modelo
            tvAno.text = carro.ano.toString()
            tvCombustivel.text = carro.combustivel
            tvNumPortas.text = carro.num_portas.toString()
            tvNumPortas.text = carro.num_portas.toString()
            tvCor.text = carro.cor
            tvCadastro.text = carro.timestamp_cadastro.toString()
            btnEuQuero.setOnClickListener {
                clickEvent?.let {
                    it(listaCarros[position])
                }
            }
        }
    }

    override fun getItemCount(): Int = listaCarros.size
}