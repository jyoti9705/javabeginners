1.Steps to install Java on windows

	1. Go to https://www.oracle.com/java/technologies/downloads/
	2. Select required OS
	3. Select the JDK Version you want to download
	4. Download the .exe installer
	5. Once installer is downloaded double click on it and click on yes , when asked for permission
	6. Copy the path where jdk is installed For e.g. C:\Program Files\Java\jdk-16.0.2\
	7. Installation is now complete, now we need to set java path 
	8. Go to location where Java is installed (path which you copied in step 6) , go to bin folder and copy the path till bin
	9. Go to environment variables , click on path and click on edit
	10. Click on New and Paste the path copied on step 8 
	11. Keep Clicking on Move Up untill it comes on the top 
	12. Click on OK

2. Steps to Verify Java Installation

    1. Open cmd in your home directory
    2. Type java -version, you will see latest java version which you installed by following above steps
    3. To further verify type jshell -version , you will the version of jshell
    4. if all above steps Ran successfully and you are also seeing versions , Hurray !! Java Setup Completed