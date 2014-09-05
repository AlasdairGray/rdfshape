
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
object validationResult extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[ValidationResult,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(vr:ValidationResult):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.23*/("""

"""),_display_(/*3.2*/if(vr.status == None)/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
""")))}/*4.3*/else/*4.8*/{_display_(Seq[Any](format.raw/*4.9*/("""  

"""),_display_(/*6.2*/if(vr.status == Some(true))/*6.29*/ {_display_(Seq[Any](format.raw/*6.31*/("""

"""),format.raw/*8.1*/("""<p class="result_ok">"""),_display_(/*8.23*/vr/*8.25*/.msg),format.raw/*8.29*/("""</p>
"""),_display_(/*9.2*/Html(vr.toHTML())),format.raw/*9.19*/("""

"""),format.raw/*11.1*/("""<details>
<summary>RDF</summary>
<pre class="prettyprint linenums lang-turtle">"""),_display_(/*13.48*/vr/*13.50*/.str_rdf),format.raw/*13.58*/("""</pre>
</details>
"""),_display_(/*15.2*/if(vr.withSchema)/*15.19*/ {_display_(Seq[Any](format.raw/*15.21*/("""
	"""),format.raw/*16.2*/("""<details>
	<summary>Schema</summary>
	<pre class="prettyprint linenums lang-shex">"""),_display_(/*18.47*/vr/*18.49*/.str_schema),format.raw/*18.60*/("""</pre>
    </details>
""")))}),format.raw/*20.2*/("""

""")))}/*22.3*/else/*22.8*/{_display_(Seq[Any](format.raw/*22.9*/(""" 

"""),format.raw/*24.1*/("""<p class="result_bad">
<pre>"""),_display_(/*25.7*/vr/*25.9*/.msg),format.raw/*25.13*/("""</pre>
</p>

<details>
<summary>RDF</summary>
<pre class="prettyprint linenums lang-turtle">"""),_display_(/*30.48*/vr/*30.50*/.str_rdf),format.raw/*30.58*/("""</pre>
</details>
"""),_display_(/*32.2*/if(vr.withSchema)/*32.19*/ {_display_(Seq[Any](format.raw/*32.21*/("""
	"""),format.raw/*33.2*/("""<details>
	<summary>Schema</summary>
	<pre class="prettyprint linenums lang-shex">"""),_display_(/*35.47*/vr/*35.49*/.str_schema),format.raw/*35.60*/("""</pre>
	</details>
""")))}),format.raw/*37.2*/("""

""")))}),format.raw/*39.2*/("""

"""),format.raw/*41.1*/("""<a href=""""),_display_(/*41.11*/routes/*41.17*/.Validator.validate_get(
	         vr.str_rdf,
	         Some(vr.opts_rdf.syntax.toString),
	         vr.opts_rdf.showRDF,
	         vr.schema_param,
	         vr.opt_iri_param,
	         vr.opt_schema.cut,
	         vr.opt_schema.withIncoming,
	         vr.opt_schema.withAny,
	         vr.opt_schema.showSchema
	         )),format.raw/*51.12*/("""">Generate permalink</a>

""")))}),format.raw/*53.2*/("""
"""))}
  }

  def render(vr:ValidationResult): play.twirl.api.HtmlFormat.Appendable = apply(vr)

  def f:((ValidationResult) => play.twirl.api.HtmlFormat.Appendable) = (vr) => apply(vr)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Sep 05 16:22:58 BST 2014
                  SOURCE: /Users/Alasdair/Workspace/HCLSValidator/rdfshape-ag/rdfshape/app/views/validationResult.scala.html
                  HASH: 72943794210a75016c2eaa9488059c4f68606890
                  MATRIX: 526->1|635->22|663->25|692->46|731->48|750->51|761->56|798->57|828->62|863->89|902->91|930->93|978->115|988->117|1012->121|1043->127|1080->144|1109->146|1216->226|1227->228|1256->236|1301->255|1327->272|1367->274|1396->276|1506->359|1517->361|1549->372|1602->395|1623->399|1635->404|1673->405|1703->408|1758->437|1768->439|1793->443|1913->536|1924->538|1953->546|1998->565|2024->582|2064->584|2093->586|2203->669|2214->671|2246->682|2296->702|2329->705|2358->707|2395->717|2410->723|2755->1047|2812->1074
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|25->4|27->6|27->6|27->6|29->8|29->8|29->8|29->8|30->9|30->9|32->11|34->13|34->13|34->13|36->15|36->15|36->15|37->16|39->18|39->18|39->18|41->20|43->22|43->22|43->22|45->24|46->25|46->25|46->25|51->30|51->30|51->30|53->32|53->32|53->32|54->33|56->35|56->35|56->35|58->37|60->39|62->41|62->41|62->41|72->51|74->53
                  -- GENERATED --
              */
          