//$$\   $$\                                                                 $$\                  $$$$$$\                                
//$$ |  $$ |                                                                $$ |                $$  __$$\                               
//$$ |  $$ | $$$$$$\  $$$$$$\$$$$\   $$$$$$\  $$$$$$\$$$$\   $$$$$$\   $$$$$$$ | $$$$$$\        $$ /  $$ | $$$$$$\   $$$$$$\   $$$$$$$\ 
//$$$$$$$$ |$$  __$$\ $$  _$$  _$$\ $$  __$$\ $$  _$$  _$$\  \____$$\ $$  __$$ |$$  __$$\       $$$$$$$$ |$$  __$$\ $$  __$$\ $$  _____|
//$$  __$$ |$$ /  $$ |$$ / $$ / $$ |$$$$$$$$ |$$ / $$ / $$ | $$$$$$$ |$$ /  $$ |$$$$$$$$ |      $$  __$$ |$$ /  $$ |$$ /  $$ |\$$$$$$\  
//$$ |  $$ |$$ |  $$ |$$ | $$ | $$ |$$   ____|$$ | $$ | $$ |$$  __$$ |$$ |  $$ |$$   ____|      $$ |  $$ |$$ |  $$ |$$ |  $$ | \____$$\ 
//$$ |  $$ |\$$$$$$  |$$ | $$ | $$ |\$$$$$$$\ $$ | $$ | $$ |\$$$$$$$ |\$$$$$$$ |\$$$$$$$\       $$ |  $$ |$$$$$$$  |$$$$$$$  |$$$$$$$  |
//\__|  \__| \______/ \__| \__| \__| \_______|\__| \__| \__| \_______| \_______| \_______|      \__|  \__|$$  ____/ $$  ____/ \_______/ 
//                                                                                                        $$ |      $$ |                
//                                                                                                        $$ |      $$ |                
//                                                                                                        \__|      \__|                                                                  
//  /\  /\___  _ __ ___   ___ _ __ / /  ___   __ _  __ _  ___ _ __ 
// / /_/ / _ \| '_ ` _ \ / _ \ '__/ /  / _ \ / _` |/ _` |/ _ \ '__|
/// __  / (_) | | | | | |  __/ | / /__| (_) | (_| | (_| |  __/ |   
//\/ /_/ \___/|_| |_| |_|\___|_| \____/\___/ \__, |\__, |\___|_|   
//                                           |___/ |___/           

//                                  ,-=::::=-,.                                                                                  
//                            .=:::=-,      .,=::::=.                                                                            
//              .=:::::::::/;;=.                   .=;;-                          /////
///								/
//      
//            .'/,-Y"     "~-.
//            l.Y             ^.
//            /\               _\_      "Doh!  ARGUABLY THE BEST LOGGER 
//           i            ___/"   "\     CLASS FOR ANDROID IN THE WHOLE GOD DAMN WORLD ,,,,,,,,!!!!!!!"
//           |          /"   "\   o !
//           l         ]     o !__./
//            \ _  _    \.___./    "~\
//             X \/ \            ___./
//            ( \ ___.   _..--~~"   ~`-.
//             ` Z,--   /               \
//               \__.  (   /       ______)
//                 \   l  /-----~~" /
//                  Y   \          /
//                  |    "x______.^
//                  |           \      -Row
//                  j            Y
//
// 
/*
 *       
 *This source is property of Homemade Apps.
 * Copyright (C) 2013 Homemade Apps
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package homemade.apps.homerlogger;

/*
 * 
 */

import android.content.Context;
import android.util.Log;

/**
 * 
 * 
 * @author Amn
 * 
 */
public class HomerLogger {

	private static boolean mKeepLogging = true;

	private static boolean mKeepLoggingE = true;
	private static boolean mKeepLoggingI = true;
	private static boolean mKeepLoggingV = true;
	private static boolean mKeepLoggingW = true;
	private static boolean mKeepLoggingD = true;

	private boolean mkeepLoggingAtObjectLevel = true;

	// ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// //////
	// //////features to be added later on ::
	// a )boolean to stop all logs from homer libs;
	//
	// b )ability to generate a log.txt file of all the logs that were Logged
	// through Hommer Logger
	// //////
	// //////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public HomerLogger() {

	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////////
	// //
	// // Getters and setters
	// //
	// //////////////////////////////////////////////////////////////////////////////////////////////////

	public static boolean keepLogging() {
		return mKeepLogging;
	}

	public static void setKeepLogging(boolean mKeepLogging) {
		HomerLogger.mKeepLogging = mKeepLogging;
	}

	public static boolean keepLoggingE() {
		return mKeepLoggingE;
	}

	public static void setKeepLoggingE(boolean mKeepLoggingE) {
		HomerLogger.mKeepLoggingE = mKeepLoggingE;
	}

	public static boolean keepLoggingI() {
		return mKeepLoggingI;
	}

	public static void setKeepLoggingI(boolean mKeepLoggingI) {
		HomerLogger.mKeepLoggingI = mKeepLoggingI;
	}

	public static boolean keepLoggingV() {
		return mKeepLoggingV;
	}

	public static void setKeepLoggingV(boolean mKeepLoggingV) {
		HomerLogger.mKeepLoggingV = mKeepLoggingV;
	}

	public static boolean keepLoggingW() {
		return mKeepLoggingW;
	}

	public static void setKeepLoggingW(boolean mKeepLoggingW) {
		HomerLogger.mKeepLoggingW = mKeepLoggingW;
	}

	public static boolean keepLoggingD() {
		return mKeepLoggingD;
	}

	public static void setKeepLoggingD(boolean mKeepLoggingD) {
		HomerLogger.mKeepLoggingD = mKeepLoggingD;
	}

	public boolean getkeepLoggingAtObjectLevel() {
		return mkeepLoggingAtObjectLevel;
	}

	public void setkeepLoggingAtObjectLevel(boolean mkeepLoggingAtObjectLevel) {
		this.mkeepLoggingAtObjectLevel = mkeepLoggingAtObjectLevel;
	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////////
	// //
	// // Logging functions............At global level ...!!!
	// //
	// //////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * ........................................................................
	 * ...............................
	 **/
	public static void e(String msg) {

		HomerLogger.e(null, msg, null);

	}

	public static void e(String debugtab, String msg) {

		HomerLogger.e(debugtab, msg, null);

	}

	public static void e(String debugtab, String msg, Exception e) {
		if (keepLogging()) {
			if (keepLoggingE()) {
				if (e == null) {
					if (debugtab != null) {
						Log.e(debugtab, msg);
					} else {
						Log.e(getTag(), msg);
					}
				} else {

					if (debugtab != null) {
						Log.e(debugtab, msg, e);
					} else {
						Log.e(getTag(), msg, e);
					}

				}
			}
		}
	}

	/**
	 * ........................................................................
	 * ...............................
	 **/
	public static void i(String msg) {

		HomerLogger.i(null, msg, null);

	}

	public static void i(String debugtab, String msg) {

		HomerLogger.i(debugtab, msg, null);

	}

	public static void i(String debugtab, String msg, Exception e) {
		if (keepLogging()) {
			if (keepLoggingI()) {
				if (e == null) {
					if (debugtab != null) {
						Log.i(debugtab, msg);
					} else {
						Log.i(getTag(), msg);
					}
				} else {
					if (debugtab != null) {
						Log.i(debugtab, msg, e);
					} else {
						Log.i(getTag(), msg, e);
					}
				}
			}
		}
	}

	/**
	 * ........................................................................
	 * ...............................
	 **/
	public static void v(String msg) {

		HomerLogger.v(null, msg, null);

	}

	public static void v(String debugtab, String msg) {

		HomerLogger.v(debugtab, msg, null);

	}

	public static void v(String debugtab, String msg, Exception e) {
		if (keepLogging()) {
			if (keepLoggingV()) {
				if (e == null) {
					if (debugtab != null) {
						Log.v(debugtab, msg);
					} else {
						Log.v(getTag(), msg);
					}
				} else {
					if (debugtab != null) {
						Log.v(debugtab, msg, e);
					} else {
						Log.v(getTag(), msg, e);
					}

				}
			}
		}
	}

	/**
	 * ........................................................................
	 * ...............................
	 **/
	public static void w(String msg) {

		HomerLogger.w(null, msg, null);

	}

	public static void w(String debugtab, String msg) {

		HomerLogger.w(debugtab, msg, null);

	}

	public static void w(String debugtab, String msg, Exception e) {
		if (keepLogging()) {
			if (keepLoggingW()) {
				if (e == null) {
					if (debugtab != null) {
						Log.w(debugtab, msg);
					} else {
						Log.w(getTag(), msg);
					}
				} else {
					if (debugtab != null) {
						Log.w(debugtab, msg, e);
					} else {
						Log.w(getTag(), msg, e);
					}

				}
			}
		}
	}

	/**
	 * ........................................................................
	 * ...............................
	 **/
	public static void d(String msg) {

		HomerLogger.d(null, msg, null);

	}

	public static void d(String debugtab, String msg) {

		HomerLogger.d(debugtab, msg, null);

	}

	public static void d(String debugtab, String msg, Exception e) {
		if (keepLogging()) {
			if (keepLoggingD()) {
				if (e == null) {
					if (debugtab != null) {
						Log.d(debugtab, msg);
					} else {
						Log.d(getTag(), msg);
					}
				} else {

					if (debugtab != null) {
						Log.d(debugtab, msg, e);

					} else {
						Log.d(getTag(), msg, e);

					}
				}
			}
		}
	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////////
	// //
	// // Logging functions............At Object level ...!!!
	// //
	// //////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * ........................................................................
	 * ...............................
	 **/
	public void eAtObjectLevel(String msg) {
		if (getkeepLoggingAtObjectLevel()) {

			HomerLogger.e(null, msg, null);

		}

	}

	public void eAtObjectLevel(String debugtab, String msg) {
		if (getkeepLoggingAtObjectLevel()) {

			HomerLogger.e(debugtab, msg, null);

		}

	}

	public void eAtObjectLevel(String debugtab, String msg, Exception e) {
		if (getkeepLoggingAtObjectLevel()) {
			HomerLogger.e(debugtab, msg, e);
		}

	}

	/**
	 * ........................................................................
	 * ...............................
	 **/
	public void iAtObjectLevel(String msg) {
		if (getkeepLoggingAtObjectLevel()) {

			HomerLogger.i(null, msg, null);

		}

	}

	public void iAtObjectLevel(String debugtab, String msg) {
		if (getkeepLoggingAtObjectLevel()) {

			HomerLogger.i(debugtab, msg, null);

		}

	}

	public void iAtObjectLevel(String debugtab, String msg, Exception e) {
		if (getkeepLoggingAtObjectLevel()) {
			HomerLogger.i(debugtab, msg, e);
		}

	}

	/**
	 * ........................................................................
	 * ...............................
	 **/
	public void vAtObjectLevel(String msg) {
		if (getkeepLoggingAtObjectLevel()) {

			HomerLogger.v(null, msg, null);

		}

	}

	public void vAtObjectLevel(String debugtab, String msg) {
		if (getkeepLoggingAtObjectLevel()) {

			HomerLogger.v(debugtab, msg, null);

		}

	}

	public void vAtObjectLevel(String debugtab, String msg, Exception e) {
		if (getkeepLoggingAtObjectLevel()) {
			HomerLogger.v(debugtab, msg, e);
		}

	}

	/**
	 * ........................................................................
	 * ...............................
	 **/
	public void wAtObjectLevel(String msg) {
		if (getkeepLoggingAtObjectLevel()) {

			HomerLogger.w(null, msg, null);

		}

	}

	public void wAtObjectLevel(String debugtab, String msg) {
		if (getkeepLoggingAtObjectLevel()) {

			HomerLogger.w(debugtab, msg, null);

		}

	}

	public void wAtObjectLevel(String debugtab, String msg, Exception e) {
		if (getkeepLoggingAtObjectLevel()) {
			HomerLogger.w(debugtab, msg, e);
		}

	}

	/**
	 * ........................................................................
	 * ...............................
	 **/
	public void dAtObjectLevel(String msg) {
		if (getkeepLoggingAtObjectLevel()) {

			HomerLogger.d(null, msg, null);

		}

	}

	public void dAtObjectLevel(String debugtab, String msg) {
		if (getkeepLoggingAtObjectLevel()) {

			HomerLogger.d(debugtab, msg, null);

		}

	}

	public void dAtObjectLevel(String debugtab, String msg, Exception e) {
		if (getkeepLoggingAtObjectLevel()) {
			HomerLogger.d(debugtab, msg, e);
		}

	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////////
	// //
	// //a function for logging that onli hommer libs uses ,,,!! so that we can
	// stop all logs from homer libs by just one boolean
	// //
	// //////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * ........................................................................
	 * ...............................
	 **/

	// ////////////////////////////////////////////////////////////////////////////////////////////////////
	// //
	// //Below is a function that automatically gets the tag for the logging
	// functions the string returned by this function would be something like
	// this
	// "ClassName.MethodName.LineNo"
	// //
	// //////////////////////////////////////////////////////////////////////////////////////////////////
	private static String getTag() {

		StackTraceElement caller = Thread.currentThread().getStackTrace()[5];
		String c = caller.getClassName();
		String className = c.substring(c.lastIndexOf(".") + 1, c.length());
		StringBuilder sb = new StringBuilder(5);
		sb.append(className);
		sb.append(".");
		sb.append(caller.getMethodName());
		sb.append("():");
		sb.append(caller.getLineNumber());
		return sb.toString();

	}

}
