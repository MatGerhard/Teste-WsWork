package matheus.luna.wswork.kotlin.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CarroModel(

    @SerializedName("id")
    val id: Int,
    @SerializedName("marca_id")
    val marca_id: Int,
    @SerializedName("marca_nome")
    val marca_nome: String,
    @SerializedName("nome_modelo")
    val nome_modelo: String,
    @SerializedName("ano")
    val ano: Int,
    @SerializedName("combustivel")
    val combustivel: String,
    @SerializedName("num_portas")
    val num_portas: Int,
    @SerializedName("valor_fipe")
    val valor_fipe: Int,
    @SerializedName("cor")
    val cor: String,
    @SerializedName("timestamp_cadastro")
    val timestamp_cadastro: Int
) : Serializable