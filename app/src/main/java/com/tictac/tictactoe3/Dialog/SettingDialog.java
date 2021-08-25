package com.tictac.tictactoe3.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;

import com.tictac.tictactoe3.PrivacyPolicy;
import com.tictac.tictactoe3.R;
import com.tictac.tictactoe3.orginizer;

public class SettingDialog extends Dialog {

    private ImageView imageView;
    public static final String PRIVACY_POLICY_KEY = "9090";
    private orginizer Or;

    public SettingDialog(@NonNull Context context) {
        super(context);
        init();

    }

    private void init() {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.setting_dialog);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setCancelable(true);
        hooks();
       Or=  new orginizer(getContext(), imageView);

    }

    private void hooks() {
        LinearLayout privacyPolicy = findViewById(R.id.privacypolicy);
        LinearLayout rateUs = findViewById(R.id.rateus);
        LinearLayout sound = findViewById(R.id.sound);
        LinearLayout contactUs = findViewById(R.id.contactus);
        imageView = findViewById(R.id.vloume);

        rateUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = "https://play.google.com/store/apps/details?id=" + getContext().getPackageName();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                getContext().startActivity(intent);
            }
        });


        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Or.change();
            }
        });


        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), PrivacyPolicy.class);
                String CONTACT_US = "<div> \n" +
                        "                \n" +
                        "                <p><strong><u>&nbsp;Android App Developer | UI/UX designer | Website Developer</u></strong></p>\n" +
                        "                <p><br></p>\n" +
                        "                <p><strong>Hi, Hope you are fine.</strong></p>\n" +
                        "                <p>We are Software Developer. we can develop android applications with high standards with great quality and design. we can also develop custom Arduino app for your project.</p>        <p><br></p>\n" +
                        "                <p><strong><u>What we can offer </u></strong></p>\n" +
                        "                <p><br></p>\n" +
                        "                <p>Android App Development.</p>\n" +
                        "                <p>Website development.</p>\n" +
                        "                <p>Bug Fixing in android app</p>\n" +
                        "                <p> UI/UX design fore apps + web </p>\n" +
                        "                <p>Firebase Integration (Authentication, Database, Storage)</p>\n" +
                        "                <p>Google maps Integration.</p>\n" +
                        "                <p>Third party library integration.</p>\n" +
                        "                <p>Social Media Integration (Google, Facebook, Twitter, LinkedIn etc.)</p>\n" +
                        "                <p>Local and Push Notification in android app</p>\n" +
                        "                <p>Arduino app for HC05 module</p>\n" +
                        "                <p><br></p>\n" +
                        "                <p><strong><u>Why  choose Us</u></strong></p>\n" +
                        "                <p><br></p>\n" +
                        "                <p>Strong technical skills, Having 2.5+ years of experience</p>\n" +
                        "                <p>99% Satisfaction to Clients.</p>\n" +
                        "                <p>High Quality Delivery.</p>\n" +
                        "                <p>Expertise in UI/ UX multi-screen support</p>\n" +
                        "                <p>Effective Communication through out the mobile app development.</p>\n" +
                        "                <p><br></p>\n" +
                        "                <p><u>“Customer satisfaction is Our first priority”</u></p>\n" +
                        "                <p><br></p>\n" +
                        "                <p>Thank you</p>\n" +
                        "                <h3 style=\"color: rgba(179, 37, 131, 0.801);\">Contact Us</h3>\n" +
                        "                <p style=\"color: rgba(179, 37, 131, 0.801); margin-left: 10px;\"><strong>Cell</strong></p>\n" +
                        "                <p style=\"margin-left: 13px;\"> <span>+923123285202</span></p>\n" +
                        "                <p style=\"margin-left: 13px;\"> <span>+923123285202</span></p>\n" +
                        "                <p style=\"color: rgba(179, 37, 131, 0.801); margin-left: 10px;\"><strong>Email</strong></p>\n" +
                        "                <p style=\"margin-left: 13px;\"> <span>Soomroqudoos5@gmail.com</span></p>\n" +
                        "                <p style=\"margin-left: 13px;\"> <span>Soomroqudoos5@gmail.com</span></p>\n" +
                        "              \n" +
                        "\n" +
                        "            </div>"
                ;
                intent.putExtra(PRIVACY_POLICY_KEY, CONTACT_US);
                getContext().startActivity(intent);
            }
        });

        privacyPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), PrivacyPolicy.class);
                String CONTACT_US = "<!DOCTYPE html>\n" +
                        "    <html>\n" +


                        "    <body>\n" +
                        "    <strong>Privacy Policy</strong> <p>\n" +
                        "                  Abdul Qudoos have built the Tic Tac Toe app as\n" +
                        "                  an Ad Supported app @TRETECH. This GAME  is provided by\n" +
                        "                  Adeel Ahmed at no cost and is intended for use as\n" +
                        "                  is.\n" +
                        "                </p> <p>\n" +
                        "                  This page is used to inform visitors regarding my\n" +
                        "                  policies with the collection, use, and disclosure of Personal\n" +
                        "                  Information if anyone decided to use our Service.\n" +
                        "                </p> <p>\n" +
                        "                  If you choose to use our Service, then you agree to\n" +
                        "                  the collection and use of information in relation to this\n" +
                        "                  policy. The Personal Information that we collect is\n" +
                        "                  used for providing and improving the Service. We will not use or share your information with\n" +
                        "                  anyone except as described in this Privacy Policy.\n" +
                        "                </p> <p>\n" +
                        "                  The terms used in this Privacy Policy have the same meanings\n" +
                        "                  as in our Terms and Conditions, which is accessible at\n" +
                        "                  Tic Tac Toe unless otherwise defined in this Privacy Policy.\n" +
                        "                </p> <p><strong>Information Collection and Use</strong></p> <p>\n" +
                        "                  For a better experience, while using our Service, I\n" +
                        "                  may require you to provide us with certain personally\n" +
                        "                  identifiable information, including but not limited to Name. The information that\n" +
                        "                  I request will be retained on your device and is not collected by me in any way.\n" +
                        "                </p> <div><p>\n" +
                        "                    The app does use third party services that may collect\n" +
                        "                    information used to identify you.\n" +
                        "                  </p> <p>\n" +
                        "                    Link to privacy policy of third party service providers used\n" +
                        "                    by the app\n" +
                        "                  </p> <ul><li><a href=\"https://www.google.com/policies/privacy/\" target=\"_blank\" rel=\"noopener noreferrer\">Google Play Services</a></li><li><a href=\"https://support.google.com/admob/answer/6128543?hl=en\" target=\"_blank\" rel=\"noopener noreferrer\">AdMob</a></li><li><a href=\"https://firebase.google.com/policies/analytics\" target=\"_blank\" rel=\"noopener noreferrer\">Google Analytics for Firebase</a></li><!----><!----><!----><!----><!----><!----><!----><!----><!----><!----><!----><!----><!----><!----><!----><!----><!----><!----><!----><!----><!----><!----><!----></ul></div> <p><strong>Log Data</strong></p> <p>\n" +
                        "                  I want to inform you that whenever you\n" +
                        "                  use my Service, in a case of an error in the app\n" +
                        "                  I collect data and information (through third party\n" +
                        "                  products) on your phone called Log Data. This Log Data may\n" +
                        "                  include information such as your device Internet Protocol\n" +
                        "                  (“IP”) address, device name, operating system version, the\n" +
                        "                  configuration of the app when utilizing my Service,\n" +
                        "                  the time and date of your use of the Service, and other\n" +
                        "                  statistics.\n" +
                        "                </p> <p><strong>Cookies</strong></p> <p>\n" +
                        "                  Cookies are files with a small amount of data that are\n" +
                        "                  commonly used as anonymous unique identifiers. These are sent\n" +
                        "                  to your browser from the websites that you visit and are\n" +
                        "                  stored on your device's internal memory.\n" +
                        "                </p> <p>\n" +
                        "                  This Service does not use these “cookies” explicitly. However,\n" +
                        "                  the app may use third party code and libraries that use\n" +
                        "                  “cookies” to collect information and improve their services.\n" +
                        "                  You have the option to either accept or refuse these cookies\n" +
                        "                  and know when a cookie is being sent to your device. If you\n" +
                        "                  choose to refuse our cookies, you may not be able to use some\n" +
                        "                  portions of this Service.\n" +
                        "                </p> <p><strong>Service Providers</strong></p> <p>\n" +
                        "                  I may employ third-party companies and\n" +
                        "                  individuals due to the following reasons:\n" +
                        "                </p> <ul><li>To facilitate our Service;</li> <li>To provide the Service on our behalf;</li> <li>To perform Service-related services; or</li> <li>To assist us in analyzing how our Service is used.</li></ul> <p>\n" +
                        "                  I want to inform users of this Service\n" +
                        "                  that these third parties have access to your Personal\n" +
                        "                  Information. The reason is to perform the tasks assigned to\n" +
                        "                  them on our behalf. However, they are obligated not to\n" +
                        "                  disclose or use the information for any other purpose.\n" +
                        "                </p> <p><strong>Security</strong></p> <p>\n" +
                        "                  I value your trust in providing us your\n" +
                        "                  Personal Information, thus we are striving to use commercially\n" +
                        "                  acceptable means of protecting it. But remember that no method\n" +
                        "                  of transmission over the internet, or method of electronic\n" +
                        "                  storage is 100% secure and reliable, and I cannot\n" +
                        "                  guarantee its absolute security.\n" +
                        "                </p> <p><strong>Links to Other Sites</strong></p> <p>\n" +
                        "                  This Service may contain links to other sites. If you click on\n" +
                        "                  a third-party link, you will be directed to that site. Note\n" +
                        "                  that these external sites are not operated by me.\n" +
                        "                  Therefore, I strongly advise you to review the\n" +
                        "                  Privacy Policy of these websites. I have\n" +
                        "                  no control over and assume no responsibility for the content,\n" +
                        "                  privacy policies, or practices of any third-party sites or\n" +
                        "                  services.\n" +
                        "                </p> <p><strong>Children’s Privacy</strong></p> <p>\n" +
                        "                  These Services do not address anyone under the age of 13.\n" +
                        "                  I do not knowingly collect personally\n" +
                        "                  identifiable information from children under 13 years of age. In the case\n" +
                        "                  I discover that a child under 13 has provided\n" +
                        "                  me with personal information, I immediately\n" +
                        "                  delete this from our servers. If you are a parent or guardian\n" +
                        "                  and you are aware that your child has provided us with\n" +
                        "                  personal information, please contact me so that\n" +
                        "                  I will be able to do necessary actions.\n" +
                        "                </p> <p><strong>Changes to This Privacy Policy</strong></p> <p>\n" +
                        "                  I may update our Privacy Policy from\n" +
                        "                  time to time. Thus, you are advised to review this page\n" +
                        "                  periodically for any changes. I will\n" +
                        "                  notify you of any changes by posting the new Privacy Policy on\n" +
                        "                  this page.\n" +
                        "                </p> <p>This policy is effective as of 2021-03-28</p> <p><strong>Contact Us</strong></p> <p>\n" +
                        "                  If you have any questions or suggestions about my\n" +
                        "                  Privacy Policy, do not hesitate to contact me at soomroqudoos@gmail.com.\n" +
                        "                </p>\n" +
                        "    </body>\n" +
                        "    </html>\n" +
                        "      ";
                ;
                intent.putExtra(PRIVACY_POLICY_KEY, CONTACT_US);
                getContext().startActivity(intent);
            }
        });
    }
}
