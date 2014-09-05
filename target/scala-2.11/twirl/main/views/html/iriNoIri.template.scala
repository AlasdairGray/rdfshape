
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
object iriNoIri extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Option[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(opt_iri: Option[String]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*3.1*/("""<div class="tabs" id="tabsIriNoIri">

 <ul>
 <li><a href="#noIri">No IRI (All)</a></li>
 <li><a href="#iri">With IRI</a></li>
 </ul>

 <div class="content" id="noIri"> 
 </div> <!-- tab no iri -->


 <div class="content" id="iri">
  <input type="text" 
	     name="iri" 
		 size="45" 
		 value='"""),_display_(/*18.12*/opt_iri/*18.19*/.getOrElse("")),format.raw/*18.33*/("""'
		 placeholder="http://..." />
 </div> <!-- content with IRI -->

</div> <!-- tabs iris -->"""))}
  }

  def render(opt_iri:Option[String]): play.twirl.api.HtmlFormat.Appendable = apply(opt_iri)

  def f:((Option[String]) => play.twirl.api.HtmlFormat.Appendable) = (opt_iri) => apply(opt_iri)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Sep 05 16:22:57 BST 2014
                  SOURCE: /Users/Alasdair/Workspace/HCLSValidator/rdfshape-ag/rdfshape/app/views/iriNoIri.scala.html
                  HASH: 537a1595cc9322850f80e6c1826c83b95656c85b
                  MATRIX: 516->1|629->26|657->28|980->324|996->331|1031->345
                  LINES: 19->1|22->1|24->3|39->18|39->18|39->18
                  -- GENERATED --
              */
          