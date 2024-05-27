package woowacourse.shopping.presentation.ui.detail

import woowacourse.shopping.presentation.ui.counter.DefaultCounterHandler

interface DetailCounterHandler : DefaultCounterHandler {
    override fun increaseCount(productId: Long)

    override fun decreaseCount(productId: Long)
}