package matheus.luna.wswork.kotlin.data.remoto

import matheus.luna.wswork.kotlin.data.model.CarroModel
import retrofit2.http.GET

interface ServiceAPI {

    @GET("cars.json")
    suspend fun getCarros(): List<CarroModel>

//    companion object {
//        private val retrofit: ServiceAPI by lazy {
//
//            val retrofitBuilder = Retrofit.Builder()
//                .baseUrl("https://wswork.com.br/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//
//            retrofitBuilder.create(ServiceAPI::class.java)
//        }
//
//        fun getInstance(): ServiceAPI {
//            return retrofit
//        }
//    }
}