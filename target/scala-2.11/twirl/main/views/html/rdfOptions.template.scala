
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
object rdfOptions extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[RDFOptions,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rdfOptions: RDFOptions):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import play.api.i18n.Messages

Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<fieldset>
<legend>"""),_display_(/*6.10*/Messages("RDF.options")),format.raw/*6.33*/("""</legend>
<label for="showRDF">"""),_display_(/*7.23*/Messages("showRDF")),format.raw/*7.42*/("""</label>
    <input 
    	type="radio" name="showRDF" value="true"
    	"""),_display_(/*10.7*/{if(rdfOptions.showRDF==true) { "checked" }}),format.raw/*10.51*/(""">
    	<label>true</label><br/>
	<input 
		type="radio" name="showRDF" value="false" 
		"""),_display_(/*14.4*/{if(rdfOptions.showRDF==false) { "checked" }}),format.raw/*14.49*/(""">
		<label>false</label>
<br/>
<label for="Syntax">"""),_display_(/*17.22*/Messages("syntax")),format.raw/*17.40*/("""</label>
    <select name="syntax">
      """),_display_(/*19.8*/for(s <- RDFOptions.availableSyntaxes) yield /*19.46*/ {_display_(Seq[Any](format.raw/*19.48*/("""
      	"""),format.raw/*20.8*/("""<option value=""""),_display_(/*20.24*/s),format.raw/*20.25*/(""""
      	 """),_display_(/*21.10*/{if(rdfOptions.syntax==s) { "checked" }}),format.raw/*21.50*/(""">"""),_display_(/*21.52*/s),format.raw/*21.53*/("""</option>
      """)))}),format.raw/*22.8*/("""
    """),format.raw/*23.5*/("""</select>
 
</fieldset>"""))}
  }

  def render(rdfOptions:RDFOptions): play.twirl.api.HtmlFormat.Appendable = apply(rdfOptions)

  def f:((RDFOptions) => play.twirl.api.HtmlFormat.Appendable) = (rdfOptions) => apply(rdfOptions)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Sep 05 16:22:58 BST 2014
                  SOURCE: /Users/Alasdair/Workspace/HCLSValidator/rdfshape-ag/rdfshape/app/views/rdfOptions.scala.html
                  HASH: 778b047af89fb87d10c553938cb35444bf9aa570
                  MATRIX: 514->1|655->25|683->58|710->59|756->79|799->102|857->134|896->153|995->226|1060->270|1175->359|1241->404|1320->456|1359->474|1428->517|1482->555|1522->557|1557->565|1600->581|1622->582|1660->593|1721->633|1750->635|1772->636|1819->653|1851->658
                  LINES: 19->1|22->1|24->4|25->5|26->6|26->6|27->7|27->7|30->10|30->10|34->14|34->14|37->17|37->17|39->19|39->19|39->19|40->20|40->20|40->20|41->21|41->21|41->21|41->21|42->22|43->23
                  -- GENERATED --
              */
          