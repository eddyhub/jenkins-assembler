/*
 * This script is executed inside the UI thread, so be sure to  call 
 * long running code in another thread.
 *
 * You have the following options
 * - execOutside { // your code }
 * - execFuture { // your code }
 * - Thread.start { // your code }
 *
 * You have the following options to run code again inside the UI thread
 * - execAsync { // your code }
 * - execSync { // your code }
 */

import groovy.swing.SwingBuilder
import static griffon.util.GriffonApplicationUtils.*

SwingBuilder.lookAndFeel((isMacOSX ? 'system' : 'nimbus'), 'gtk', ['metal', [boldFonts: false]])


/*def splashScreen = SplashScreen.getInstance()*/

// Setting a splash image
//URL url = this.class.getResource("mySplash.jpg")
//splashScreen.setImage(url)
//
// Setting Status Text
// SplashScreen.getInstance().showStatus("Initializing the Controller")
SplashGriffonAddon.display(app)
/*splashScreen.splash()
splashScreen.waitForSplash()*/

