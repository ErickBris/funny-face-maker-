package com.funnyfacemaker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.Toast;
import change.look.face.DragController;
import change.look.face.DragLayer;
import change.look.face.MyAbsoluteLayout;

import com.startapp.android.publish.StartAppAd;
import com.startapp.android.publish.nativead.NativeAdDetails;

public class Imageeditor extends Activity implements View.OnTouchListener,View.OnClickListener
 //, OnSeekBarChangeListener 
{
  public static final boolean Debugging = true;
  int del_id = 0;
  int k,j;
  int id;
  public static DragLayer[] draglayer = new DragLayer[25];
  static Bitmap fbitmap;
  ImageButton Delete;
  ImageButton Done;
  int a;
  ImageButton dadhi;
  RelativeLayout draglout;
  ImageButton ear;
  ImageButton eye;
  ImageView frame;
  ImageView gadgetsimag;
  ImageButton goggles;
  ImageButton head;
  ImageButton hair;
  ImageButton cigar;
  ImageButton mask;
  ImageButton horror;
  int i = 1;
  int index;
  ImageButton lips;
  private DragController mDragController;
  private DragLayer mDragLayer;
  Context mcontext;
  ImageButton nose;
  ImageButton tie;
  ImageButton zoomin;
  ImageButton zoomout;
  Bitmap bitmap;
  ImageView m1,m2,m3;//new
 
  Matrix matrix = new Matrix();
  Matrix savedMatrix = new Matrix();
  // we can be in one of these 3 states
  private static final int NONE = 0;
  private static final int DRAG = 1;
  private static final int ZOOM = 2;
  private int mode = NONE;
  // remember some things for zooming
  private PointF start = new PointF();
  private PointF mid = new PointF();
  private float oldDist = 1f;
  private float d = 0f;
  private float newRot = 0f;
  private float[] lastEvent = null;
  private StartAppAd startAppAd = new StartAppAd(this);
	
  private NativeAdDetails nativeAd = null;

  public void gatedata(Intent paramIntent)
  {
	ImageView localImageView = new ImageView(this);
	localImageView.setImageBitmap((Bitmap)paramIntent.getExtras().get("wall_id"));
    mDragLayer.addView(localImageView);
	localImageView.setId(i);
	i = (1 + i);
    localImageView.setOnTouchListener(this);
}
protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramInt2 == -1))
    {
      index = paramIntent.getIntExtra("index1", 0);
      if (index == 1)
        gatedata(paramIntent);
      if (index == 2)
        gatedata(paramIntent);
      if (index == 3)
        gatedata(paramIntent);
      if (index == 4)
        gatedata(paramIntent);
      if (index == 5)
        gatedata(paramIntent);
      if (index == 6)
        gatedata(paramIntent);
      if (index == 7)
        gatedata(paramIntent);
      if (index == 8)
        gatedata(paramIntent);
      if (index == 9)
        gatedata(paramIntent);
      if (index == 10)
        gatedata(paramIntent);
      if (index == 11)
        gatedata(paramIntent);
      if (index == 12)
        gatedata(paramIntent);
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

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

  protected void onCreate(Bundle paramBundle)
  {
	requestWindowFeature(1);
    super.onCreate(paramBundle);
    //StartAppSDK.init(this, AppConstants.DEVELOPER_ID, AppConstants.APP_ID, true); //TODO: Replace with your IDs
    setContentView(R.layout.editor);
    //Effects.getInstance().init(this);
    mDragController = new DragController(this);
    DragController localDragController = mDragController;
    mDragLayer = ((DragLayer)findViewById(R.id.drag_layer));
    mDragLayer.setDragController(localDragController);
    frame = ((ImageView)findViewById(R.id.frame));
    localDragController.addDropTarget(mDragLayer);
    lips = ((ImageButton)findViewById(R.id.Glips));
    draglout = ((RelativeLayout)findViewById(R.id.draglayout));
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
    Done = ((ImageButton)findViewById(R.id.done));
    Delete = ((ImageButton)findViewById(R.id.delete));
    Delete.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			j = del_id;
			//Toast.makeText(getApplicationContext(), "Delete", 2000).show();
		      try
		      {
		        ImageView localImageView = (ImageView)findViewById(j);
		        mDragLayer.removeView(localImageView);
		       // Toast.makeText(getApplicationContext(), "Delete", 2000).show();
		      }
		      catch (NullPointerException localNullPointerException1)
		      {
		        Toast.makeText(getApplicationContext(), "Please Select item to delete", Toast.LENGTH_SHORT).show();
		      }
		}
	});
    lips.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			Intent localIntent9 = new Intent(getApplicationContext(), Gadgets.class);
	        localIntent9.putExtra("index", 1);
	        startActivityForResult(localIntent9,1);
	        
		}
	});
    eye.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			Intent localIntent8 = new Intent(getApplicationContext(), Gadgets.class);
	        localIntent8.putExtra("index", 2);
	        startActivityForResult(localIntent8,1);
		}
	});
    head.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			Intent localIntent7 = new Intent(getApplicationContext(), Gadgets.class);
	        localIntent7.putExtra("index", 3);
	        startActivityForResult(localIntent7, 1);
		}
	});
    dadhi.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			Intent localIntent6 = new Intent(getApplicationContext(), Gadgets.class);
		      localIntent6.putExtra("index", 4);
		      startActivityForResult(localIntent6, 1);
		}
	});
    goggles.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			Intent localIntent5 = new Intent(getApplicationContext(), Gadgets.class);
		      localIntent5.putExtra("index", 5);
		      startActivityForResult(localIntent5, 1);
		}
	});
    nose.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			Intent localIntent4 = new Intent(getApplicationContext(), Gadgets.class);
		      localIntent4.putExtra("index", 6);
		      startActivityForResult(localIntent4, 1);
		}
	});
    ear.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			Intent localIntent3 = new Intent(getApplicationContext(), Gadgets.class);
		      localIntent3.putExtra("index", 7);
		      startActivityForResult(localIntent3, 1);
		}
	});
    tie.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			Intent localIntent2 = new Intent(getApplicationContext(), Gadgets.class);
		      localIntent2.putExtra("index", 8);
		      startActivityForResult(localIntent2, 1);
		}
	});
    hair.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			Intent localIntent10 = new Intent(getApplicationContext(), Gadgets.class);
		      localIntent10.putExtra("index", 9);
		      startActivityForResult(localIntent10, 1);
		}
	});
    cigar.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			Intent localIntent11 = new Intent(getApplicationContext(), Gadgets.class);
		      localIntent11.putExtra("index", 10);
		      startActivityForResult(localIntent11, 1);
		}
	});
    mask.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			Intent localIntent12 = new Intent(getApplicationContext(), Gadgets.class);
		      localIntent12.putExtra("index", 11);
		      startActivityForResult(localIntent12, 1);
		}
	});
    horror.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			Intent localIntent13 = new Intent(getApplicationContext(), Gadgets.class);
		      localIntent13.putExtra("index", 12);
		      startActivityForResult(localIntent13, 1);
		}
	});
    Done.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Effects.getInstance().playSound(Effects.SOUND_1);
			Intent localIntent1 = new Intent(getApplicationContext(), Finalactivity.class);
		      draglout.setDrawingCacheEnabled(true);
		      draglout.buildDrawingCache(true);
		      fbitmap = Bitmap.createBitmap(draglout.getDrawingCache());
		      draglout.setDrawingCacheEnabled(false);
		      startActivity(localIntent1);
		}
	});
	
	@SuppressWarnings("deprecation")
	BitmapDrawable localBitmapDrawable = new BitmapDrawable(MainScreen.thumbnail);
    frame.setImageDrawable(localBitmapDrawable);
  }
  public void onClick(View paramView)
  {
	  switch (paramView.getId())
	    {
	    case 1:
	    case 2:
	    }
  }
  
@Override
public boolean onTouch(View v, MotionEvent event) 
{
	//Effects.getInstance().playSound(Effects.SOUND_1);
		  del_id = v.getId();
		  v.bringToFront();
		  //Toast.makeText(getApplicationContext(), "Click"+v.getId(), 700).show();
		  ImageView localImageView = (ImageView) v;
		  MyAbsoluteLayout.LayoutParams localLayoutParams1 =  (MyAbsoluteLayout.LayoutParams)v.getLayoutParams();
		  //localImageView.setBackgroundColor(Color.TRANSPARENT);
		  localImageView.setLayoutParams(localLayoutParams1);
		  localImageView.setScaleType(ScaleType.MATRIX);
		  mDragLayer.updateViewLayout(localImageView, localLayoutParams1);
		
				/*if(v.getId() == del_id)
				{*/
					switch (event.getAction() & MotionEvent.ACTION_MASK) {
					case MotionEvent.ACTION_DOWN:
						savedMatrix.set(matrix);
						start.set(event.getX(), event.getY());
						mode = DRAG;
						lastEvent = null;
						break;
					case MotionEvent.ACTION_POINTER_DOWN:
						oldDist = spacing(event);
						if (oldDist > 10f) {
							savedMatrix.set(matrix);
							midPoint(mid, event);
							mode = ZOOM;
						}
						lastEvent = new float[4];
						lastEvent[0] = event.getX(0);
						lastEvent[1] = event.getX(1);
						lastEvent[2] = event.getY(0);
						lastEvent[3] = event.getY(1);
						d = rotation(event);
						break;
					case MotionEvent.ACTION_UP:
					case MotionEvent.ACTION_POINTER_UP:
						mode = NONE;
						lastEvent = null;
						break;
					case MotionEvent.ACTION_MOVE:
						if (mode == DRAG) {
							matrix.set(savedMatrix);
							float dx = event.getX() - start.x;
							float dy = event.getY() - start.y;
							matrix.postTranslate(dx, dy);
						} else if (mode == ZOOM) {
							float newDist = spacing(event);
							if (newDist > 10f) {
								matrix.set(savedMatrix);
								float scale = (newDist / oldDist);
								matrix.postScale(scale, scale, mid.x, mid.y);

							}
							if (lastEvent != null && event.getPointerCount() == 2) {
								newRot = rotation(event);
								// matrix.postRotate(70);

								float r = newRot - d;
								float[] values = new float[9];
								matrix.getValues(values);
								matrix.postRotate(r, v.getMeasuredWidth() / 2,
										v.getMeasuredHeight() / 2);
								}
						}
				break;
			}
					localLayoutParams1.height= -1;
					  localLayoutParams1.width = -1;
				localImageView.setImageMatrix(matrix);
				return true;
}
/**
 * Determine the space between the first two fingers
 */
private float spacing(MotionEvent event) {
    float x = event.getX(0) - event.getX(1);
    float y = event.getY(0) - event.getY(1);
    return (float) Math.sqrt(x * x + y * y);
}

private void midPoint(PointF point, MotionEvent event) {
    float x = event.getX(0) + event.getX(1);
    float y = event.getY(0) + event.getY(1);
    point.set(x / 2, y / 2);
}

private float rotation(MotionEvent event) 
{
	//Toast.makeText(getApplicationContext(), "get x :-"+event.getX(0)+""+event.getX(1), Toast.LENGTH_LONG).show();
    double delta_x = (event.getX(0) - event.getX(1));
    double delta_y = (event.getY(0) - event.getY(1));
    double radians = Math.atan2(delta_y, delta_x);
    //Toast.makeText(getApplicationContext(),Math.toDegrees(radians)+"", Toast.LENGTH_LONG).show();
    return (float) Math.toDegrees(radians);
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

