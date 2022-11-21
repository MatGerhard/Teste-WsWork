package matheus.luna.wswork.kotlin.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import matheus.luna.wswork.kotlin.data.model.CarroModel
import matheus.luna.wswork.kotlin.databinding.ActivityUsuarioBinding

class UsuarioAdapter(var carros: List<CarroModel>) :
    RecyclerView.Adapter<UsuarioAdapter.UsuarioViewHolder>() {

    inner class UsuarioViewHolder(val binding: ActivityUsuarioBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioViewHolder {
        return UsuarioViewHolder(
            ActivityUsuarioBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: UsuarioViewHolder, position: Int) {
        val carro = carros[position]
        holder.binding.apply {
            tvMarcaModelo.text = carro.nome_modelo
        }
    }

    override fun getItemCount(): Int = carros.size
}