<div id="content">
 <h1 id="TheProviderLayer">The Provider Layer</h1> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_providerlayer.java"></a> </p>
 <p> The <a href="05-The-Provider-Layer#TheProviderLayer">ProviderLayer</a> contains <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a> objects that provide generic <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> capabilities (<a href="cross cutting concerns">cross cutting concerns</a>) to support the higher layers (see <a href="01-The-Reflect-Framework#TheReflectFramework_ArchitectureOfAnReflectApplication">ReflectArchitecture</a>) </p> 
 <p> The <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_providercontainer.java">ProviderContainer</a> is an <a href="01-The-Reflect-Framework#TheReflectFramework_DependencyInjectionContainer">DependencyInjectionContainer</a> that represents the <a href="05-The-Provider-Layer#TheProviderLayer">ProviderLayer</a> and holds and manages <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a> Objects. </p> 
 <p></p> 
 <p> Note that this layer is the bottom layer (see <a href="01-The-Reflect-Framework#TheReflectFramework_ArchitectureOfAnReflectApplication">ReflectArchitecture</a> ), which means that objects in the upper layers may haved references to <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a>Objects, but not visa versa! </p> 
 <h2 id="TheProviderLayer_ProviderObjects">Provider Objects</h2> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java"></a> <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a>s are responsible for different <a href="cross cutting concerns">cross cutting concerns</a> within an <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> such as: </p> 
 <ul> 
  <li>Authorization (see <a href="05-The-Provider-Layer#TheProviderLayer_AuthorizationProvider">AuthorizationProvider</a>)</li> 
  <li>Validation (see <a href="05-The-Provider-Layer#TheProviderLayer_ValidationProvider">ValidationProvider</a>)</li> 
  <li>Multi language (see <a href="05-The-Provider-Layer#TheProviderLayer_LanguageProvider">LanguageProvider</a>)</li> 
  <li>Notifications (see <a href="05-The-Provider-Layer#TheProviderLayer_NotificationProvider">NotificationProvider</a>)</li> 
  <li>File path information (see <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders">UrlProvider</a>)</li> 
  <li>Object meta information (see <a href="05-The-Provider-Layer#TheProviderLayer_ReflectionProvider">ReflectionProvider</a>)</li> 
  <li>Version information (see <a href="05-The-Provider-Layer#TheProviderLayer_AboutProvider">AboutProvider</a>)</li> 
 </ul> 
 <p> <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a>s may be used by any class within an application. </p> 
 <p> Providers are interfaces and can have multiple implementations (depending on what type of application you are using/writing). Which implementation of each provider needs to be used within an application is defined in the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> class. You are free to implement your own <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a> implementation and register it by overwriting one of the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication.get...ProviderClass()</a> methods </p> 
 <h3 id="TheProviderLayer_ProviderObjects_ProviderConstruction">Provider Construction</h3> 
 <p> <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a>'s are instantiated by the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_providercontainer.java">ProviderContainer</a> (see <a href="01-The-Reflect-Framework#TheReflectFramework_DependencyInjectionContainer">DependencyInjectionContainer</a>) <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a>Objects can have references to other <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a>Objects. These objects are injected into the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a>Objects (see the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_container_constructioninjection.java">ConstructionInjection</a> section. </p> 
 <h3 id="TheProviderLayer_ProviderObjects_ProviderPresentation">Provider Presentation</h3> 
 <p> The methods of <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a>Objects are not displayed by the <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a>. </p> 
 <h2 id="TheProviderLayer_AuthorizationProvider">Authorization Provider</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_authorization_authorizationprovider.java"></a> </p> 
 <p> <a href="https://en.wikipedia.org/wiki/Authorization_(computer_access_control)">Authorization</a>, means the ability to control what an individual user can see and do within an application, based upon their identity and the role(s) assigned to them. </p> The 
 <a href="05-The-Provider-Layer#TheProviderLayer_AuthorizationProvider">AuthorizationProvider</a> facilitates this with methods: 
 <ul> 
  <li> <a href="05-The-Provider-Layer#TheProviderLayer_AuthorizationProvider">AuthorizationProvider.getCurrentUserName()</a></li> 
  <li> <a href="05-The-Provider-Layer#TheProviderLayer_AuthorizationProvider">AuthorizationProvider.userInRole(String userRole)</a></li> 
 </ul> 
 <h3 id="TheProviderLayer_AuthorizationProvider_TypesOfAuthorizationProvider">Types of AuthorizationProvider</h3> There can be different types of 
 <a href="05-The-Provider-Layer#TheProviderLayer_AuthorizationProvider">AuthorizationProvider</a> implementations, depending on the authorization mechanism you prefer. In example: you could write an implementation that uses: 
 <ul> 
  <li>hard coded authorization</li> 
  <li>file based authorization</li> 
  <li>database authorization</li> 
  <li>web container authorization (e.g. <a href="https://tomcat.apache.org/tomcat-7.0-doc/realm-howto.html">Apache Tomcat Realm</a>)</li> 
  <li><a href="https://nl.wikipedia.org/wiki/Lightweight_Directory_Access_Protocol">LDAP</a></li> 
  <li><a href="https://nl.wikipedia.org/wiki/Active_Directory">Active directory</a></li> 
  <li>or other</li> 
 </ul> An example of a basic hard coded validation 
 <pre>
 public class AuthorizationProviderTestObject implements AuthorizationProvider {
 
 	private final List&lt;UserTestObject&gt; users;
 	private UserTestObject currentUser;
 
 	public AuthorizationProviderTestObject() {
 		users = new ArrayList&lt;&gt;();
 		users.add(new UserTestObject(&quot;carla&quot;, &quot;pasword1&quot;, &quot;salesmanager&quot;));
 		users.add(new UserTestObject(&quot;john&quot;, &quot;pasword2&quot;, &quot;customer&quot;));
 	}
 
 	public void login(String userName, String password)
 			throws InvalidNameOrPasswordException {
 		for (UserTestObject user : users) {
 			if (user.isValid(userName, password)) {
 				currentUser = user;
 				return;
 			}
 		}
 		throw new InvalidNameOrPasswordException();
 	}
 
 	@Override
 	public String getCurrentUserName() {
 		return currentUser == null ? &quot;&quot; : currentUser.getName();
 	}
 
 	@Override
 	public boolean userInRole(String role) {
 		return currentUser == null ? false : currentUser.inRole(role);
 	}
 
 }
 
 </pre> 
 <h3 id="TheProviderLayer_AuthorizationProvider_RegisteringAnAuthorizationProvider">Registering an AuthorizationProvider</h3> 
 <p> The <a href="05-The-Provider-Layer#TheProviderLayer_AuthorizationProvider">AuthorizationProvider</a> is registered to the framework with the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication.getAuthorizationProviderClass()</a> method. By default it returns the <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_authorization_defaultauthorizationprovider.java">DefaultAuthorizationProvider</a>, which always returns true on the <a href="ReferenceName_reflect-examples_examples_reflect-for-vaadin14-archetype_target_classes_archetype-resources_src_main_java___application-class-name__.java">userInRole(String)</a> method. You can register another <a href="05-The-Provider-Layer#TheProviderLayer_AuthorizationProvider">AuthorizationProvider</a> implementation by overriding the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication.getAuthorizationProviderClass()</a> method. </p> 
 <h3 id="TheProviderLayer_AuthorizationProvider_UsingAnAuthorizationProvider">Using an AuthorizationProvider</h3> 
 <p> The <a href="05-The-Provider-Layer#TheProviderLayer_AuthorizationProvider">AuthorizationProvider</a> is used by the @Hidden and @Disabled annotations (see <a href="08-Object-behavior#ObjectBehavior">ObjectBehavior</a>). If you want to use the <a href="05-The-Provider-Layer#TheProviderLayer_AuthorizationProvider">AuthorizationProvider</a> in your code you need to inject it into your object (see <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_container_constructioninjection.java">ConstructionInjection</a>) </p> 
 <p></p> 
 <p></p> 
 <h2 id="TheProviderLayer_ValidationProvider">Validation Provider</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_validation_validationprovider.java"></a> </p> 
 <p> The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> sometimes let’s the user edit an <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> before it is passed as an <a href="07-Action-Methods#ActionMethods">ActionMethod</a> parameter (depending on how the ActionMethod is annotated, see <a href="08-Object-behavior#ObjectBehavior_ExecutionMode">ExecutionMode</a> ). The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> then validates the edited <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a> using the <a href="05-The-Provider-Layer#TheProviderLayer_ValidationProvider">ValidationProvider</a> before the <a href="07-Action-Methods#ActionMethods">ActionMethod</a> is called.The <a href="05-The-Provider-Layer#TheProviderLayer_ValidationProvider">ValidationProvider</a> will use ValidationAnnotationsTODO_LINK and ValidationMethods_TODO_LINK that are located in the <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>s them selves so that they can be validated. </p> 
 <h3 id="TheProviderLayer_ValidationProvider_ValidationProviderImplementation">ValidationProvider implementation</h3> 
 <p> There are many validation libraries and frameworks available. The ReflectFramework complies with the JSR303 by using the <a href="http://bval.apache.org/">Apache Bean Validator (BVal)</a> library, combined with <a href="08-Object-behavior#ObjectBehavior_Validation_ValidationMethods">ValidationMethod</a>s. You are free to implement or extend your own implementation and register it to your <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> by overriding the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication.getValidationProviderClass()</a> method </p> 
 <p></p> 
 <p></p> 
 <h2 id="TheProviderLayer_LanguageProvider">Language Provider</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_language_languageprovider.java"></a> </p> 
 <p> The <a href="05-The-Provider-Layer#TheProviderLayer_LanguageProvider">LanguageProvider</a> makes multilingual support possible. The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> supports the English language by default because it uses the ClassNames, <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer3domain_domainobjectproperty.java">DomainObjectProperty</a>Names and <a href="07-Action-Methods#ActionMethods">ActionMethod</a>names that are used in the code as part of the <a href="http://martinfowler.com/bliki/UbiquitousLanguage.html">Ubiquitous Language</a> (it does not make sense to mix an other language into your code). </p> 
 <h3 id="TheProviderLayer_LanguageProvider_LanguagePropertyFiles">Language property files</h3> 
 <p> Texts for other languages are stored in property files. The name of these files need to be: &lt;application configuration folder&gt;/language_&lt;language_code&gt;.properties </p> Where: 
 <ul> 
  <li> &lt;application configuration folder&gt; These files need to be located at the configuration folder of the application. See PathProvider for more information</li> 
  <li>&lt;Language_code&gt; two letter language code (see java <a href="ReferenceName_Locale">Locale</a>)</li> 
 </ul> 
 <p> The language property files comply to the Java <a href="https://en.wikipedia.org/wiki/.properties">.properties</a> standard and thus contain key value pairs. </p> 
 <ul> 
  <li> The key is an reference to part of the code. Keys have the following format: &lt;packageName&gt;.&lt;classname&gt; or &lt;packageName&gt;.&lt;classname&gt;.&lt;propertyName&gt; or &lt;packageName&gt;.&lt;classname&gt;.&lt;actionMethodName&gt;, followed by .displayname or.description (see examples below)</li> 
  <li>The value is the translated text. Special characters are supported with Unicode (\u 
   <number>
     e.g. \u20AC=€). There are several free tools available to edit .properties file with good Unicode support. 
   </number></li> 
 </ul> 
 <p></p> 
 <p> Examples of key value lines in property files: </p> 
 <ul> 
  <li> com.acme.order.ShoppingCart.displayname=Winkel wagen</li> 
  <li>com.acme.product.ProductService.displayname=Producten</li> 
 </ul> 
 <h3 id="TheProviderLayer_LanguageProvider_GettingTheTranslatedText">Getting the translated text</h3> 
 <p> The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> will call the <a href="05-The-Provider-Layer#TheProviderLayer_LanguageProvider">LanguageProvider</a> to try and get the appropriate text from the language property files (depending on the selected language in the graphical user interface). If it can’t find this value it will display the default values (in English) </p> 
 <p> An other way to get a translated text is to inject the <a href="05-The-Provider-Layer#TheProviderLayer_LanguageProvider">LanguageProvider</a> into the object that needs it and use it in your code (see <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_container_constructioninjection.java">ConstructionInjection</a>) </p> 
 <ul> 
  <li>TODO CODE EXAMPLE OF VALIDATION TEXTS OR EXCEPTION TEXTS</li> 
  <li>TODO EXPLAIN HOW THE LANGUAGE IS SELECTED</li> 
  <li>TODO HOW TO SET DEFAULT TEXT OTHER THAN DEFAULT</li> 
  <li>TODO EXPLAIN HOW TO GENERATE OR UPDATE LANGUAGE PROPERTY FILES WITH A SPECIAL <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a></li> 
 </ul> 
 <p></p> 
 <p></p> 
 <h2 id="TheProviderLayer_NotificationProvider">Notification Provider</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_notification_notificationprovider.java"></a> </p> 
 <ul> 
  <li>TODO What it does</li> 
  <li>TODO How you can use it (or explain who uses it)</li> 
  <li>TODO Code example</li> 
  <li>TODO How to register a custom ... provider</li> 
 </ul> 
 <p></p> 
 <p></p> 
 <p></p> 
 <h2 id="TheProviderLayer_ReflectionProvider">Reflection Provider</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_reflectionprovider.java"></a> The <a href="05-The-Provider-Layer#TheProviderLayer_ReflectionProvider">ReflectionProvider</a> provides information on objects ( <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_test_java_nth_reflect_fw_junit_layer5provider_reflection_info_classinfo_applicationclassinfotest.java">ApplicationClassInfoTest</a>, <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_info_classinfo_serviceclassinfo.java">ServiceClassInfo</a>, <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_info_classinfo_domainclassinfo.java">DomainClassInfo</a>), properties ( <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_info_property_propertyinfo.java">PropertyInfo</a>) of <a href="07-Action-Methods#ActionMethods">ActionMethod</a> ( <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_info_actionmethod_actionmethodinfo.java">ActionMethodInfo</a>) using <a href="https://en.wikipedia.org/wiki/Reflection_(computer_programming)">reflection</a>. The <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer_UserInterfaceController">UserInterfaceController</a> uses this information to know how the user interface should look like and behave. You can use the <a href="05-The-Provider-Layer#TheProviderLayer_ReflectionProvider">ReflectionProvider</a> in your code when you need meta information (See <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_container_constructioninjection.java">ConstructionInjection</a>) TODO Code example </p> 
 <p></p> 
 <h2 id="TheProviderLayer_AboutProvider">About Provider</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_about_aboutprovider.java"></a> The <a href="05-The-Provider-Layer#TheProviderLayer_AboutProvider">AboutProvider</a> provides the following information on all objects used in an <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a>: </p> 
 <ul> 
  <li>The class name</li> 
  <li>The package name (jar,war,etc...)</li> 
  <li>The version of the jar file (from the meta info file)</li> 
  <li>The authors of the jar file (from the meta info file)</li> 
 </ul> This about information can be displayed on a graphical user interface. 
 <p></p> 
 <p></p> 
 <h2 id="TheProviderLayer_URLProviders">URL Providers</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_urlprovider.java"></a> </p> 
 <p> You can use custom URL's or <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_reflecturl.java">ReflectUrl</a>'s that are translated to normal URL's using <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders">UrlProvider</a>s. <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders">UrlProvider</a>s need to be registered with the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication.getUrlProviderClasses()</a> so that they can be registered with <a href="ReferenceName_URL">URL.setURLStreamHandlerFactory()</a> (See <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_reflecturlstreamhandlerfactory.java">ReflectUrlStreamHandlerFactory</a>). The following paragraphs show examples of <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders">UrlProvider</a>s </p> 
 <h3 id="TheProviderLayer_URLProviders_ApplicationUrlProvider">ApplicationUrlProvider</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_application_applicationurlprovider.java"></a> A <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders_ApplicationUrlProvider">ApplicationUrlProvider</a> handles a <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders_ApplicationUrlProvider">ApplicationUrl</a>. </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_application_applicationurl.java"></a> </p> 
 <p> A <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders_ApplicationUrlProvider">ApplicationUrl</a> is a <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_reflecturl.java">ReflectUrl</a> that helps to create a reference to the application folder e.g. to get a resource file </p> 
 <p> The format of a <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders_ApplicationUrlProvider">ApplicationUrl</a> is: reflect-application://&lt;relative path to resource&gt; </p> 
 <p> E.g.: reflect-application://images/sales.png (for a reference to the sales.png file in the application sub folder images) </p> 
 <p></p> 
 <p></p> 
 <p></p> 
 <h3 id="TheProviderLayer_URLProviders_ClassResourceUrlProvider">ClassResourceUrlProvider</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_classresource_classresourceurlprovider.java"></a> A <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders_ClassResourceUrlProvider">ClassResourceUrlProvider</a> handles a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_classresource_classresourceurl.java">ClassResourceUrl</a>. </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_classresource_classresourceurl.java"></a> </p> 
 <p> A <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_classresource_classresourceurl.java">ClassResourceUrl</a> is a <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_reflecturl.java">ReflectUrl</a> that helps to create a reference to a class resource (See <a href="ReferenceName_Class">Class.getResource(String)</a>) </p> 
 <p> The format of a <a href="ReferenceName_reflect-core old_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_classresource_classresourceurl.java">ClassResourceUrl</a> is: reflect-class-resource://&lt;class path&gt;/&lt;resource name&gt; </p> 
 <p> E.g.: reflect-class-resource://com.acme.SalesApp/sales.png; (for a sales.png file in the com.acme package, next to the SalesApp class) </p> 
 <p></p> 
 <p></p> 
 <p></p> 
 <h3 id="TheProviderLayer_URLProviders_FontIconUrlProvider">FontIconUrlProvider</h3> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_fonticon_fonticonurlprovider.java"></a> The <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders_FontIconUrlProvider">FontIconUrlProvider</a> resolves <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders_FontIconUrlProvider">FontIconUrl</a>s. </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_fonticon_fonticonurl.java"></a> </p> 
 <p> A <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders_FontIconUrlProvider">FontIconUrl</a> is a <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_url_reflecturl.java">ReflectUrl</a> that helps to create a reference to a <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_reflection_behavior_fonticon_fonticon.java">FontIcon</a>. </p> 
 <p> The format of a <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders_FontIconUrlProvider">FontIconUrl</a> is: reflect-font-icon://&lt;font name&gt;/&lt;font fontIconUrl&gt;#&lt;uni code&gt; </p> 
 <p> E.g.: reflect-font-icon://FontAwesome/META-INF/resources/webjars/font-awesome/4.5.0/ fonts/fontawesome-webfont.ttf#F0C9 for a menu/navigation icon </p> 
 <p> <a href="05-The-Provider-Layer#TheProviderLayer_URLProviders_FontIconUrlProvider">FontIconUrl</a>'s can be used in your code with e.g. FontAwesomeUrl.NAVIGATION </p> 
 <p></p> 
 <p></p> 
 <p></p> 
 <p></p> 
 <p></p> 
 <p></p> 
</div>