
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
<head>
<title>"""),_display_(/*7.9*/title),format.raw/*7.14*/("""</title>
<link rel="stylesheet" media="screen" href=""""),_display_(/*8.46*/routes/*8.52*/.Assets.at("lib/jquery-ui/jquery-ui.min.css")),format.raw/*8.97*/("""">
<link rel="stylesheet" media="screen" href='"""),_display_(/*9.46*/routes/*9.52*/.WebJarAssets.at(WebJarAssets.locate("prettify.css"))),format.raw/*9.105*/("""'></script>

<script type='text/javascript' src='"""),_display_(/*11.38*/routes/*11.44*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*11.98*/("""'></script>
<script type='text/javascript' src='"""),_display_(/*12.38*/routes/*12.44*/.WebJarAssets.at(WebJarAssets.locate("jquery-ui.min.js"))),format.raw/*12.101*/("""'></script>

<!-- The following files would be for codemirror but are not used now 
<script type='text/javascript' src='"""),_display_(/*15.38*/routes/*15.44*/.WebJarAssets.at(WebJarAssets.locate("codemirror.js"))),format.raw/*15.98*/("""'></script>
<script type='text/javascript' src='"""),_display_(/*16.38*/routes/*16.44*/.WebJarAssets.at(WebJarAssets.locate("mode/sparql/sparql.js"))),format.raw/*16.106*/("""'></script>
<script type='text/javascript' src='"""),_display_(/*17.38*/routes/*17.44*/.WebJarAssets.at(WebJarAssets.locate("mode/turtle/turtle.js"))),format.raw/*17.106*/("""'></script>
<script type='text/javascript' src='"""),_display_(/*18.38*/routes/*18.44*/.WebJarAssets.at(WebJarAssets.locate("runmode/runmode.js"))),format.raw/*18.103*/("""'></script> 
<script type='text/javascript' src='"""),_display_(/*19.38*/routes/*19.44*/.WebJarAssets.at(WebJarAssets.locate("runmode/colorize.js"))),format.raw/*19.104*/("""'></script>
<script type='text/javascript' src='"""),_display_(/*20.38*/routes/*20.44*/.WebJarAssets.at(WebJarAssets.locate("edit/matchbrackets.js"))),format.raw/*20.106*/("""'></script> -->
<script type='text/javascript' src='"""),_display_(/*21.38*/routes/*21.44*/.WebJarAssets.at(WebJarAssets.locate("prettify.js"))),format.raw/*21.96*/("""'></script>

<link rel="stylesheet" media="screen" href=""""),_display_(/*23.46*/routes/*23.52*/.Assets.at("stylesheets/main.css")),format.raw/*23.86*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(/*24.51*/routes/*24.57*/.Assets.at("images/favicon.png")),format.raw/*24.89*/("""">

</head>
<body onload="prettyPrint()">
<header>
<h1 id="title"><a href=""""),_display_(/*29.26*/routes/*29.32*/.Application.index),format.raw/*29.50*/(""""><i>RDFShape</i>: RDF Validator using Shape Expressions</a></h1>
<p class="about"><a href=""""),_display_(/*30.28*/routes/*30.34*/.Application.about()),format.raw/*30.54*/("""">About</a></p>
</header>
"""),_display_(/*32.2*/content),format.raw/*32.9*/("""
"""),format.raw/*33.1*/("""<footer>
<div>Developed by: <a href="http://www.weso.es">WESO Research Group</a></div>
</footer>
<script src=""""),_display_(/*36.15*/routes/*36.21*/.Assets.at("javascripts/tabs.js")),format.raw/*36.54*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*37.15*/routes/*37.21*/.Assets.at("javascripts/lang-turtle.js")),format.raw/*37.61*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*38.15*/routes/*38.21*/.Assets.at("javascripts/lang-shex.js")),format.raw/*38.59*/("""" type="text/javascript"></script>
<script>

/* Uncomment the following to try to colorize textarea's using codemirror 
  var rdf_editor = CodeMirror.fromTextArea(document.getElementById("rdf_textarea"), """),format.raw/*42.85*/("""{"""),format.raw/*42.86*/("""
	   """),format.raw/*43.5*/("""mode: "text/turtle",
	   lineNumbers: true
	 """),format.raw/*45.3*/("""}"""),format.raw/*45.4*/(""");

var schema_editor = CodeMirror.fromTextArea(document.getElementById("schema_textarea"), """),format.raw/*47.89*/("""{"""),format.raw/*47.90*/("""
		   """),format.raw/*48.6*/("""mode: "text/turtle",
		   lineNumbers: true
		 """),format.raw/*50.4*/("""}"""),format.raw/*50.5*/(""");

rdf_editor.refresh();
schema_editor.refresh(); */
/*setTimeout(function()"""),format.raw/*54.24*/("""{"""),format.raw/*54.25*/("""CodeMirror.colorize();"""),format.raw/*54.47*/("""}"""),format.raw/*54.48*/(""", 20);*/

</script>
</body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Sep 05 16:13:50 BST 2014
                  SOURCE: /Users/Alasdair/Workspace/HCLSValidator/rdfshape-ag/rdfshape/app/views/main.scala.html
                  HASH: 31a91f8c42967efff58a6e36334c833f3cce90c6
                  MATRIX: 509->1|627->31|655->33|719->72|744->77|824->131|838->137|903->182|977->230|991->236|1065->289|1142->339|1157->345|1232->399|1308->448|1323->454|1402->511|1550->632|1565->638|1640->692|1716->741|1731->747|1815->809|1891->858|1906->864|1990->926|2066->975|2081->981|2162->1040|2239->1090|2254->1096|2336->1156|2412->1205|2427->1211|2511->1273|2591->1326|2606->1332|2679->1384|2764->1442|2779->1448|2834->1482|2914->1535|2929->1541|2982->1573|3085->1649|3100->1655|3139->1673|3259->1766|3274->1772|3315->1792|3368->1819|3395->1826|3423->1827|3561->1938|3576->1944|3630->1977|3706->2026|3721->2032|3782->2072|3858->2121|3873->2127|3932->2165|4164->2369|4193->2370|4225->2375|4297->2420|4325->2421|4445->2513|4474->2514|4507->2520|4581->2567|4609->2568|4714->2645|4743->2646|4793->2668|4822->2669
                  LINES: 19->1|22->1|24->3|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|32->11|32->11|32->11|33->12|33->12|33->12|36->15|36->15|36->15|37->16|37->16|37->16|38->17|38->17|38->17|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|42->21|42->21|42->21|44->23|44->23|44->23|45->24|45->24|45->24|50->29|50->29|50->29|51->30|51->30|51->30|53->32|53->32|54->33|57->36|57->36|57->36|58->37|58->37|58->37|59->38|59->38|59->38|63->42|63->42|64->43|66->45|66->45|68->47|68->47|69->48|71->50|71->50|75->54|75->54|75->54|75->54
                  -- GENERATED --
              */
          