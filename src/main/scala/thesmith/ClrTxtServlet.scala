package thesmith

import org.scalatra._
import scalate.ScalateSupport // ScalaSupport is a trait that adds scala support

class ClrTxtServlet extends ScalatraServlet with ScalateSupport {

    before {
        contentType = "text/html"
    }

    get("/") {
        // templateEngine is defined for you by ScalateSupport and can be used to help render your index.scaml content.
				templateEngine.layout("/WEB-INF/index.scaml", Map("content" -> "Hello World"))
    }

    protected def contextPath = request.getContextPath
}