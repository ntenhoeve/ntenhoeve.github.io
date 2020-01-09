<div id="content">
 <h1 id="ObjectBehavior">Object behavior</h1> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_objectbehavior.java"></a> The <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a>, <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s and <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s can have behavior that defines how the objects act or how they are displayed. Behavior can be defined with: </p>
 <ul> 
  <li><a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralAnnotations">BehavioralAnnotation</a>s</li> 
  <li><a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralMethods">BehavioralMethod</a>s</li> 
 </ul> 
 <h3 id="ActionMethods_ActionMethodBehavior_BehavioralAnnotations">Behavioral Annotations</h3> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_behavioralannotation.java"></a> </p> 
 <p> <a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralAnnotations">BehavioralAnnotation</a>s are recognized by the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> and define how <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s, <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>s or <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s behave (how they act and how they are displayed). </p> 
 <a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralAnnotations">BehavioralAnnotation</a>s are normally located before the declaration of the member: 
 <ul> 
  <li><a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralAnnotations">BehavioralAnnotation</a>s for a class: are located before the class key word </li> 
  <li><a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralAnnotations">BehavioralAnnotation</a>s for a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>: are located before the getter method of a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a></li> 
  <li><a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralAnnotations">BehavioralAnnotation</a>s for an <a href="07-Action-Methods#ActionMethods">ActionMethod</a>: are located before the <a href="07-Action-Methods#ActionMethods">ActionMethod</a></li> 
 </ul> 
 <p></p> 
 <h3 id="ActionMethods_ActionMethodBehavior_BehavioralMethods">Behavioral Methods</h3> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_behavioralmethod.java"></a> </p> 
 <p> <a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralMethods">BehavioralMethod</a>s are recognized by the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> and dynamically define how <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s, <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>s or <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s behave (how they act and how they displayed). The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> will call these <a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralMethods">BehavioralMethod</a>s when the user interface is updated to get the current behavioral values depending on the state of the object (property values) </p> 
 <h3 id="ActionMethods_ActionMethodBehavior_BehavioralMethodConvention">Behavioral Method Convention</h3> 
 <ul> 
  <li>Syntax: &lt;memberName&gt;&lt;behaviourName&gt;<br /> &lt;memberName&gt;= can be a <a href="ReferenceName_Class">Class</a>Name, a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> Name or a <a href="07-Action-Methods#ActionMethods">ActionMethod</a>Name<br /> &lt;behaviourName&gt;= A behavior like FontIcon, Hidden, Disabled, Validation, etc</li> 
  <li><a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralMethods">BehavioralMethod</a>s do NOT have any parameters</li> 
  <li><a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralMethods">BehavioralMethod</a>s ALWAYS return a value (see <a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralMethods">BehavioralMethod.returnType()</a> of the different implementations</li> 
  <li><a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralMethods">BehavioralMethod</a>s are public</li> 
  <li><a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralMethods">BehavioralMethod</a>s are not static</li> 
  <li><a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralMethods">BehavioralMethod</a>s are normally located after the declaration of the member:</li> 
  <ul> 
   <li><a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralMethods">BehavioralMethod</a>s for classes: are located after the constructors </li> 
   <li><a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralMethods">BehavioralMethod</a>s for <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>: are located after the getter and setter methods of the properties</li> 
   <li><a href="07-Action-Methods#ActionMethods_ActionMethodBehavior_BehavioralMethods">BehavioralMethod</a>s for <a href="07-Action-Methods#ActionMethods">ActionMethod</a>: are located after the <a href="07-Action-Methods#ActionMethods">ActionMethod</a></li> 
  </ul> 
 </ul> 
 <p></p> 
 <h2 id="ObjectBehavior_DisplayName">Display Name</h2> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_displayname_displaynamemodel.java"></a> </p> 
 <p> The <a href="ReferenceName_Class">Class</a>Names, <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> names and <a href="07-Action-Methods#ActionMethods">ActionMethod</a>Names are part of the <a href="http://martinfowler.com/bliki/UbiquitousLanguage.html">ubiquitous language</a> (in terms both understand by users and developers). The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> therefore displays the same names as used in the program code. </p> 
 <h3 id="ObjectBehavior_DisplayName_DisplayNameDefault">DisplayName Default</h3> 
 <p> <a href="ReferenceName_Class">Class</a> names, <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> names and <a href="07-Action-Methods#ActionMethods">ActionMethod</a> names in the <a href="https://en.wikipedia.org/wiki/Codebase">codebase</a> use names such as OrderService, orderLines, addOrderLine (using no spaces, <a href="https://nl.wikipedia.org/wiki/CamelCase">camelCase</a> and no special characters). If the user is a an human, more user friendly names are needed such as “Orders” “PropertyActionMethod lines” and “Add order line”. This format is called the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_displayname_displayname.java">DisplayName</a>. The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> will automatically convert the names used in the code to a human readable format (<a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_displayname_displayname.java">DisplayName</a>) when needed. </p> 
 <p> The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> supports DisplayNames for multiple languages. The <a href="05-The-Provider-Layer#TheProviderLayer_LanguageProvider">LanguageProvider</a> is used to get the default displayNames from a language specific property files. For more information see <a href="05-The-Provider-Layer#TheProviderLayer_LanguageProvider">LanguageProvider</a>. </p> 
 <h3 id="ObjectBehavior_DisplayName_DisplayNameAnnotation">DisplayName Annotation</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_displayname_displayname.java"></a> The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> will automatically convert the names used in the program code to a human readable English format by default. In some cases the default <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_displayname_displayname.java">DisplayName</a> does not suffice, in example when: </p> 
 <ul> 
  <li>A different use of capital case is needed</li> 
  <li>Special characters are needed that can not be used in the code</li> 
  <li>The plural form of the default displayName of a ServiceObject is incorrect</li> 
 </ul> 
 <p> In these cases you can override the English default text with the language property file or with a <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_displayname_displayname.java">DisplayName</a> annotation, The <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_displayname_displayname.java">DisplayName</a> annotation is placed: </p> 
 <ul> 
  <li>before the class keyword</li> 
  <li>before the getter method of a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a></li> 
  <li>or before a <a href="07-Action-Methods#ActionMethods">ActionMethod</a></li> 
 </ul> 
 <p></p> TODO EXAMPLE ACMEWebShop 
 <p></p> 
 <p></p> 
 <p></p> 
 <h2 id="ObjectBehavior_Description">Description</h2> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_description_descriptionmodel.java"></a> </p> 
 <p> Each <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> or <a href="07-Action-Methods#ActionMethods">ActionMethod</a> can have a text to explain the class member in more detail. This <a href="08-Object-behavior#ObjectBehavior_Description">DescriptionModel</a> is often displayed in a graphical user interface as <a href="https://en.wikipedia.org/wiki/Tooltip">tooltip</a> or can be used by most <a href="https://en.wikipedia.org/wiki/Computer_accessibility">accessibility tools (e.g. for blind people)</a> when the user hovers over the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> or <a href="07-Action-Methods#ActionMethods">ActionMethod</a> (menu item) or icon </p> 
 <h3 id="ObjectBehavior_Description_DescriptionDefault">Description Default</h3> 
 <p> By default the description is the same as the default <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_displayname_displayname.java">DisplayName</a>, therefore it is recommended to override the default value where needed. You can override the default value by by adding the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_description_description.java">Description</a> in the language property files (see <a href="05-The-Provider-Layer#TheProviderLayer_LanguageProvider">LanguageProvider</a>) or by adding a description annotation. </p> 
 <h3 id="ObjectBehavior_Description_DescriptionAnnotation">Description Annotation</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_description_description.java"></a> </p> 
 <p> You can override the default description value for the English language, by putting the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_description_description.java">Description</a> annotation before the getter method of a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> or before an <a href="07-Action-Methods#ActionMethods">ActionMethod</a> </p> TODO EXAMPLE 
 <p> Note that the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_description_description.java">Description</a> annotation is intended for the English language only. Use the Description default if you want to use multiple languages </p> 
 <p></p> 
 <p></p> 
 <p></p> 
 <h2 id="ObjectBehavior_Title">Title</h2> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_title_titlemodel.java"></a> </p> 
 <p> <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s that have identity (entities) need to have a dynamic title that help users to distinguish objects of the same type (e.g. Type customer versus “John Doe”). This title should exist of all the properties that identify the object. The title is therefore dynamic: it changes when the value of these properties change. </p> 
 <p> In example: The title of a customer could be a customer number, followed by the given name, followed by the family name. If the customer changes it’s name, than so does the title (but not its identity) </p> 
 <h3 id="ObjectBehavior_Title_TitleDefault">Title Default</h3> 
 <p> The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> provides a default title based on the properties that are normally displayed in tables. This is a best guess. It is therefore recommended to always implement the toString method. </p> 
 <h3 id="ObjectBehavior_Title_TitletoStringMethod">Title (toString) method</h3> 
 <p> You can define the title by overriding the the toString() method of your <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> </p> 
 <p> (TODO example with Customer toString and TitleBuilder) </p> 
 <h3 id="ObjectBehavior_Title_TitleBuilder">Title builder</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_generic_util_titlebuilder.java"></a> </p> 
 <p> Often a <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> can be identified by a single property. The toString() method can than simply return this property value to return the title. </p> 
 <p> In other cases a DomainObject is identified by multiple property values. In this case it is recommended to override the <a href="ReferenceName_reflect-examples_examples_reflect-for-vaadin14-archetype_target_classes_archetype-resources_src_main_java___application-class-name__.java">toString()</a> method and using the <a href="08-Object-behavior#ObjectBehavior_Title_TitleBuilder">TitleBuilder</a> to create an identification string. </p> 
 <p> The <a href="08-Object-behavior#ObjectBehavior_Title_TitleBuilder">TitleBuilder</a> can be compared with a StringBuilder, but has some additional functionality such as: </p> 
 <ul> 
  <li>The “append” methods will append a separator and a given value. You can use the default separator (a comma and a space) or use an “append” method where you pass the separator as a first parameter followed by the value.</li> 
  <li>The “contact” methods will append a given value without a separator</li> 
  <li>Both “append” and “contact” methods will ignore null values or reference objects that have not overridden the toString method</li> 
  <li>Both “append” and “contact” methods have methods where you can specify format values (e.g. date, time and numbers)</li> 
  <li>Enumeration values will be translated to a readable format</li> 
 </ul> TODO example 
 <p></p> 
 <p></p> 
 <p></p> 
 <h2 id="ObjectBehavior_FontIcon">FontIcon</h2> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fonticon_fonticonmodelfactory.java"></a> </p> 
 <p> <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s ,<a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s and <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s can have <a href="https://www.sitepoint.com/introduction-icon-fonts-font-awesome-icomoon/">FontIcons</a> that are displayed in graphical user interfaces. These icons help the user to quickly identify what they are looking at. </p> 
 <p> <a href="https://www.sitepoint.com/introduction-icon-fonts-font-awesome-icomoon/">Fonticons</a> have become very popular in graphical user interface design. ApplicationIcon fonts are just fonts. However, instead of containing letters or numbers, they contain symbols and glyphs that can be used in a graphical user interface. Advantages of font icons over <a href="https://en.wikipedia.org/wiki/Image_file_formats#Raster_formats">raster format files</a>: </p> 
 <ul> 
  <li>Browsers are usually faster in rendering fonts than loading image files. </li> 
  <li>Fonts Icons are <a href="https://en.wikipedia.org/wiki/Vector_graphics">vector graphics</a>, so they scale well at any size.</li> 
  <li>As font icons are text characters, all icons can be styled in the same way (size, color, shadow, etc)</li> 
 </ul> 
 <p></p> 
 <p> There are many free font icons that you can use in your application (e.g. download or include with a build tool like <a href="https://maven.apache.org/">Maven</a>). Examples of free ApplicationIcon fonts are: </p> 
 <ul> 
  <li><a href="https://material.io/tools/icons/">Google Material Icons</a></li> 
  <li><a href="https://fontawesome.com">Font Awesome</a></li> 
  <li><a href="https://speckyboy.com/free-icon-fonts/">and many more...</a></li> 
 </ul> 
 <p></p> 
 <p> There are free online tools to create your own icon font, e.g by: importing from icons from their (free) database, other (free) icon fonts or <a href="https://en.wikipedia.org/wiki/Scalable_Vector_Graphics"> XML-based vector image format (SVG)</a> from other (free) web sites. Example of web site that help you build your icon font are: </p> 
 <ul> 
  <li><a href="http://fontastic.me">Fontastic</a></li> 
  <li><a href="https://icomoon.io">Icomoon</a></li> 
  <li><a href="https://www.flaticon.com">FlatIcon</a></li> 
 </ul> 
 <p></p> Note that the icon is also linked to the 
 <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_description_description.java">Description</a> of that class so that it can be displayed as a 
 <a href="https://en.wikipedia.org/wiki/Tooltip">tooltip</a> or can be used by most 
 <a href="https://en.wikipedia.org/wiki/Computer_accessibility">accessibility tools (e.g. for blind people)</a> when the user hovers over the icon. 
 <h3 id="ObjectBehavior_FontIcon_FontIconDefault">FontIcon Default</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fonticon_fonticonnourlmodel.java"></a> </p> 
 <p> The default is no <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fonticon_fonticon.java">FontIcon</a> </p> 
 <p></p> 
 <p></p> 
 <h3 id="ObjectBehavior_FontIcon_FontIconAnnotation">FontIcon Annotation</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fonticon_fonticon.java"></a> </p> 
 <p> You can define the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fonticon_fonticon.java">FontIcon</a> by placing an <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fonticon_fonticon.java">FontIcon</a> annotation before the class key word of the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a> or the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> or before the <a href="07-Action-Methods#ActionMethods">ActionMethod</a>. </p> 
 <p> Syntax: <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fonticon_fonticon.java">FontIcon</a>(String fontIconUrl) </p> 
 <p> Parameter fontIconUrl: See <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders_FontIconUrlProvider">FontIconUrl</a> </p> 
 <p></p> 
 <p></p> 
 <h3 id="ObjectBehavior_FontIcon_FontIconMethod">FontIcon Method</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fonticon_fonticonmethod.java"></a> </p> 
 <p> Instead of the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fonticon_fonticon.java">FontIcon</a> annotation you can also define the icon with a <a href="08-Object-behavior#ObjectBehavior_FontIcon_FontIconMethod">FontIconMethod</a>. This allows you to change the icon dynamically during runtime, based on the object state (e.g. when the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> Person is a male or female). </p> 
 <p> Syntax: public string &lt;className or <a href="07-Action-Methods#ActionMethods">ActionMethod</a>Name&gt;FontIcon() </p> The return value must be an 
 <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders_FontIconUrlProvider">FontIconUrl</a>. TODO EXAMPLE customer male or female icon 
 <p></p> 
 <p></p> 
 <p></p> 
 <h2 id="ObjectBehavior_ApplicationIcon">ApplicationIcon</h2> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_applicationicon_applicationiconmodelfactory.java"></a> </p> 
 <p> With a <a href="08-Object-behavior#ObjectBehavior_ApplicationIcon_ApplicationIconAnnotation">ApplicationIcon</a> the graphical user interface of a <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> can easily be identified by the user. This icon is a file that contains an image. The type, size and depends on the type(platforms) of your application. In example: </p> 
 <ul> 
  <li><a href="https://docs.oracle.com/javase/8/javafx/api/javafx/stage/Stage.html#getIcons--">Icon requirements for JavaFX (desktop) applications</a></li> 
  <li><a href="https://developer.android.com/studio/write/image-asset-studio">Icon requirements for Android (mobile) applications</a></li> 
  <li><a href="https://en.m.wikipedia.org/wiki/Favicon">Icon requirements for Web applications</a></li> 
 </ul> 
 <p></p> 
 <h3 id="ObjectBehavior_ApplicationIcon_ApplicationIconDefault">ApplicationIcon Default</h3> 
 <p> The default is no <a href="08-Object-behavior#ObjectBehavior_ApplicationIcon_ApplicationIconAnnotation">ApplicationIcon</a> </p> 
 <h3 id="ObjectBehavior_ApplicationIcon_ApplicationIconAnnotation">ApplicationIcon Annotation</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_applicationicon_applicationicon.java"></a> </p> 
 <p> You can define the <a href="08-Object-behavior#ObjectBehavior_ApplicationIcon_ApplicationIconAnnotation">ApplicationIcon</a> by placing an <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fonticon_fonticon.java">FontIcon</a> annotation before the “class” of the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a>. </p> 
 <p> Syntax: <a href="08-Object-behavior#ObjectBehavior_ApplicationIcon_ApplicationIconAnnotation">ApplicationIcon</a>(String iconURL) </p> 
 <p> Parameter iconURI: a URL to a image file. Best practice is to put the icon file in the package of the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> class and refer to it using a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_classresource_classresourceurl.java">ClassResourceUrl</a>. TODO: example. </p> 
 <p></p> 
 <p></p> 
 <h3 id="ObjectBehavior_ApplicationIcon_ApplicationIconMethod">ApplicationIcon Method</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_applicationicon_applicationiconmethod.java"></a> </p> 
 <p> Instead of the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fonticon_fonticon.java">FontIcon</a> annotation you can also define the icon with a <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_applicationicon_applicationiconmethod.java">ApplicationIconMethod</a>. This allows you to change the icon dynamically during runtime, based on state (e.g. when the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> Person is a male or female). </p> 
 <p> Syntax: public string &lt;ApplicationClassName&gt;ApplicationIcon() </p> The return value must be an a URL to the 
 <a href="08-Object-behavior#ObjectBehavior_ApplicationIcon_ApplicationIconAnnotation">ApplicationIcon</a> file, e.g. a 
 <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_classresource_classresourceurl.java">ClassResourceUrl</a>. TODO EXAMPLE of a changing application icon 
 <p></p> 
 <p></p> 
 <p></p> 
 <h2 id="ObjectBehavior_Hidden">Hidden</h2> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_hidden_hiddenmodelfactory.java"></a> A <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> or <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is visible on the user interface by default,but in some cases you may want to hide them, e.g.: </p> 
 <ul> 
  <li>Because not all information needs to be displayed in the user interface (e.g. a database id key or version number for optimistic locking)</li> 
  <li>Because you want to limit the number of visible properties in a table (e.g. to limit the number of columns in a table to prevent the table to become cluttered with to much information)</li> 
  <li>Depending on the state of a <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> you do not want to display Irrelevant information</li> 
  <li>Depending on the state of a domain object you do not want a user to activate an action method (e.g. hide an <a href="07-Action-Methods#ActionMethods">ActionMethod</a> “submit” once the domainObject already is submitted)</li> 
  <li>Because a user is not authorized to see a property value</li> 
  <li>Because a user is not authorized to activate an <a href="07-Action-Methods#ActionMethods">ActionMethod</a></li> 
 </ul> 
 <h3 id="ObjectBehavior_Hidden_HiddenAnnotation">Hidden Annotation</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_hidden_hidden.java"></a> </p> 
 <p> You can hide a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> by putting the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_hidden_hidden.java">Hidden</a> annotation before the getter method or you can hide an <a href="07-Action-Methods#ActionMethods">ActionMethod</a> by putting the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_hidden_hidden.java">Hidden</a> annotation before the <a href="07-Action-Methods#ActionMethods">ActionMethod</a>. </p> 
 <p> Syntax: @Hidden(propertyHiddenFor, exceptForRoles) </p> 
 <p> Parameters: </p> 
 <ul> 
  <li><a href="ReferenceName_reflect-examples_examples_reflect-for-vaadin14-archetype_target_classes_archetype-resources_src_main_java___application-class-name__.java">propertyHiddenFor()</a>: optional and for properties only: to indicate if the property should be hidden in <a href="ReferenceName_reflect-framework_reflect_reflect-for-javafx_src_main_java_nth_reflect_fw_javafx_control_tab_form_formtab.java">FormTab</a>s, <a href="ReferenceName_reflect-framework_reflect_reflect-for-vaadin_src_main_java_nth_reflect_ui_vaadin_tab_table_tabletab.java">TableTab</a>s or both (hidden for both is default).</li> 
  <li><a href="ReferenceName_reflect-examples_examples_reflect-for-vaadin14-archetype_target_classes_archetype-resources_src_main_java___application-class-name__.java">exceptForRoleNames()</a> : optional comma separated string of user roles that are allowed to see the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> or <a href="07-Action-Methods#ActionMethods">ActionMethod</a></li> 
 </ul> 
 <p></p> TODO EXAMPLE 
 <p></p> 
 <p></p> 
 <h3 id="ObjectBehavior_Hidden_HiddenMethod">Hidden Method</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_hidden_hiddenmethod.java"></a> </p> 
 <p> You can hide a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> or <a href="07-Action-Methods#ActionMethods_ActionMethodsForDomainObjects">DomainObjectActionMethod</a> depending on the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> state (the value of its properties), with an ...Hidden method. If you have a <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_hidden_hidden.java">Hidden</a> annotation and a ...Hidden method, both need to be true in order to hide the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> or <a href="07-Action-Methods#ActionMethods">ActionMethod</a>. </p> 
 <p> Note that you can not change the visibility with a ...Hidden method for <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> in a <a href="ReferenceName_reflect-framework_reflect_reflect-for-vaadin_src_main_java_nth_reflect_ui_vaadin_tab_table_tabletab.java">TableTab</a>! </p> 
 <p> Syntax: public boolean &lt;property name or actionMethodName&amp;gtHidden;() </p> 
 <p> ReturnValue: a boolean that is true if the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> or <a href="07-Action-Methods#ActionMethods">ActionMethod</a> needs to be hidden </p> 
 <p></p> 
 <p></p> 
 <p></p> 
 <h2 id="ObjectBehavior_Disabled">Disabled</h2> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_disabled_disabledmodelfactory.java"></a> </p> 
 <p> A <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> or <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is enabled on the user interface by default, but in some cases you may want to disable them. If something is disabled they are grayed out on the user interface. Disabled properties can not be edited (read only) and disabled <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s can not be invoked. </p> 
 <p> You may want to disable items when: </p> 
 <ul> 
  <li>Not all properties need to be editable on the user interface but the code might need a setter method to set the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>value when the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> is created from the database</li> 
  <li>Depending on the state of a <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> you do not want the user to edit certain <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a></li> 
  <li>Depending on the state of a <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> you do not want a user to invoke an <a href="07-Action-Methods#ActionMethods">ActionMethod</a> (e.g. prevent invoking <a href="07-Action-Methods#ActionMethods">ActionMethod</a> “submit” once the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> already is submitted)</li> 
  <li>Because a user is not authorized to edit a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> Value</li> 
 </ul> 
 <p></p> 
 <p> Important note: If an user is not authorized to change a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> or call an <a href="07-Action-Methods#ActionMethods">ActionMethod</a> it is best to hide the method or property instead of disabling it. In general you do not want to confuse users (clutter the user interface) with options that they are not allowed to use anyway. Disabled <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s <a href="https://axesslab.com/disabled-buttons-suck/">have a bad impact on usability</a>. </p> 
 <h3 id="ObjectBehavior_Disabled_DisabledAnnotation">Disabled Annotation</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_disabled_disabled.java"></a> </p> 
 <p> You can disable a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> by putting the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_disabled_disabled.java">Disabled</a> annotation before the getter method or you can disable an <a href="07-Action-Methods#ActionMethods">ActionMethod</a> by putting the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_disabled_disabled.java">Disabled</a> annotation before the <a href="07-Action-Methods#ActionMethods">ActionMethod</a>. </p> 
 <p> Syntax: @Disabled(exceptForRoles) </p> 
 <p> Parameter: <a href="ReferenceName_reflect-examples_examples_reflect-for-vaadin14-archetype_target_classes_archetype-resources_src_main_java___application-class-name__.java">exceptForRoleNames()</a>: optional comma separated string of user roles that are allowed to edit the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> or invoke a <a href="07-Action-Methods#ActionMethods">ActionMethod</a> </p> TODO EXAMPLE 
 <p></p> 
 <p></p> 
 <h3 id="ObjectBehavior_Disabled_DisabledMethod">Disabled Method</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_disabled_disabledmethod.java"></a> </p> 
 <p> You can disable a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> or <a href="07-Action-Methods#ActionMethods_ActionMethodsForDomainObjects">DomainObjectActionMethod</a> depending on the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> state (the value of its properties). </p> 
 <p> If you have a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_disabled_disabled.java">Disabled</a> annotation and a disabled method, only one needs to be true in order to disable the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> or <a href="07-Action-Methods#ActionMethods">ActionMethod</a>. </p> 
 <p> Syntax: public boolean &lt;property name or actionMethodName&gt;Disabled() </p> 
 <p> ReturnValue: a boolean that is true if the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> or <a href="07-Action-Methods#ActionMethods">ActionMethod</a> needs to be disabled </p> 
 <p></p> 
 <p></p> 
 <h3 id="ObjectBehavior_Disabled_DisabledAnnotationAndDisabledMethod">Disabled Annotation and Disabled Method</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_disabled_disabledormodel.java"></a> If the code has both a &quot;disabled annotation&quot; and a &quot;disabled method&quot;, the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> work will disable the item when on of them is true (if the user is not authorized by the definition of the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_disabled_disabled.java">Disabled</a> annotation OR if the disabled method returns true). </p> 
 <p></p> 
 <p></p> 
 <h2 id="ObjectBehavior_PropertyActionMethod">PropertyActionMethod</h2> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_info_actionmethod_propertyactionmethod.java"></a> </p> 
 <p> <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s may have <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s that do something with the value of a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>, e.g. modify it or display it or open it in a browser. In this case the we need to annotate it with the @<a href="08-Object-behavior#ObjectBehavior_PropertyActionMethod">PropertyActionMethod</a> annotation to indicated that the <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is an <a href="07-Action-Methods#ActionMethods_ActionMethodsForDomainObjectProperties">DomainObjectPropertyActionMethod</a> and needs to be added to a <a href="ReferenceName_reflect-core old_reflect_reflect-graphical-user-interface_src_main_java_nth_reflect_fw_gui_component_tab_form_propertypanel_menu_propertypanelmenu.java">PropertyPanelMenu</a>. You therefore must specify the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> name in the @<a href="08-Object-behavior#ObjectBehavior_PropertyActionMethod">PropertyActionMethod</a> annotation. </p> 
 <p> An <a href="07-Action-Methods#ActionMethods">ActionMethod</a> in a <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> will be an <a href="07-Action-Methods#ActionMethods_ActionMethodsForDomainObjects">DomainObjectActionMethod</a> and displayed in the <a href="ReferenceName_reflect-core old_reflect_reflect-graphical-user-interface_src_main_java_nth_reflect_fw_gui_component_tab_form_formtabmenu.java">FormTabMenu</a> if it does not have a @<a href="08-Object-behavior#ObjectBehavior_PropertyActionMethod">PropertyActionMethod</a> annotation. </p> TODO example 
 <p></p> 
 <h2 id="ObjectBehavior_Format">Format</h2> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_format_format.java"></a> </p> 
 <p> Some property types such as <a href="ReferenceName_Date">Date</a>, time, <a href="ReferenceName_Number">Number</a> can be formatted with help of the <a href="08-Object-behavior#ObjectBehavior_Format">Format</a> annotation. Note that the format can NOT be changed during runtime. </p> The 
 <a href="08-Object-behavior#ObjectBehavior_Format">Format</a> annotation can be added before the getter method of a 
 <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>. 
 <p></p> 
 <p> Syntax: @Format(string pattern) </p> 
 <p> Please see the JavaDoc of the <a href="ReferenceName_SimpleDateFormat">SimpleDateFormat</a> and <a href="ReferenceName_DecimalFormat">DecimalFormat</a> formatters to learn more about the patterns that can be used. See the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_format_formatfactory.java">FormatFactory</a> to learn how the formating works for the different <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> types. </p> TODO example 
 <p></p> 
 <h2 id="ObjectBehavior_FieldMode">Field Mode</h2> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fieldmode_textfieldmode.java"></a> </p> 
 <p> <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s are rendered by the user interface layer as fields when a <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> is displayed in a <a href="ReferenceName_reflect-framework_reflect_reflect-for-javafx_src_main_java_nth_reflect_fw_javafx_control_tab_form_formtab.java">FormTab</a>. The <a href="ReferenceName_reflect-framework_reflect_reflect-for-javafx_src_main_java_nth_reflect_fw_javafx_control_tab_form_formtab.java">FormTab</a> will determine in what type of field these <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>s are displayed (textbox, combobox, etc). When the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> is a String, you can select an alternative field type using the <a href="08-Object-behavior#ObjectBehavior_FieldMode">TextFieldMode</a> annotation. The <a href="08-Object-behavior#ObjectBehavior_FieldMode">TextFieldMode</a> annotation needs to be put before the getter method of a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>. Note that the format can not be changed during runtime. </p> 
 <p> Syntax: @TextFieldMode(FieldModeType mode) </p> 
 <p> Examples of alternative <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fieldmode_fieldmodetype.java">FieldModeType</a>s: </p> 
 <ul> 
  <li><a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fieldmode_fieldmodetype.java">FieldModeType.TEXT_AREA</a>: renders a text field to edit a string with multiple lines</li> 
  <li><a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fieldmode_fieldmodetype.java">FieldModeType.PASSWORD</a>: renders a field to edit a password string (obscuring the input so that other users can not read the secret password)</li> 
  <li><a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fieldmode_fieldmodetype.java">FieldModeType.RICH_TEXT_AREA</a>: renders a field to edit a string, with formatting options such as bold, underline, italic,etc...)</li> 
 </ul> 
 <p></p> 
 <p> </p> 
 <p></p> 
 <h2 id="ObjectBehavior_ExecutionMode">Execution Mode</h2> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_executionmode_executionmode.java"></a> </p> 
 <p> <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s can be annotated, so that the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> knows how the <a href="07-Action-Methods#ActionMethods">ActionMethod</a> needs to be invoked after the user has clicked on the corresponding menu item. Note that the <a href="08-Object-behavior#ObjectBehavior_ExecutionMode">ExecutionMode</a> can not be changed during runtime. </p> 
 <p> Syntax: @ExecutionMode(<a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_executionmode_executionmodetype.java">ExecutionModeType</a> mode) </p> 
 <p> <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_executionmode_executionmodetype.java">ExecutionModeType</a>: </p> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_executionmode_executionmodetype.java"></a> </p> 
 <ul> 
  <li><a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_executionmode_executionmodetype.java">ExecutionModeType.EXECUTE_METHOD_DIRECTLY</a> : executes the method directly without user intervention</li> 
  <li><a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_executionmode_executionmodetype.java">ExecutionModeType.EXECUTE_METHOD_AFTER_CONFORMATION</a>: the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> opens a confirmation dialog. The method is executed after the user activates the confirmation button. The method is NOT executed when the user cancels the confirmation dialog.</li> 
  <li> <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_executionmode_executionmodetype.java">ExecutionModeType.EDIT_PARAMETER_THEN_EXECUTE_METHOD_OR_CANCEL</a>: the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> opens a form on a new tab, so that the user can modify (edit) the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>. The method is executed with the edited <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> as the method parameter, when the user clicks the confirmation button on the button bar. The method is NOT executed when the user clicks on cancel in the bottom bar.</li> 
 </ul> 
 <p></p> 
 <p></p> 
 <p></p> 
 <h2 id="ObjectBehavior_PropertyActionMethod">Property Action Method</h2> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_info_actionmethod_propertyactionmethod.java"></a> </p> 
 <p> <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s may have <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s that do something with the value of a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>, e.g. modify it or display it or open it in a browser. In this case the we need to annotate it with the @<a href="08-Object-behavior#ObjectBehavior_PropertyActionMethod">PropertyActionMethod</a> annotation to indicated that the <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is an <a href="07-Action-Methods#ActionMethods_ActionMethodsForDomainObjectProperties">DomainObjectPropertyActionMethod</a> and needs to be added to a <a href="ReferenceName_reflect-core old_reflect_reflect-graphical-user-interface_src_main_java_nth_reflect_fw_gui_component_tab_form_propertypanel_menu_propertypanelmenu.java">PropertyPanelMenu</a>. You therefore must specify the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> name in the @<a href="08-Object-behavior#ObjectBehavior_PropertyActionMethod">PropertyActionMethod</a> annotation. </p> 
 <p> An <a href="07-Action-Methods#ActionMethods">ActionMethod</a> in a <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> will be an <a href="07-Action-Methods#ActionMethods_ActionMethodsForDomainObjects">DomainObjectActionMethod</a> and displayed in the <a href="ReferenceName_reflect-core old_reflect_reflect-graphical-user-interface_src_main_java_nth_reflect_fw_gui_component_tab_form_formtabmenu.java">FormTabMenu</a> if it does not have a @<a href="08-Object-behavior#ObjectBehavior_PropertyActionMethod">PropertyActionMethod</a> annotation. </p> TODO example 
 <p></p> 
 <h2 id="ObjectBehavior_ReadOnlyActionMethod">Read Only Action Method</h2> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_info_actionmethod_readonlyactionmethod.java"></a> </p> 
 <p> Most <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s can modify values in a <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>, e.g. change a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> value. In this case the <a href="07-Action-Methods#ActionMethods_ActionMethodsForDomainObjects">DomainObjectActionMethod</a> or <a href="07-Action-Methods#ActionMethods_ActionMethodsForDomainObjectProperties">DomainObjectPropertyActionMethod</a> is only visible in the <a href="ReferenceName_reflect-core old_reflect_reflect-graphical-user-interface_src_main_java_nth_reflect_fw_gui_component_tab_form_propertypanel_menu_propertypanelmenu.java">PropertyPanelMenu</a> when the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> is edited in a <a href="ReferenceName_reflect-framework_reflect_reflect-for-javafx_src_main_java_nth_reflect_fw_javafx_control_tab_form_formtab.java">FormTab</a> (<a href="ReferenceName_reflect-core old_reflect_reflect-graphical-user-interface_src_main_java_nth_reflect_fw_gui_component_tab_form_formmode.java">FormMode.EDIT</a>). </p> 
 <p> You can annotate an <a href="07-Action-Methods#ActionMethods">ActionMethod</a> with the @<a href="08-Object-behavior#ObjectBehavior_ReadOnlyActionMethod">ReadOnlyActionMethod</a> annotation if the <a href="07-Action-Methods#ActionMethods">ActionMethod</a> does not not modify the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>. In this case the <a href="07-Action-Methods#ActionMethods_ActionMethodsForDomainObjects">DomainObjectActionMethod</a> or <a href="07-Action-Methods#ActionMethods_ActionMethodsForDomainObjectProperties">DomainObjectPropertyActionMethod</a> is also visible when the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> is viewed in a <a href="ReferenceName_reflect-framework_reflect_reflect-for-javafx_src_main_java_nth_reflect_fw_javafx_control_tab_form_formtab.java">FormTab</a> (<a href="ReferenceName_reflect-core old_reflect_reflect-graphical-user-interface_src_main_java_nth_reflect_fw_gui_component_tab_form_formmode.java">FormMode.READ_ONLY</a>) </p> 
 <p></p> 
 <h2 id="ObjectBehavior_ExecutionMode">Execution Mode</h2> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_executionmode_executionmode.java"></a> </p> 
 <p> <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s can be annotated, so that the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> knows how the <a href="07-Action-Methods#ActionMethods">ActionMethod</a> needs to be invoked after the user has clicked on the corresponding menu item. Note that the <a href="08-Object-behavior#ObjectBehavior_ExecutionMode">ExecutionMode</a> can not be changed during runtime. </p> 
 <p> Syntax: @ExecutionMode(<a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_executionmode_executionmodetype.java">ExecutionModeType</a> mode) </p> 
 <p> <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_executionmode_executionmodetype.java">ExecutionModeType</a>: </p> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_executionmode_executionmodetype.java"></a> </p> 
 <ul> 
  <li><a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_executionmode_executionmodetype.java">ExecutionModeType.EXECUTE_METHOD_DIRECTLY</a> : executes the method directly without user intervention</li> 
  <li><a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_executionmode_executionmodetype.java">ExecutionModeType.EXECUTE_METHOD_AFTER_CONFORMATION</a>: the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> opens a confirmation dialog. The method is executed after the user activates the confirmation button. The method is NOT executed when the user cancels the confirmation dialog.</li> 
  <li> <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_executionmode_executionmodetype.java">ExecutionModeType.EDIT_PARAMETER_THEN_EXECUTE_METHOD_OR_CANCEL</a>: the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> opens a form on a new tab, so that the user can modify (edit) the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>. The method is executed with the edited <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> as the method parameter, when the user clicks the confirmation button on the button bar. The method is NOT executed when the user clicks on cancel in the bottom bar.</li> 
 </ul> 
 <p></p> 
 <p></p> 
 <p></p> 
 <h2 id="ObjectBehavior_ParameterFactory">Parameter Factory</h2> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_parameterfactory_parameterfactorymodelfactory.java"></a> </p> 
 <p> The parameter factory allows you to create an object for an <a href="07-Action-Methods#ActionMethods">ActionMethod</a>. This object can then be edited by the user (depending how the <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is annotated, see <a href="08-Object-behavior#ObjectBehavior_ExecutionMode">ExecutionMode</a> annotation) after which it is passed as method parameter when the <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is invoked. </p> 
 <p> The <a href="ReferenceName_reflect-core old_reflect_reflect-for-vaadin14_src_main_java_nth_reflect_ui_vaadin_mainwindow_menu_mainmenu.java">MainMenu</a> will display all <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s of all registered <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s that can directly be executed (without the need of an opened <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>). This means that only <a href="07-Action-Methods#ActionMethods">ActionMethod</a>s that either have no method parameter or have an <a href="08-Object-behavior#ObjectBehavior_ParameterFactory_ParameterFactoryAnnotation">ParameterFactory</a> are displayed as menu items in the <a href="ReferenceName_reflect-core old_reflect_reflect-for-vaadin14_src_main_java_nth_reflect_ui_vaadin_mainwindow_menu_mainmenu.java">MainMenu</a>. </p> 
 <p> </p> 
 <h3 id="ObjectBehavior_ParameterFactory_ParameterFactoryAnnotation">ParameterFactory Annotation</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_parameterfactory_parameterfactory.java"></a> </p> 
 <p> When adding the <a href="08-Object-behavior#ObjectBehavior_ParameterFactory_ParameterFactoryAnnotation">ParameterFactory</a> Annotation before an <a href="07-Action-Methods#ActionMethods">ActionMethod</a>, the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> know's it is allowed to try to instantiate a new DomainObject. This <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> can then be edited by the user (depending how the <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is annotated, see <a href="08-Object-behavior#ObjectBehavior_ExecutionMode">ExecutionMode</a>) after which it is passed as method parameter when the <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is invoked. </p> 
 <p> Note that the method parameter (a <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>) can only be instantiated by an <a href="08-Object-behavior#ObjectBehavior_ParameterFactory_ParameterFactoryAnnotation">ParameterFactory</a> annotation if it has a public constructor without parameters. If not use the ...ParameterFactory method. </p> 
 <p> Syntax: </p> 
 <p></p> 
 <p></p> 
 <h3 id="ObjectBehavior_ParameterFactory_ParameterFactoryMethod">ParameterFactory Method</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_parameterfactory_parameterfactorymethod.java"></a> </p> 
 <p> When adding the <a href="08-Object-behavior#ObjectBehavior_ParameterFactory_ParameterFactoryAnnotation">ParameterFactory</a> method (normally located after an <a href="07-Action-Methods#ActionMethods">ActionMethod</a>), the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> will first get a new <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> from the <a href="08-Object-behavior#ObjectBehavior_ParameterFactory_ParameterFactoryMethod">ParameterFactoryMethod</a>. This object can then be edited by the user (depending how the <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is annotated, see <a href="08-Object-behavior#ObjectBehavior_ExecutionMode">ExecutionMode</a>) after which it is passed as method parameter when the <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is invoked. </p> 
 <p> Syntax: public&lt;domainObject type&gt; prameterFactory&lt;actionMethodName&gt;() </p> 
 <p> TODO EXAMPLE OF ordersWithinPeriod METHOD </p> 
 <p></p> 
 <p></p> 
 <p></p> 
 <h2 id="ObjectBehavior_Validation">Validation</h2> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_validation_validationmethodfactory.java"></a> </p> 
 <p> </p> 
 <p> The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> sometimes let’s the user edit an <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> before it is passed as an <a href="07-Action-Methods#ActionMethods">ActionMethod</a> parameter (depending on how the <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is annotated, see <a href="08-Object-behavior#ObjectBehavior_ExecutionMode">ExecutionMode</a>). The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> then validates the edited <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> using the <a href="05-The-Provider-Layer#TheProviderLayer_ValidationProvider">ValidationProvider</a> before the <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is called.The <a href="05-The-Provider-Layer#TheProviderLayer_ValidationProvider">ValidationProvider</a> will use validation annotations and validation methods that are located in the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s them selves to validate the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s. </p> 
 <h3 id="ObjectBehavior_Validation_ValidationAnnotations">Validation annotations</h3> 
 <p> A <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>s can be validated by putting validation annotations before the getter method of a property. The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> uses the JSR303 complient Apache BVal library for validation. Please read the BVal documentation on how to annotate the getter methods of the properties. </p> 
 <h3 id="ObjectBehavior_Validation_ValidationMethods">Validation methods</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_validation_validationmethod.java"></a> </p> 
 <p> <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s and <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>s can also be validated with <a href="08-Object-behavior#ObjectBehavior_Validation_ValidationMethods">ValidationMethod</a>s located in the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> so that you can do more complicated validation using code. </p> 
 <p> ValidationMethods conventions: </p> 
 <ul> 
  <li>Syntax: public <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_validation_validationviolations.java">ValidationViolations</a> &lt;<a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>Name&gt;&lt;constraint name&gt;Validation.<br /> E.g. for a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> startDate: public <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_validation_validationviolations.java">ValidationViolations</a> startDateAfterTodayValidation()<br /> E.g. for business rule custommerUnique: public <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_validation_validationviolations.java">ValidationViolations</a> customerUniqueValidation()</li> 
  <li>Method may not have a method parameter</li> 
  <li>Method must return a ValidationViolation</li> 
  <li>Method must be public</li> 
  <li>Method may not be static</li> 
  <li>May not change the state of the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a></li> 
 </ul> TODO code example TODO EXPLAIN 
 <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_validation_validationviolations.java">ValidationViolations</a> 
 <p></p> 
 <p></p> 
 <p></p> 
 <p></p> 
 <p></p> 
 <h2 id="ObjectBehavior_Options">Options</h2> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_option_optionsmodelfactory.java"></a> </p> 
 <p> A <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> can sometimes only have a limited amount of valid values. Such an <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> can be displayed as a <a href="https://en.wikipedia.org/wiki/Combo_box">Combo Box</a> to select one of these values when its been edited. </p> 
 <h3 id="ObjectBehavior_Options_OptionMethod">Option Method</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_option_optionsmethod.java"></a> </p> 
 <p> The <a href="ReferenceName_Options">Options</a> method returns a <a href="ReferenceName_java.util.List">java.util.List</a> with values that can be selected for a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> e.g. with a <a href="https://en.wikipedia.org/wiki/Combo_box">Combo Box</a> </p> 
 <p> Syntax: public <a href="ReferenceName_reflect-framework_reflect_reflect-for-javafx_src_main_java_nth_reflect_fw_javafx_control_list_list.java">List</a>&lt;<a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>Type &gt; &lt;<a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> name&gt;Options(); </p> 
 <p> Return Value: A <a href="ReferenceName_reflect-framework_reflect_reflect-for-javafx_src_main_java_nth_reflect_fw_javafx_control_list_list.java">List</a> with values of the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> Type. This <a href="ReferenceName_java.util.List">java.util.List</a> should not be empty because than a user can not select a value. The <a href="ReferenceName_java.util.List">java.util.List</a> may contain a null value when the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a> may be null. It is best to use an ordered <a href="ReferenceName_java.util.List">java.util.List</a> (e.g. an <a href="ReferenceName_ArrayList">ArrayList</a>) so that the items stay in the same sequence for the user to choose from. </p> 
 <p></p> 
 <p></p> 
 <p></p> 
 <p></p> 
</div>