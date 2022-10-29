package com.Spelling.spellingnumbers;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class HomeActivity extends AppCompatActivity {

    private Button Onebtn;
    private Button OneHundreOnedbtn;
    private Button TwoHundreOnedbtn;
    private Button ThreeHundreOnebtn;
    private Button FourHundredonebtn;
    private Button FivHundredonebtn;
    private Button SixHundredonebtn;
    private Button SevenHundredonebtn;
    private Button EightHundredonebtn;
    private Button NineHundredonebtn;

    private TextView textView;

    private Button ShareButton;

    private AdView mAdView;
    //private InterstitialAd mInterstitialAd;
    private RewardedAd mRewardedAd = null;
    private final String TAG ="--->AdMob";

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do You Want to Exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        HomeActivity.super.onBackPressed();


                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        dialogInterface.cancel();

                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3650990573229785/3252665011");



        textView=findViewById(R.id.textView2);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
                loadRewardedAd();
            }
        });



        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);







        //InterstitialAd
       /* mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        Onebtn =findViewById(R.id.Onebtn);

        Onebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial ad wasn't ready yet.");
                }
            }
        });*/



        ShareButton = findViewById(R.id.ShareButton);
        ShareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                String shareBody = "Download this Application now :- https://play.google.com/store/apps/details?id=com.Spelling.spellingnumbers";//
                String shareSub = "Spelling Numbers";

                shareIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                shareIntent.putExtra(Intent.EXTRA_TEXT,shareBody);

                startActivity(Intent.createChooser(shareIntent,"Share Using"));

            }
        });

        Onebtn = findViewById(R.id.Onebtn);

        Onebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent categoryIntent = new Intent(HomeActivity.this,One1.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();

            }
        });



        OneHundreOnedbtn = findViewById(R.id.OneHundreOnedbtn);

        OneHundreOnedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity.this,OneHunderdOne101.class);
                startActivity(categoryIntent);
                finish();
               // showRewardedAd();

            }
        });


        TwoHundreOnedbtn = findViewById(R.id.TwoHundreOnedbtn);

        TwoHundreOnedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity.this,TwoHundred201.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();

            }
        });

        ThreeHundreOnebtn = findViewById(R.id.ThreeHundreOnebtn);

        ThreeHundreOnebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity.this,ThreeHundred301.class);
                startActivity(categoryIntent);
                finish();
                //showRewardedAd();

            }
        });
        FourHundredonebtn = findViewById(R.id.FourHundredonebtn);

        FourHundredonebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity.this,FourHundred401.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();

            }
        });
        FivHundredonebtn = findViewById(R.id.FivHundredonebtn);

        FivHundredonebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity.this,FiveHundred501.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();

            }
        });
        SixHundredonebtn = findViewById(R.id.SixHundredonebtn);

        SixHundredonebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity.this,SixHundred601.class);
                startActivity(categoryIntent);
                finish();
                //showRewardedAd();

            }
        });
        SevenHundredonebtn = findViewById(R.id.SevenHundredonebtn);

        SevenHundredonebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity.this,SevenHundred701.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();

            }
        });

        EightHundredonebtn = findViewById(R.id.EightHundredonebtn);

        EightHundredonebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity.this,EightHundred801.class);
                startActivity(categoryIntent);
                finish();
                //showRewardedAd();

            }
        });

        NineHundredonebtn = findViewById(R.id.NineHundredonebtn);

        NineHundredonebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent categoryIntent = new Intent(HomeActivity.this,NineHundred901.class);
                startActivity(categoryIntent);
                finish();
                showRewardedAd();

            }
        });
    }

    private void loadRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();

        RewardedAd.load(this, "ca-app-pub-3650990573229785/1532809992",
                adRequest, new RewardedAdLoadCallback(){
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error.
                        Log.d(TAG, loadAdError.getMessage());
                        mRewardedAd = null;
                        Log.d(TAG, "onAdFailedToLoad");
                    }

                    @Override
                    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
                        mRewardedAd = rewardedAd;
                        Log.d(TAG, "Ad is Lodaded");

                        mRewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                            @Override
                            public void onAdShowedFullScreenContent() {
                                // Called when ad is shown.
                                Log.d(TAG, "Ad was shown.");
                                mRewardedAd = null;
                            }

                            @Override
                            public void onAdFailedToShowFullScreenContent(AdError adError) {
                                // Called when ad fails to show.
                                Log.d(TAG, "Ad failed to show.");
                            }

                            @Override
                            public void onAdDismissedFullScreenContent() {
                                // Called when ad is dismissed.
                                // Don't forget to set the ad reference to null so you
                                // don't show the ad a second time.
                                Log.d(TAG, "Ad was dismissed.");
                                loadRewardedAd();
                            }
                        });
                    }
                });
    }
    private void showRewardedAd(){
        if (mRewardedAd != null) {

            mRewardedAd.show(this, new OnUserEarnedRewardListener() {
                @Override
                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                    // Handle the reward.
                    Log.d(TAG, "The user earned the reward.");
                    int rewardAmount = rewardItem.getAmount();
                    String rewardType = rewardItem.getType();

                    int reward = Integer.parseInt(textView.getText().toString().trim());

                    textView.setText(String.valueOf(reward +1));
                }
            });
        } else {
            Log.d(TAG, "The rewarded ad wasn't ready yet.");
        }
    }
}