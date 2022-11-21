package matheus.luna.wswork.kotlin.di

import android.app.Application
import androidx.room.Room
import matheus.luna.wswork.kotlin.data.local.UsuarioDao
import matheus.luna.wswork.kotlin.data.local.UsuarioDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val daoModule = module {
    fun provideDatabase(application: Application): UsuarioDatabase {
        return Room.databaseBuilder(application, UsuarioDatabase::class.java, "USUARIO")
            .build()
    }

    fun provideDao(database: UsuarioDatabase): UsuarioDao {
        return database.getUsuarioDao()
    }
    single { provideDatabase(androidApplication()) }
    single { provideDao(get()) }
}