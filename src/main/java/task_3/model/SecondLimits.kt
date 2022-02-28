package task_3.model

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty


data class SecondLimits (
    @JacksonXmlProperty(localName = "PaymentCardLimit" )
    var paymentCardLimit: PaymentCardLimit?=PaymentCardLimit(),
    @JacksonXmlProperty(localName = "PaymentCardSecondLimit")
    val paymentCardSecondLimit: PaymentCardSecondLimit?=PaymentCardSecondLimit()
)
{override fun toString(): String {
    return """
paymentCardLimit >>>>>> 
$paymentCardLimit

paymentCardSecondLimit >>>>>> 
$paymentCardSecondLimit
""".trimMargin()
}
}