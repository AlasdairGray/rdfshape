
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
object about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(validatorVersion: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.28*/("""
"""),_display_(/*2.2*/main("About")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
	
"""),format.raw/*4.1*/("""<h1>About RDFShape</h1>

<p>RDFShape contains a RDF Shape Validator</p>
<p>It can be used as an online RDF validator and as a RDF Shape Expressions validator</p>
<p>The implementation is based on <a href="http://labra.github.io/ShExcala/">ShExcala</a></p>
<p>Developed by: 
   <a href="http://www.di.uniovi.es/~labra">Jose Emilio Labra Gayo</a>, 
   <a href="http://www.weso.es">WESO Research Group</a></p>
<p>Source code: <a href="https://github.com/labra/rdfshape">Github project</a></p>
<p><a href="https://github.com/labra/rdfshape/issues">Issues</a></p>
<p>Validator version: """),_display_(/*14.24*/validatorVersion),format.raw/*14.40*/("""</p> 
""")))}),format.raw/*15.2*/("""
"""))}
  }

  def render(validatorVersion:String): play.twirl.api.HtmlFormat.Appendable = apply(validatorVersion)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (validatorVersion) => apply(validatorVersion)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Sep 05 16:55:43 BST 2014
                  SOURCE: /Users/Alasdair/Workspace/HCLSValidator/rdfshape-ag/rdfshape/app/views/about.scala.html
                  HASH: 79f8156421b6d3a5dc81d17a4f996409fac5ded6
                  MATRIX: 505->1|619->27|646->29|667->42|706->44|735->47|1344->629|1381->645|1418->652
                  LINES: 19->1|22->1|23->2|23->2|23->2|25->4|35->14|35->14|36->15
                  -- GENERATED --
              */
          