<div id="content">
 <h1 id="TheServiceLayer">The Service Layer</h1> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_servicelayer.java"></a> </p>
 <p> The <a href="03-The-Service-Layer#TheServiceLayer">ServiceLayer</a> (sometimes also called application layer) gives the user access to the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s so that the user can work on them. </p> 
 <p>The <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_servicecontainer.java">ServiceContainer</a> is an <a href="01-The-Reflect-Framework#TheReflectFramework_DependencyInjectionContainer">DependencyInjectionContainer</a> that represents the <a href="03-The-Service-Layer#TheServiceLayer">ServiceLayer</a> and holds and manages <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s. </p> 
 <p> Note that the <a href="03-The-Service-Layer#TheServiceLayer">ServiceLayer</a> is a middle layer (see <a href="01-The-Reflect-Framework#TheReflectFramework_ArchitectureOfAnReflectApplication">ReflectArchitecture</a>): </p> 
 <ul> 
  <li> The <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s have NO references to objects in the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer">UserInterfaceLayer</a></li> 
  <li>The <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s may have references to the objects in the lower <a href="02-The-Domain-Layer#TheDomainLayer">DomainLayer</a>, <a href="04-The-Infrastructure-Layer#TheInfrastructureLayer">InfrastructureLayer</a> and <a href="05-The-Provider-Layer#TheProviderLayer">ProviderLayer</a>, but not visa versa!</li> 
 </ul> 
 <p></p> 
 <h2 id="TheServiceLayer_ServiceObjects">Service Objects</h2> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java"></a> </p> 
 <p> The word 'service' implies: </p> 
 <ul> 
  <li>There is a client that needs to be served. For the ReflectFramework this is the user, trough the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a></li> 
  <li>There are activities\ operations. For the ReflectFramework these are defined as <a href="07-Action-Methods#ActionMethods">ActionMethod</a>'s</li> 
  <li>An activity\ operation is done with other things. For the ReflectFramework these operations are done with or on <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> s trough <a href="07-Action-Methods#ActionMethods">ActionMethod</a> parameters and return values</li> 
 </ul> 
 <p></p> Eric Evans explains in his book 
 <a href="https://en.wikipedia.org/wiki/Domain-driven_design">Domain Driven Design</a>, that a good 
 <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a> has three characteristics: 
 <ul> 
  <li>The operation relates to a domain concept that is not a natural part of a <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> (Entities or Value Objects).</li> 
  <li>The interface is defined in terms of other elements of the domain model. </li> 
  <li>The operation is state-less</li> 
 </ul> These characteristics are discussed in more detail in the following paragraphs. 
 <h3 id="TheServiceLayer_ServiceObjects_ServiceObjectsOperationsRelatesToADomainConceptThatIsNotANaturalPartOfADomainObject">Service objects operations relates to a domain concept that is not a natural part of a DomainObject</h3> 
 <p> <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s contain <a href="07-Action-Methods#ActionMethods_ActionMethodsForServiceObjects">ServiceObjectActionMethod</a>s. The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> displays these methods as menu items and invokes these methods once a user clicks on the menu item. Most <a href="07-Action-Methods#ActionMethods_ActionMethodsForServiceObjects">ServiceObjectActionMethod</a>s create or retrieve <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s where the user does not have an existing <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> to navigate from. </p> 
 <h3 id="TheServiceLayer_ServiceObjects_ServiceObjectsDefineAnInterfaceInTermsOfTheDomainModel">Service objects define an interface in terms of the domain model</h3> 
 <p> <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s basically provides the user (via the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a>) access to <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s, so that the user can work on them (via the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a>). </p> 
 <h3 id="TheServiceLayer_ServiceObjects_ServiceObjectsAreStateless">Service objects are state-less</h3> 
 <p> Quoting Eric Evans: “<a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s should be state-less. State-less here means that any client can use any instance of the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s without regard to the instance’s individual history. The execution of the service will use information that is accessible globally, and may even change that global information (have side-effects). But it does not hold state of its own that affects its behavior, as most domain objects do.&quot; </p> 
 <p> <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s do not have state and therefore should not have properties (no getter and setter methods). My personal opinion is that a <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a> with state is a <a href="http://en.wikipedia.org/wiki/Code_smell">code-smell</a>, which you can solve by moving the <a href="07-Action-Methods#ActionMethods_ActionMethodsForServiceObjects">ServiceObjectActionMethod</a>s that share state (fields) to new or existing <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s. </p> 
 <h3 id="TheServiceLayer_ServiceObjects_ServiceObjectsShouldBeFlat">Service Objects should be flat</h3> 
 <p> <a href="https://en.wikipedia.org/?title=Object-oriented_programming"> Object Orientated Programming</a> favors to put business logic and the validation logic into the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s (and sometimes <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s) as much as possible. <a href="07-Action-Methods#ActionMethods_ActionMethodsForServiceObjects">ServiceObjectActionMethod</a>s should therefore not contain business logic or validation logic, but delegate the work to collaborations of <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s and <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s, in order to prevent the <a href="http://martinfowler.com/bliki/AnemicDomainModel.html">Anemic Domain Model</a> - <a href="http://en.wikipedia.org/wiki/Anti-pattern">anti-pattern</a>. </p> 
 <p> </p> 
 <h3 id="TheServiceLayer_ServiceObjects_AWebShopExample">A web shop example</h3> 
 <ul> 
  <li>The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> class calls the <a href="07-Action-Methods#ActionMethods_ActionMethodsForServiceObjects">ServiceObjectActionMethod</a> findProduct(searchCriteria) method on <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>: ProductService</li> 
  <li>This method will call the findProduct method on the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a> : ProductRepository</li> 
  <li>This method will return a list of <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s that meet the search criteria</li> 
  <li>The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> displays the found list of <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s as a table in a new tab.</li> 
 </ul> 
 <p></p> 
 <h3 id="TheDomainLayer_DomainObjects_Construction">Construction</h3> 
 <p> The principle of <a href="https://en.wikipedia.org/wiki/Naked_objects">“naked objects”</a> is that any <a href="http://en.wikipedia.org/wiki/Plain_Old_Java_Object">'Plain Old Java Object' (POJO)</a> can function as a <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>. In other words: a service class does not have to inherit from any special class, nor implement any particular interface, nor have any specific attributes. </p> 
 <p> <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s are instantiated by the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a>, and therefore need to be registered to the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication.getServiceClasses()</a> method. </p> In example: 
 <pre>
 public class WebShop extends ReflectApplicationFor... {
 	@Override
 	public List
   
  
   
  
  <class<?>
   
   
    
   
    &gt; getServiceClasses() {
 		List
    
   
    
   
   <class<?>
     &gt; serviceClasses = new ArrayList&lt;&gt;(); serviceClasses.add(ProductService.class); serviceClasses.add(ShoppingCartService.class); serviceClasses.add(OrderService.class); return serviceClasses; } // etc... } 
   </class<?>
   
  
   
  
  </class<?></pre> 
 <p> <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s can have references to other objects. These objects are injected into the ServiceObject (see the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_container_constructioninjection.java">ConstructionInjection</a> section) </p> 
 <h3 id="TheDomainLayer_DomainObjects_Naming">Naming</h3> 
 <p> <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s are normally named after the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s that they service and have the suffix 'Service' (e.g. CustomerService, OrderService, etc). </p> 
 <h3 id="TheServiceLayer_ServiceObjects_ServiceObjectMembers">Service object members</h3> 
 <p> Service objects contain: </p> 
 <ul> 
  <li><a href="07-Action-Methods#ActionMethods_ActionMethodsForServiceObjects">ServiceObjectActionMethod</a>s: that define user actions</li> 
  <li>Methods: that define <a href="08-Object-behavior#ObjectBehavior">ObjectBehavior</a></li> 
  <li>Annotations: that define <a href="08-Object-behavior#ObjectBehavior">ObjectBehavior</a></li> 
 </ul> These members are discussed in more detail in the following paragraphs. 
 <p></p> 
 <h2 id="TheDomainLayer_ActionMethods">Action Methods</h2> 
 <p> <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s are all about <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s that represent the main menu items (see section <a href="07-Action-Methods#ActionMethods_ActionMethodsForServiceObjects">ServiceObjectActionMethod</a>) </p> 
 <p></p> 
 <p></p> 
</div>