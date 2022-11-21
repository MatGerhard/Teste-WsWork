package matheus.luna.wswork.kotlin.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UsuarioModel::class], version = 1)
abstract class UsuarioDatabase : RoomDatabase() {

    abstract fun getUsuarioDao(): UsuarioDao

//    companion object {
//
//        @Volatile
//        private var instance: UsuarioDatabase? = null
//        private val Lock = Any()
//
//        operator fun invoke(context: Context) = instance ?: synchronized(Lock) {
//            instance ?: createdDatabase(context).also { usuarioDatabase ->
//                instance = usuarioDatabase
//            }
//        }
//
//        private fun createdDatabase(context: Context) =
//
//            Room.databaseBuilder(
//                context.applicationContext,
//                UsuarioDatabase::class.java,
//                "usuario_db.db"
//            ).build()
//    }
}