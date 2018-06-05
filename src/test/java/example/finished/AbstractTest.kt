package org.alfresco.module.aosmodule.kotlin

import org.xml.sax.InputSource
import javax.xml.parsers.DocumentBuilderFactory
import khttp.delete as httpDelete
import java.io.StringReader

data class AOSRequest(val method: String, val url: String, val header: String, val body: String)
data class AOSResponse(val header: String, val body: String)

open class AbstractTest {

    /**
     *
     * Extension function for casting a header String to a map e.g.:
     *
    Depth: 1
    Content-Type: text/xml; charset=utf-8
    Content-Length: 210
    Host: localhost:8080
    Connection: Keep-Alive
     *
     * @param dropN = Drop first N lines
     *
     */
    protected fun String.toMap(dropN: Int): Map<String, String> {
        var resultMap: MutableMap<String, String> = mutableMapOf()
        // drop some firsts lines because they are not part of the header
        val lines = lines().drop(dropN)
        // generate header map
        lines.forEach {
            resultMap[it.substringBefore(":")] = it.substringAfter(":")
        }
        return resultMap
    }

    /**
     * This does a schema check
     *
     * @param dtd = Reference to the dtd. E.g.:
     *      "<!DOCTYPE D:multistatus SYSTEM \" src/test/resources/IT/aos-response-xml.dtd\">"
     * @param xml = xml code in String
     */
    protected fun validateXML(dtd: String, xml: String){
        val factory = DocumentBuilderFactory.newInstance()
        factory.isValidating = true
        factory.isNamespaceAware = true

        val aosExpRespBodyWithDTD = xml.replace("?>", "?> $dtd")

        val iS = InputSource()
        iS.characterStream = StringReader(aosExpRespBodyWithDTD)
        factory.newDocumentBuilder().parse(iS)
    }
}

//fun main(args: Array<String>) {

    // Now we could do:
    // - compare with real SharePoint. But will be hard ...
    // - Levenshtein Distance wit expected response and other distance
    // http://blog.sodhanalibrary.com/2014/03/text-comparison-in-java_27.html#.WukwydMvykY
    // - len of the response and compare with expected response

    // Parallel work
    // - Requests + Responses for all use cases LOCK, UNLOCK see:
    // aosReq; aosExpResp
    // - finish aos-response-xml.dtd . There is a helper dtd webdav-1.0.dtd see:
    // validateXML("", "")

    // Tested
    // println(aosReq.header.toMap(3))
    // println(response)
    // println(response.content)
    //    validateXML(
    //            dtd = "<!DOCTYPE D:multistatus SYSTEM \"alfresco-aos-module/src/test/resources/IT/aos-response-xml.dtd\">",
    //            xml = aosExpResp.body)
    //}