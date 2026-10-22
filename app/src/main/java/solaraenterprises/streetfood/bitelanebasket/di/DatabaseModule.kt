package solaraenterprises.streetfood.bitelanebasket.di

import androidx.room.Room
import solaraenterprises.streetfood.bitelanebasket.data.database.XOENAppDatabase
import org.koin.dsl.module

private const val DB_NAME = "xoen_db"

val databaseModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = XOENAppDatabase::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<XOENAppDatabase>().cartItemDao() }

    single { get<XOENAppDatabase>().orderDao() }
}