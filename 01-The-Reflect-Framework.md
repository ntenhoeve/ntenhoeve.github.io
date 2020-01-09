<div id="content">
 <h1 id="TheReflectFramework">The Reflect Framework</h1> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_reflectframework.java"></a> </p>
 <p> The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> is a light weight <a href="http://en.wikipedia.org/wiki/Java_(programming_language)">Java</a> <a href="http://en.wikipedia.org/wiki/Application_framework">Application Framework</a> for creating <a href="https://en.wikipedia.org/wiki/Business_software">business like applications</a> that can read and manipulate information by using <a href="https://en.wikipedia.org/wiki/Form_(document)">forms</a> and <a href="https://en.wikipedia.org/wiki/Table_(information)">tables</a>. </p> 
 <p> With the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> you only need to create <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s. The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> provides you the <a href="https://en.wikipedia.org/wiki/User_interface">user interface</a>, without writing any <a href="https://en.wikipedia.org/wiki/User_interface">user interface</a> code. This means that the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> is ideal for rapid prototyping, rapid development or to learn programming (e.g. to teach: <a href="https://en.wikipedia.org/wiki/Object-oriented_programming">Object Oriented Programming</a> or <a href="https://en.wikipedia.org/wiki/Domain-driven_design">Domain Driven Design</a>). </p> 
 <p> The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> provides different <a href="https://en.wikipedia.org/wiki/User_interface">user interface</a> implementations that you can use for your <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s. Please read the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_documentation_reflectapplicationprojects.java">ReflectApplicationProjects</a> section to learn what <a href="https://en.wikipedia.org/wiki/User_interface">user interfaces</a> are available and how to get started. If you want to know more about the details of the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a>, keep reading.... </p> 
 <h2 id="TheReflectFramework_ReflectCoreValues">Reflect Core Values</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_documentation_reflectcorevalues.java"></a> The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> is designed around the following core values: </p> 
 <h3 id="TheReflectFramework_ReflectCoreValues_BasedOnTheNakedObjectsDesignPattern">Based on the Naked Objects Design Pattern</h3> See the Wiki page on the 
 <a href="http://en.wikipedia.org/wiki/Naked_objects">Naked Objects</a> 
 <a href="https://en.wikipedia.org/wiki/Architectural_pattern">Architectural pattern</a>: 
 <ul> 
  <li>All <a href="http://en.wikipedia.org/wiki/Business_logic">business logic</a> should be encapsulated onto the <a href="http://en.wikipedia.org/wiki/Business_object_(computer_science)">domain objects</a>. This principle is not unique to naked objects: it is just a strong commitment to <a href="http://en.wikipedia.org/wiki/Encapsulation_%28object-oriented_programming%29">encapsulation</a>.</li> 
  <li>The <a href="http://en.wikipedia.org/wiki/User_interface">user interface</a> should be a direct representation of the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s, with all user actions consisting, explicitly, of creating or retrieving <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s and/or invoking <a href="http://en.wikipedia.org/wiki/Method_(computer_science)">methods</a> on those objects. This principle is also not unique to naked objects: it is just a specific interpretation of an <a href="http://en.wikipedia.org/wiki/Object-oriented_user_interface">object-oriented user interface (OOUI)</a>.</li> 
  <li>The user interface should be created 100% automatically from the definition of the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s. <a href="http://en.wikipedia.org/wiki/Reflection_(computer_science)">Reflection</a> is used instead of code generation. Hence the name of the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a>: The framework reflects the code of the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s and <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s to the user interface.</li> 
 </ul> 
 <h3 id="TheReflectFramework_ReflectCoreValues_WrittenInJava">Written in Java</h3> At the time of this writing, 
 <a href="https://java.com">Java</a> is still the 
 <a href="https://www.codingdojo.com/blog/7-most-in-demand-programming-languages-of-2018/">most used programming language</a>. Most developers are able to write (or read) Java code. There are many Java libraries available that can be used in your application. 
 <h3 id="TheReflectFramework_ReflectCoreValues_ProvideAGoodStructureForApplications">Provide a good structure for applications</h3> 
 <ul> 
  <li>Enforce <a href="http://en.wikipedia.org/wiki/Separation_of_concerns">separation of concerns</a> (see <a href="01-The-Reflect-Framework#TheReflectFramework_ArchitectureOfAnReflectApplication">ReflectArchitecture</a>).</li> 
  <li>Facilitate <a href="http://en.wikipedia.org/wiki/Domain-driven_design">domain driven design</a>.</li> 
  <li><a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>'s, <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>'s and <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>'s should have no (or almost no) dependencies with the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> so that it could easily be replaced with another dependency injection framework (such as <a href="http://en.wikipedia.org/wiki/Spring_Framework">Spring</a>, <a href="http://en.wikipedia.org/wiki/Google_Guice">Guice</a> or <a href="http://picocontainer.codehaus.org/">Pico container</a>, etc...) or visa versa. You would only need to change some annotations and link it to the other dependency injection framework</li> 
  <li>The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> must accept <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s, <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s, <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s that are <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object">Plain Old Java Objects (POJO's)</a>.</li> 
  <li>The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> exists of a few basic interfaces like <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> and <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a>s that can have multiple different implementations.</li> 
 </ul> 
 <h3 id="TheReflectFramework_ReflectCoreValues_HaveAModernGraphicalUserInterface">Have a modern graphical user interface</h3> 
 <ul> 
  <li><a href="https://en.wikipedia.org/wiki/Responsive_web_design">Responsive Design</a>: An optimized user experience on a variety of devices and screen sizes.</li> 
  <li><a href="https://en.wikipedia.org/wiki/Flat_design">Flat design</a>: A minimalist graphical user interface (e.g. like Google's <a href="https://material.io/design/">Material Design</a>) that does not distract the user in executing his or her tasks</li> 
 </ul> 
 <h3 id="TheReflectFramework_ReflectCoreValues_WriteOnceAndDeployAsDifferentTypeOfApplications">Write once and deploy as different type of applications</h3> 
 <p> The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> allows you to write your code once, and deploy it as different types of applications without much of a hassle. See the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_documentation_reflectapplicationprojects.java">ReflectApplicationProjects</a> for more information. </p> 
 <h3 id="TheReflectFramework_ReflectCoreValues_SimpleToConfigure">Simple to configure</h3> The 
 <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> has no configuration files (see 
 <a href="http://www.martinfowler.com/articles/injection.html#CodeOrConfigurationFiles">“Code or configuration files”</a> section in Martin Fowlers article for the arguments why). 
 <br /> 
 <br /> There are 3 things that need to be configured: 
 <ul> 
  <li>Which implementations of the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> and <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a>'s are going to be used by the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a>. </li> 
  <li>Which <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a> classes and <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a> classes are going to be used by the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a>.</li> 
  <li>The <a href="08-Object-behavior#ObjectBehavior">ObjectBehavior</a> of <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>'s and <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a> 's (how the domain needs to handled by the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a>)</li> 
 </ul> 
 <p> Furthermore the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> prefers “Configure by Exception”. This means that the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> uses reasonable defaults wherever possible. These default values can be overridden by the developer. </p> 
 <h3 id="TheReflectFramework_ReflectCoreValues_Lightweight">Lightweight</h3> 
 <p> The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> is aimed to have a small distribution size. </p> 
 <h3 id="TheReflectFramework_ReflectCoreValues_OpenSourceAndFree">Open source and free</h3> 
 <p> See the <a href="01-The-Reflect-Framework#TheReflectFramework_ReflectLicense">ReflectLicense</a>. </p> 
 <p></p> 
 <p></p> 
 <h2 id="TheReflectFramework_WhyTheReflectFrameworkWasDeveloped">Why the Reflect Framework was developed</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_documentation_reflectwhyitwasdeveloped.java"></a> </p> 
 <p> Almost everyday new libraries, frameworks and tools are being released by the developer community, many of which reinvent the wheel. </p> 
 <p> This is called the &quot;Yet Another Framework Syndrome&quot; (YAFS), or in more general terms &quot;Not Invented Here&quot; (NIH). While innovation is something we should all welcome, YAFS can lead to confusion and frustration for users because there's a big risk of it introducing more noise than value.<br /> </p> 
 <p> So why did I develop a new framework while there are so many Java application frameworks out there? </p> 
 <h3 id="TheReflectFramework_WhyTheReflectFrameworkWasDeveloped_Reason1BecauseItsFun">Reason 1: Because its fun</h3> Probably the best reason ever! 
 <h3 id="TheReflectFramework_WhyTheReflectFrameworkWasDeveloped_Reason2BecauseIWantedToLearn">Reason 2: Because I wanted to learn</h3> The journey of developing yet another framework has thought me more than I could have learned implementing an existing framework. Specifically on how other frameworks solved issues that I run into. 
 <h3 id="TheReflectFramework_WhyTheReflectFrameworkWasDeveloped_Reason3BecauseICouldNotFindWhatIWasLookingFor">Reason 3: Because I could not find what I was looking for</h3> There are already several frame works that are based on the 
 <a href="https://en.wikipedia.org/wiki/Naked_objects">Naked Objects</a> pattern, e.g.: 
 <ul> 
  <li><a href="https://github.com/NakedObjectsGroup/NakedObjectsFramework">Naked Objects </a><a> (for .net)</a></li> 
  <a> </a> 
  <li><a></a><a href="https://isis.apache.org/">Apache Isis</a> <a href="https://isis.apache.org/guides/ugvw/ugvw.html">Wicket Viewer</a> (for Java)</li> 
  <li><a href="https://en.wikipedia.org/wiki/Naked_objects#Software_frameworks">And others</a></li> 
 </ul> These frame works have merit on their own, but they did not have all the things I was looking for (see 
 <a href="01-The-Reflect-Framework#TheReflectFramework_ReflectCoreValues">ReflectCoreValues</a>). Specifically: 
 <h3 id="TheReflectFramework_WhyTheReflectFrameworkWasDeveloped_NoMandatoryPersistenceFrameworkDependency">No mandatory persistence framework dependency</h3> 
 <p> Most of the existing <a href="https://en.wikipedia.org/wiki/Naked_objects#Software_frameworks">Naked Object Frameworks</a> heavily depend on a <a href="https://en.wikipedia.org/wiki/Persistence_framework">persistence framework</a> (at the time of this writing Apache Isis even wrote its own!). Editing and changing <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s automatically triggers the <a href="https://en.wikipedia.org/wiki/Persistence_framework">persistence framework</a> to store the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> into a database. This is a handy feature, however <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s do not necessarily need to be persisted after its been edited. The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> chooses a different approach: <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s can be passed to a method as a method parameter. This method parameter can be edited by a user before a method is executed (depending on how the method is annotated). The logic in the method than dictates how this (changed) <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> is processed. In some cases the method will use a <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a> that will store the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> into a database (possibly using a <a href="https://en.wikipedia.org/wiki/Persistence_framework">persistence framework</a>). But we do not always need to store the (changed) <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> in a database. Maybe your application does not need a database at all! Therefore the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> should not have a mandatory dependency with a <a href="https://en.wikipedia.org/wiki/Persistence_framework">persistence framework</a>. </p> 
 <h3 id="TheReflectFramework_WhyTheReflectFrameworkWasDeveloped_MissingAGoodGraphicalUserInterface">Missing a good graphical user interface.</h3> None of the existing 
 <a href="https://en.wikipedia.org/wiki/Naked_objects#Software_frameworks">Naked Object Frameworks</a> (at the time of this writing) have a graphical user interface that meets modern design principles like: 
 <ul> 
  <li><a href="https://en.wikipedia.org/wiki/Responsive_web_design">Responsive Design</a>: An optimized user experience on a variety of devices and screen sizes.</li> 
  <li><a href="https://en.wikipedia.org/wiki/Flat_design">Flat design</a>: A minimalist graphical user interface that does not distract the user execute its tasks, e.g. like Google's <a href="https://material.io/design/">Material Design</a></li> 
 </ul> 
 <h3 id="TheReflectFramework_WhyTheReflectFrameworkWasDeveloped_MissingANakedObjectsWORAFramework">Missing a Naked Objects WORA framework</h3> 
 <a href="https://en.wikipedia.org/wiki/Java_(programming_language)">Java</a> was first released in 1995 and was designed with the 
 <a href="https://en.wikipedia.org/wiki/Write_once,_run_anywhere">Write Once Run Anywhere (WORA)</a> philosophy. A lot has changed since. So does WORA still apply for Java? The answer: Yes and No: 
 <ul> 
  <li>Yes: The <a href="https://en.wikipedia.org/wiki/Java_virtual_machine">Java Virtual Machine (JVM)</a> can run on almost all devices: e.g. home appliances, personal computers, and even on devices out in space. It has been very successful on the server side.</li> 
  <li>No: Java code can run on all platforms that support Java. Apple does not allow the Oracle JVM on its devices and Android devices use Googles JVM which is different. Furthermore: It is nearly impossible to write a GUI for a desktop, and deploy it as a web application or mobile application or vice-versa</li> 
 </ul> Frameworks like 
 <a href="https://facebook.github.io/react-native/">React Native</a>, 
 <a href="https://flutter.io">Google Flutter</a> and 
 <a href="https://www.codenameone.com">Codename One</a> all aim to write code once and execute it on different platforms. The need for such frameworks is obvious: Most of us want our applications to run on as many devices as possible, without having to re-write test and release the (GUI) application for multiple platforms, because this is tedious, no value added, costly work. 
 <p></p> 
 <p> At the time of this writing, none of the existing <a href="https://en.wikipedia.org/wiki/Naked_objects#Software_frameworks">Naked Object Frameworks</a> can be dispatched to different platforms (e.g. the command line, desktop, mobile devices and the web). The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> lets you wrap your <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s, <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s and <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s, in several native implementations of the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a>. For more information see: <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_documentation_reflectapplicationprojects.java">ReflectApplicationProjects</a> </p> 
 <p></p> 
 <p></p> 
 <h2 id="TheReflectFramework_ReflectLicense">Reflect License</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_documentation_reflectlicense.java"></a> The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> is an <a href="http://en.wikipedia.org/wiki/Open_source">open source</a> project under the <a href="http://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License">GNU Lesser General Public License</a>. The license can be found <a href="https://github.com/ntenhoeve/Reflect-Framework/blob/master/LICENSE">here</a>. </p> 
 <p></p> 
 <h2 id="TheReflectFramework_ArchitectureOfAnReflectApplication">Architecture of an Reflect Application</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_documentation_reflectarchitecture.java"></a> The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> helps you to create a <a href="http://en.wikipedia.org/wiki/Multilayered_architecture">multi layer architecture</a> for your application. A multi layer architecture has several <a href="http://martinfowler.com/bliki/LayeringPrinciples.html"> design principles</a>: </p> 
 <ul> 
  <li>Separation of concerns (separate responsibilities within the application into different layers).</li> 
  <li>Low coupling between layers, high cohesion within them.</li> 
  <li>Layers should be testable individual.</li> 
  <li>Business logic layers contain no user interface and don't refer to user interface modules.</li> 
  <li>No circular references between layers.</li> 
  <li>Lower layers should not depend on upper layers.</li> 
  <li>Layers should be shy about their internals.</li> 
  <li>Layers may share infrastructural aspects (eg security)</li> 
  <li>Inbound external interface modules (eg web service handlers) should not contain business logic.</li> 
 </ul> 
 <p> These multi layer architecture design principles try to prevent <a href="http://en.wikipedia.org/wiki/Spaghetti_code"> spaghetti code</a>, which is hard to extend, hard to trouble shoot, hard to test and hard to keep <a href="http://en.wikipedia.org/wiki/Software_bug#Etymology">bug</a> free.<br /> </p> 
 <p> There are many different opinions on the number of layers, the names of the layers and what each layer should do (see these <a href="https://www.google.nl/search?q=layered+software+architecture&amp;tbm=isch">examples</a>). The <a href="http://www.herrodius.com/blog/wp-content/uploads/2010/03/LayeredArchitecture.png">definition of layers</a> from Eric Evans <a href="https://en.wikipedia.org/wiki/Domain-driven_design">Domain Driven Design approach</a> is likely the most commonly used. The most important thing is that your multi layered architecture complies with the design principles above. </p> 
 <p> The <a href="01-The-Reflect-Framework#TheReflectFramework_ArchitectureOfAnReflectApplication">ReflectArchitecture</a> uses the following layer definition, which is pretty close to <a href="https://en.wikipedia.org/wiki/Domain-driven_design">Eric Evans Domain Driven Design</a> approach.: </p> 
 <ul> 
  <li><a href="06-The-UserInterface-Layer#TheUserInterfaceLayer">UserInterfaceLayer</a></li> 
  <li><a href="03-The-Service-Layer#TheServiceLayer">ServiceLayer</a> (called &quot;application layer&quot; by Eric Evans)</li> 
  <li><a href="02-The-Domain-Layer#TheDomainLayer">DomainLayer</a></li> 
  <li><a href="04-The-Infrastructure-Layer#TheInfrastructureLayer">InfrastructureLayer</a></li> 
  <li><a href="05-The-Provider-Layer#TheProviderLayer">ProviderLayer</a> (extra layer for <a href="https://en.wikipedia.org/wiki/Cross-cutting_concern">cross cutting concerns</a>)</li> 
 </ul> 
 <p></p> Each layer is implemented by an 
 <a href="01-The-Reflect-Framework#TheReflectFramework_DependencyInjectionContainer">DependencyInjectionContainer</a> 
 <br /> 
 <br /> 
 <img src="reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_documentation_reflectarchitecture.png" /> 
 <br /> 
 <br /> Red objects are provided by the 
 <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> 
 <br /> Yellow objects need to be written or included by the developer. 
 <p></p> 
 <p></p> 
 <h2 id="TheReflectFramework_DependencyInjectionContainer">Dependency Injection Container</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_container_dependencyinjectioncontainer.java"></a> </p> 
 <p> The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> is a dependency injection framework and consists of several <a href="http://en.wikipedia.org/wiki/Dependency_injection">dependency injection containers</a>. </p> 
 <p> If you are new to Dependency Injection I recommend reading <a href="http://en.wikipedia.org/wiki/Martin_Fowler">Martin Fowler</a>'s <a href="http://martinfowler.com/articles/injection.html">article</a> in which he explains the basics dependency injection. </p> 
 <p> Each <a href="01-The-Reflect-Framework#TheReflectFramework_DependencyInjectionContainer">DependencyInjectionContainer</a> is responsible for: </p> 
 <ul> 
  <li>Creating new instances of types that are registered to a <a href="01-The-Reflect-Framework#TheReflectFramework_DependencyInjectionContainer">DependencyInjectionContainer</a> with the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> .get...Class() or .get...Classes() methods</li> 
  <li>Linking dependencies (references to other objects) to these new instances (using constructor injection)</li> 
  <li>Caching these new instances, if we only need one instance (like a singleton)</li> 
 </ul> 
 <p></p> 
 <p> The <a href="01-The-Reflect-Framework#TheReflectFramework_ArchitectureOfAnReflectApplication">ReflectArchitecture</a> consists of several layers. Each layer has its own <a href="01-The-Reflect-Framework#TheReflectFramework_DependencyInjectionContainer">DependencyInjectionContainer</a> that manages the objects in that layer: </p> 
 <ul> 
  <li><a href="06-The-UserInterface-Layer#TheUserInterfaceLayer">UserInterfaceLayer</a>: <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> object is managed by a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer1userinterface_userinterfacecontainer.java">UserInterfaceContainer</a>. The <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer1userinterface_userinterfacecontainer.java">UserInterfaceContainer</a> knows the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_servicecontainer.java">ServiceContainer</a></li> 
  <li><a href="03-The-Service-Layer#TheServiceLayer">ServiceLayer</a>: <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>'s are managed by a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_servicecontainer.java">ServiceContainer</a>. The <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_servicecontainer.java">ServiceContainer</a> knows the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domaincontainer.java">DomainContainer</a></li> 
  <li><a href="02-The-Domain-Layer#TheDomainLayer">DomainLayer</a>: <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>'s are managed by a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domaincontainer.java">DomainContainer</a>. The <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domaincontainer.java">DomainContainer</a> knows the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructurecontainer.java">InfrastructureContainer</a></li> 
  <li><a href="04-The-Infrastructure-Layer#TheInfrastructureLayer">InfrastructureLayer</a>: <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>'s are managed by a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructurecontainer.java">InfrastructureContainer</a>. The <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domaincontainer.java">DomainContainer</a> knows the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_providercontainer.java">ProviderContainer</a></li> 
  <li><a href="05-The-Provider-Layer#TheProviderLayer">ProviderLayer</a>: <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a> object's are managed by a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_providercontainer.java">ProviderContainer</a>.</li> 
 </ul> 
 <p></p> 
 <h3 id="TheReflectFramework_DependencyInjectionContainer_ConstructorInjection">Constructor Injection</h3> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_container_constructioninjection.java"></a> </p> 
 <p> The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> favors constructor injection (see <a href="http://en.wikipedia.org/wiki/Martin_Fowler">Martin Fowler</a>'s easy to read <a href="http://martinfowler.com/articles/injection.html#ConstructorVersusSetterInjection">article</a> for the arguments why). </p> 
 <p> All objects within an <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> can have references to (may know) other objects. These reference objects are injected into an object as constructor parameter during the creation of the object by the <a href="01-The-Reflect-Framework#TheReflectFramework_DependencyInjectionContainer">DependencyInjectionContainer</a> of that specific layer. This constructor parameter can than be linked to a private final field, so that it can be used throughout the object. </p> In example: 
 <pre>
 public class ProductService {
 
 	private final ProductRepository productRepository;
 
 	public ProductService(ProductRepository productRepository) {
 		this.productRepository = productRepository;
 	}
 
 	public List&lt;Product&gt; findProduct(ProductSearchCritiria searchCritiria) {
 		return productRepository.findProduct(searchCritiria);
 	}
 
 	// other action methods...
 }
 </pre> 
 <p> It is good practice to link the constructor parameter (reference object) to a <a href="https://en.wikibooks.org/wiki/Java_Programming/Keywords/private">private</a> <a href="https://en.wikipedia.org/wiki/Final_(Java)#Final_variables">final</a> field, so that it is <a href="https://en.wikipedia.org/wiki/Encapsulation_(computer_programming)">encapsulated</a> and <a href="https://en.wikipedia.org/wiki/Immutable_object">immutable</a>. </p> 
 <p> If your object needs a lot of references to other objects (too many constructor parameters), your object has most likely to many responsibilities, which could be solved by splitting up this object. </p> Note that you can only inject reference object types (use constructor parameters types) that are known to the that specific layer: 
 <ul> 
  <li>The ReflectApplication class can be injected in all layers</li> 
  <li>You can only inject objects of the same layer or lower layers (see <a href="01-The-Reflect-Framework#TheReflectFramework_ArchitectureOfAnReflectApplication">ReflectArchitecture</a>). The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> tries to prevent that objects in the lower layer know (have references to) objects in the higher layers because this is against several design principles of an layered architecture</li> 
  <li>You can only inject objects that are registered to the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> by overriding the get...Classes() or get...Class() methods.</li> 
 </ul> 
 <p></p> 
 <p></p> 
 <p></p> 
 <h2 id="TheReflectFramework_TheReflectApplication">The Reflect Application</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_reflectapplication.java"></a> <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> is used as initialization parameter for the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a>. <br /> A <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> has several purposes: </p> 
 <ul> 
  <li>It provides the name, icon and description of the application (see <a href="08-Object-behavior#ObjectBehavior">ObjectBehavior</a>)</li> 
  <li>It provides the location of the distribution package (jar, war)</li> 
  <li>It provides the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> type, needed for the application with the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication.getUserInterfaceControllerClass()</a> method. Each application type (e.g. for the command line, desktop, mobile devices or the web) requires different implementations of the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a></li> 
  <li>It provides a list of <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a> types with the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication.getServiceClasses()</a> method. <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s basically provide the actionable/menu items</li> 
  <li>It provides a list of <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> types that need to be created using dependency injection, with the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication.getDomainClasses()</a> method.</li> 
  <li>It provides a list of <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a> types with the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication.getInfrastructureClasses()</a> method. <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s basically communicate to the outside world (i.e. data base access objects, email clients, soap clients, etc)</li> 
  <li>It provides the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a> types with the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication.get...ProviderClass()</a> methods. <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a> Objects help with <a href="https://en.wikipedia.org/wiki/Cross-cutting_concern">cross cutting concerns</a>. Each application type (e.g. for the command line, desktop, mobile devices or the web) requires different implementations of the providers</li> 
 </ul> 
 <p> Each application type (e.g. for the command line, desktop, mobile devices or the web) has its own implementation of <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> to help initializing the framework. See the type hierarchy of <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> to learn which classes can be used and read their java doc to learn how to use them. </p> 
 <p> If you create a new application you will be extending one of these classes. You will only need to implement some of the methods mentioned above (at least the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication.getServiceClasses()</a> method). </p> An example of a desktop application: 
 <pre>
 public class WebShopForJavaFX extends ReflectApplicationForJavaFX {
 
 	private List&lt;Class&lt;?&gt;&gt; serviceClasses;
 	private List&lt;Class&lt;?&gt;&gt; infrastructureClasses;
 
 	public class WebShopForJavaFX() {
		serviceClasses=Arrays.asList(ShoppingCartService.class, ProductService.class);
		infrastructureClasses=Arrays.asList(ProductRepository.class, EmailClient.class, PaymentClient.class);
 	}

 	@Override
 	public List&lt;Class&lt;?&gt;&gt; getServiceClasses() {
 		return serviceClasses;
 	}
 
 	@Override
 	public List&lt;Class&lt;?&gt;&gt; getInfrastructureClasses() {
 		return infrastructureClasses;
 	}
 
 }
 </pre> 
 <p> For more (detailed) examples see the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_documentation_reflectapplicationprojects.java">ReflectApplicationProjects</a> section. </p> 
 <p></p> 
 <p></p> 
 <h2 id="TheReflectFramework_StartingANewReflectProject">Starting a new Reflect Project</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_documentation_reflectstartinganewproject.java"></a> </p> 
 <p> How you create a new <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> depends on the type of application type that you want to create. </p> 
 <p> First decide on the type of application you want to create. Then look up the corresponding paragraph in the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_documentation_reflectapplicationprojects.java">ReflectApplicationProjects</a> section. There you will learn how to create a java project that contains an application class that extends the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> class. This class will initialize and start the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a>. This class also contains methods that you need to implement to provide the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a> classes and <a href="04-The-Infrastructure-Layer#TheInfrastructureLayer">InfrastructureLayer</a> classes that are required in the application. </p> 
 <p></p> 
 <p></p> 
 <p></p> 
</div>