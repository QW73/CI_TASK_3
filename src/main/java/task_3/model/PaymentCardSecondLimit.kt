package task_3.model

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty


data class PaymentCardSecondLimit (
    var amountMax: String?=null,
    var limitTypeId: String?=null,
    var rest: String?=null,
    var summ: String?=null
)
{override fun toString(): String {
    return """
amountMax: $amountMax
amountMax: $limitTypeId
amountMax: $rest
amountMax: $summ

""".trimMargin()
}
}