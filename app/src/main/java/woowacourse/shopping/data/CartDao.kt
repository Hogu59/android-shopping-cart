package woowacourse.shopping.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import woowacourse.shopping.data.model.CartItemEntity

@Dao
interface CartDao {
    @Insert
    fun save(cartItemEntity: CartItemEntity)

    @Query("SELECT * FROM cart_items WHERE id = :id")
    fun find(id: Long): CartItemEntity

    @Query("SELECT * FROM cart_items")
    fun findAll(): List<CartItemEntity>

    @Query("DELETE FROM cart_items WHERE id = :id")
    fun delete(id: Long)

    @Query("DELETE FROM cart_items")
    fun deleteAll()
}