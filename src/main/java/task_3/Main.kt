package task_3

import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.dataformat.xml.XmlMapper
import task_3.model.*

import java.io.File
import java.io.InputStream

fun main(){
//prep
  val  paymentCardLimit1 = PaymentCardLimit(
      "3001",
              "10",
      "10",
  "0"
  )
    val paymentCardSecondLimit1 = PaymentCardSecondLimit(
        "30000.00",
                "3002",
        "0.00",
        "30000.00"
    )
    val paymentCardLimits1= listOf(
        SecondLimits(paymentCardLimit1,paymentCardSecondLimit1)
    )
    val limits1= listOf(
        PaymentCardLimits(paymentCardLimits1)
    )
    val paymentCard1 = PaymentCard(
        "40817810200999999999",
        "12345.0",
        "1",
        "3007999111999035",
        "3007********9035",
        "Иванов Иван Иванович",
        "0000001",
        "IVAN IVANOV",
        "2023-04-20T11:19:58+03:00",
        limits = Limits(limits1)
    )
    val  paymentCardLimit2 = PaymentCardLimit(
        "3001",
        "20",
        "20",
        "0"
    )
    val paymentCardSecondLimit2 = PaymentCardSecondLimit(
        "50000.00",
        "3002",
        "0.00",
        "50000.00"
    )
    val paymentCardLimits2= listOf(
        SecondLimits(paymentCardLimit2,paymentCardSecondLimit2)
    )
    val limits2= listOf(
        PaymentCardLimits(paymentCardLimits2)
    )
    val paymentCard2 = PaymentCard(
        "40817810200999999999",
        "0.0",
        "1",
        "3007999111999036",
        "3007********9036",
        "Иванов Иван Иванович",
        "0000002",
        "IVAN IVANOV",
        "2023-04-20T11:19:58+03:00",
        limits = Limits(limits2)
    )
    val body= listOf(
        paymentCard1,
        paymentCard2
    )
    val head = Head(
        "branchId",
    "C1",
        "OK",
        "ABS"
    )
    val paymentCardResponse = PaymentCardResponse(
        body=Body(body),
        head
)

    //From XML to Object
    val pathFile = "src/main/resources/source.xml"
val personsUnmarshal = convertXmlFileDataObject(pathFile, PaymentCardResponse::class.java)
println("\r\nUnmarshalling:\r\n" + personsUnmarshal)

    //From Object to XML
    val pathFile2 = "src/main/resources/sourceResult.xml"
    writeXMLFile(paymentCardResponse, pathFile2)
    println("\r\nMarshalling was successful\r\n")
    readFile()
}


//Fun Object to XML
fun writeXMLFile(obj: Any, pathFile: String) {
    val xmlMapper = XmlMapper()
    xmlMapper.enable(SerializationFeature.INDENT_OUTPUT)
    xmlMapper.writeValue(File(pathFile), obj)
}

// Fun XML to Object
fun convertXmlFileDataObject(pathFile: String, cls: Class<*>): Any {
    val xmlMapper = XmlMapper()
    return xmlMapper.readValue(File(pathFile), cls)

}
// Fun read XML
fun readFile() {
    val inputStream: InputStream = File("src/main/resources/source.xml").inputStream()
    val lineList = mutableListOf<String>()
    inputStream.bufferedReader().forEachLine { lineList.add(it) }
    lineList.forEach{println(">  " + it)}
}