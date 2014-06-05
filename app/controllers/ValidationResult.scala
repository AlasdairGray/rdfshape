package controllers

import es.weso.shex._
import es.weso.monads._
import es.weso.parser.PrefixMap
import xml.Utility.escape
import es.weso.rdfgraph.nodes.RDFNode
import es.weso.rdfgraph.nodes.IRI

case class ValidationResult(
    msg: String, 
    rs: Stream[Typing],
    str_rdf: String,
    str_schema: String,
    iri: Option[IRI],
    pm: PrefixMap) {

  def typing2Html(typing: Typing): String = {
    val sb = new StringBuilder
    sb.append("<tr><th>Node</th><th>Shape</th></tr>")
    for ((node,ts) <- typing.map) {
      sb.append("<tr><td>" + node2Html(node) + 
    		  		 "</td><td>" + nodes2Html(ts) + "</td></tr>")
    }
    sb.toString
  }
  
   def nodes2Html(nodes: Set[RDFNode]): String = {
     val sb = new StringBuilder
     sb.append("<ul class=\"nodes\">")
     for (node <- nodes) {
       sb.append("<li>" + node2Html(node) + "</li>")
     }
     sb.append("</ul>")
     sb.toString
   }

   def node2Html(node: RDFNode): String = {
     if (node.isIRI) ("<a href=\"" + node.toIRI.str + "\">" + escape(node.toIRI.str) + "</a>")
     else escape(node.toString)
   }
    
   def toHTML(cut: Int): String = {
    val sb = new StringBuilder
    sb.append("<p class=\"result\">" + msg + "</p>")
    sb.append("<table>")
    for (t <- rs.take(cut)) {
      sb.append("<tr>" + typing2Html(t) + "</tr>")
    }
    sb.append("</table>") 
    sb.toString
  }
}

object ValidationResult {
  def empty = ValidationResult("",Stream(), "","", None, PrefixMap.empty)
  
  def failure(e: Throwable,str_rdf:String, str_schema: String = "") : ValidationResult = {
    ValidationResult(e.getMessage, Stream(),str_rdf,str_schema,None,PrefixMap.empty)
  }

  def withMessage(msg: String) : ValidationResult = {
    ValidationResult(msg, Stream(),"","",None,PrefixMap.empty)
  }
}