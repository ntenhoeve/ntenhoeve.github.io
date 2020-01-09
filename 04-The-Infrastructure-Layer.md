<div id="content">
 <h1 id="TheInfrastructureLayer">The Infrastructure Layer</h1> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructurelayer.java"></a> </p>
 <p> The <a href="04-The-Infrastructure-Layer#TheInfrastructureLayer">InfrastructureLayer</a> contains <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>'s that provide generic technical capabilities to support the higher layers. </p> 
 <p> The <a href="04-The-Infrastructure-Layer#TheInfrastructureLayer">InfrastructureLayer</a> is also know as: </p> 
 <ul> 
  <li><a href="http://en.wikipedia.org/wiki/Data_access_layer">Data access layer</a></li> 
  <li><a href="http://en.wikipedia.org/wiki/Persistence_layer">Persistence layer</a></li> 
  <li>Logging Layer</li> 
  <li>Networking Layer</li> 
  <li>And other services which are required to support the <a href="03-The-Service-Layer#TheServiceLayer">ServiceLayer</a> or <a href="02-The-Domain-Layer#TheDomainLayer">DomainLayer</a></li> 
 </ul> 
 <p></p> 
 <p> The <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructurecontainer.java">InfrastructureContainer</a> is an <a href="01-The-Reflect-Framework#TheReflectFramework_DependencyInjectionContainer">DependencyInjectionContainer</a> that represents the <a href="04-The-Infrastructure-Layer#TheInfrastructureLayer">InfrastructureLayer</a> and holds and manages <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s.<br /> </p> Note that the 
 <a href="04-The-Infrastructure-Layer#TheInfrastructureLayer">InfrastructureLayer</a> is a middle layer (see 
 <a href="01-The-Reflect-Framework#TheReflectFramework_ArchitectureOfAnReflectApplication">ReflectArchitecture</a>): 
 <ul> 
  <li> The <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s have NO references to objects in the upper <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer">UserInterfaceLayer</a>, <a href="03-The-Service-Layer#TheServiceLayer">ServiceLayer</a> nor <a href="02-The-Domain-Layer#TheDomainLayer">DomainLayer</a></li> 
  <li>The <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s may have references to the objects in the lower <a href="05-The-Provider-Layer#TheProviderLayer">ProviderLayer</a>, but not visa versa!</li> 
 </ul> 
 <h2 id="TheInfrastructureLayer_InfrastructureObjects">Infrastructure Objects</h2> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java"></a> </p> 
 <p> <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s provide generic technical capabilities to support the higher layers. <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s communicate with other systems such as external hardware (like disks), databases, web-services, etc... </p> 
 <h3 id="TheInfrastructureLayer_InfrastructureObjects_FunctionAndNamingOfInfrastructureObjects">Function and naming of InfrastructureObjects</h3> 
 <p> The name of an <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s depends on what it does. It is common practice to use the following naming: </p> 
 <ul> 
  <li>Communicating with a <a href="https://en.wikipedia.org/wiki/Database">database</a>:<br /> class names end with 'Repository', e.g.: CustomerRepository, OrderRepository, etc...</li> 
  <li>Communicating with a <a href="https://en.wikipedia.org/?title=Web_servicehttps://en.wikipedia.org/?title=Web_service">web-service</a>:<br /> class names end with 'Client', e.g.: EmailClient, GoogleMapsClient, SOAPClient, etc..</li> 
  <li>Creating objects with a <a href="https://en.wikipedia.org/wiki/Factory_(object-oriented_programming)">factory</a> class:<br /> class names end with 'RandomGenerator', e.g.: ReportFactory, etc..</li> 
  <li><a href="https://en.wikipedia.org/wiki/Logfile">Logging</a>:<br /> class names end with 'Logger'</li> 
 </ul> 
 <p></p> 
 <h3 id="TheInfrastructureLayer_InfrastructureObjects_InfrastructureObjectPresentation">Infrastructure Object Presentation</h3> 
 <p> The methods of infrastructure object are unknown to the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> and are not displayed on the <a href="https://en.wikipedia.org/wiki/User_interface">UserTestObject Interface</a>. * </p> 
 <h3 id="TheDomainLayer_DomainObjects_Construction">Construction</h3> 
 <p> The principle of “naked objects” is that any <a href="http://en.wikipedia.org/wiki/Plain_Old_Java_Object">'Plain Old Java Object' (POJO)</a> can function as a <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>. In other words: a <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a> class does not have to inherit from any special class, nor implement any particular interface, nor have any specific attributes. </p> 
 <p> You can: </p> 
 <ul> 
  <li>write new <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s.</li> 
  <li>reuse <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s from existing projects</li> 
  <li>use or extend one of the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s of one of the <a href="11-Reflect-Infrastructure-Projects#ReflectInfrastructureProjects">ReflectInfrastructureProjects</a>. Open the type hierarchy of the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>, to see all these convenience classes</li> 
  <li>or use or extend <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s from other (open source) projects</li> 
 </ul> 
 <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s can have references to other objects. These objects are injected into the InfrastructureObjects (see the 
 <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_container_constructioninjection.java">ConstructionInjection</a> section.) 
 <p></p> 
 <p></p> 
 <p></p> 
</div>