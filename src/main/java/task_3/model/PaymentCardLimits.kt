package task_3.model

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty

data class PaymentCardLimits(
    @field: JacksonXmlElementWrapper(useWrapping = false)
    @field: JacksonXmlProperty(localName = "limits")
    val secondLimits: List<SecondLimits>?=null
)
{override fun toString(): String {
    return """
limits >>>>> 
$secondLimits
""".trimMargin()
}
}