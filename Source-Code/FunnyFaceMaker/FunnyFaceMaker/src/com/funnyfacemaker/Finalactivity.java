package com.funnyfacemaker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.startapp.android.publish.Ad;
import com.startapp.android.publish.AdEventListener;
import com.startapp.android.publish.StartAppAd;
import com.startapp.android.publish.StartAppSDK;
import com.startapp.android.publish.nativead.NativeAdDetails;
import com.startapp.android.publish.nativead.NativeAdPreferences;
import com.startapp.android.publish.nativead.StartAppNativeAd;
import com.startapp.android.publish.nativead.NativeAdPreferences.NativeAdBitmapSize;

public class Finalactivity extends Activity
  implements View.OnClickListener
{
  ImageButton back;
  Bitmap bmp;
  boolean btn1 = true;
  RelativeLayout btnlayout;
  int count;
  String fileName;
  RelativeLayout fulllayout;
  ImageView img;
  ImageView mbtn;
  File root = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), "/FunnyFaceMaker"); 
  ImageButton save;
  ImageButton share;
  private StartAppAd startAppAd = new StartAppAd(this);
	
  /** StartApp Native Ad declaration */
  private StartAppNativeAd startAppNativeAd = new StartAppNativeAd(this);
  private NativeAdDetails nativeAd = null;

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
  				nativeAd.sendImpression(Finalactivity.this);
  				
  			}
  		}
		@Override
		public void onFailedToReceiveAd(Ad arg0) {
			// TODO Auto-generated method stub
			
		}
  	};
  public void onBackPressed()
  {
    try
    {
      super.onBackPressed();
      startAppAd.onBackPressed();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        finish();
    }
  }

  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    case 0:
    default:
    case 1:
    }
  }

  protected void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    StartAppSDK.init(this, AppConstants.DEVELOPER_ID, AppConstants.APP_ID, true); //TODO: Replace with your IDs
    setContentView(R.layout.done);
    root.mkdir();
    mbtn = ((ImageView)findViewById(R.id.mmmbtn2));
    btnlayout = ((RelativeLayout)findViewById(R.id.btnlayout));
    fulllayout = ((RelativeLayout)findViewById(R.id.laout));
    save = ((ImageButton)findViewById(R.id.bsave));
    share = ((ImageButton)findViewById(R.id.bshare));
    back = ((ImageButton)findViewById(R.id.backbtn));
    img = ((ImageView)findViewById(R.id.fimage));
    bmp = Imageeditor.fbitmap;
    img.setImageBitmap(bmp);
    startAppNativeAd.loadAd(
			new NativeAdPreferences()
				.setAdsNumber(1)
				.setAutoBitmapDownload(true)
				.setImageSize(NativeAdBitmapSize.SIZE150X150),
			nativeAdListener);
    save.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			btn1 = true;
			save();
		}
	});
    share.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			btn1 = false;
			save();
			share();
		}
	});
    back.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			finish();
		}
	});
  }

  public void save()
  {
    btnlayout.setVisibility(4);
    fulllayout.setDrawingCacheEnabled(true);
    fulllayout.buildDrawingCache();
    Bitmap localBitmap = fulllayout.getDrawingCache();
    Calendar localCalendar = Calendar.getInstance();
    fileName = new SimpleDateFormat("yyyyMMddhhmmss").format(localCalendar.getTime());
    try
    {
      FileOutputStream inout = new FileOutputStream(new File(root.getAbsolutePath(), fileName + ".jpg"));
      localBitmap.compress(Bitmap.CompressFormat.JPEG, 90, inout);
      inout.flush();
      inout.close();
      if (btn1)
        Toast.makeText(getApplicationContext(), "Image Saved Successfully", 0).show();
      btnlayout.setVisibility(0);
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
      {
        localFileNotFoundException.printStackTrace();
        Toast.makeText(getApplicationContext(), "Image not saved", 2000).show();
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        localIOException.printStackTrace();
        Toast.makeText(getApplicationContext(), "Image not saved", 2000).show();
      }
    }
  }
  public void share()
  {
	  Intent localIntent = new Intent("android.intent.action.SEND");
      localIntent.setType("image/jpg");
      localIntent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(root, fileName + ".jpg")));
      String[] arrayOfString = new String[1];
      arrayOfString[0] = "";
      localIntent.putExtra("android.intent.extra.EMAIL", arrayOfString);
      localIntent.putExtra("android.intent.extra.SUBJECT", "See This Cool Android App");
      localIntent.putExtra("android.intent.extra.TEXT", "Hi,\n I found this really cool app on android market Funny Photo Maker. https://play.google.com/store/apps/details?id=change.look.facechanger2");
      startActivity(Intent.createChooser(localIntent, "Share Via"));
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

}
