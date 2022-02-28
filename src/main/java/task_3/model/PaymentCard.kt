package task_3.model

data class PaymentCard (
    val account: String?=null,
    val balance: String?=null,
    val blocking: String?=null,
    val cardNumber: String?=null,
    val cardNumberMask: String?=null,
    val cardholderName: String?=null,
    val designId: String?=null,
    val embossedName: String?=null,
    val expirationDate: String?=null,
    val limits: Limits?=Limits()
        )
{
    override fun toString(): String {
        return """
paymentCard >>
account: $account
balance: $balance
blocking: $blocking
cardNumber: $cardNumber
cardNumberMask: $cardNumberMask
cardholderName: $cardholderName
designId: $designId
embossedName: $embossedName
expirationDate: $expirationDate
limits >>>
$limits
""".trimMargin()
    }
}