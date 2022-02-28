package task_3.model

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class Body (
    @field: JacksonXmlElementWrapper(useWrapping = false)
    @field: JacksonXmlProperty(localName = "PaymentCard")
    val paymentCard: List<PaymentCard>?=null
        )
{
    override fun toString(): String {
        return """
paymentCard >> 
$paymentCard
""".trimMargin()
    }
}