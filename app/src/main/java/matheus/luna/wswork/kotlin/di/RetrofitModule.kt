package matheus.luna.wswork.kotlin.di

import matheus.luna.wswork.kotlin.data.remoto.ServiceAPI
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

val retrofitModule = module {
    single(named("BASE_URL")) {
        "https://wswork.com.br/"
    }
    single {
        Retrofit.Builder()
            .baseUrl(get<String>(named("BASE_URL")))
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    single {
        get<Retrofit>().create(ServiceAPI::class.java)
    }
}