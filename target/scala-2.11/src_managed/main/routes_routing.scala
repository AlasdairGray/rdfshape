// @SOURCE:/Users/Alasdair/Workspace/HCLSValidator/rdfshape-ag/rdfshape/conf/routes
// @HASH:c4840a8c45ea456ca8809bed8f16c87f766a15dc
// @DATE:Fri Sep 05 20:00:21 BST 2014


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_about1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
private[this] lazy val controllers_Application_about1_invoker = createInvoker(
controllers.Application.about,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "about", Nil,"GET", """""", Routes.prefix + """about"""))
        

// @LINE:10
private[this] lazy val controllers_Assets_at2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:13
private[this] lazy val controllers_Validator_validate_post3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("validator"))))
private[this] lazy val controllers_Validator_validate_post3_invoker = createInvoker(
controllers.Validator.validate_post,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Validator", "validate_post", Nil,"POST", """""", Routes.prefix + """validator"""))
        

// @LINE:14
private[this] lazy val controllers_Validator_validate_get4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("validator"))))
private[this] lazy val controllers_Validator_validate_get4_invoker = createInvoker(
controllers.Validator.validate_get(fakeValue[String], fakeValue[Option[String]], fakeValue[Boolean], fakeValue[Option[String]], fakeValue[Option[String]], fakeValue[Int], fakeValue[Boolean], fakeValue[Boolean], fakeValue[Boolean]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Validator", "validate_get", Seq(classOf[String], classOf[Option[String]], classOf[Boolean], classOf[Option[String]], classOf[Option[String]], classOf[Int], classOf[Boolean], classOf[Boolean], classOf[Boolean]),"GET", """""", Routes.prefix + """validator"""))
        

// @LINE:16
private[this] lazy val controllers_WebJarAssets_at5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("webjars/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_WebJarAssets_at5_invoker = createInvoker(
controllers.WebJarAssets.at(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.WebJarAssets", "at", Seq(classOf[String]),"GET", """""", Routes.prefix + """webjars/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.about"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """validator""","""controllers.Validator.validate_post"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """validator""","""controllers.Validator.validate_get(rdf:String, syntaxRDF:Option[String] ?= None, showRDF:Boolean ?= true, schema:Option[String] ?= None, iri:Option[String] ?= None, cut:Int ?= 1, withIncoming:Boolean ?= false, withAny:Boolean ?= false, showSchema:Boolean ?= true)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""","""controllers.WebJarAssets.at(file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:7
case controllers_Application_about1_route(params) => {
   call { 
        controllers_Application_about1_invoker.call(controllers.Application.about)
   }
}
        

// @LINE:10
case controllers_Assets_at2_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at2_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:13
case controllers_Validator_validate_post3_route(params) => {
   call { 
        controllers_Validator_validate_post3_invoker.call(controllers.Validator.validate_post)
   }
}
        

// @LINE:14
case controllers_Validator_validate_get4_route(params) => {
   call(params.fromQuery[String]("rdf", None), params.fromQuery[Option[String]]("syntaxRDF", Some(None)), params.fromQuery[Boolean]("showRDF", Some(true)), params.fromQuery[Option[String]]("schema", Some(None)), params.fromQuery[Option[String]]("iri", Some(None)), params.fromQuery[Int]("cut", Some(1)), params.fromQuery[Boolean]("withIncoming", Some(false)), params.fromQuery[Boolean]("withAny", Some(false)), params.fromQuery[Boolean]("showSchema", Some(true))) { (rdf, syntaxRDF, showRDF, schema, iri, cut, withIncoming, withAny, showSchema) =>
        controllers_Validator_validate_get4_invoker.call(controllers.Validator.validate_get(rdf, syntaxRDF, showRDF, schema, iri, cut, withIncoming, withAny, showSchema))
   }
}
        

// @LINE:16
case controllers_WebJarAssets_at5_route(params) => {
   call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at5_invoker.call(controllers.WebJarAssets.at(file))
   }
}
        
}

}
     