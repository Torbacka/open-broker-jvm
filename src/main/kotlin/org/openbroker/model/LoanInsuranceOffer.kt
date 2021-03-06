package org.openbroker.model

import org.openbroker.requireMin

data class LoanInsuranceOffer @JvmOverloads constructor(
    val insuredAmount: Int,
    val monthlyPremium: Int,
    val descriptiveText: String? = null
) {
    init {
        insuredAmount.requireMin(1, "insuredAmount")
        monthlyPremium.requireMin(1, "monthlyPremium")
    }
}