
## Setting up Selenium environment


## Setting up Selenium Grid

---
video used to guide setup: https://youtu.be/kevXwbatJvU?si=QZSaWk3dPNKl9n31
---
Make sure to download the selenium grid driver

Open the terminal on your computer and type in the following:
java -jar "location of the selenium-server-standalone-2.45.0.jar file" hub
You will need to replace 'location' with the selenium grid driver location you downloaded earlier.
Now open another terminal window, navigate to the same directory as the first one and type in:
http://localhost:4444/grid/console (you can copy this link)
This should open a webpage where you can select the grid driver you want to use for testing.