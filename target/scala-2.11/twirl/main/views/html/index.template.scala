
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[ValidationResult,ValidationForm,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(vr: ValidationResult = ValidationResult.empty,
  vf: ValidationForm = ValidationForm() ):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import play.api.i18n.Messages

Seq[Any](format.raw/*2.42*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Index")/*6.15*/ {_display_(Seq[Any](format.raw/*6.17*/("""

"""),_display_(/*8.2*/validationResult(vr)),format.raw/*8.22*/("""

"""),format.raw/*10.1*/("""<h1>"""),_display_(/*10.6*/Messages("Name")),format.raw/*10.22*/("""</h1>


<form method="post" 
	  enctype="multipart/form-data" 
	  action="validator">

<div class="submit">
<input title="Submit for validation" 
	   type="submit" 
	   value='"""),_display_(/*20.13*/Messages("Submit")),format.raw/*20.31*/("""' />
</div>

<input id="rdf" name="rdf" type="hidden" value="#"""),_display_(/*23.51*/{vf.rdfInput.input_type_RDF}),format.raw/*23.79*/("""_rdf" /> 
<input id="schema" name="schema" type="hidden" value=""""),_display_(/*24.56*/{vf.schema_toggle}),format.raw/*24.74*/("""" />
<input id="input-schema" name="input-schema" type="hidden" value="#"""),_display_(/*25.69*/{vf.input_type_Schema_str}),format.raw/*25.95*/("""_schema" />
<input id="iriNoIri" name="withIRI" type="hidden" value="#"""),_display_(/*26.60*/{vf.opt_iri_str}),format.raw/*26.76*/("""" />
	  
<div class="tabs" id="tabs-rdf">

<ul>
 <li><a href="#byUri_rdf">"""),_display_(/*31.28*/Messages("ByURI")),format.raw/*31.45*/("""</a></li>
 <li><a href="#byFile_rdf">"""),_display_(/*32.29*/Messages("ByFile")),format.raw/*32.47*/("""</a></li>
 <li><a href="#byInput_rdf">"""),_display_(/*33.30*/Messages("ByInput")),format.raw/*33.49*/("""</a></li>
 <li><a href="#byEndpoint_rdf">"""),_display_(/*34.33*/Messages("ByEndpoint")),format.raw/*34.55*/("""</a></li>
 <li><a href="#byDereference_rdf">"""),_display_(/*35.36*/Messages("ByDereference")),format.raw/*35.61*/("""</a></li>
</ul>

<div class="content" id="byUri_rdf">
	  <input type="url" 
           name="rdf_uri" 
		   id="rdf_uri" 
		   size="45" 
		   placeholder="http://..." />
  </div> <!-- content -->

 <div class="content" id="byFile_rdf">
	<input type="file" 
		   id="rdf_file" 
		   name="rdf_file" 
		   size="30" >
 </div> <!-- content -->

 <div class="content" id="byInput_rdf">	
   <legend>"""),_display_(/*54.13*/Messages("Input")),format.raw/*54.30*/("""</legend>	
   <textarea class="input_src"
		id="rdf_textarea" 
		name="rdf_textarea" 
		rows="12" cols="80">"""),_display_(/*58.24*/vr/*58.26*/.str_rdf),format.raw/*58.34*/("""</textarea>
  </div> <!-- content -->

 <div class="content" id="byEndpoint_rdf">	
  <input type="url" 
   	     name="rdf_endpoint" 
		 id="rdf_endpoint" 
		 size="45" />
 </div> <!-- content -->

 <div class="content" id="byDereference_rdf">	
 </div> <!-- content -->
 
</div> <!-- rdf-tabs -->   

"""),_display_(/*73.2*/rdfOptions(vf.rdfOptions)),format.raw/*73.27*/("""

"""),format.raw/*75.1*/("""<div class="tabs" id="tabs-schema">

<ul>
<li><a href="#no_schema">No schema</a></li>
<li><a href="#schema">With schema</a></li>
</ul>

<div class="content" id="no_schema">
 No schema
</div>        

<div class="content" id="schema">  <!-- content with Schema -->

<div class="tabs" id="tabs-input-schema">

<ul>
<li><a href="#byUri_schema">"""),_display_(/*91.30*/Messages("ByURI")),format.raw/*91.47*/("""</a></li>
<li><a href="#byFile_schema">"""),_display_(/*92.31*/Messages("ByFile")),format.raw/*92.49*/("""</a></li>
<li><a href="#byInput_schema">"""),_display_(/*93.32*/Messages("ByInput")),format.raw/*93.51*/("""</a></li>
</ul>

<div id="byUri_schema">

  <input type="text" 
		   name="schema_uri" 
		   id="schema_uri" 
		   size="45" 
		   placeholder="http://..." ></input>

</div> <!-- byUri_schema -->

<div class="content" 
	 id="byFile_schema">
	<input type="file" 
		   id="schema_file" 
		   name="schema_file" 
		   size="30" ></input>

</div>	

<div class="content" 
	 id="byInput_schema">
	<textarea class="input_src"
		id="schema_textarea" 
		name="schema_textarea" 
		rows="12" cols="80">"""),_display_(/*120.24*/vr/*120.26*/.str_schema),format.raw/*120.37*/("""</textarea>

</div> <!-- content -->

"""),_display_(/*124.2*/schemaOptions(vf.schemaOptions)),format.raw/*124.33*/("""

"""),format.raw/*126.1*/("""</div> <!-- input schema tabs -->

</div> <!-- content with Schema -->

</div> <!-- schema tabs --> 


</form>	


""")))}),format.raw/*136.2*/("""
"""))}
  }

  def render(vr:ValidationResult,vf:ValidationForm): play.twirl.api.HtmlFormat.Appendable = apply(vr,vf)

  def f:((ValidationResult,ValidationForm) => play.twirl.api.HtmlFormat.Appendable) = (vr,vf) => apply(vr,vf)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Sep 05 16:22:57 BST 2014
                  SOURCE: /Users/Alasdair/Workspace/HCLSValidator/rdfshape-ag/rdfshape/app/views/index.scala.html
                  HASH: 6f72f44e06fcfdfaeeef381a29a17e1961d6f8fb
                  MATRIX: 530->1|736->90|764->123|791->125|812->138|851->140|879->143|919->163|948->165|979->170|1016->186|1220->363|1259->381|1349->444|1398->472|1490->537|1529->555|1629->628|1676->654|1774->725|1811->741|1913->816|1951->833|2016->871|2055->889|2121->928|2161->947|2230->989|2273->1011|2345->1056|2391->1081|2814->1477|2852->1494|2988->1603|2999->1605|3028->1613|3356->1915|3402->1940|3431->1942|3800->2284|3838->2301|3905->2341|3944->2359|4012->2400|4052->2419|4572->2911|4584->2913|4617->2924|4683->2963|4736->2994|4766->2996|4912->3111
                  LINES: 19->1|23->2|25->5|26->6|26->6|26->6|28->8|28->8|30->10|30->10|30->10|40->20|40->20|43->23|43->23|44->24|44->24|45->25|45->25|46->26|46->26|51->31|51->31|52->32|52->32|53->33|53->33|54->34|54->34|55->35|55->35|74->54|74->54|78->58|78->58|78->58|93->73|93->73|95->75|111->91|111->91|112->92|112->92|113->93|113->93|140->120|140->120|140->120|144->124|144->124|146->126|156->136
                  -- GENERATED --
              */
          