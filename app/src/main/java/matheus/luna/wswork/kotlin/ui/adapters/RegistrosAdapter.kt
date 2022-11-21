package matheus.luna.wswork.kotlin.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import matheus.luna.wswork.kotlin.data.local.UsuarioModel
import matheus.luna.wswork.kotlin.databinding.ItemRegistroBinding

class RegistroAdapter(var registros: List<UsuarioModel>) :
    RecyclerView.Adapter<RegistroAdapter.RegistrosViewHolder>() {

    inner class RegistrosViewHolder(val binding: ItemRegistroBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RegistrosViewHolder {
        return RegistrosViewHolder(
            ItemRegistroBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: RegistrosViewHolder, position: Int) {
        val registro = registros[position]
        holder.binding.apply {
            tvRegistro.text = registro.nome
            tvMarcaNome.text = registro.nome_marca
            tvModeloNome.text = registro.nome_modelo
        }
    }

    override fun getItemCount(): Int = registros.size
}