package solaraenterprises.streetfood.bitelanebasket.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import solaraenterprises.streetfood.bitelanebasket.data.database.dao.CartItemDao
import solaraenterprises.streetfood.bitelanebasket.data.database.dao.OrderDao
import solaraenterprises.streetfood.bitelanebasket.data.database.converter.Converters
import solaraenterprises.streetfood.bitelanebasket.data.entity.CartItemEntity
import solaraenterprises.streetfood.bitelanebasket.data.entity.OrderEntity

@Database(
    entities = [CartItemEntity::class, OrderEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class XOENAppDatabase : RoomDatabase() {

    abstract fun cartItemDao(): CartItemDao

    abstract fun orderDao(): OrderDao
}