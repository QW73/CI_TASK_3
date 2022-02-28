package task_3.model

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class Limits (
    @field: JacksonXmlElementWrapper(useWrapping = false)
    @field: JacksonXmlProperty(localName = "PaymentCardLimits")
    val paymentCardLimits: List<PaymentCardLimits>?=null
        )
{override fun toString(): String {
    return """
paymentCardLimits >>>> 
$paymentCardLimits
""".trimMargin()
}
}