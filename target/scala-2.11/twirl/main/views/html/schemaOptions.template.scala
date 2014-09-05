
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
object schemaOptions extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[SchemaOptions,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(schemaOptions: SchemaOptions):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import play.api.i18n.Messages

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.1*/("""<fieldset>
<legend>"""),_display_(/*6.10*/Messages("Schema.options")),format.raw/*6.36*/("""</legend>
<label for="cut">"""),_display_(/*7.19*/Messages("Cut")),format.raw/*7.34*/("""</label>
<input type="number"
       id="cut" 
	   name="cut" 
	   min="1" 
	   max="100" 
	   value=""""),_display_(/*13.13*/schemaOptions/*13.26*/.cut),format.raw/*13.30*/("""" />

"""),_display_(/*15.2*/iriNoIri(schemaOptions.opt_iri.map(iri => iri.str))),format.raw/*15.53*/("""
 
"""),format.raw/*17.1*/("""<!-- Options -->
<details>
   <summary>"""),_display_(/*19.14*/Messages("MoreOptions")),format.raw/*19.37*/("""</summary>
   <table>	
   <tr><th>Name</th><th>Option</th><th>Description</th></tr>
   <tr>
    <td>"""),_display_(/*23.10*/Messages("WithIncoming")),format.raw/*23.34*/("""</td>
    <td>
    <input 
    	type="radio" name="withIncoming" value="true"
    	"""),_display_(/*27.7*/{if(schemaOptions.withIncoming==true) { "checked" }}),format.raw/*27.59*/(""">
    	<label>true</label><br/>
	<input 
		type="radio" 
		name="withIncoming" 
		value="false" 
		"""),_display_(/*33.4*/{if(schemaOptions.withIncoming==false) { "checked" }}),format.raw/*33.57*/(""">
		<label>false</label>
    </td>
    <td>"""),_display_(/*36.10*/Messages("WithIncoming.explain")),format.raw/*36.42*/("""</td>
    </tr>	
    <tr>
    <td>"""),_display_(/*39.10*/Messages("Any.Shape")),format.raw/*39.31*/("""</td>
    <td>
    <input 
    	type="radio" 
    	name="withAny" 
    	value="true"
    	"""),_display_(/*45.7*/{if(schemaOptions.withAny==true) { "checked" }}),format.raw/*45.54*/(""">
    	<label>"""),_display_(/*46.14*/Messages("Add.any.shape")),format.raw/*46.39*/("""</label><br/>
	<input 
		type="radio" 
		name="withAny" 
		value="false" 
		"""),_display_(/*51.4*/{if(schemaOptions.withAny==false) { "checked" }}),format.raw/*51.52*/(""">
		<label>"""),_display_(/*52.11*/Messages("Only.defined.shapes")),format.raw/*52.42*/("""</label>
    </td>
    <td>"""),_display_(/*54.10*/Messages("Add.any.explain")),format.raw/*54.37*/("""</td>
    </tr>
    <tr>
    <td>"""),_display_(/*57.10*/Messages("Show.schema")),format.raw/*57.33*/("""</td>
    <td>
    <input 
    	type="radio" 
    	name="showSchema" 
    	value="true"
    	"""),_display_(/*63.7*/{if(schemaOptions.showSchema==true) { "checked" }}),format.raw/*63.57*/(""">
    	<label>"""),_display_(/*64.14*/Messages("Show.schema")),format.raw/*64.37*/("""</label><br/>
	<input 
		type="radio" 
		name="withAny" 
		value="false" 
		"""),_display_(/*69.4*/{if(schemaOptions.showSchema==false) { "checked" }}),format.raw/*69.55*/(""">
		<label>"""),_display_(/*70.11*/Messages("Dont.show.schema")),format.raw/*70.39*/("""</label>
    </td>
    <td>"""),_display_(/*72.10*/Messages("Show.schema.explain")),format.raw/*72.41*/("""</td>
    </tr>
   </table>
</details>
</fieldset>"""))}
  }

  def render(schemaOptions:SchemaOptions): play.twirl.api.HtmlFormat.Appendable = apply(schemaOptions)

  def f:((SchemaOptions) => play.twirl.api.HtmlFormat.Appendable) = (schemaOptions) => apply(schemaOptions)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Sep 05 16:55:44 BST 2014
                  SOURCE: /Users/Alasdair/Workspace/HCLSValidator/rdfshape-ag/rdfshape/app/views/schemaOptions.scala.html
                  HASH: 4faa461e249e524ab3ce82962e223b22b15714e1
                  MATRIX: 520->1|667->31|695->64|722->65|768->85|814->111|868->139|903->154|1033->257|1055->270|1080->274|1113->281|1185->332|1215->335|1282->375|1326->398|1454->499|1499->523|1609->607|1682->659|1808->759|1882->812|1953->856|2006->888|2068->923|2110->944|2227->1035|2295->1082|2337->1097|2383->1122|2486->1199|2555->1247|2594->1259|2646->1290|2701->1318|2749->1345|2810->1379|2854->1402|2974->1496|3045->1546|3087->1561|3131->1584|3234->1661|3306->1712|3345->1724|3394->1752|3449->1780|3501->1811
                  LINES: 19->1|22->1|24->4|25->5|26->6|26->6|27->7|27->7|33->13|33->13|33->13|35->15|35->15|37->17|39->19|39->19|43->23|43->23|47->27|47->27|53->33|53->33|56->36|56->36|59->39|59->39|65->45|65->45|66->46|66->46|71->51|71->51|72->52|72->52|74->54|74->54|77->57|77->57|83->63|83->63|84->64|84->64|89->69|89->69|90->70|90->70|92->72|92->72
                  -- GENERATED --
              */
          