<div id="content">
 <h1 id="ActionMethods">Action Methods</h1> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_info_actionmethod_actionmethod.java"></a> </p>
 <p> An <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is a method in a <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> or <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a> that is displayed by the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> as a menu item. An <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is invoked by the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> when the user clicks on the menu item. </p> 
 <p> There are several menu's where these <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s are displayed: </p> 
 <ul> 
  <li><a href="ReferenceName_reflect-core old_reflect_reflect-for-vaadin14_src_main_java_nth_reflect_ui_vaadin_mainwindow_menu_mainmenu.java">MainMenu</a></li> 
  <li><a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_GridTab_GridTabMenu">GridTabMenu</a></li> 
  <li><a href="ReferenceName_reflect-core old_reflect_reflect-graphical-user-interface_src_main_java_nth_reflect_fw_gui_component_tab_form_formtabmenu.java">FormTabMenu</a></li> 
  <li><a href="ReferenceName_reflect-core old_reflect_reflect-graphical-user-interface_src_main_java_nth_reflect_fw_gui_component_tab_form_propertypanel_menu_propertypanelmenu.java">PropertyPanelMenu</a></li> 
 </ul> 
 <h2 id="ActionMethods_ActionMethodsForDomainObjects">Action Methods for Domain Objects</h2> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectactionmethod.java"></a> </p> 
 <p> <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s may have <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s that to do something with or for the given <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>. In example: an ShoppingCart object may have an ActionMethod such as checkout(). </p> 
 <p> <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s of <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s are displayed as menu items in the <a href="ReferenceName_reflect-core old_reflect_reflect-graphical-user-interface_src_main_java_nth_reflect_fw_gui_component_tab_form_formtabmenu.java">FormTabMenu</a>. </p> 
 <p></p> 
 <h2 id="ActionMethods_ActionMethodsForDomainObjectProperties">Action Methods for Domain Object Properties</h2> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectpropertyactionmethod.java"></a> </p> 
 <p> <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s may have <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s that do something with the value of a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>, e.g. modify it or display it or open it in a browser. In this case the we need to annotate it with the @<a href="08-Object-behavior#ObjectBehavior_PropertyActionMethod">PropertyActionMethod</a> annotation to indicated that the <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is an <a href="07-Action-Methods#ActionMethods_ActionMethodsForDomainObjectProperties">DomainObjectPropertyActionMethod</a> and needs to be displayed in the <a href="ReferenceName_reflect-core old_reflect_reflect-graphical-user-interface_src_main_java_nth_reflect_fw_gui_component_tab_form_propertypanel_menu_propertypanelmenu.java">PropertyPanelMenu</a>. You therefore must specify the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> name in the @<a href="08-Object-behavior#ObjectBehavior_PropertyActionMethod">PropertyActionMethod</a> annotation. </p> 
 <p> Examples: </p> 
 <ul> 
  <li>A ShoppingCar object may have an property lineItems that has a <a href="07-Action-Methods#ActionMethods_ActionMethodsForDomainObjectProperties">DomainObjectPropertyActionMethod</a>s such as addLineItem(LineItem lineItem) or removeLineItem(LineItem lineItem) or removeAllLineItems().</li> 
  <li>A Customer object may have an property address that has a PropertyActionMethod such as moveToNewAddress(Address new Address)</li> 
 </ul> 
 <p></p> 
 <p></p> 
 <h2 id="ActionMethods_ActionMethodsForServiceObjects">Action Methods for Service Objects</h2> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobjectactionmethod.java"></a> </p> 
 <p> <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s exist because they always have one ore more <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s. ActionMethods of serviceObjects can appear as menu items in the <a href="ReferenceName_reflect-core old_reflect_reflect-for-vaadin14_src_main_java_nth_reflect_ui_vaadin_mainwindow_menu_mainmenu.java">MainMenu</a>, <a href="ReferenceName_reflect-core old_reflect_reflect-graphical-user-interface_src_main_java_nth_reflect_fw_gui_component_tab_form_formtabmenu.java">FormTabMenu</a>, or <a href="ReferenceName_reflect-core old_reflect_reflect-graphical-user-interface_src_main_java_nth_reflect_fw_gui_component_tab_form_propertypanel_menu_propertypanelmenu.java">PropertyPanelMenu</a> </p> 
 <p> In Example: a CustomerService object may have an <a href="07-Action-Methods#ActionMethods">ActionMethod</a> such as findCustomer(CustomerSearchArgument searchArgument) that is displayed in the <a href="ReferenceName_reflect-core old_reflect_reflect-for-vaadin14_src_main_java_nth_reflect_ui_vaadin_mainwindow_menu_mainmenu.java">MainMenu</a>. </p> 
 <p></p> 
 <h2 id="ActionMethods_ActionMethodsConvention">Action Methods Convention</h2> 
 <p> Any method in a <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> or <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a> can be an Action method, provided that it complies with the following convention: </p> 
 <ul> 
  <li>The method has no parameter or a single <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> parameter</li> 
  <li>Its return type (if any) are types recognized by the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> (see below)</li> 
  <li>The method is not a getter method or a setter method (see <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>)</li> 
  <li>The method is not a <a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralMethods">BehavioralMethod</a></li> 
  <li>The method is public (not private)</li> 
  <li>The method is NOT static</li> 
 </ul> 
 <h2 id="ActionMethods_ActionMethodNames">Action method names</h2> 
 <p> The name of an <a href="07-Action-Methods#ActionMethods">ActionMethod</a> should describe the action in a <a href="http://martinfowler.com/bliki/UbiquitousLanguage.html">Ubiquitous Language</a> (in terms understood by both users and developers). Keep in mind that the goal of a user is almost never to create, update or delete objects. Method names like: createPerson(Person person), updatePerson(Person person) and removePerson(Person person) should therefore be avoided where possible. Method names like addNewBorn(BirthCirtificate birthCirtificate), addMarriage(Marriage marriage), deceased(DeathCertificate deathCertificate) would be better method names. </p> 
 <h2 id="ActionMethods_ActionMethodParameter">Action method parameter</h2> 
 <p> An action method either has no parameter or a single <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> as a parameter. If not, the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> will not recognize a method as an <a href="07-Action-Methods#ActionMethods">ActionMethod</a>. </p> 
 <h2 id="ActionMethods_ActionMethodReturnValue">Action method return value</h2> 
 <p> The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> renders the output of a method, depending on the type of the action method return value: </p> 
 <ul> 
  <li>No return value (void method): The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> will display a short message when the method has been executed</li> 
  <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html">A primitive data type</a>: The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> will display a message dialog that displays the return value after the method is been executed</li> 
  <li>A <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>: The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> displays the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> in a new <a href="ReferenceName_reflect-framework_reflect_reflect-for-javafx_src_main_java_nth_reflect_fw_javafx_control_tab_form_formtab.java">FormTab</a>.</li> 
  <li>A <a href="http://en.wikipedia.org/wiki/Java_collections_framework">collection</a> of <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s: The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> displays the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s in a new <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_GridTab">GridTab</a>.</li> 
  <li>A URI: The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> displays the contents of the URI on a new <a href="ReferenceName_reflect-framework_reflect_reflect-for-javafx_src_main_java_nth_reflect_fw_javafx_control_tab_tab.java">Tab</a>.</li> 
  <li>A <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer1userinterface_controller_downloadstream.java">DownloadStream</a>: The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> will open a &quot;Save as&quot; dialog&quot; so that the file can be down loaded.</li> 
 </ul> 
 <h2 id="ActionMethods_ActionMethodBehavior">Action Method behavior</h2> 
 <p> You can specify certain things about both the behavior and presentation of <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s with help of <a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralAnnotations">BehavioralAnnotation</a>s or <a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralMethods">BehavioralMethod</a>s, in example: </p> 
 <ul> 
  <li>Display name</li> 
  <li>icon</li> 
  <li>visibility</li> 
  <li>enabled state</li> 
  <li><a href="08-Object-behavior#ObjectBehavior_ExecutionMode">ExecutionMode</a></li> 
  <li><a href="08-Object-behavior#ObjectBehavior_PropertyActionMethod">PropertyActionMethod</a></li> 
  <li><a href="08-Object-behavior#ObjectBehavior_ReadOnlyActionMethod">ReadOnlyActionMethod</a></li> 
 </ul> Etc. See the sections on 
 <a href="08-Object-behavior#ObjectBehavior">ObjectBehavior</a>. 
 <p></p> 
 <p></p> 
</div>