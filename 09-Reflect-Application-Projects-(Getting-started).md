<div id="content">
 <h1 id="ReflectApplicationProjectsGettingStarted">Reflect Application Projects (Getting started)</h1> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_documentation_reflectapplicationprojects.java"></a> </p>
 <p> There are different implementations of the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> class, to support different type of applications (e.g. for the command line, web applications, etc...). This chapter will explain the different <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a>, and how to get started with them. If needed you can also write your own implementation of the <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> class. </p> 
 <h2 id="ReflectApplicationProjectsGettingStarted_SettingUpYourDevelopmentComputer">Setting up your development computer</h2> 
 <p> First step is installing the following software on your development computer (if you did not do so already): </p> 
 <ul> 
  <li><b>Operating system:</b> The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> was created and tested on <a href="https://en.wikipedia.org/wiki/Microsoft_Windows">Microsoft Windows</a>. It is therefore recommended to use <a href="https://en.wikipedia.org/wiki/Microsoft_Windows">Microsoft Windows</a> for your development computer. You might also be ale to use another operating system, because both <a href="https://en.wikipedia.org/wiki/Java_(programming_language)">Java</a> and <a href="https://en.wikipedia.org/wiki/Integrated_development_environment">Integrated Development Environments</a> will work on multiple operating systems. This however never was tested.</li> 
  <li><b>Java Development Kit:</b> You need to install the <a href="https://en.wikipedia.org/wiki/Java_Development_Kit">Java Development Kit</a> on your development computer in order to <a href="https://en.wikipedia.org/wiki/Compiler">compile</a> and run <a href="https://en.wikipedia.org/wiki/Java_(programming_language)">Java code</a>. At the time of this writing the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> uses Java Standard Edition Development Kit 8. You can download it free from the Oracle web site. Just <a href="https://www.google.com/search?q=Java+SE+Development+Kit+8+-+Downloads+-+Oracle">search the Internet for: &quot;Java SE Development Kit 8 - Downloads - Oracle&quot;</a> and install the correct version for your operating system.</li> 
  <li><b>Integrated Development Environment:</b> You need to install a <a href="https://en.wikipedia.org/wiki/Integrated_development_environment">Integrated Development Environment</a> on your development computer. The <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> was created with Eclipse and this is therefore Recommended for your development computer. Eclipse is free and can be down loaded from <a href="https://www.eclipse.org/downloads/">https://www.eclipse.org/downloads/</a> and then installed on your development computer. You might also be ale to use another <a href="https://en.wikipedia.org/wiki/Integrated_development_environment">Integrated Development Environment</a>. This however never was tested.</li> 
 </ul> 
 <!-- TODO add youtube film --> 
 <p></p> 
 <h2 id="ReflectApplicationProjectsGettingStarted_ReflectForTheWeb">Reflect for the Web</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-for-vaadin14_src_main_java_nth_reflect_ui_vaadin_reflectapplicationforvaadin14.java"></a> </p> 
 <p> <a href="09-Reflect-Application-Projects-(Getting-started)#ReflectApplicationProjectsGettingStarted_ReflectForTheWeb">ReflectApplicationForVaadin14</a> is an implementation of the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> that provides a <a href="http://en.wikipedia.org/wiki/Graphical_user_interface"> graphical user interface</a> for <a href="https://en.wikipedia.org/wiki/Web_application">web applications</a>, using the <a href="https://vaadin.com/">Vaadin Framework</a>. <a href="09-Reflect-Application-Projects-(Getting-started)#ReflectApplicationProjectsGettingStarted_ReflectForTheWeb">ReflectApplicationForVaadin14</a> tries to comply with the <a href="https://material.io/guidelines/">Google Material Design</a> as much as possible. The application can be used on a <a href="https://en.wikipedia.org/wiki/Desktop_computer">desktop</a>, <a href="https://en.wikipedia.org/wiki/Laptop">lap-top</a>, <a href="https://en.wikipedia.org/wiki/Tablet_computer">tablet</a> or <a href="https://en.wikipedia.org/wiki/Mobile_device">mobile device</a>. It has an <a href="https://en.wikipedia.org/wiki/Responsive_web_design">responsive web design</a>: it optimizes the user interface depending on the size of the <a href="ReferenceName_miscellaneous_meyncontainersimulator_src_main_java_nth_meyn_containersimulator_mainwindow.java">MainWindow</a>. </p> 
 <p> This class will be created and used by the <a href="http://vaadin.com">Vaadin</a> framework when a new <a href="ReferenceName_VaadinSession">VaadinSession</a> for this application is created (after receiving a new <a href="ReferenceName_HttpServletRequest">HttpServletRequest</a> from a user that does not have a active <a href="ReferenceName_VaadinSession">VaadinSession</a>). It will: 
  <ui> 
  </ui></p> 
 <li>initialize the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> with implemented methods from this class</li> 
 <li>create the <a href="ReferenceName_miscellaneous_meyncontainersimulator_src_main_java_nth_meyn_containersimulator_mainwindow.java">MainWindow</a></li> 
 <p></p> 
 <h3 id="ReflectApplicationProjectsGettingStarted_ReflectForTheWeb_HowToDownloadAReflectForJavaFXDemoProject">How to download a ReflectForJavaFX demo project</h3> 
 <p> TODO </p> 
 <h3 id="ReflectApplicationProjectsGettingStarted_ReflectForTheWeb_HowToCreateANewReflectForJavaFXProject">How to create a new ReflectForJavaFX project</h3> 
 <p> TODO </p> 
 <h3 id="ReflectApplicationProjectsGettingStarted_ReflectForTheWeb_HowToStartTheApplicationInTheIDE">How to start the application in the IDE</h3> 
 <p> You start the application with Mvn jetty:run<br /> E.g. in the Eclipse IDE create a debug configuration: </p> 
 <ul> 
  <li>Ensure that you got a Java JDK installed and Eclipse knows where to find it</li> 
  <ul> 
   <li>Ensure you have downloaded and installed a Java JDK on your computer (for windows see: c:\program files\java)</li> 
   <li>On the Eclipse main menu click Window, Preferences, Java, Installed JRE's</li> 
   <li>Add the JDK to the list if it is missing: Add, Standard VM, and select the folder where the JDK is installed</li> 
   <li>Ensure the JDK is now in the list and selected as default</li> 
  </ul> 
  <li>Select Debug as</li> 
  <li>Select Maven Build...</li> 
  <li>Give the debug configuration a logical name: e.g. 
   <application-name>
     -run-jetty 
   </application-name></li> 
  <li>On Source tab:</li> 
  <ul> 
   <li>Click add button</li> 
   <li>Select Java Project and click OK button</li> 
   <li>Select Your and click OK button</li> 
  </ul> 
  <li>On Main tab:</li> 
  <ul> 
   <li>Base Directory: Click on Workspace button, select your project and click OK button</li> 
   <li>Enter Goal: jetty:run</li> 
  </ul> 
  <li>Click on debug button</li> 
  <li>Check if there are no build errors in the console window: almost at the end it should read: [INFO] Started Jetty Server</li> 
  <li>Open the application in a browser, and open address: localhost:8080</li> 
 </ul> 
 <p></p> 
 <p></p> 
 <p></p> 
 <h2 id="ReflectApplicationProjectsGettingStarted_ReflectForJavaFx">Reflect for JavaFx</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-core old_reflect_reflect-for-javafx_src_main_java_nth_reflect_fw_javafx_reflectapplicationforjavafx.java"></a> </p> 
 <p> <a href="09-Reflect-Application-Projects-(Getting-started)#ReflectApplicationProjectsGettingStarted_ReflectForJavaFx">ReflectApplicationForJavaFX</a> is an implementation of the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> that provides a <a href="http://en.wikipedia.org/wiki/Graphical_user_interface"> graphical user interface</a> for a computer with an <a href="https://en.wikipedia.org/wiki/Desktop_environment">desktop environment</a>. It might also be used for mobile devices in the future as well, but porting JavaFX for Android is still somewhat of a problem at the time of this writing. <a href="09-Reflect-Application-Projects-(Getting-started)#ReflectApplicationProjectsGettingStarted_ReflectForJavaFx">ReflectApplicationForJavaFX</a> tries to comply with the <a href="https://material.io/guidelines/">Google Material Design</a> as much as possible. The application can be used on a <a href="https://en.wikipedia.org/wiki/Desktop_computer">desktop</a>, <a href="https://en.wikipedia.org/wiki/Laptop">lap-top</a>, <a href="https://en.wikipedia.org/wiki/Tablet_computer">tablet</a> or <a href="https://en.wikipedia.org/wiki/Mobile_device">mobile device</a>. It has an <a href="https://en.wikipedia.org/wiki/Responsive_web_design">responsive web design</a>: It optimizes the user interface depending on the size of the <a href="ReferenceName_miscellaneous_meyncontainersimulator_src_main_java_nth_meyn_containersimulator_mainwindow.java">MainWindow</a>. </p> 
 <h3 id="ReflectApplicationProjectsGettingStarted_ReflectForTheWeb_HowToDownloadAReflectForJavaFXDemoProject">How to download a ReflectForJavaFX demo project</h3> 
 <p> TODO </p> 
 <h3 id="ReflectApplicationProjectsGettingStarted_ReflectForTheWeb_HowToCreateANewReflectForJavaFXProject">How to create a new ReflectForJavaFX project</h3> 
 <p> TODO </p> 
 <p></p> 
 <p></p> 
 <h2 id="ReflectApplicationProjectsGettingStarted_ReflectForCommandLine">Reflect for CommandLine</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-for-commandline_src_main_java_nth_reflect_fw_ui_commandline_reflectapplicationforcommandline.java"></a> </p> 
 <p> The <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> is an implementation of the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> for <a href="https://en.wikipedia.org/wiki/Command-line_interface">command line interfaces</a>.<br /> <br /> If you execute the application with parameters it will: </p> 
 <ul> 
  <li>parse the given command line</li> 
  <li>call one of the <a href="07-Action-Methods#ActionMethods_ActionMethodsForServiceObjects">ServiceObjectActionMethod</a>'s with an optional parameter</li> 
  <li>Return the result of the method or return a message if a method was successfully executed or not</li> 
  <li>The <a href="09-Reflect-Application-Projects-(Getting-started)#ReflectApplicationProjectsGettingStarted_ReflectForCommandLine">ReflectApplicationForCommandLine</a> is than terminated (state is lost unless the application stores state somehow)</li> 
 </ul> If you execute the application without parameters it will: 
 <ul> 
  <li>Return a list of possible commands and arguments</li> 
  <li>The <a href="09-Reflect-Application-Projects-(Getting-started)#ReflectApplicationProjectsGettingStarted_ReflectForCommandLine">ReflectApplicationForCommandLine</a> is than terminated</li> 
 </ul> 
 <p></p> 
 <h3 id="ReflectApplicationProjectsGettingStarted_ReflectForCommandLine_HowToDownloadAReflectForCommandLineDemoProject">How to download a ReflectForCommandLine demo project</h3> 
 <p> TODO </p> 
 <h3 id="ReflectApplicationProjectsGettingStarted_ReflectForCommandLine_HowToCreateANewReflectCommandLineProject">How to create a new ReflectCommandLine project</h3> 
 <p> TODO </p> 
 <p></p> 
 <p></p> 
 <h2 id="ReflectApplicationProjectsGettingStarted_ReflectForJUnit">Reflect for JUnit</h2> 
 <p> </p> 
 <p> <a id="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_junit_reflectapplicationforjunit.java"></a> The <a href="09-Reflect-Application-Projects-(Getting-started)#ReflectApplicationProjectsGettingStarted_ReflectForJUnit">ReflectApplicationForJUnit</a> is created to be used for <a href="http://en.wikipedia.org/wiki/JUnit">JUnit tests</a>. Its big advantage over using one of the other <a href="01-The-Reflect-Framework#TheReflectFramework_TheReflectApplication">ReflectApplication</a> implementations in a JUnit test is that the <a href="09-Reflect-Application-Projects-(Getting-started)#ReflectApplicationProjectsGettingStarted_ReflectForJUnit">ReflectApplicationForJUnit</a>: </p> 
 <ul> 
  <li>Does not have a <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer">UserInterfaceLayer</a>, because it is not needed for testing. None of the <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer2service_serviceobject.java">ServiceObject</a>s, <a href="02-The-Domain-Layer#TheDomainLayer_DomainObjects">DomainObject</a>'s <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer4infrastructure_infrastructureobject.java">InfrastructureObject</a>, <a href="ReferenceName_reflect-framework_reflect_reflect-core_src_main_java_nth_reflect_fw_layer5provider_provider.java">Provider</a> Objects that you create or maintain do know the UserTestObject Interface (see <a href="01-The-Reflect-Framework#TheReflectFramework_ArchitectureOfAnReflectApplication">ReflectArchitecture</a>). We do not need to test the <a href="01-The-Reflect-Framework#TheReflectFramework">ReflectFramework</a> <a href="06-The-UserInterface-Layer#TheUserInterfaceLayer">UserInterfaceLayer</a> if we assume it works as it should.</li> 
  <li>You only need to register the classes that need testing. You register classes by overriding the get...Class or get...Classes methods in the <a href="09-Reflect-Application-Projects-(Getting-started)#ReflectApplicationProjectsGettingStarted_ReflectForJUnit">ReflectApplicationForJUnit</a> class</li> 
 </ul> 
 <p> If you are new to JUnit test I recommend to watch one of the many instruction video's on the Internet. Your IDE most likely supports you with implementing and running JUnit tests (and if not you can probably download a plug-in for it) </p> 
 <h3 id="ReflectApplicationProjectsGettingStarted_ReflectForJUnit_HowToDownloadAReflectForJUnitDemoProject">How to download a ReflectForJUnit demo project</h3> 
 <p> TODO </p> 
 <h3 id="ReflectApplicationProjectsGettingStarted_ReflectForJUnit_HowToCreateANewReflectForJUnitProject">How to create a new ReflectForJUnit project</h3> 
 <p> TODO </p> 
 <h3 id="ReflectApplicationProjectsGettingStarted_ReflectForJUnit_ExampleOfATestingAServiceObjectAndInfrastructureMockUpObjectInAJUnitTestCase">Example of a testing a ServiceObject and InfrastructureMockUpObject in a JUnit test case</h3> 
 <pre>
 public class ProductServiceTest {
 
 	private ProductService productService;
 
 	@Before
 	public void setUp() throws Exception {
 		DependencyInjectionContainer container = new ReflectApplicationForJUnit()
 				.addServiceClass(ProductService.class).addInfrastructureClass(ProductRepositoryMockup.class)
 				.createContainer();
 		productService = container.get(ProductService.class);
 	}
 
 	@Test
 	public void bestSellingProductsTest() {
 		List&lt;Product&gt; products = productService.bestSellingProducts();
 		// assert method calls ...
 	}
 
 	// other test methods ...
 }
 
 </pre> 
 <p></p> 
 <p></p> 
 <h2 id="ReflectApplicationProjectsGettingStarted_PossibleFutureProjects">Possible future projects</h2> 
 <p> This is a list of possible future projects (still to be developed) </p> 
 <h3 id="ReflectApplicationProjectsGettingStarted_PossibleFutureProjects_ReflectForAndroid">Reflect for Android</h3> 
 <p> An application with a <a href="http://en.wikipedia.org/wiki/Graphical_user_interface"> graphical user interface</a> for <a href="https://en.wikipedia.org/wiki/Mobile_device">mobile devices</a> such as <a href="https://en.wikipedia.org/wiki/Smartphone">smart phones</a> and <a href="https://en.wikipedia.org/wiki/Tablet_computer">tablets</a>. </p> 
 <h3 id="ReflectApplicationProjectsGettingStarted_PossibleFutureProjects_ReflectForVaadin">Reflect for Vaadin</h3> 
 <p> A <a href="https://en.wikipedia.org/wiki/Web_application">web application</a> with a <a href="http://en.wikipedia.org/wiki/Graphical_user_interface">graphical user interface</a> for <a href="https://en.wikipedia.org/wiki/Web_browser">web browsers</a> </p> 
 <h3 id="ReflectApplicationProjectsGettingStarted_PossibleFutureProjects_ReflectForSOAP">Reflect for SOAP</h3> 
 <p> A <a href="https://en.wikipedia.org/wiki/Web_service">web service</a> that allows other computer applications to interact via the <a href="http://en.wikipedia.org/wiki/SOAP">Simple Object Access Protocol (SOAP)</a> </p> 
 <h3 id="ReflectApplicationProjectsGettingStarted_PossibleFutureProjects_ReflectForRESTfullXML">Reflect for RESTfull XML</h3> 
 <p> A <a href="https://en.wikipedia.org/wiki/Web_service">web service</a> that allows other computer applications to interact using <a href="http://en.wikipedia.org/wiki/Representational_state_transfer"> Representational State Transfer (RESTfull)</a> with <a href="https://en.wikipedia.org/wiki/XML">XML</a> </p> 
 <h3 id="ReflectApplicationProjectsGettingStarted_PossibleFutureProjects_ReflectForRESTfullJSON">Reflect for RESTfull JSON</h3> 
 <p> A <a href="https://en.wikipedia.org/wiki/Web_service">web service</a> that allows other computer applications to interact using <a href="http://en.wikipedia.org/wiki/Representational_state_transfer"> Representational State Transfer (RESTfull)</a> with <a href="https://en.wikipedia.org/wiki/JSON">JSON</a> </p> 
 <p></p> 
</div>