package task_3.model

data class PaymentCardResponse (
    var body: Body?=null,
    var head: Head?=null
        )
{
    override fun toString(): String {
        return """
PaymentCardResponse  
body >
$body

head >
$head

""".trimMargin()
    }
}