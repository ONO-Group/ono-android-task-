# ONO Cookbook Android Version

Welcome, stranger! Wanna join us at [Slack][1]? Or you just don't know what to do on a lazy sunday afternoon ?

We have a tasty Task for you! Create an Android version of our delicious Ackee recipes. We have everything you need to get you started
- API (and a running server)
- Designs
- Simple Android skeleton with all icons and assets (including Roboto font)

it should take you only a few hours to complete this Task.

## API & Server
Documentation for the api can be found on [apiary][2] and the
live server runs at this address [https://cookbook.ack.ee][3]

## Designs
Application should contain these 3 screens. You can also download a Sketch app file over [here][4]

<img src="https://raw.githubusercontent.com/AckeeCZ/cookbook-android-task/master/screens/01_list.png" width="200">&nbsp;&nbsp;&nbsp;
<img src="https://raw.githubusercontent.com/AckeeCZ/cookbook-android-task/master/screens/03_add.png" width="200">&nbsp;
<img src="https://raw.githubusercontent.com/AckeeCZ/cookbook-android-task/master/screens/02_detail.png" width="200">&nbsp;&nbsp;&nbsp;


- List of recipes
- Form to add a new recipe (via the plus button)
- Detail of a recipe with rating (on a list item click)

### Tasks for you

- Write the app :)
- Use as much standards as we do in our [Android Cookbook][5]
- Use of a reactive programming and Clean Architecture(MVP, MVVM,...) is a big advantage
- Application should be able to run on every device and every orientation 
- There are only a few recipes on the server, however you should take into consideration that the application should be able to deal with any number of recipes (some sort of paging should be implemented)!
- Application should cache its data so we can cook our delicous recipes even when offline. 
- Use 3rd party libraries, technologies and frameworks as you wish. But have a good reason to use any of them, though.
- Life is Great and Everything Will Be Ok, Kotlin is Here! Since Kotlin is now an officially supported Android app development languange and we love it as much as our delicious recipes, we want you to write this app in Kotlin.
- If you want to add anything extra, just go for it!
- Send it to us as link to dropbox / GDrive / etc..

[1]:https://join.slack.com/t/0n0/shared_invite/enQtMjcxMDU3NzQ5OTg3LTlmNDM4NzE1NWY2YWM5NjRlNmIxMDM1MDQ4NGIwMWQ5NmZkNDY2N2IyZDNhNmJjZjVhMmJkYTIwYzU2OGFiYjE
[2]:	http://docs.cookbook3.apiary.io/#introduction/recipes
[3]:	https://cookbook.ack.ee
[4]:	https://raw.githubusercontent.com/AckeeCZ/cookbook-android-task/master/screens/ackee_cookbook.sketch
[5]:	https://github.com/AckeeCZ/android-cookbook
