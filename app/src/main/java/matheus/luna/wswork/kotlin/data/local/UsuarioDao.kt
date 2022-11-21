package matheus.luna.wswork.kotlin.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UsuarioDao {

    @Insert
    fun insert(usuarioModel: UsuarioModel)

    @Query("SELECT * FROM UsuarioModel")
    fun getUsuarios(): List<UsuarioModel>
}