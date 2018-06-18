package example2.finished

import khttp.responses.Response
import org.junit.Assert.assertEquals
import org.junit.Test

class PropfindFolderIT: AbstractTest(){

    private val aosReq = AOSRequest(
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

    private val aosExpResp = AOSResponse(
            header =
            """
@@0TfxBb1
3:3:HTTP/1.1 207 Multi-Status
Server: Apache-Coyote/1.1
MicrosoftSharePointTeamServices: 15.0.0.4420
MS-Author-Via: MS-FP/4.0,DAV
MicrosoftOfficeWebServer: 5.0_Collab
DocumentManagementServer: Properties Schema;Source Control;Version History;
DAV: 1,2
Allow: GET, POST, OPTIONS, HEAD, MKCOL, PUT, PROPFIND, PROPPATCH, DELETE, MOVE, COPY, GETLIB, LOCK, UNLOCK
Accept-Ranges: none
Content-Type: text/xml;charset=UTF-8
Content-Length: 2988
Date: Fri, 27 Apr 2018 14:07:36 GMT
""",
            body =
            """<?xml version="1.0" encoding="utf-8" ?>
<D:multistatus xmlns:D="DAV:" xmlns:Office="urn:schemas-microsoft-com:office:office" xmlns:Repl="http://schemas.microsoft.com/repl/" xmlns:Z="urn:schemas-microsoft-com:">
    <D:response>
        <D:href>http://localhost:8080/alfresco/aos/Sites/swsdp/documentLibrary/Budget%20Files/</D:href>
        <D:propstat>
            <D:prop>
                <D:displayname>Budget Files</D:displayname>
                <D:lockdiscovery/>
                <D:supportedlock/>
                <D:isFolder>t</D:isFolder>
                <D:iscollection>1</D:iscollection>
                <D:ishidden>0</D:ishidden>
                <D:getcontenttype>application/octet-stream</D:getcontenttype>
                <D:getcontentlength>0</D:getcontentlength>
                <D:resourcetype>
                    <D:collection/>
                </D:resourcetype>
                <Repl:authoritative-directory>t</Repl:authoritative-directory>
                <D:getlastmodified>2011-02-15T21:08:20Z</D:getlastmodified>
                <D:creationdate>2011-02-15T21:08:20Z</D:creationdate>
                <Repl:repl-uid>rid:{AFA4F0CB-F63E-729E-A8B4-68F52A115EB3}</Repl:repl-uid>
                <Repl:resourcetag>rt:{8AB12916-4897-47FB-94EB-1AB699822ECB}@00000000000</Repl:resourcetag>
                <D:getetag>&quot;{8AB12916-4897-47FB-94EB-1AB699822ECB},0&quot;</D:getetag>
            </D:prop>
            <D:status>HTTP/1.1 200 OK</D:status>
        </D:propstat>
    </D:response>
    <D:response>
        <D:href>http://localhost:8080/alfresco/aos/Sites/swsdp/documentLibrary/Budget%20Files/Invoices</D:href>
        <D:propstat>
            <D:prop>
                <D:displayname>Invoices</D:displayname>
                <D:lockdiscovery/>
                <D:supportedlock/>
                <D:isFolder>t</D:isFolder>
                <D:iscollection>1</D:iscollection>
                <D:ishidden>0</D:ishidden>
                <D:getcontenttype>application/octet-stream</D:getcontenttype>
                <D:getcontentlength>0</D:getcontentlength>
                <D:resourcetype>
                    <D:collection/>
                </D:resourcetype>
                <Repl:authoritative-directory>t</Repl:authoritative-directory>
                <D:getlastmodified>2011-02-15T21:12:14Z</D:getlastmodified>
                <D:creationdate>2011-02-15T21:12:14Z</D:creationdate>
                <Repl:repl-uid>rid:{AFC57CD1-F63E-729E-A8B4-68F52A115EB3}</Repl:repl-uid>
                <Repl:resourcetag>rt:{D56AFDC3-0174-4F8C-BCE8-977CAFD712AB}@00000000000</Repl:resourcetag>
                <D:getetag>&quot;{D56AFDC3-0174-4F8C-BCE8-977CAFD712AB},0&quot;</D:getetag>
            </D:prop>
            <D:status>HTTP/1.1 200 OK</D:status>
        </D:propstat>
    </D:response>
    <D:response>
        <D:href>http://localhost:8080/alfresco/aos/Sites/swsdp/documentLibrary/Budget%20Files/budget.xls</D:href>
        <D:propstat>
            <D:prop>
                <D:resourcetype />
                <D:displayname>budget.xls</D:displayname>
                <D:isFolder>f</D:isFolder>
                <D:lockdiscovery/>
                <D:supportedlock>
                    <D:lockentry>
                        <D:lockscope>
                            <D:exclusive/>
                        </D:lockscope>
                        <D:locktype>
                            <D:write/>
                        </D:locktype>
                    </D:lockentry>
                </D:supportedlock>
                <D:getlastmodified>2011-02-15T21:35:26Z</D:getlastmodified>
                <D:creationdate>2011-02-15T21:35:26Z</D:creationdate>
                <D:getcontentlength>26112</D:getcontentlength>
                <Repl:repl-uid>rid:{C260ECE1-F63E-729E-A8B4-68F52A115EB3}</Repl:repl-uid>
                <Repl:resourcetag>rt:{5FA74AD3-9B5B-461B-9DF5-DE407F1F4FE7}@00001000000</Repl:resourcetag>
                <D:getetag>&quot;{5FA74AD3-9B5B-461B-9DF5-DE407F1F4FE7},725602861&quot;</D:getetag>
                <Office:modifiedby>someuser</Office:modifiedby>
            </D:prop>
            <D:status>HTTP/1.1 200 OK</D:status>
        </D:propstat>
    </D:response>
</D:multistatus>
""")

    private val response: Response = khttp.request(
            method = aosReq.method,
            url = aosReq.url,
            headers = aosReq.header.toMap(3))

    @Test
    fun `response xml dtd schema validation`(){
        validateXML(
                dtd = "<!DOCTYPE D:multistatus SYSTEM \"src/test/resources/IT/aos-response-xml.dtd\">",
                xml = response.text)
    }

    @Test
    fun `compare response with exp result`(){
        // Remove white spaces and assert equals
        assertEquals(
                aosExpResp.body.replace("\\s".toRegex(), "").length,
                response.text.replace("\\s".toRegex(), "").length)
    }

}