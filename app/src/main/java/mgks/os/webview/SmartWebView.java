package mgks.os.webview;

/*
 * Android Smart WebView is an Open Source Project available on GitHub (https://github.com/mgks/Android-SmartWebView).
 * Developed by Ghazi Khan (https://github.com/mgks) under MIT Open Source License.
 * This program is free to use for private and commercial purposes.
 * Please mention project source or developer credit in your Application's License(s) Wiki.
 * Giving right credit to developers encourages them to create better projects :)
*/

class SmartWebView {

    /* -- PERMISSION VARIABLES -- */

    // enable JavaScript for webview
    static boolean ASWP_JSCRIPT     = true;

    // upload file from webview
    static boolean ASWP_FUPLOAD     = true;

    // enable upload from camera for photos
    static boolean ASWP_CAMUPLOAD   = true;

    // incase you want only camera files to upload
    static boolean ASWP_ONLYCAM      = false;

    // upload multiple files in webview
    static boolean ASWP_MULFILE     = true;

    // track GPS locations
    static boolean ASWP_LOCATION    = true;

    // show ratings dialog; auto configured
    // edit method get_rating() for customizations
    static boolean ASWP_RATINGS     = true;

    // pull refresh current url
    static boolean ASWP_PULLFRESH    = false; // true;

    // show progress bar in app
    static boolean ASWP_PBAR        = true;

    // zoom control for webpages view
    static boolean ASWP_ZOOM        = false;

    // save form cache and auto-fill information
    static boolean ASWP_SFORM       = false;

    // whether the loading webpages are offline or online
    static boolean ASWP_OFFLINE     = false;

    // open external url with default browser instead of app webview
    static boolean ASWP_EXTURL      = false; // true;


    /* -- SECURITY VARIABLES -- */

    // verify whether HTTPS port needs certificate verification
    static boolean ASWP_CERT_VERIFICATION = true;


    /* -- CONFIG VARIABLES -- */

    //complete URL of your website or offline webpage
    static String ASWV_URL          = "https://uploadfiles.io/"; // file:///android_asset/offline.html";

    //to upload any file type using "*/*"; check file type references for more
    static String ASWV_F_TYPE       = "*/*";


    /* -- RATING SYSTEM VARIABLES -- */

    static int ASWR_DAYS            = 3;    // after how many days of usage would you like to show the dialoge
    static int ASWR_TIMES           = 10;  // overall request launch times being ignored
    static int ASWR_INTERVAL        = 2;   // reminding users to rate after days interval
}
