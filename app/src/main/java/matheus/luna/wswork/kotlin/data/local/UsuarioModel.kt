package matheus.luna.wswork.kotlin.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UsuarioModel(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val nome: String,
    val nome_modelo: String,
    val nome_marca: String
)