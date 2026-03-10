# ANDROID APPLICATION DEVELOPMENT (UNIT II – FINAL TERM)

## I. Overview
This part demonstrates competency in application development using Android Studio, XML, and Java. It covers the ability and knowledge to design, develop, and assess a complete Android application using both technical skills and conceptual understanding aligned with UNIT II learning outcomes.

## II. Intended Learning Outcomes
The students should demonstrate comprehensive ability to:
1. Design and implement an interface that adapts correctly to different screen sizes, densities, and orientations.
2. Create a consistent and usable interface by defining styles, applying themes, implementing scrollable content, and using fragments.
3. Implement user and system event handling using Java, including click events, Broadcast Receivers, and configuration change management.
4. Design and manage menus and the action bar, including dynamic updates at runtime and display data using intents and lists, including custom list items and click handling (pass, receive, return).
5. Implement SQLite and demonstrate through working CRUD operations and manipulate dynamic data using appropriate SQL queries.

## III. Content

### 1. Supporting Multiple Screens
- [x] **1.1. Dealing with android market fragmentation** (Screen resolutions & densities: mdpi, hdpi, xhdpi, etc., Android OS versions)
- [x] **1.2. Creating drawable resources for multiple screens** (PNG/JPG, Icons, Vector graphics, Shapes, Backgrounds)
- [ ] **1.3. Creating stretchable 9-path graphics** (9-Patch Image; file name .9.png)
- [x] **1.4. Creating a custom launcher icon** (app icon display on home screen)

### 2. Managing the User Interface
- [ ] **2.1. Defining and using styles** (shown in res – values - styles)
- [ ] **2.2. Applying application themes** (shown in res – values - themes)
- [ ] **2.3. Creating a scrollable text display** (shown inside Fragment layout)
- [ ] **2.4. Laying out a screen with fragments** (a placeholder for fragments to be visible, can be static fragment, dynamic, fragment-based UI for navigation)

### 3. Working with Events
- [ ] **3.1. Handling user events with Java code** (such as Text input event, setOnClickListener(), validation check)
- [ ] **3.2. Creating a Broadcast Receiver to handle system events** (Should create inside in the Java package folder and must be Register in Manifest- shown in app/src/main/AndroidManifest.xml / Handles system events)
- [ ] **3.3. Handling orientation and other configuration changes** (Orientation changes such as rotating the mobile from portrait to landscape - usually handled inside the Activity class; shown control configuration changes in the manifest file; shown separate layouts for different orientations thru alternative layouts)

### 4. Working with Menus and the Action Bar
- [ ] **4.1. Adding items to the options menu** (Shown in app/src/main/res/menu/)
- [ ] **4.2. Displaying menu items in the action bar** (Shown in the Java Activity file loads the menu into the Action Bar and for showing icons in the action bar see Inside the menu XML file, and check if it is added showAsAction.)
- [ ] **4.3. Managing the action bar and menus at runtime** (Menu behavior is controlled in the Activity Java file; Added show/hide menu items dynamically; shown in MainActivity.java and go to onCreateOptionsMenu() and MainActivity.java go to onOptionsItemSelected() during runtime)

### 5. Working with Data
- [ ] **5.1. Passing data to an activity with intent extras** (Shown in the java activity file folder- can send data using an Intent)
- [ ] **5.2. Receiving data in a new activity** (Shown the usage when one screen sends data to another screen)
- [ ] **5.3. Returning data to a calling activity** (Shown on how to send data back to the previous screen)
- [ ] **5.4. Displaying data in a list** (Shown multiple data items)
- [ ] **5.5. Handling list items click events** (Shown on how to detect which item the user clicked.)
- [ ] **5.6. Customizing the list item** (Shown on how to create custom design instead of default list layout)
- [ ] **5.7. Exploring other uses of data** (Shown on how data passed between activities can be used for)

### 6. Working with dynamic data using SQLite
- [ ] **6.1. Fetching data from database**
- [ ] **6.2. Understanding different SQL queries.**
- [ ] **6.3. Creating CRUD application using SQLite Database**
