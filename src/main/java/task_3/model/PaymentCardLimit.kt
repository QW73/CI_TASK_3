package task_3.model


data class PaymentCardLimit(

    var limitTypeId: String? =null,
    var operationCount: String?=null,
    var operationCountMax: String?=null,
    var operationCountRest: String?=null
)
{override fun toString(): String {
    return """
limitTypeId: $limitTypeId
operationCount: $operationCount
operationCountMax: $operationCountMax
operationCountRest: $operationCountRest
""".trimMargin()
}
}