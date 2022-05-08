package com.funnyfacemaker;

import java.util.ArrayList;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.startapp.android.publish.Ad;
import com.startapp.android.publish.AdEventListener;
import com.startapp.android.publish.StartAppAd;
import com.startapp.android.publish.StartAppSDK;
import com.startapp.android.publish.nativead.NativeAdDetails;
import com.startapp.android.publish.nativead.StartAppNativeAd;

@SuppressWarnings("unused")
public class Gadgets extends Activity 
{
  ImageButton dadhi;
  Integer[] dadhiIDs;
  ImageButton ear;
  Integer[] earIDs;
  ImageButton eye;
  Integer[] eyeIDs;
  ImageButton goggles;
  Integer[] gogglesIDs;
  GridView gudgets;
  ImageButton head;
  Integer[] headIDs;
  ImageButton lips;
  Integer[] lipsIDs;
  ImageButton nose;
  Integer[] noseIDs;
  ImageButton tie;
  Integer[] tieIDs;
  ImageButton hair;
  Integer[] hairIDs;
  ImageButton cigar;
  Integer[] cigarIDs;
  ImageButton mask;
  Integer[] maskIDs;
  ImageButton horror;
  Integer[] horrorIDs;
  private static final String AD_UNIT_ID = "ca-app-pub-3940256099942544/6300978111";
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
  				nativeAd.sendImpression(Gadgets.this);
  				
  			}
  		}
		@Override
		public void onFailedToReceiveAd(Ad arg0) {
			// TODO Auto-generated method stub
			
		}
  	};
  public Gadgets()
  {
    Integer[] arrayOfInteger1 = new Integer[17];
    arrayOfInteger1[0] = Integer.valueOf(R.drawable.lips1);
    arrayOfInteger1[1] = Integer.valueOf(R.drawable.lips2);
    arrayOfInteger1[2] = Integer.valueOf(R.drawable.lips3);
    arrayOfInteger1[3] = Integer.valueOf(R.drawable.lips4);
    arrayOfInteger1[4] = Integer.valueOf(R.drawable.lips5);
    arrayOfInteger1[5] = Integer.valueOf(R.drawable.lips6);
    arrayOfInteger1[6] = Integer.valueOf(R.drawable.lips7);
    arrayOfInteger1[7] = Integer.valueOf(R.drawable.lips8);
    arrayOfInteger1[8] = Integer.valueOf(R.drawable.lips9);
    arrayOfInteger1[9] = Integer.valueOf(R.drawable.lips10);
    arrayOfInteger1[10] = Integer.valueOf(R.drawable.lips11);
    arrayOfInteger1[11] = Integer.valueOf(R.drawable.lips12);
    arrayOfInteger1[12] = Integer.valueOf(R.drawable.lips13);
    arrayOfInteger1[13] = Integer.valueOf(R.drawable.lips14);
    arrayOfInteger1[14] = Integer.valueOf(R.drawable.lips15);
    arrayOfInteger1[15] = Integer.valueOf(R.drawable.lips16);
    arrayOfInteger1[16] = Integer.valueOf(R.drawable.lips17);
    lipsIDs = arrayOfInteger1;
    
    Integer[] arrayOfInteger2 = new Integer[23];
    arrayOfInteger2[0] = Integer.valueOf(R.drawable.changer5);
    arrayOfInteger2[1] = Integer.valueOf(R.drawable.changer6);
    arrayOfInteger2[2] = Integer.valueOf(R.drawable.changer7);
    arrayOfInteger2[3] = Integer.valueOf(R.drawable.changer8);
    arrayOfInteger2[4] = Integer.valueOf(R.drawable.changer9);
    arrayOfInteger2[5] = Integer.valueOf(R.drawable.changer10);
    arrayOfInteger2[6] = Integer.valueOf(R.drawable.changer11);
    arrayOfInteger2[7] = Integer.valueOf(R.drawable.changer12);
    arrayOfInteger2[8] = Integer.valueOf(R.drawable.changer13);
    arrayOfInteger2[9] = Integer.valueOf(R.drawable.changer14);
    arrayOfInteger2[10] = Integer.valueOf(R.drawable.changer15);
    arrayOfInteger2[11] = Integer.valueOf(R.drawable.changer16);
    arrayOfInteger2[12] = Integer.valueOf(R.drawable.changer17);
    arrayOfInteger2[13] = Integer.valueOf(R.drawable.changer18);
    arrayOfInteger2[14] = Integer.valueOf(R.drawable.changer19);
    arrayOfInteger2[15] = Integer.valueOf(R.drawable.changer20);
    arrayOfInteger2[16] = Integer.valueOf(R.drawable.changer21);
    arrayOfInteger2[17] = Integer.valueOf(R.drawable.changer22);
    arrayOfInteger2[18] = Integer.valueOf(R.drawable.changer23);
    arrayOfInteger2[19] = Integer.valueOf(R.drawable.changer24);
    arrayOfInteger2[20] = Integer.valueOf(R.drawable.changer25);
    arrayOfInteger2[21] = Integer.valueOf(R.drawable.changer26);
    arrayOfInteger2[22] = Integer.valueOf(R.drawable.changer27);
    eyeIDs = arrayOfInteger2;
    
    Integer[] arrayOfInteger3 = new Integer[21];
    arrayOfInteger3[0] = Integer.valueOf(R.drawable.cap1);
    arrayOfInteger3[1] = Integer.valueOf(R.drawable.cap2);
    arrayOfInteger3[2] = Integer.valueOf(R.drawable.cap3);
    arrayOfInteger3[3] = Integer.valueOf(R.drawable.cap4);
    arrayOfInteger3[4] = Integer.valueOf(R.drawable.cap5);
    arrayOfInteger3[5] = Integer.valueOf(R.drawable.cap6);
    arrayOfInteger3[6] = Integer.valueOf(R.drawable.cap7);
    arrayOfInteger3[7] = Integer.valueOf(R.drawable.cap8);
    arrayOfInteger3[8] = Integer.valueOf(R.drawable.cap9);
    arrayOfInteger3[9] = Integer.valueOf(R.drawable.cap10);
    arrayOfInteger3[10] = Integer.valueOf(R.drawable.cap11);
    arrayOfInteger3[11] = Integer.valueOf(R.drawable.cap12);
    arrayOfInteger3[12] = Integer.valueOf(R.drawable.cap13);
    arrayOfInteger3[13] = Integer.valueOf(R.drawable.cap14);
    arrayOfInteger3[14] = Integer.valueOf(R.drawable.cap15);
    arrayOfInteger3[15] = Integer.valueOf(R.drawable.cap16);
    arrayOfInteger3[16] = Integer.valueOf(R.drawable.cap17);
    arrayOfInteger3[17] = Integer.valueOf(R.drawable.cap18);
    arrayOfInteger3[18] = Integer.valueOf(R.drawable.cap19);
    arrayOfInteger3[19] = Integer.valueOf(R.drawable.cap20);
    arrayOfInteger3[20] = Integer.valueOf(R.drawable.cap21);
    headIDs = arrayOfInteger3;
    
    Integer[] arrayOfInteger4 = new Integer[20];
    arrayOfInteger4[0] = Integer.valueOf(R.drawable.mos1);
    arrayOfInteger4[1] = Integer.valueOf(R.drawable.mos2);
    arrayOfInteger4[2] = Integer.valueOf(R.drawable.mos3);
    arrayOfInteger4[3] = Integer.valueOf(R.drawable.mos4);
    arrayOfInteger4[4] = Integer.valueOf(R.drawable.mos5);
    arrayOfInteger4[5] = Integer.valueOf(R.drawable.mos6);
    arrayOfInteger4[6] = Integer.valueOf(R.drawable.mos7);
    arrayOfInteger4[7] = Integer.valueOf(R.drawable.mos8);
    arrayOfInteger4[8] = Integer.valueOf(R.drawable.mos9);
    arrayOfInteger4[9] = Integer.valueOf(R.drawable.mos10);
    arrayOfInteger4[10] = Integer.valueOf(R.drawable.mos11);
    arrayOfInteger4[11] = Integer.valueOf(R.drawable.mos12);
    arrayOfInteger4[12] = Integer.valueOf(R.drawable.mos13);
    arrayOfInteger4[13] = Integer.valueOf(R.drawable.mos14);
    arrayOfInteger4[14] = Integer.valueOf(R.drawable.mos15);
    arrayOfInteger4[15] = Integer.valueOf(R.drawable.mos16);
    arrayOfInteger4[16] = Integer.valueOf(R.drawable.mos17);
    arrayOfInteger4[17] = Integer.valueOf(R.drawable.mos18);
    arrayOfInteger4[18] = Integer.valueOf(R.drawable.mos19);
    arrayOfInteger4[19] = Integer.valueOf(R.drawable.mos20);
    dadhiIDs = arrayOfInteger4;
    
    Integer[] arrayOfInteger5 = new Integer[16];
    arrayOfInteger5[0] = Integer.valueOf(R.drawable.goggle1);
    arrayOfInteger5[1] = Integer.valueOf(R.drawable.goggle2);
    arrayOfInteger5[2] = Integer.valueOf(R.drawable.goggle3);
    arrayOfInteger5[3] = Integer.valueOf(R.drawable.goggle4);
    arrayOfInteger5[4] = Integer.valueOf(R.drawable.goggle5);
    arrayOfInteger5[5] = Integer.valueOf(R.drawable.goggle6);
    arrayOfInteger5[6] = Integer.valueOf(R.drawable.goggle7);
    arrayOfInteger5[7] = Integer.valueOf(R.drawable.goggle8);
    arrayOfInteger5[8] = Integer.valueOf(R.drawable.goggle13);
    arrayOfInteger5[9] = Integer.valueOf(R.drawable.goggle14);
    arrayOfInteger5[10] = Integer.valueOf(R.drawable.goggle15);
    arrayOfInteger5[11] = Integer.valueOf(R.drawable.goggle16);
    arrayOfInteger5[12] = Integer.valueOf(R.drawable.goggle17);
    arrayOfInteger5[13] = Integer.valueOf(R.drawable.goggle18);
    arrayOfInteger5[14] = Integer.valueOf(R.drawable.goggle19);
    arrayOfInteger5[15] = Integer.valueOf(R.drawable.goggle20);
    gogglesIDs = arrayOfInteger5;
    
    Integer[] arrayOfInteger6 = new Integer[9];
    arrayOfInteger6[0] = Integer.valueOf(R.drawable.nose1);
    arrayOfInteger6[1] = Integer.valueOf(R.drawable.nose2);
    arrayOfInteger6[2] = Integer.valueOf(R.drawable.nose3);
    arrayOfInteger6[3] = Integer.valueOf(R.drawable.nose4);
    arrayOfInteger6[4] = Integer.valueOf(R.drawable.nose5);
    arrayOfInteger6[5] = Integer.valueOf(R.drawable.nose6);
    arrayOfInteger6[6] = Integer.valueOf(R.drawable.nose7);
    arrayOfInteger6[7] = Integer.valueOf(R.drawable.nose8);
    arrayOfInteger6[8] = Integer.valueOf(R.drawable.nose9);
    noseIDs = arrayOfInteger6;
    
    Integer[] arrayOfInteger7 = new Integer[5];
    arrayOfInteger7[0] = Integer.valueOf(R.drawable.ear1);
    arrayOfInteger7[1] = Integer.valueOf(R.drawable.ear2);
    arrayOfInteger7[2] = Integer.valueOf(R.drawable.ear3);
    arrayOfInteger7[3] = Integer.valueOf(R.drawable.ear4);
    arrayOfInteger7[4] = Integer.valueOf(R.drawable.ear5);
    earIDs = arrayOfInteger7;
    
    Integer[] arrayOfInteger8 = new Integer[13];
    arrayOfInteger8[0] = Integer.valueOf(R.drawable.tie1);
    arrayOfInteger8[1] = Integer.valueOf(R.drawable.tie2);
    arrayOfInteger8[2] = Integer.valueOf(R.drawable.tie3);
    arrayOfInteger8[3] = Integer.valueOf(R.drawable.tie4);
    arrayOfInteger8[4] = Integer.valueOf(R.drawable.tie5);
    arrayOfInteger8[5] = Integer.valueOf(R.drawable.tie6);
    arrayOfInteger8[6] = Integer.valueOf(R.drawable.tie10);
    arrayOfInteger8[7] = Integer.valueOf(R.drawable.tie11);
    arrayOfInteger8[8] = Integer.valueOf(R.drawable.tie12);
    arrayOfInteger8[9] = Integer.valueOf(R.drawable.tie14);
    arrayOfInteger8[10] = Integer.valueOf(R.drawable.tie15);
    arrayOfInteger8[11] = Integer.valueOf(R.drawable.tie16);
    arrayOfInteger8[12] = Integer.valueOf(R.drawable.tie17);
    tieIDs = arrayOfInteger8;
    
    Integer[] arrayOfInteger9 = new Integer[17];
    arrayOfInteger9[0] = Integer.valueOf(R.drawable.hair1);
    arrayOfInteger9[1] = Integer.valueOf(R.drawable.hair2);
    arrayOfInteger9[2] = Integer.valueOf(R.drawable.hair3);
    arrayOfInteger9[3] = Integer.valueOf(R.drawable.hair4);
    arrayOfInteger9[4] = Integer.valueOf(R.drawable.hair5);
    arrayOfInteger9[5] = Integer.valueOf(R.drawable.hair6);
    arrayOfInteger9[6] = Integer.valueOf(R.drawable.hair7);
    arrayOfInteger9[7] = Integer.valueOf(R.drawable.hair8);
    arrayOfInteger9[8] = Integer.valueOf(R.drawable.hair9);
    arrayOfInteger9[9] = Integer.valueOf(R.drawable.hair10);
    arrayOfInteger9[10] = Integer.valueOf(R.drawable.hair11);
    arrayOfInteger9[11] = Integer.valueOf(R.drawable.hair12);
    arrayOfInteger9[12] = Integer.valueOf(R.drawable.hair13);
    arrayOfInteger9[13] = Integer.valueOf(R.drawable.hair14);
    arrayOfInteger9[14] = Integer.valueOf(R.drawable.hair15);
    arrayOfInteger9[15] = Integer.valueOf(R.drawable.hair16);
    arrayOfInteger9[16] = Integer.valueOf(R.drawable.hair17);
    hairIDs = arrayOfInteger9;
    
    Integer[] arrayOfInteger10 = new Integer[10];
    arrayOfInteger10[0] = Integer.valueOf(R.drawable.mask23);
    arrayOfInteger10[1] = Integer.valueOf(R.drawable.mask14);
    arrayOfInteger10[2] = Integer.valueOf(R.drawable.mask15);
    arrayOfInteger10[3] = Integer.valueOf(R.drawable.mask16);
    arrayOfInteger10[4] = Integer.valueOf(R.drawable.mask17);
    arrayOfInteger10[5] = Integer.valueOf(R.drawable.mask18);
    arrayOfInteger10[6] = Integer.valueOf(R.drawable.mask19);
    arrayOfInteger10[7] = Integer.valueOf(R.drawable.mask20);
    arrayOfInteger10[8] = Integer.valueOf(R.drawable.mask21);
    arrayOfInteger10[9] = Integer.valueOf(R.drawable.mask22);
    maskIDs = arrayOfInteger10;
    
    Integer[] arrayOfInteger11 = new Integer[3];
    arrayOfInteger11[0] = Integer.valueOf(R.drawable.cigar4);
    arrayOfInteger11[1] = Integer.valueOf(R.drawable.cigar5);
    arrayOfInteger11[2] = Integer.valueOf(R.drawable.cigar6);
    cigarIDs = arrayOfInteger11;
    
    Integer[] arrayOfInteger12 = new Integer[14];
    arrayOfInteger12[0] = Integer.valueOf(R.drawable.horror1);
    arrayOfInteger12[1] = Integer.valueOf(R.drawable.horror2);
    arrayOfInteger12[2] = Integer.valueOf(R.drawable.horror3);
    arrayOfInteger12[3] = Integer.valueOf(R.drawable.horror4);
    arrayOfInteger12[4] = Integer.valueOf(R.drawable.horror5);
    arrayOfInteger12[5] = Integer.valueOf(R.drawable.horror6);
    arrayOfInteger12[6] = Integer.valueOf(R.drawable.horror7);
    arrayOfInteger12[7] = Integer.valueOf(R.drawable.horror8);
    arrayOfInteger12[8] = Integer.valueOf(R.drawable.horror9);
    arrayOfInteger12[9] = Integer.valueOf(R.drawable.horror10);
    arrayOfInteger12[10] = Integer.valueOf(R.drawable.horror11);
    arrayOfInteger12[11] = Integer.valueOf(R.drawable.horror12);
    arrayOfInteger12[12] = Integer.valueOf(R.drawable.horror13);
    arrayOfInteger12[13] = Integer.valueOf(R.drawable.horror14);
    horrorIDs = arrayOfInteger12;
  }

  private void function1()
  {
    gudgets = ((GridView)findViewById(R.id.gridgudgets));
    gudgets.setAdapter(new lipAdapter(this));
    gudgets.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(@SuppressWarnings("rawtypes") AdapterView paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("wall_id", BitmapFactory.decodeResource(getResources(), lipsIDs[paramAnonymousInt].intValue()));
        localIntent.putExtra("index1", 1);
        setResult(-1, localIntent);
        finish();
      }
    });
  }

  private void function2()
  {
    gudgets = ((GridView)findViewById(R.id.gridgudgets));
    gudgets.setAdapter(new eyeAdapter(this));
    gudgets.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(@SuppressWarnings("rawtypes") AdapterView paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("wall_id", BitmapFactory.decodeResource(getResources(), eyeIDs[paramAnonymousInt].intValue()));
        localIntent.putExtra("index1", 2);
        setResult(-1, localIntent);
        finish();
      }
    });
  }

  private void function3()
  {
   gudgets = ((GridView)findViewById(R.id.gridgudgets));
    gudgets.setAdapter(new headAdapter(this));
    gudgets.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("wall_id", BitmapFactory.decodeResource(getResources(), headIDs[paramAnonymousInt].intValue()));
        localIntent.putExtra("index1", 3);
        setResult(-1, localIntent);
        finish();
      }
    });
  }

  private void function4()
  {
    gudgets = ((GridView)findViewById(R.id.gridgudgets));
    gudgets.setAdapter(new dadhiAdapter(this));
    gudgets.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("wall_id", BitmapFactory.decodeResource(getResources(), dadhiIDs[paramAnonymousInt].intValue()));
        localIntent.putExtra("index1", 4);
        setResult(-1, localIntent);
        finish();
      }
    });
  }

  private void function5()
  {
    gudgets = ((GridView)findViewById(R.id.gridgudgets));
    gudgets.setAdapter(new gogglesAdapter(this));
    gudgets.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("wall_id", BitmapFactory.decodeResource(getResources(), gogglesIDs[paramAnonymousInt].intValue()));
        localIntent.putExtra("index1", 5);
        setResult(-1, localIntent);
        finish();
      }
    });
  }

  private void function6()
  {
    gudgets = ((GridView)findViewById(R.id.gridgudgets));
    gudgets.setAdapter(new noseAdapter(this));
    gudgets.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(@SuppressWarnings("rawtypes") AdapterView paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("wall_id", BitmapFactory.decodeResource(getResources(), noseIDs[paramAnonymousInt].intValue()));
        localIntent.putExtra("index1", 6);
        setResult(-1, localIntent);
        finish();
      }
    });
  }

  private void function7()
  {
    gudgets = ((GridView)findViewById(R.id.gridgudgets));
    gudgets.setAdapter(new earAdapter(this));
    gudgets.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("wall_id", BitmapFactory.decodeResource(getResources(), earIDs[paramAnonymousInt].intValue()));
        localIntent.putExtra("index1", 7);
        setResult(-1, localIntent);
        finish();
      }
    });
  }

  private void function8()
  {
    gudgets = ((GridView)findViewById(R.id.gridgudgets));
    gudgets.setAdapter(new tieAdapter(this));
    gudgets.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("wall_id", BitmapFactory.decodeResource(getResources(), tieIDs[paramAnonymousInt].intValue()));
        localIntent.putExtra("index1", 8);
        setResult(-1, localIntent);
        finish();
      }
    });
  }
  
    private void function9()
    {
      gudgets = ((GridView)findViewById(R.id.gridgudgets));
      gudgets.setAdapter(new hairAdapter(this));
      gudgets.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public void onItemClick(AdapterView paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("wall_id", BitmapFactory.decodeResource(getResources(), hairIDs[paramAnonymousInt].intValue()));
          localIntent.putExtra("index1", 9);
          setResult(-1, localIntent);
          finish();
        }
      });
    }
    
      private void function10()
      {
        gudgets = ((GridView)findViewById(R.id.gridgudgets));
        gudgets.setAdapter(new cigarAdapter(this));
        gudgets.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
          public void onItemClick(AdapterView paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            Intent localIntent = new Intent();
            localIntent.putExtra("wall_id", BitmapFactory.decodeResource(getResources(), cigarIDs[paramAnonymousInt].intValue()));
            localIntent.putExtra("index1", 10);
            setResult(-1, localIntent);
            finish();
          }
        });
      }
      
        private void function11()
        {
          gudgets = ((GridView)findViewById(R.id.gridgudgets));
          gudgets.setAdapter(new maskAdapter(this));
          gudgets.setOnItemClickListener(new AdapterView.OnItemClickListener()
          {
            public void onItemClick(AdapterView paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
            {
              Intent localIntent = new Intent();
              localIntent.putExtra("wall_id", BitmapFactory.decodeResource(getResources(), maskIDs[paramAnonymousInt].intValue()));
              localIntent.putExtra("index1", 11);
              setResult(-1, localIntent);
              finish();
            }
          });
        }
        
          private void function12()
          {
            gudgets = ((GridView)findViewById(R.id.gridgudgets));
            gudgets.setAdapter(new horrorAdapter(this));
            gudgets.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
              public void onItemClick(AdapterView paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
              {
                Intent localIntent = new Intent();
                localIntent.putExtra("wall_id", BitmapFactory.decodeResource(getResources(), horrorIDs[paramAnonymousInt].intValue()));
                localIntent.putExtra("index1", 12);
                setResult(-1, localIntent);
                finish();
              }
            });
           
  }

  protected void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    StartAppSDK.init(this, AppConstants.DEVELOPER_ID, AppConstants.APP_ID, true); //TODO: Replace with your IDs
    setContentView(R.layout.gadgets);
    gudgets = ((GridView)findViewById(R.id.gridgudgets));
    lips = ((ImageButton)findViewById(R.id.Glips));
    eye = ((ImageButton)findViewById(R.id.geye));
    head = ((ImageButton)findViewById(R.id.Ghead));
    dadhi = ((ImageButton)findViewById(R.id.Gdadhi));
    goggles = ((ImageButton)findViewById(R.id.Ggoggles));
    nose = ((ImageButton)findViewById(R.id.Gnose));
    ear = ((ImageButton)findViewById(R.id.Gear));
    tie = ((ImageButton)findViewById(R.id.Gtie));
    hair = ((ImageButton)findViewById(R.id.Ghair));
    cigar = ((ImageButton)findViewById(R.id.Gcigar));
    mask = ((ImageButton)findViewById(R.id.Gmask));
    horror = ((ImageButton)findViewById(R.id.Ghorror));
    lips.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			function1();
		}
	}); 
    eye.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			function2();
		}
	});
    head.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			function3();
		}
	});
    dadhi.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			function4();
		}
	});
    goggles.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			function5();
		}
	});
    nose.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			function6();
		}
	});
    ear.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			function7();
		}
	});
    tie.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			function8();
		}
	});
    hair.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			function9();
		}
	});
    cigar.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			function10();
		}
	});
    mask.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			function11();
		}
    });
    horror.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			function12();
		}
    });
  }
  @Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		startAppAd.onResume();
		int i = getIntent().getExtras().getInt("index");
		switch(i)
		{
		case 1:
		      function1();
		      break;
		case 2: 
		      function2();
		      break;
		case 3:
		      function3();
		      break;
		case 4:
			function4();
			break;
		case 5:
			function5();
			break;
		case 6:
			function6();
			break;
		case 7:
			function7();
			break;
		case 8:
			function8();
			break;
		case 9:
			function9();
			break;
		case 10:
			function10();
			break;
		case 11:
			function11();
			break;
		case 12:
			function12();
			break;
	  }
	}
  
  class dadhiAdapter extends BaseAdapter
  {
    Context context;

    public dadhiAdapter(Context arg2)
    {
      context = arg2;
    }

    public int getCount()
    {
      return dadhiIDs.length;
    }

    public Object getItem(int paramInt)
    {
      return Integer.valueOf(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return dadhiIDs[paramInt].intValue();
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
      if (paramView == null);
      for (View localView = localLayoutInflater.inflate(R.layout.row, null); ; localView = paramView)
      {
        ImageView localImageView = (ImageView)localView.findViewById(R.id.imagerow);
        localImageView.setImageResource(dadhiIDs[paramInt].intValue());
        localImageView.setBackgroundResource(R.drawable.border);
        return localView;
      }
    }
  }
  
  class hairAdapter extends BaseAdapter
  {
    Context context;

    public hairAdapter(Context arg2)
    {
      context = arg2;
    }

    public int getCount()
    {
      return hairIDs.length;
    }

    public Object getItem(int paramInt)
    {
      return Integer.valueOf(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return hairIDs[paramInt].intValue();
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
      if (paramView == null);
      for (View localView = localLayoutInflater.inflate(R.layout.row, null); ; localView = paramView)
      {
        ImageView localImageView = (ImageView)localView.findViewById(R.id.imagerow);
        localImageView.setImageResource(hairIDs[paramInt].intValue());
        localImageView.setBackgroundResource(R.drawable.border);
        return localView;
      }
    }
  }
  
  class cigarAdapter extends BaseAdapter
  {
    Context context;

    public cigarAdapter(Context arg2)
    {
      context = arg2;
    }

    public int getCount()
    {
      return cigarIDs.length;
    }

    public Object getItem(int paramInt)
    {
      return Integer.valueOf(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return cigarIDs[paramInt].intValue();
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
      if (paramView == null);
      for (View localView = localLayoutInflater.inflate(R.layout.row, null); ; localView = paramView)
      {
        ImageView localImageView = (ImageView)localView.findViewById(R.id.imagerow);
        localImageView.setImageResource(cigarIDs[paramInt].intValue());
        localImageView.setBackgroundResource(R.drawable.border);
        return localView;
      }
    }
  }

  class earAdapter extends BaseAdapter
  {
    Context context;

    public earAdapter(Context arg2)
    {
      context = arg2;
    }

    public int getCount()
    {
      return earIDs.length;
    }

    public Object getItem(int paramInt)
    {
      return Integer.valueOf(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return earIDs[paramInt].intValue();
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
      if (paramView == null);
      for (View localView = localLayoutInflater.inflate(R.layout.row, null); ; localView = paramView)
      {
        ImageView localImageView = (ImageView)localView.findViewById(R.id.imagerow);
        localImageView.setImageResource(earIDs[paramInt].intValue());
        localImageView.setBackgroundResource(R.drawable.border);
        return localView;
      }
    }
  }

  class eyeAdapter extends BaseAdapter
  {
    Context context;

    public eyeAdapter(Context arg2)
    {
      context = arg2;
    }

    public int getCount()
    {
      return eyeIDs.length;
    }

    public Object getItem(int paramInt)
    {
      return Integer.valueOf(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return eyeIDs[paramInt].intValue();
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
      if (paramView == null);
      for (View localView = localLayoutInflater.inflate(R.layout.row, null); ; localView = paramView)
      {
        ImageView localImageView = (ImageView)localView.findViewById(R.id.imagerow);
        localImageView.setImageResource(eyeIDs[paramInt].intValue());
        localImageView.setBackgroundResource(R.drawable.border);
        return localView;
      }
    }
  }

  class gogglesAdapter extends BaseAdapter
  {
    Context context;

    public gogglesAdapter(Context arg2)
    {
      context = arg2;
    }

    public int getCount()
    {
      return gogglesIDs.length;
    }

    public Object getItem(int paramInt)
    {
      return Integer.valueOf(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return gogglesIDs[paramInt].intValue();
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
      if (paramView == null);
      for (View localView = localLayoutInflater.inflate(R.layout.row, null); ; localView = paramView)
      {
        ImageView localImageView = (ImageView)localView.findViewById(R.id.imagerow);
        localImageView.setImageResource(gogglesIDs[paramInt].intValue());
        localImageView.setBackgroundResource(R.drawable.border);
        return localView;
      }
    }
  }

  class maskAdapter extends BaseAdapter
  {
    Context context;

    public maskAdapter(Context arg2)
    {
      context = arg2;
    }

    public int getCount()
    {
      return maskIDs.length;
    }

    public Object getItem(int paramInt)
    {
      return Integer.valueOf(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return maskIDs[paramInt].intValue();
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
      if (paramView == null);
      for (View localView = localLayoutInflater.inflate(R.layout.row, null); ; localView = paramView)
      {
        ImageView localImageView = (ImageView)localView.findViewById(R.id.imagerow);
        localImageView.setImageResource(maskIDs[paramInt].intValue());
        localImageView.setBackgroundResource(R.drawable.border);
        return localView;
      }
    }
  }
  
  class headAdapter extends BaseAdapter
  {
    Context context;

    public headAdapter(Context arg2)
    {
     context = arg2;
    }

    public int getCount()
    {
      return headIDs.length;
    }

    public Object getItem(int paramInt)
    {
      return Integer.valueOf(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return headIDs[paramInt].intValue();
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
      if (paramView == null);
      for (View localView = localLayoutInflater.inflate(R.layout.row, null); ; localView = paramView)
      {
        ImageView localImageView = (ImageView)localView.findViewById(R.id.imagerow);
        localImageView.setImageResource(headIDs[paramInt].intValue());
        localImageView.setBackgroundResource(R.drawable.border);
        return localView;
      }
    }
  }

  class horrorAdapter extends BaseAdapter
  {
    Context context;

    public horrorAdapter(Context arg2)
    {
      context = arg2;
    }

    public int getCount()
    {
      return horrorIDs.length;
    }

    public Object getItem(int paramInt)
    {
      return Integer.valueOf(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return horrorIDs[paramInt].intValue();
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
      if (paramView == null);
      for (View localView = localLayoutInflater.inflate(R.layout.row, null); ; localView = paramView)
      {
        ImageView localImageView = (ImageView)localView.findViewById(R.id.imagerow);
        localImageView.setImageResource(horrorIDs[paramInt].intValue());
        localImageView.setBackgroundResource(R.drawable.border);
        return localView;
      }
    }
  }
  
  class lipAdapter extends BaseAdapter
  {
    Context context;

    public lipAdapter(Context arg2)
    {
      context = arg2;
    }

    public int getCount()
    {
      return lipsIDs.length;
    }

    public Object getItem(int paramInt)
    {
      return Integer.valueOf(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return lipsIDs[paramInt].intValue();
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
      if (paramView == null);
      for (View localView = localLayoutInflater.inflate(R.layout.row, null); ;localView=paramView)
      {
    	  
        ImageView localImageView = (ImageView)localView.findViewById(R.id.imagerow);
        localImageView.setImageResource(Gadgets.this.lipsIDs[paramInt].intValue());
        localImageView.setBackgroundResource(R.drawable.border);
        return localView;
      }
    }
  }

  class noseAdapter extends BaseAdapter
  {
    Context context;

    public noseAdapter(Context arg2)
    {
      context = arg2;
    }

    public int getCount()
    {
      return noseIDs.length;
    }

    public Object getItem(int paramInt)
    {
      return Integer.valueOf(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return noseIDs[paramInt].intValue();
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
      if (paramView == null);
      for (View localView = localLayoutInflater.inflate(R.layout.row, null); ; localView = paramView)
      {
        ImageView localImageView = (ImageView)localView.findViewById(R.id.imagerow);
        localImageView.setImageResource(noseIDs[paramInt].intValue());
        localImageView.setBackgroundResource(R.drawable.border);
        return localView;
      }
    }
  }
  
	/**
	 * Part of the activity's life cycle, StartAppAd should be integrated here
	 * for the home button exit ad integration.
	 */
	@Override
	public void onPause() {
		super.onPause();
		startAppAd.onPause();
	}

	/**
	 * Part of the activity's life cycle, StartAppAd should be integrated here
	 * for the back button exit ad integration.
	 */
	@Override
	public void onBackPressed() {
		startAppAd.onBackPressed();
		super.onBackPressed();
	}
  class tieAdapter extends BaseAdapter
  {
    Context context;

    public tieAdapter(Context arg2)
    {
      context = arg2;
    }

    public int getCount()
    {
      return tieIDs.length;
    }

    public Object getItem(int paramInt)
    {
      return Integer.valueOf(paramInt);
    }

    public long getItemId(int paramInt)
    {
      return tieIDs[paramInt].intValue();
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
      if (paramView == null);
      for (View localView = localLayoutInflater.inflate(R.layout.row, null); ; localView = paramView)
      {
        ImageView localImageView = (ImageView)localView.findViewById(R.id.imagerow);
        localImageView.setImageResource(tieIDs[paramInt].intValue());
        localImageView.setBackgroundResource(R.drawable.border);
        return localView;
      }
    }
  }
}
