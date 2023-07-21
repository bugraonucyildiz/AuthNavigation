# AuthNavigation
Jetpack Compose Auth Multi Navigation

# Jetpack Compose Navigation Example
This is an example of a Jetpack Compose navigation setup with multiple screens and nested navigation.

Overview
The app consists of two main navigation graphs: AuthNavigation and AuthenticatedNavigation.

AuthNavigation
The AuthNavigation graph handles the authentication flow, including the SplashScreen, SignUpScreen, and LoginScreen.

SplashScreen: The initial screen of the app, shown when the app starts. It displays a simple welcome message and a button to navigate to the SignUpScreen.

SignUpScreen: The screen where users can sign up for the app. It displays a form to fill in the user's information and a button to navigate to the LoginScreen.

LoginScreen: The screen where users can log in to the app. It displays a login form, and when successfully logged in, it navigates to the AuthenticatedNavigation graph.

AuthenticatedNavigation
The AuthenticatedNavigation graph represents the main navigation flow after the user is logged in. It includes HomeScreen, CallScreen, UserScreen, and SettingsScreen.

HomeScreen: The main home screen of the app. It displays a welcome message and a button to navigate to the CallScreen.

CallScreen: A screen where users can make calls. It displays a call interface and a button to navigate to the UserScreen.

UserScreen: The user profile screen. It shows the user's information and a button to navigate to the SettingsScreen.

SettingsScreen: The settings screen. It allows users to manage app settings and log out. When the "Go Authenticated Screens" button is clicked, it navigates back to the AuthNavigation graph, closing all the authenticated screens.

Usage
To use this navigation setup in your app, follow the steps below:

Create a new Composable function for each screen, such as SplashScreen, SignUpScreen, LoginScreen, HomeScreen, CallScreen, UserScreen, and SettingsScreen.

Implement the screen content and any navigation logic within each Composable function.

Create the AuthNavigation graph using the NavHost and NavHostController. Define the start destination as "splash" and set up the composable functions for each screen.

Implement the AuthenticatedNavigation graph in the same way as AuthNavigation, but set the start destination to "home" and define the composable functions for each screen.

Finally, create the MainNavigation function to handle the overall navigation. In this function, use rememberNavController to create the rootNavController. Then, set up the NavHost for both AuthNavigation and AuthenticatedNavigation, with start destinations "auth" and "authenticated", respectively.

With this navigation setup, your app should be able to handle the authentication flow and smoothly navigate between different screens based on user interactions.

I hope this documentation helps you to understand the navigation setup better. If you need any further clarification or have any other questions, feel free to ask!
