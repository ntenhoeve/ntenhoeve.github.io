<div id="content">
 <h1 id="TheDomainLayer">The Domain Layer</h1> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainlayer.java"></a> The <a href="02-The-Domain-Layer#TheDomainLayer">DomainLayer</a> is the heart of any <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a>. The <a href="02-The-Domain-Layer#TheDomainLayer">DomainLayer</a> represents: </p>
 <ul> 
  <li>The concepts of the business</li> 
  <li>The business rules</li> 
  <li>The state that reflects the business situation</li> 
 </ul> Because there is many debate on the naming within a layered architecture, the domain layer is sometimes also called: 
 <ul> 
  <li><a href="http://en.wikipedia.org/wiki/Business_logic">Business</a> layer</li> 
  <li><a href="http://en.wikipedia.org/wiki/Business_logic">Business logic</a> layer</li> 
  <li><a href="http://en.wikipedia.org/wiki/Domain_model">Domain model</a> layer</li> 
 </ul> 
 <p> The domain layer is basically where all the domain objects are. The <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domaincontainer.java">DomainContainer</a> is an <a href="01-The-Reflect-Framework#TheReflectFramework_DependencyInjectionContainer">DependencyInjectionContainer</a> that can be used to create and hold <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>'s that need dependency injection. </p> Note that the 
 <a href="02-The-Domain-Layer#TheDomainLayer">DomainLayer</a> is a middle layer (see 
 <a href="01-The-Reflect-Framework#TheReflectFramework_ArchitectureOfAnReflectApplication">ReflectArchitecture</a>): 
 <ul> 
  <li>The <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s have NO references to objects in the upper <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer">UserInterfaceLayer</a> nor <a href="03-The-Service-Layer#TheServiceLayer">ServiceLayer</a></li> 
  <li>The <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s may have references to the objects in the lower <a href="04-The-Infrastructure-Layer#TheInfrastructureLayer">InfrastructureLayer</a> or <a href="05-The-Provider-Layer#TheProviderLayer">ProviderLayer</a>, but not visa versa!</li> 
 </ul> 
 <h2 id="TheDomainLayer_DomainObjects">Domain Objects</h2> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobject.java"></a> </p> 
 <p> <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s represent entities; the nouns of the domain. If your application domain is a sales application it’s likely that your domain model contains <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s such as: customers, products and orders. </p> 
 <p> <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s are created by a developer or are reused from an existing application that needs to be re-written. They can be created from scratch or generated from a schema (in example from a <a href="http://en.wikipedia.org/wiki/Database_schema">database schema</a>, <a href="http://nl.wikipedia.org/wiki/XML_Schema">XML schema</a> or <a href="http://en.wikipedia.org/wiki/Web_Services_Description_Language">web service</a>) </p> 
 <h3 id="TheDomainLayer_DomainObjects_Naming">Naming</h3> 
 <p> <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s names are nouns, such as customer, product and order. They basically describe the things that are important in your application. <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s names are part of the <a href="http://martinfowler.com/bliki/UbiquitousLanguage.html">Ubiquitous Language</a>: in terms understood by both users and developers. </p> 
 <h3 id="TheDomainLayer_DomainObjects_Presentation">Presentation</h3> 
 <p> An <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> can display domain objects in 3 ways:<br /> </p> 
 <ul> 
  <li>Domain object as form:<br /> <img src="reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_objectasform.png" /></li> 
  <li>Domain object as a field in a form:<br /> <img src="reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_objectasfield.png" /></li> 
  <li>Domain object as a row in a table:<br /> <img src="reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_objectastable.png" /></li> 
 </ul> 
 <p></p> 
 <h3 id="TheDomainLayer_DomainObjects_Construction">Construction</h3> 
 <p> The principle of “naked objects” is that any <a href="http://en.wikipedia.org/wiki/Plain_Old_Java_Object">'Plain Old Java Object' (POJO)</a> can function as a domain object. In other words: a domain class does not have to inherit from any special class, nor implement any particular interface, nor have any specific attributes. </p> 
 <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s can be created by different objects e.g.: 
 <ul> 
  <li>By a <a href="07-Action-Methods#ActionMethods_ActionMethodsForServiceObjects">ServiceObjectActionMethod</a> such as customerService.createNewCustomer() </li> 
  <li>By a <a href="07-Action-Methods#ActionMethods_ActionMethodsForDomainObjects">DomainObjectActionMethod</a> such as shoppingCart.lineItemCreate(LineItem lineItem)</li> 
  <li>By a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domaincontainer.java">DomainContainer</a> such as domainContainer.getObject(Customer.class)</li> 
  <li>By a <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a> method such as orderRepository.allOpenOrders() or shoppingCartFactory.createForCustomer(Customer customer).</li> 
 </ul> 
 <br /> There are 2 ways to create new 
 <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s: 
 <ul> 
  <li>Creating a new <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> with the new keyword:<br /> In example: PropertyActionMethod order=new PropertyActionMethod()</li> 
  <li>Creating a domain object using Dependency Injection:<br /> Sometimes you want a new <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> to have references to other objects (being other <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s, <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>s or <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a>Objects). In example: A Customer object needs a references to a ShoppingCartFactory object. The Customer object can therefore be created by the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domaincontainer.java">DomainContainer</a> with Customer customer=(Customer) domainContainer.getObject(Customer.class). The ShopingCart object will automatically be injected as a constructor parameter of the Customer class. In order to create <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s using dependency injection you need to:</li> 
  <ul> 
   <li>Add the reference object as a parameter in the constructor and link it to a private field, so that it can be used throughout the class.</li> 
   <li>Make sure that the referenced object type is known by the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a>: Its class must be returned by the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication.getDomainClasses()</a> method.</li> 
   <li>The object that creates the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> needs to have a reference to the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domaincontainer.java">DomainContainer</a> as a constructor parameter, so that that the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domaincontainer.java">DomainContainer.get(Class)</a> method can be called to get or create the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> with the required dependencies injected by the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a></li> 
  </ul> 
 </ul> 
 <h3 id="TheDomainLayer_DomainObjects_DomainObjectMembers">Domain object members</h3> 
 <p> Domain objects contain: </p> 
 <ul> 
  <li>Getter and setter methods (and possible fields): that define <a href="http://en.wikipedia.org/wiki/Property_(programming)">properties</a></li> 
  <li><a href="07-Action-Methods#ActionMethods_ActionMethodsForDomainObjects">DomainObjectActionMethod</a>s: that define user actions</li> 
  <li>Methods: that define <a href="08-Object-behavior#ObjectBehavior">ObjectBehavior</a></li> 
  <li>Annotations: that define <a href="08-Object-behavior#ObjectBehavior">ObjectBehavior</a></li> 
 </ul> These members are discussed in more detail in the following paragraphs. 
 <p></p> 
 <h2 id="TheDomainLayer_Properties">Properties</h2> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java"></a> <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s have <a href="http://en.wikipedia.org/wiki/State_(computer_science)">state</a>. This means the domain objects contain information that may change over time. This information is represented by <a href="http://en.wikipedia.org/wiki/Property_(programming)">properties</a>. </p> 
 <p></p> Here is an example of a domain class customer that has the following properties: 
 <ul> 
  <li>givenName</li> 
  <li>familyName</li> 
  <li>fullName</li> 
  <li>bonusMember</li> 
 </ul> 
 <pre>
 public class Customer {
 	private String givenName;
 	private String familyName;
 	private boolean bonusMember;
 
 	public String getGivenName() {
 		return givenName;
 	}
 
 	public void setGivenName(String givenName) {
 		this.givenName = givenName;
 	}
 
 	public String getFamilyName() {
 		return familyName;
 	}
 
 	public void setFamilyName(String familyName) {
 		this.familyName = familyName;
 	}
 
 	public String getFullName() {
 		return new TitleBuilder().append(givenName).append(familyName)
 				.toString();
 	}
 
 	public boolean isBonusMember() {
 		return bonusMember;
 	}
 
 	public void setBonusMember(boolean bonusMember) {
 		this.bonusMember = bonusMember;
 	}
 }
 </pre> 
 <p> Properties are a special type of class members and are an intermediate between <a href="http://en.wikipedia.org/wiki/Mutator_method">getter and setter methods</a> and a <a href="http://en.wikipedia.org/wiki/Field_(computer_science)">field</a>. The following 3 sections will explain this in more detail. </p> 
 <p> </p> 
 <h3 id="TheDomainLayer_Properties_GetterMethods">Getter methods</h3> 
 <ul> 
  <li>A property always has a getter method, so that other objects can read its value</li> 
  <li>The getter method name starts with get, followed by the property name in <a href="http://en.wikipedia.org/wiki/CamelCase">CamelCase</a> when the property type is NOT a boolean (See the getGivenName() method in the example above)</li> 
  <li>The getter method name starts with is, followed by the property name in <a href="http://en.wikipedia.org/wiki/CamelCase">CamelCase</a> when the property type IS a boolean (See the isBonusMember() method in the example above)</li> 
  <li>The getter methods are always public (accessible by other objects)</li> 
 </ul> 
 <h3 id="TheDomainLayer_Properties_SetterMethods">Setter methods</h3> 
 <ul> 
  <li>A property might have a setter method, so that other objects can change its value. The property is read-only when it does not have a setter method</li> 
  <li>The setter method name starts with set, followed by the property name in <a href="http://en.wikipedia.org/wiki/CamelCase">CamelCase</a> (See the setFamilyName() method in the example above)</li> 
  <li>The setter methods are always public (accessible by other objects)</li> 
  <li>The setter methods are commonly placed after the corresponding getter method</li> 
 </ul> 
 <h3 id="TheDomainLayer_Properties_Fields">Fields</h3> 
 <ul> 
  <li>Properties can use <a href="http://en.wikipedia.org/wiki/Field_%28computer_science%29">fields</a> to hold information in the domain object. These fields need to be private (not accessible by other objects) to ensure <a href="http://en.wikipedia.org/wiki/Encapsulation_(computer_science)"> encapsulation</a> (See private fields givenName, familyName and male in the example above)</li> 
  <li>A property does not need to have a field. The value can be a computation of fields of other properties (such as the fullName property in the example above), or maybe even a value from an <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a> or a <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a>.</li> 
  <li>Fields are commonly defined at the beginning of the class</li> 
 </ul> 
 <h3 id="TheDomainLayer_Properties_PropertyTypes">Property types</h3> Property types can be divided into 3 groups: 
 <ul> 
  <li>Value property: A char, string, boolean, number, date, or other <a href="http://en.wikipedia.org/wiki/Primitive_data_type#Specific_primitive_data_types">primitive data types</a>. The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> will display these types as a <a href="http://en.wikipedia.org/wiki/Text_box">textbox</a>. Assuming that the user is allowed to modify that property, they may enter the value by typing in text, which will be validated and formatted according to the value type. Certainly value types may provide alternative mechanisms for user input, such as a calendar-selector for a date field.</li> 
  <li>Enumeration property: The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> will display these types as as a <a href="http://en.wikipedia.org/wiki/Combo_box">combo-box</a>, containing the different enumeration values as text.</li> 
  <li>Reference Property: A 'reference property' or 'entity' is one where the type is another <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>. Reference properties are thus sometimes referred to as 'associations'. The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> will display a <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> property as a <a href="http://en.wikipedia.org/wiki/Text_box">textbox</a>, containing the referenced object (as an icon and title) and a menu button. The menu button will open a <a href="http://en.wikipedia.org/wiki/Context_menu">context menu</a>, that contains <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s to manipulate the property value.</li> 
  <li>Collection Property: A 'collection property' is a property that returns an collection of either value properties (<a href="http://en.wikipedia.org/wiki/Primitive_data_type#Specific_primitive_data_types">primitive data type</a>) or reference properties (<a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s). The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> will display these types as a table. If the user clicks on a row a <a href="http://en.wikipedia.org/wiki/Context_menu">context menu</a> opens, containing <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s to manipulate the property value. Collections must be initialized (collection properties should never return null). Collection properties should not contain large collections. If you have a big collection associated with a <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> it is better to return the collection from an <a href="07-Action-Methods#ActionMethods">ActionMethod</a> in the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>, so that the table is displayed on a new tab.</li> 
 </ul> 
 <h3 id="TheDomainLayer_Properties_PropertyBehavior">Property behavior</h3> You can specify certain things about both the behavior and presentation of properties by adding specific attributes or methods. See section 
 <a href="08-Object-behavior#ObjectBehavior">ObjectBehavior</a>. 
 <p></p> 
 <h2 id="TheDomainLayer_ActionMethods">Action Methods</h2> 
 <p> Domain objects can contain action methods (see <a href="07-Action-Methods#ActionMethods_ActionMethodsForDomainObjects">DomainObjectActionMethod</a> section) </p> 
 <p></p> 
 <p></p> 
</div>