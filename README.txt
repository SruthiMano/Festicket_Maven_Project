README

Instructions
Please run festticket_Login_Logout.feature file as cucumber Feature
Login and Log out scenarios has been automated
Cucumber-BDD framework has been used
For ease of reference/run my user name and password is provided in the example section(if required multiple inputs can be keyed in there).

Analysis
● Issues and/or challenges you’ve come across and how did you overcome them?
 Login button is getting refreshed after user name and password is entered, so the test should wait until the refresh and complete loading of button is done that was bit challenging
For time being that has been handled with wait/sleep( but I know wait until element is displayed is the correct option, time constraint is the problem here)

● If you had more time what would you do differently?
1. I would use google guice to inject the task class into stepdefinitions which will simply our work
2. I would have written seprate step definition for log in and out and also sperate task classes which will make reusability better
3. Would have used Magentys Cinnamon framework and would have used ajaxFinished utility which will make the waitUntil page is loaded activity very simple
4. CSS Selector web elements could have been placed in a seprate loctor file and used sysytematically

● What other test cases would you automate and why?
I would love to automate everything but due to time constraint am submiting login and logout only

● What dependencies or 3rd party frameworks/libs/modules used and why?
As mentioned earlier Cucumber-BDD framework has been used I would love to use google-Inject dependancy, Cinnamon webdriver and element conditions(though I have added but not used), the reasons I have have already mentioned above.
