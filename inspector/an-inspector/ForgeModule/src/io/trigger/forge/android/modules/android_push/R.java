/* This file was generated as part of a ForgeModule.
 *
 * You may move this file to another package if you require, however do not modify its contents.
 * To add more resources: rebuild the inspector project.
 */

package io.trigger.forge.android.modules.android_push;

import java.lang.reflect.Field;
import android.util.Log;

public class R {
    public static class attr {
        /** 
    The size of the ad. It must be one of BANNER, FULL_BANNER, LEADERBOARD,
    MEDIUM_RECTANGLE, SMART_BANNER, WIDE_SKYSCRAPER, or
    &lt;width&gt;x&lt;height&gt;.
    
         <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int adSize=0x7f010000;
        /** 
    A comma-separated list of the supported ad sizes. The sizes must be one of
    BANNER, FULL_BANNER, LEADERBOARD, MEDIUM_RECTANGLE, SMART_BANNER,
    WIDE_SKYSCRAPER, or &lt;width&gt;x&lt;height&gt;.
    
         <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int adSizes=0x7f010001;
        /**  The ad unit ID. 
         <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int adUnitId=0x7f010002;
        /**  Theme to be used for the Wallet selector 
         <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>holo_dark</code></td><td>0</td><td></td></tr>
<tr><td><code>holo_light</code></td><td>1</td><td></td></tr>
</table>
         */
        public static int appTheme=0x7f010011;
        /**  Appearance of the buy button. Must be one of "classic", "grayscale" and "monochrome" 
         <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>classic</code></td><td>1</td><td></td></tr>
<tr><td><code>grayscale</code></td><td>2</td><td></td></tr>
<tr><td><code>monochrome</code></td><td>3</td><td></td></tr>
</table>
         */
        public static int buyButtonAppearance=0x7f010018;
        /**  Height of the buy button. This includes an 8dp padding (4dp on each side) used for
             pressed and focused states of the button. The value can be a specific height, e.g.
             "48dp", or special values "match_parent" and "wrap_content". 
         <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
<p>May be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>match_parent</code></td><td>-1</td><td></td></tr>
<tr><td><code>wrap_content</code></td><td>-2</td><td></td></tr>
</table>
         */
        public static int buyButtonHeight=0x7f010015;
        /**  Text on the buy button. Must be one of "buy_with_google", "buy_now" and "book_now" 
         <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>buy_with_google</code></td><td>1</td><td></td></tr>
<tr><td><code>buy_now</code></td><td>2</td><td></td></tr>
<tr><td><code>book_now</code></td><td>3</td><td></td></tr>
</table>
         */
        public static int buyButtonText=0x7f010017;
        /**  Width of the buy button. This includes an 8dp padding (4dp on each side) used for
             pressed and focused states of the button. The value can be a specific width, e.g.
             "300dp", or special values "match_parent" and "wrap_content". 
         <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
<p>May be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>match_parent</code></td><td>-1</td><td></td></tr>
<tr><td><code>wrap_content</code></td><td>-2</td><td></td></tr>
</table>
         */
        public static int buyButtonWidth=0x7f010016;
        /** <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int cameraBearing=0x7f010004;
        /** <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int cameraTargetLat=0x7f010005;
        /** <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int cameraTargetLng=0x7f010006;
        /** <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int cameraTilt=0x7f010007;
        /** <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int cameraZoom=0x7f010008;
        /**  Google Wallet environment to use 
         <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>production</code></td><td>1</td><td></td></tr>
<tr><td><code>sandbox</code></td><td>0</td><td></td></tr>
<tr><td><code>strict_sandbox</code></td><td>2</td><td></td></tr>
</table>
         */
        public static int environment=0x7f010012;
        /**  Fragment mode 
         <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>buyButton</code></td><td>1</td><td></td></tr>
<tr><td><code>selectionDetails</code></td><td>2</td><td></td></tr>
</table>
         */
        public static int fragmentMode=0x7f010014;
        /**  A style resource specifing attributes to customize the look and feel of WalletFragment 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int fragmentStyle=0x7f010013;
        /** <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>none</code></td><td>0</td><td></td></tr>
<tr><td><code>normal</code></td><td>1</td><td></td></tr>
<tr><td><code>satellite</code></td><td>2</td><td></td></tr>
<tr><td><code>terrain</code></td><td>3</td><td></td></tr>
<tr><td><code>hybrid</code></td><td>4</td><td></td></tr>
</table>
         */
        public static int mapType=0x7f010003;
        /**  Masked wallet details background 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static int maskedWalletDetailsBackground=0x7f01001b;
        /**  "Change" button background in masked wallet details view 
         <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
         */
        public static int maskedWalletDetailsButtonBackground=0x7f01001d;
        /**  TextAppearance for the "Change" button in masked wallet details view 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int maskedWalletDetailsButtonTextAppearance=0x7f01001c;
        /**  TextAppearance for headers describing masked wallet details 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int maskedWalletDetailsHeaderTextAppearance=0x7f01001a;
        /**  Type of the wallet logo image in masked wallet details view 
         <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>classic</code></td><td>1</td><td></td></tr>
<tr><td><code>monochrome</code></td><td>2</td><td></td></tr>
</table>
         */
        public static int maskedWalletDetailsLogoImageType=0x7f01001f;
        /**  Color of the Google Wallet logo text in masked wallet details view 
         <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int maskedWalletDetailsLogoTextColor=0x7f01001e;
        /**  TextAppearance for masked wallet details 
         <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static int maskedWalletDetailsTextAppearance=0x7f010019;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int uiCompass=0x7f010009;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int uiRotateGestures=0x7f01000a;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int uiScrollGestures=0x7f01000b;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int uiTiltGestures=0x7f01000c;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int uiZoomControls=0x7f01000d;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int uiZoomGestures=0x7f01000e;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int useViewLifecycle=0x7f01000f;
        /** <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static int zOrderOnTop=0x7f010010;
        static {
            try {
                Class<?> realRClass = Class.forName("io.trigger.forge.android.inspector.R$attr");
	            for (Field f : attr.class.getDeclaredFields()) {
	                try {
	                    f.set(null, realRClass.getDeclaredField(f.getName()).get(null));
	                } catch (IllegalArgumentException e) {
	                	Log.e("Forge", e.toString());
	                } catch (IllegalAccessException e) {
	                	Log.e("Forge", e.toString());
	                } catch (NoSuchFieldException e) {
	                	Log.e("Forge", e.toString());
	                }
	            }
            } catch (ClassNotFoundException e) {
            	Log.e("Forge", e.toString());
            }
        }
    }
    public static class color {
        public static int common_action_bar_splitter=0x7f050009;
        /**  Sign-in Button Colors 
         */
        public static int common_signin_btn_dark_text_default=0x7f050000;
        public static int common_signin_btn_dark_text_disabled=0x7f050002;
        public static int common_signin_btn_dark_text_focused=0x7f050003;
        public static int common_signin_btn_dark_text_pressed=0x7f050001;
        public static int common_signin_btn_default_background=0x7f050008;
        public static int common_signin_btn_light_text_default=0x7f050004;
        public static int common_signin_btn_light_text_disabled=0x7f050006;
        public static int common_signin_btn_light_text_focused=0x7f050007;
        public static int common_signin_btn_light_text_pressed=0x7f050005;
        public static int common_signin_btn_text_dark=0x7f050017;
        public static int common_signin_btn_text_light=0x7f050018;
        public static int wallet_bright_foreground_disabled_holo_light=0x7f05000f;
        /** 
         Wallet colors to support consistent Wallet fragment holo dark UI in client application
         regardless of the theme and device type
    
         */
        public static int wallet_bright_foreground_holo_dark=0x7f05000a;
        public static int wallet_bright_foreground_holo_light=0x7f050010;
        public static int wallet_dim_foreground_disabled_holo_dark=0x7f05000c;
        public static int wallet_dim_foreground_holo_dark=0x7f05000b;
        public static int wallet_dim_foreground_inverse_disabled_holo_dark=0x7f05000e;
        public static int wallet_dim_foreground_inverse_holo_dark=0x7f05000d;
        public static int wallet_highlighted_text_holo_dark=0x7f050014;
        public static int wallet_highlighted_text_holo_light=0x7f050013;
        public static int wallet_hint_foreground_holo_dark=0x7f050012;
        public static int wallet_hint_foreground_holo_light=0x7f050011;
        public static int wallet_holo_blue_light=0x7f050015;
        public static int wallet_link_text_light=0x7f050016;
        public static int wallet_primary_text_holo_light=0x7f050019;
        public static int wallet_secondary_text_holo_dark=0x7f05001a;
        static {
            try {
                Class<?> realRClass = Class.forName("io.trigger.forge.android.inspector.R$color");
	            for (Field f : color.class.getDeclaredFields()) {
	                try {
	                    f.set(null, realRClass.getDeclaredField(f.getName()).get(null));
	                } catch (IllegalArgumentException e) {
	                	Log.e("Forge", e.toString());
	                } catch (IllegalAccessException e) {
	                	Log.e("Forge", e.toString());
	                } catch (NoSuchFieldException e) {
	                	Log.e("Forge", e.toString());
	                }
	            }
            } catch (ClassNotFoundException e) {
            	Log.e("Forge", e.toString());
            }
        }
    }
    public static class drawable {
        public static int common_full_open_on_phone=0x7f020000;
        public static int common_ic_googleplayservices=0x7f020001;
        public static int common_signin_btn_icon_dark=0x7f020002;
        public static int common_signin_btn_icon_disabled_dark=0x7f020003;
        public static int common_signin_btn_icon_disabled_focus_dark=0x7f020004;
        public static int common_signin_btn_icon_disabled_focus_light=0x7f020005;
        public static int common_signin_btn_icon_disabled_light=0x7f020006;
        public static int common_signin_btn_icon_focus_dark=0x7f020007;
        public static int common_signin_btn_icon_focus_light=0x7f020008;
        public static int common_signin_btn_icon_light=0x7f020009;
        public static int common_signin_btn_icon_normal_dark=0x7f02000a;
        public static int common_signin_btn_icon_normal_light=0x7f02000b;
        public static int common_signin_btn_icon_pressed_dark=0x7f02000c;
        public static int common_signin_btn_icon_pressed_light=0x7f02000d;
        public static int common_signin_btn_text_dark=0x7f02000e;
        public static int common_signin_btn_text_disabled_dark=0x7f02000f;
        public static int common_signin_btn_text_disabled_focus_dark=0x7f020010;
        public static int common_signin_btn_text_disabled_focus_light=0x7f020011;
        public static int common_signin_btn_text_disabled_light=0x7f020012;
        public static int common_signin_btn_text_focus_dark=0x7f020013;
        public static int common_signin_btn_text_focus_light=0x7f020014;
        public static int common_signin_btn_text_light=0x7f020015;
        public static int common_signin_btn_text_normal_dark=0x7f020016;
        public static int common_signin_btn_text_normal_light=0x7f020017;
        public static int common_signin_btn_text_pressed_dark=0x7f020018;
        public static int common_signin_btn_text_pressed_light=0x7f020019;
        public static int ic_plusone_medium_off_client=0x7f02001a;
        public static int ic_plusone_small_off_client=0x7f02001b;
        public static int ic_plusone_standard_off_client=0x7f02001c;
        public static int ic_plusone_tall_off_client=0x7f02001d;
        public static int powered_by_google_dark=0x7f02001e;
        public static int powered_by_google_light=0x7f02001f;
        static {
            try {
                Class<?> realRClass = Class.forName("io.trigger.forge.android.inspector.R$drawable");
	            for (Field f : drawable.class.getDeclaredFields()) {
	                try {
	                    f.set(null, realRClass.getDeclaredField(f.getName()).get(null));
	                } catch (IllegalArgumentException e) {
	                	Log.e("Forge", e.toString());
	                } catch (IllegalAccessException e) {
	                	Log.e("Forge", e.toString());
	                } catch (NoSuchFieldException e) {
	                	Log.e("Forge", e.toString());
	                }
	            }
            } catch (ClassNotFoundException e) {
            	Log.e("Forge", e.toString());
            }
        }
    }
    public static class id {
        public static int book_now=0x7f060010;
        public static int buyButton=0x7f06000a;
        public static int buy_now=0x7f06000f;
        public static int buy_with_google=0x7f06000e;
        public static int classic=0x7f060011;
        public static int grayscale=0x7f060012;
        public static int holo_dark=0x7f060005;
        public static int holo_light=0x7f060006;
        public static int hybrid=0x7f060004;
        public static int match_parent=0x7f06000c;
        public static int monochrome=0x7f060013;
        public static int none=0x7f060000;
        public static int normal=0x7f060001;
        public static int production=0x7f060007;
        public static int sandbox=0x7f060008;
        public static int satellite=0x7f060002;
        public static int selectionDetails=0x7f06000b;
        public static int strict_sandbox=0x7f060009;
        public static int terrain=0x7f060003;
        public static int wrap_content=0x7f06000d;
        static {
            try {
                Class<?> realRClass = Class.forName("io.trigger.forge.android.inspector.R$id");
	            for (Field f : id.class.getDeclaredFields()) {
	                try {
	                    f.set(null, realRClass.getDeclaredField(f.getName()).get(null));
	                } catch (IllegalArgumentException e) {
	                	Log.e("Forge", e.toString());
	                } catch (IllegalAccessException e) {
	                	Log.e("Forge", e.toString());
	                } catch (NoSuchFieldException e) {
	                	Log.e("Forge", e.toString());
	                }
	            }
            } catch (ClassNotFoundException e) {
            	Log.e("Forge", e.toString());
            }
        }
    }
    public static class integer {
        public static int google_play_services_version=0x7f070000;
        static {
            try {
                Class<?> realRClass = Class.forName("io.trigger.forge.android.inspector.R$integer");
	            for (Field f : integer.class.getDeclaredFields()) {
	                try {
	                    f.set(null, realRClass.getDeclaredField(f.getName()).get(null));
	                } catch (IllegalArgumentException e) {
	                	Log.e("Forge", e.toString());
	                } catch (IllegalAccessException e) {
	                	Log.e("Forge", e.toString());
	                } catch (NoSuchFieldException e) {
	                	Log.e("Forge", e.toString());
	                }
	            }
            } catch (ClassNotFoundException e) {
            	Log.e("Forge", e.toString());
            }
        }
    }
    public static class string {
        public static int accept=0x7f040002;
        /**   Text for notification shown when the Android Wear apps needs to be updated. Only shown on the wearable. [CHAR LIMIT=NONE] 
         */
        public static int common_android_wear_notification_needs_update_text=0x7f040009;
        /**  Message in confirmation dialog informing user that they need to update
        the Android Wear app [CHAR LIMIT=NONE] 
         */
        public static int common_android_wear_update_text=0x7f040016;
        /**  Title of confirmation dialog informing user that they need to update
        the Android Wear app (from Play Store) [CHAR LIMIT=40] 
         */
        public static int common_android_wear_update_title=0x7f040014;
        /**  Button in confirmation dialog to enable Google Play services.  Clicking it
        will direct user to application settings of Google Play services where they
        can enable it [CHAR LIMIT=40] 
         */
        public static int common_google_play_services_enable_button=0x7f040012;
        /**  Message in confirmation dialog informing user they need to enable
        Google Play services in application settings [CHAR LIMIT=NONE] 
         */
        public static int common_google_play_services_enable_text=0x7f040011;
        /**  Title of confirmation dialog informing user they need to enable
        Google Play services in application settings [CHAR LIMIT=40] 
         */
        public static int common_google_play_services_enable_title=0x7f040010;
        /**   Requested by string saying which app requested the notification. [CHAR LIMIT=42] 
         */
        public static int common_google_play_services_error_notification_requested_by_msg=0x7f04000b;
        /**  Button in confirmation dialog for installing Google Play services [CHAR LIMIT=40] 
         */
        public static int common_google_play_services_install_button=0x7f04000f;
        /**  (For phones) Message in confirmation dialog informing user that
        they need to install Google Play services (from Play Store) [CHAR LIMIT=NONE] 
         */
        public static int common_google_play_services_install_text_phone=0x7f04000d;
        /**  (For tablets) Message in confirmation dialog informing user that
        they need to install Google Play services (from Play Store) [CHAR LIMIT=NONE] 
         */
        public static int common_google_play_services_install_text_tablet=0x7f04000e;
        /**  Title of confirmation dialog informing user that they need to install
        Google Play services (from Play Store) [CHAR LIMIT=40] 
         */
        public static int common_google_play_services_install_title=0x7f04000c;
        /**  Message in confirmation dialog informing the user that they provided an invalid account. [CHAR LIMIT=NONE] 
         */
        public static int common_google_play_services_invalid_account_text=0x7f04001a;
        /**  Title of confirmation dialog informing the user that they provided an invalid account. [CHAR LIMIT=40] 
         */
        public static int common_google_play_services_invalid_account_title=0x7f040019;
        /**   Title for notification shown when GooglePlayServices needs to be enabled for an
        application to work. [CHAR LIMIT=70] 
         */
        public static int common_google_play_services_needs_enabling_title=0x7f04000a;
        /**  Message in confirmation dialog informing the user that a network error occurred. [CHAR LIMIT=NONE] 
         */
        public static int common_google_play_services_network_error_text=0x7f040018;
        /**  Title of confirmation dialog informing the user that a network error occurred. [CHAR LIMIT=40] 
         */
        public static int common_google_play_services_network_error_title=0x7f040017;
        /**   Title for notification shown when GooglePlayServices needs to be installed
        for an application to work. [CHAR LIMIT=70] 
         */
        public static int common_google_play_services_notification_needs_installation_title=0x7f040007;
        /**   Title for notification shown when GooglePlayServices needs to be updated for an
        application to work. [CHAR LIMIT=70] 
         */
        public static int common_google_play_services_notification_needs_update_title=0x7f040008;
        /**   Title for notification shown when GooglePlayServices is unavailable [CHAR LIMIT=42] 
         */
        public static int common_google_play_services_notification_ticker=0x7f040006;
        /**  Message in confirmation dialog informing user there is an unknown issue in Google Play
        services [CHAR LIMIT=NONE] 
         */
        public static int common_google_play_services_unknown_issue=0x7f04001b;
        /**  Message in confirmation dialog informing user that Google Play services is not supported on their device [CHAR LIMIT=NONE] 
         */
        public static int common_google_play_services_unsupported_text=0x7f04001d;
        /**  Title of confirmation dialog informing user that Google Play services is not supported on their device [CHAR LIMIT=40] 
         */
        public static int common_google_play_services_unsupported_title=0x7f04001c;
        /**  Button in confirmation dialog for updating Google Play services [CHAR LIMIT=40] 
         */
        public static int common_google_play_services_update_button=0x7f04001e;
        /**  Message in confirmation dialog informing user that they need to update
        Google Play services (from Play Store) [CHAR LIMIT=NONE] 
         */
        public static int common_google_play_services_update_text=0x7f040015;
        /**  Title of confirmation dialog informing user that they need to update
        Google Play services (from Play Store) [CHAR LIMIT=40] 
         */
        public static int common_google_play_services_update_title=0x7f040013;
        /**  Label for an action to open a notifications content on the phone [CHAR LIMIT=25] 
         */
        public static int common_open_on_phone=0x7f040021;
        /**  Sign-in button text [CHAR LIMIT=15] 
         */
        public static int common_signin_button_text=0x7f04001f;
        /**  Long form sign-in button text [CHAR LIMIT=30] 
         */
        public static int common_signin_button_text_long=0x7f040020;
        public static int create_calendar_message=0x7f040005;
        public static int create_calendar_title=0x7f040004;
        public static int decline=0x7f040003;
        public static int store_picture_message=0x7f040001;
        public static int store_picture_title=0x7f040000;
        /**  Text on a placeholder buy button when Google Play services is not
         available or up-to-date 
         */
        public static int wallet_buy_button_place_holder=0x7f040022;
        static {
            try {
                Class<?> realRClass = Class.forName("io.trigger.forge.android.inspector.R$string");
	            for (Field f : string.class.getDeclaredFields()) {
	                try {
	                    f.set(null, realRClass.getDeclaredField(f.getName()).get(null));
	                } catch (IllegalArgumentException e) {
	                	Log.e("Forge", e.toString());
	                } catch (IllegalAccessException e) {
	                	Log.e("Forge", e.toString());
	                } catch (NoSuchFieldException e) {
	                	Log.e("Forge", e.toString());
	                }
	            }
            } catch (ClassNotFoundException e) {
            	Log.e("Forge", e.toString());
            }
        }
    }
    public static class style {
        public static int Theme_IAPTheme=0x7f030000;
        public static int WalletFragmentDefaultButtonTextAppearance=0x7f030003;
        public static int WalletFragmentDefaultDetailsHeaderTextAppearance=0x7f030002;
        public static int WalletFragmentDefaultDetailsTextAppearance=0x7f030001;
        /** 
         Default style of the wallet fragment that will be used if not set explicitly
         when fragment is created
    
         */
        public static int WalletFragmentDefaultStyle=0x7f030004;
        static {
            try {
                Class<?> realRClass = Class.forName("io.trigger.forge.android.inspector.R$style");
	            for (Field f : style.class.getDeclaredFields()) {
	                try {
	                    f.set(null, realRClass.getDeclaredField(f.getName()).get(null));
	                } catch (IllegalArgumentException e) {
	                	Log.e("Forge", e.toString());
	                } catch (IllegalAccessException e) {
	                	Log.e("Forge", e.toString());
	                } catch (NoSuchFieldException e) {
	                	Log.e("Forge", e.toString());
	                }
	            }
            } catch (ClassNotFoundException e) {
            	Log.e("Forge", e.toString());
            }
        }
    }
    public static class styleable {
        /** Attributes that can be used with a AdsAttrs.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #AdsAttrs_adSize io.trigger.forge.android.modules.android_push:adSize}</code></td><td>
    The size of the ad.</td></tr>
           <tr><td><code>{@link #AdsAttrs_adSizes io.trigger.forge.android.modules.android_push:adSizes}</code></td><td>
    A comma-separated list of the supported ad sizes.</td></tr>
           <tr><td><code>{@link #AdsAttrs_adUnitId io.trigger.forge.android.modules.android_push:adUnitId}</code></td><td> The ad unit ID.</td></tr>
           </table>
           @see #AdsAttrs_adSize
           @see #AdsAttrs_adSizes
           @see #AdsAttrs_adUnitId
         */
        public static int[] AdsAttrs = {
            0x7f010000, 0x7f010001, 0x7f010002
        };
        /**
          <p>
          @attr description
          
    The size of the ad. It must be one of BANNER, FULL_BANNER, LEADERBOARD,
    MEDIUM_RECTANGLE, SMART_BANNER, WIDE_SKYSCRAPER, or
    &lt;width&gt;x&lt;height&gt;.
    


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:adSize
        */
        public static int AdsAttrs_adSize = 0;
        /**
          <p>
          @attr description
          
    A comma-separated list of the supported ad sizes. The sizes must be one of
    BANNER, FULL_BANNER, LEADERBOARD, MEDIUM_RECTANGLE, SMART_BANNER,
    WIDE_SKYSCRAPER, or &lt;width&gt;x&lt;height&gt;.
    


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:adSizes
        */
        public static int AdsAttrs_adSizes = 1;
        /**
          <p>
          @attr description
           The ad unit ID. 


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:adUnitId
        */
        public static int AdsAttrs_adUnitId = 2;
        /** Attributes that can be used with a MapAttrs.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #MapAttrs_cameraBearing io.trigger.forge.android.modules.android_push:cameraBearing}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_cameraTargetLat io.trigger.forge.android.modules.android_push:cameraTargetLat}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_cameraTargetLng io.trigger.forge.android.modules.android_push:cameraTargetLng}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_cameraTilt io.trigger.forge.android.modules.android_push:cameraTilt}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_cameraZoom io.trigger.forge.android.modules.android_push:cameraZoom}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_mapType io.trigger.forge.android.modules.android_push:mapType}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_uiCompass io.trigger.forge.android.modules.android_push:uiCompass}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_uiRotateGestures io.trigger.forge.android.modules.android_push:uiRotateGestures}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_uiScrollGestures io.trigger.forge.android.modules.android_push:uiScrollGestures}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_uiTiltGestures io.trigger.forge.android.modules.android_push:uiTiltGestures}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_uiZoomControls io.trigger.forge.android.modules.android_push:uiZoomControls}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_uiZoomGestures io.trigger.forge.android.modules.android_push:uiZoomGestures}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_useViewLifecycle io.trigger.forge.android.modules.android_push:useViewLifecycle}</code></td><td></td></tr>
           <tr><td><code>{@link #MapAttrs_zOrderOnTop io.trigger.forge.android.modules.android_push:zOrderOnTop}</code></td><td></td></tr>
           </table>
           @see #MapAttrs_cameraBearing
           @see #MapAttrs_cameraTargetLat
           @see #MapAttrs_cameraTargetLng
           @see #MapAttrs_cameraTilt
           @see #MapAttrs_cameraZoom
           @see #MapAttrs_mapType
           @see #MapAttrs_uiCompass
           @see #MapAttrs_uiRotateGestures
           @see #MapAttrs_uiScrollGestures
           @see #MapAttrs_uiTiltGestures
           @see #MapAttrs_uiZoomControls
           @see #MapAttrs_uiZoomGestures
           @see #MapAttrs_useViewLifecycle
           @see #MapAttrs_zOrderOnTop
         */
        public static int[] MapAttrs = {
            0x7f010003, 0x7f010004, 0x7f010005, 0x7f010006,
            0x7f010007, 0x7f010008, 0x7f010009, 0x7f01000a,
            0x7f01000b, 0x7f01000c, 0x7f01000d, 0x7f01000e,
            0x7f01000f, 0x7f010010
        };
        /**
          <p>This symbol is the offset where the {@link io.trigger.forge.android.modules.android_push.R.attr#cameraBearing}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:cameraBearing
        */
        public static int MapAttrs_cameraBearing = 1;
        /**
          <p>This symbol is the offset where the {@link io.trigger.forge.android.modules.android_push.R.attr#cameraTargetLat}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:cameraTargetLat
        */
        public static int MapAttrs_cameraTargetLat = 2;
        /**
          <p>This symbol is the offset where the {@link io.trigger.forge.android.modules.android_push.R.attr#cameraTargetLng}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:cameraTargetLng
        */
        public static int MapAttrs_cameraTargetLng = 3;
        /**
          <p>This symbol is the offset where the {@link io.trigger.forge.android.modules.android_push.R.attr#cameraTilt}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:cameraTilt
        */
        public static int MapAttrs_cameraTilt = 4;
        /**
          <p>This symbol is the offset where the {@link io.trigger.forge.android.modules.android_push.R.attr#cameraZoom}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a floating point value, such as "<code>1.2</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:cameraZoom
        */
        public static int MapAttrs_cameraZoom = 5;
        /**
          <p>This symbol is the offset where the {@link io.trigger.forge.android.modules.android_push.R.attr#mapType}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>none</code></td><td>0</td><td></td></tr>
<tr><td><code>normal</code></td><td>1</td><td></td></tr>
<tr><td><code>satellite</code></td><td>2</td><td></td></tr>
<tr><td><code>terrain</code></td><td>3</td><td></td></tr>
<tr><td><code>hybrid</code></td><td>4</td><td></td></tr>
</table>
          @attr name android:mapType
        */
        public static int MapAttrs_mapType = 0;
        /**
          <p>This symbol is the offset where the {@link io.trigger.forge.android.modules.android_push.R.attr#uiCompass}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:uiCompass
        */
        public static int MapAttrs_uiCompass = 6;
        /**
          <p>This symbol is the offset where the {@link io.trigger.forge.android.modules.android_push.R.attr#uiRotateGestures}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:uiRotateGestures
        */
        public static int MapAttrs_uiRotateGestures = 7;
        /**
          <p>This symbol is the offset where the {@link io.trigger.forge.android.modules.android_push.R.attr#uiScrollGestures}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:uiScrollGestures
        */
        public static int MapAttrs_uiScrollGestures = 8;
        /**
          <p>This symbol is the offset where the {@link io.trigger.forge.android.modules.android_push.R.attr#uiTiltGestures}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:uiTiltGestures
        */
        public static int MapAttrs_uiTiltGestures = 9;
        /**
          <p>This symbol is the offset where the {@link io.trigger.forge.android.modules.android_push.R.attr#uiZoomControls}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:uiZoomControls
        */
        public static int MapAttrs_uiZoomControls = 10;
        /**
          <p>This symbol is the offset where the {@link io.trigger.forge.android.modules.android_push.R.attr#uiZoomGestures}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:uiZoomGestures
        */
        public static int MapAttrs_uiZoomGestures = 11;
        /**
          <p>This symbol is the offset where the {@link io.trigger.forge.android.modules.android_push.R.attr#useViewLifecycle}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:useViewLifecycle
        */
        public static int MapAttrs_useViewLifecycle = 12;
        /**
          <p>This symbol is the offset where the {@link io.trigger.forge.android.modules.android_push.R.attr#zOrderOnTop}
          attribute's value can be found in the {@link #MapAttrs} array.


          <p>Must be a boolean value, either "<code>true</code>" or "<code>false</code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:zOrderOnTop
        */
        public static int MapAttrs_zOrderOnTop = 13;
        /**  Attributes for the WalletFragment &lt;fragment&gt; tag 
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #WalletFragmentOptions_appTheme io.trigger.forge.android.modules.android_push:appTheme}</code></td><td> Theme to be used for the Wallet selector </td></tr>
           <tr><td><code>{@link #WalletFragmentOptions_environment io.trigger.forge.android.modules.android_push:environment}</code></td><td> Google Wallet environment to use </td></tr>
           <tr><td><code>{@link #WalletFragmentOptions_fragmentMode io.trigger.forge.android.modules.android_push:fragmentMode}</code></td><td> Fragment mode </td></tr>
           <tr><td><code>{@link #WalletFragmentOptions_fragmentStyle io.trigger.forge.android.modules.android_push:fragmentStyle}</code></td><td> A style resource specifing attributes to customize the look and feel of WalletFragment </td></tr>
           </table>
           @see #WalletFragmentOptions_appTheme
           @see #WalletFragmentOptions_environment
           @see #WalletFragmentOptions_fragmentMode
           @see #WalletFragmentOptions_fragmentStyle
         */
        public static int[] WalletFragmentOptions = {
            0x7f010011, 0x7f010012, 0x7f010013, 0x7f010014
        };
        /**
          <p>
          @attr description
           Theme to be used for the Wallet selector 


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>holo_dark</code></td><td>0</td><td></td></tr>
<tr><td><code>holo_light</code></td><td>1</td><td></td></tr>
</table>
          <p>This is a private symbol.
          @attr name android:appTheme
        */
        public static int WalletFragmentOptions_appTheme = 0;
        /**
          <p>
          @attr description
           Google Wallet environment to use 


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>production</code></td><td>1</td><td></td></tr>
<tr><td><code>sandbox</code></td><td>0</td><td></td></tr>
<tr><td><code>strict_sandbox</code></td><td>2</td><td></td></tr>
</table>
          <p>This is a private symbol.
          @attr name android:environment
        */
        public static int WalletFragmentOptions_environment = 1;
        /**
          <p>
          @attr description
           Fragment mode 


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>buyButton</code></td><td>1</td><td></td></tr>
<tr><td><code>selectionDetails</code></td><td>2</td><td></td></tr>
</table>
          <p>This is a private symbol.
          @attr name android:fragmentMode
        */
        public static int WalletFragmentOptions_fragmentMode = 3;
        /**
          <p>
          @attr description
           A style resource specifing attributes to customize the look and feel of WalletFragment 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name android:fragmentStyle
        */
        public static int WalletFragmentOptions_fragmentStyle = 2;
        /**  Attributes that may be specified in a style resource to customize the look and feel of
         WalletFragment 
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #WalletFragmentStyle_buyButtonAppearance io.trigger.forge.android.modules.android_push:buyButtonAppearance}</code></td><td> Appearance of the buy button.</td></tr>
           <tr><td><code>{@link #WalletFragmentStyle_buyButtonHeight io.trigger.forge.android.modules.android_push:buyButtonHeight}</code></td><td> Height of the buy button.</td></tr>
           <tr><td><code>{@link #WalletFragmentStyle_buyButtonText io.trigger.forge.android.modules.android_push:buyButtonText}</code></td><td> Text on the buy button.</td></tr>
           <tr><td><code>{@link #WalletFragmentStyle_buyButtonWidth io.trigger.forge.android.modules.android_push:buyButtonWidth}</code></td><td> Width of the buy button.</td></tr>
           <tr><td><code>{@link #WalletFragmentStyle_maskedWalletDetailsBackground io.trigger.forge.android.modules.android_push:maskedWalletDetailsBackground}</code></td><td> Masked wallet details background </td></tr>
           <tr><td><code>{@link #WalletFragmentStyle_maskedWalletDetailsButtonBackground io.trigger.forge.android.modules.android_push:maskedWalletDetailsButtonBackground}</code></td><td> "Change" button background in masked wallet details view </td></tr>
           <tr><td><code>{@link #WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance io.trigger.forge.android.modules.android_push:maskedWalletDetailsButtonTextAppearance}</code></td><td> TextAppearance for the "Change" button in masked wallet details view </td></tr>
           <tr><td><code>{@link #WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance io.trigger.forge.android.modules.android_push:maskedWalletDetailsHeaderTextAppearance}</code></td><td> TextAppearance for headers describing masked wallet details </td></tr>
           <tr><td><code>{@link #WalletFragmentStyle_maskedWalletDetailsLogoImageType io.trigger.forge.android.modules.android_push:maskedWalletDetailsLogoImageType}</code></td><td> Type of the wallet logo image in masked wallet details view </td></tr>
           <tr><td><code>{@link #WalletFragmentStyle_maskedWalletDetailsLogoTextColor io.trigger.forge.android.modules.android_push:maskedWalletDetailsLogoTextColor}</code></td><td> Color of the Google Wallet logo text in masked wallet details view </td></tr>
           <tr><td><code>{@link #WalletFragmentStyle_maskedWalletDetailsTextAppearance io.trigger.forge.android.modules.android_push:maskedWalletDetailsTextAppearance}</code></td><td> TextAppearance for masked wallet details </td></tr>
           </table>
           @see #WalletFragmentStyle_buyButtonAppearance
           @see #WalletFragmentStyle_buyButtonHeight
           @see #WalletFragmentStyle_buyButtonText
           @see #WalletFragmentStyle_buyButtonWidth
           @see #WalletFragmentStyle_maskedWalletDetailsBackground
           @see #WalletFragmentStyle_maskedWalletDetailsButtonBackground
           @see #WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance
           @see #WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance
           @see #WalletFragmentStyle_maskedWalletDetailsLogoImageType
           @see #WalletFragmentStyle_maskedWalletDetailsLogoTextColor
           @see #WalletFragmentStyle_maskedWalletDetailsTextAppearance
         */
        public static int[] WalletFragmentStyle = {
            0x7f010015, 0x7f010016, 0x7f010017, 0x7f010018,
            0x7f010019, 0x7f01001a, 0x7f01001b, 0x7f01001c,
            0x7f01001d, 0x7f01001e, 0x7f01001f
        };
        /**
          <p>
          @attr description
           Appearance of the buy button. Must be one of "classic", "grayscale" and "monochrome" 


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>classic</code></td><td>1</td><td></td></tr>
<tr><td><code>grayscale</code></td><td>2</td><td></td></tr>
<tr><td><code>monochrome</code></td><td>3</td><td></td></tr>
</table>
          <p>This is a private symbol.
          @attr name android:buyButtonAppearance
        */
        public static int WalletFragmentStyle_buyButtonAppearance = 3;
        /**
          <p>
          @attr description
           Height of the buy button. This includes an 8dp padding (4dp on each side) used for
             pressed and focused states of the button. The value can be a specific height, e.g.
             "48dp", or special values "match_parent" and "wrap_content". 


          <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
<p>May be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>match_parent</code></td><td>-1</td><td></td></tr>
<tr><td><code>wrap_content</code></td><td>-2</td><td></td></tr>
</table>
          <p>This is a private symbol.
          @attr name android:buyButtonHeight
        */
        public static int WalletFragmentStyle_buyButtonHeight = 0;
        /**
          <p>
          @attr description
           Text on the buy button. Must be one of "buy_with_google", "buy_now" and "book_now" 


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>buy_with_google</code></td><td>1</td><td></td></tr>
<tr><td><code>buy_now</code></td><td>2</td><td></td></tr>
<tr><td><code>book_now</code></td><td>3</td><td></td></tr>
</table>
          <p>This is a private symbol.
          @attr name android:buyButtonText
        */
        public static int WalletFragmentStyle_buyButtonText = 2;
        /**
          <p>
          @attr description
           Width of the buy button. This includes an 8dp padding (4dp on each side) used for
             pressed and focused states of the button. The value can be a specific width, e.g.
             "300dp", or special values "match_parent" and "wrap_content". 


          <p>May be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
<p>May be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>match_parent</code></td><td>-1</td><td></td></tr>
<tr><td><code>wrap_content</code></td><td>-2</td><td></td></tr>
</table>
          <p>This is a private symbol.
          @attr name android:buyButtonWidth
        */
        public static int WalletFragmentStyle_buyButtonWidth = 1;
        /**
          <p>
          @attr description
           Masked wallet details background 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name android:maskedWalletDetailsBackground
        */
        public static int WalletFragmentStyle_maskedWalletDetailsBackground = 6;
        /**
          <p>
          @attr description
           "Change" button background in masked wallet details view 


          <p>May be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
<p>May be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
          <p>This is a private symbol.
          @attr name android:maskedWalletDetailsButtonBackground
        */
        public static int WalletFragmentStyle_maskedWalletDetailsButtonBackground = 8;
        /**
          <p>
          @attr description
           TextAppearance for the "Change" button in masked wallet details view 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name android:maskedWalletDetailsButtonTextAppearance
        */
        public static int WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance = 7;
        /**
          <p>
          @attr description
           TextAppearance for headers describing masked wallet details 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name android:maskedWalletDetailsHeaderTextAppearance
        */
        public static int WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance = 5;
        /**
          <p>
          @attr description
           Type of the wallet logo image in masked wallet details view 


          <p>Must be one of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>classic</code></td><td>1</td><td></td></tr>
<tr><td><code>monochrome</code></td><td>2</td><td></td></tr>
</table>
          <p>This is a private symbol.
          @attr name android:maskedWalletDetailsLogoImageType
        */
        public static int WalletFragmentStyle_maskedWalletDetailsLogoImageType = 10;
        /**
          <p>
          @attr description
           Color of the Google Wallet logo text in masked wallet details view 


          <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          <p>This is a private symbol.
          @attr name android:maskedWalletDetailsLogoTextColor
        */
        public static int WalletFragmentStyle_maskedWalletDetailsLogoTextColor = 9;
        /**
          <p>
          @attr description
           TextAppearance for masked wallet details 


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          <p>This is a private symbol.
          @attr name android:maskedWalletDetailsTextAppearance
        */
        public static int WalletFragmentStyle_maskedWalletDetailsTextAppearance = 4;
        static {
            try {
                Class<?> realRClass = Class.forName("io.trigger.forge.android.inspector.R$styleable");
	            for (Field f : styleable.class.getDeclaredFields()) {
	                try {
	                    f.set(null, realRClass.getDeclaredField(f.getName()).get(null));
	                } catch (IllegalArgumentException e) {
	                	Log.e("Forge", e.toString());
	                } catch (IllegalAccessException e) {
	                	Log.e("Forge", e.toString());
	                } catch (NoSuchFieldException e) {
	                	Log.e("Forge", e.toString());
	                }
	            }
            } catch (ClassNotFoundException e) {
            	Log.e("Forge", e.toString());
            }
        }
    };
}
