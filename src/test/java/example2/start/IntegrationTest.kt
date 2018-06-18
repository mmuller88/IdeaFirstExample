package example2.start

// https://kotlinlang.org/docs/reference/data-classes.html
data class AOSRequest(val method: String, val url: String, val header: String, val body: String)
data class AOSResponse(val header: String, val body: String)
























val aosReq = AOSRequest(
        method = "PROPFIND",
        url = "http://localhost:8080/alfresco/aos/Sites/swsdp/documentLibrary/Budget%20Files/",
        header =
        """
E@@0x@Tf1x
3:3:PROPFIND /alfresco/aos/Sites/swsdp/documentLibrary/Budget%20Files/ HTTP/1.1
Depth: 1
Content-Type: text/xml; charset=utf-8
Content-Length: 210
Host: localhost:8080
Connection: Keep-Alive
User-Agent: Cyberduck/6.3.2.27291 (Mac OS X/10.13.4) (x86_64)
Cookie: JSESSIONID=413BAC7A73511A54ADCAF34055FCBA00
Accept-Encoding: gzip,deflate
Authorization: Basic 1231111222GutenMorgen
""",
        body =
        """<?xml version="1.0" encoding="UTF-8"?>
<propfind xmlns="DAV:">
   <prop>
      <creationdate />
      <displayname />
      <getcontentlength />
      <getcontenttype />
      <getetag />
      <getlastmodified />
      <resourcetype />
   </prop>
</propfind>
""")

















val aosRequest = AOSRequest("POST", "http://", "h1: v1", "I have a nice Body")
val aosResponse = AOSResponse("Accept: txt", "body stuff")


fun main(args : Array<String>) {
    println("")
}