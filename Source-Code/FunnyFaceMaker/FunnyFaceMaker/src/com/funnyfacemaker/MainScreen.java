package com.funnyfacemaker;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.plus.PlusShare;
import com.startapp.android.publish.Ad;
import com.startapp.android.publish.AdEventListener;
import com.startapp.android.publish.StartAppAd;
import com.startapp.android.publish.StartAppSDK;
import com.startapp.android.publish.nativead.NativeAdDetails;
import com.startapp.android.publish.nativead.NativeAdPreferences;
import com.startapp.android.publish.nativead.StartAppNativeAd;
import com.startapp.android.publish.nativead.NativeAdPreferences.NativeAdBitmapSize;

public class MainScreen extends Activity
{
  public static Boolean bool = Boolean.valueOf(false);
  public static Bitmap thumbnail;
  int CAMERA_PIC_REQUEST = 100;
  int SELECT_PHOTO = 200;
  int PICK_IMAGE = 1;
  Animation animation1;
  ImageView camera;
  int count;
  ImageView gallery;
  ImageView mbtn;
  ImageButton play;
  CountDownTimer timer;
  ImageView ShareButton;
  private InterstitialAd interstitial;
  private StartAppAd startAppAd = new StartAppAd(this);
  /** StartApp Native Ad declaration */
  private StartAppNativeAd startAppNativeAd = new StartAppNativeAd(this);
  private NativeAdDetails nativeAd = null;
  Uri selectedImageUri;
  /** Native Ad Callback */
  	private AdEventListener nativeAdListener = new AdEventListener() {
  		
  		@Override
  		public void onReceiveAd(Ad ad) {
  			
  			// Get the native ad
  			ArrayList<NativeAdDetails> nativeAdsList = startAppNativeAd.getNativeAds();
  			if (nativeAdsList.size() > 0){
  				nativeAd = nativeAdsList.get(0);
  			}
  			
  			// Verify that an ad was retrieved
  			if (nativeAd != null){
  				
  				// When ad is received and displayed - we MUST send impression
  				nativeAd.sendImpression(MainScreen.this);
  			}
  		}

		@Override
		public void onFailedToReceiveAd(Ad arg0) {
			// TODO Auto-generated method stub
			Log.e("MyApplication", "Error while loading Ad");
		}
  	};
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
	    if (paramInt2 != RESULT_OK)
		return;
	  //localUri = paramIntent.getData();
    if (paramInt1 == 100)
    {
        thumbnail = (Bitmap)paramIntent.getExtras().get("data");
        startActivity(new Intent(this, Imageeditor.class));
    }
    else
    {
      if (paramInt1 == 200)
      {
      	  try
          {
        	selectedImageUri = paramIntent.getData();
            thumbnail = BitmapFactory.decodeStream(getContentResolver().openInputStream(selectedImageUri));
            startActivity(new Intent(this, Imageeditor.class));
            super.onActivityResult(paramInt1, paramInt2, paramIntent);
          }
          catch (FileNotFoundException localFileNotFoundException)
          {
            localFileNotFoundException.printStackTrace();
          }
      }
    }
   }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    StartAppSDK.init(this, AppConstants.DEVELOPER_ID, AppConstants.APP_ID, true); //TODO: Replace with your IDs
    setContentView(R.layout.activity_scree);
    AdRequest adRequest = new AdRequest.Builder()
	
	// Add a test device to show Test Ads
	 .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
	 .addTestDevice("")
			.build();
 // Prepare the Interstitial Ad
    interstitial = new InterstitialAd(MainScreen.this);
 		// Insert the Ad Unit ID
 		interstitial.setAdUnitId(AppConstants.INTERTITIAL_ID);
 		
 	// Load ads into Interstitial Ads
 			interstitial.loadAd(adRequest);
 			
 			// Prepare an Interstitial Ad Listener
 			interstitial.setAdListener(new AdListener() {
 				public void onAdLoaded() {
 					// Call displayInterstitial() function
 					displayInterstitial();
 				}
 			});
 		
 		
    gallery = ((ImageView)findViewById(R.id.gallery));
    camera = ((ImageView)findViewById(R.id.camera));
    play = ((ImageButton)findViewById(R.id.Start));
    //ShareButton = (ImageView) findViewById(R.id.google);
    gallery.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent localIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
	         localIntent.setType("image/*");
	         localIntent.setAction(Intent.ACTION_GET_CONTENT);
	         startActivityForResult(localIntent, SELECT_PHOTO);
		}
	});
    camera.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
			startActivityForResult(localIntent, CAMERA_PIC_REQUEST); 
		}
	});
    /*ShareButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          // Launch the Google+ share dialog with attribution to your app.
        	isNetworkAvailable();
        }
    });*/
    startAppNativeAd.loadAd(
			new NativeAdPreferences()
				.setAdsNumber(1)
				.setAutoBitmapDownload(true)
				.setImageSize(NativeAdBitmapSize.SIZE150X150),
			nativeAdListener);
   }
 
public void displayInterstitial() {
		// If Ads are loaded, show Interstitial else show nothing.
		if (interstitial.isLoaded()) {
			interstitial.show();
		}
	}
  public void isNetworkAvailable() {
	    ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
	    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
	    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
	    	Intent shareIntent = new PlusShare.Builder(MainScreen.this)
            .setType("text/plain")
            .setText("Guru Technolabs")
            .setContentUrl(Uri.parse("http://www.gurutechnolabs.com"))
            .getIntent();
         startActivityForResult(shareIntent, 0);
	    } else {
	        Toast.makeText(getApplicationContext(), "Internet Connection Is Required", Toast.LENGTH_LONG).show();

	    }
	}
  
  public void freeAppClick(View view){
		if (nativeAd != null){
			nativeAd.sendClick(this);
		}
	}

	@Override
	public void onResume() {
		super.onResume();
		startAppAd.onResume();
	}

	@Override
	public void onPause() {
		super.onPause();
		startAppAd.onPause();
	}

  public void onBackPressed()
  {
	  displayInterstitial();
    super.onBackPressed();
  }

}